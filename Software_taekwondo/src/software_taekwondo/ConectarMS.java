package software_taekwondo;

/**
 * UNIVERSIDAD DE CUNDINAMARCA
 * INGENIERÍA DE SISTEMAS
 * Materias:
 * SISTEMAS DE INFORMACIÓN
 * INGENIERÍA DE SOFTWARE II
 * Profesor:   Jorge Paramo Fonseca
 * @author JuanJo
 * @version 1.0
 * @created 18-sep-2011 03:49:58 p.m.
 *
 * Está clase está encargada de hacer establecer la conexion con la BD, pasar las diferentes consultas a ella
 * y recibir los resultados
 *
 */


import java.sql.*;	//DatabaseMetaData,Statement,Connection,ResultSet,ResultSetMetaData,DriverManager,SQLException

public class ConectarMS
{

    private String ip = "localhost";                                //Dirección IP del servidor donde este la base de datos
    private String puerto = "3306";                                 //Puerto del servidor de bases de datos
    private String tipo = "mysql";                                  //Tipo de Servidor
    private String bd = "m&d";                                      //Nombre de la base de datos
    private String classforname = "com.mysql.jdbc.Driver";          //Para crear la clase por nombre segun el tipo y el driver
	private String strUsuario = "root";									//Nombre del usuario de la BD
	private String strClave = "rootroot";								//Clave para el ingreso a la BD
    
    private DatabaseMetaData dbmd;                                  //Metadatos de la BD
    private Statement stmt;                                         //Consulta o instrución SQL establecida
    private Connection conexion;                                    //Conexión

    public String error;                                            //Para manejo del error

//-------------------------------------------------------------------------------------------------------------------------------
//Constructor
	
    ConectarMS()
    {
        if(ip.compareTo("")==0 || puerto.compareTo("")==0 || tipo.compareTo("")==0 || bd.compareTo("")==0  || classforname.compareTo("")==0)
        {
            System.out.print("No estan todos los parametros o no todos son correctos");
        }
        else
        {
            String url = "jdbc:"+tipo+"://" + ip + ":" + puerto + "/"+bd;

            try
            {   
                Class.forName(classforname);
                error = "Creo la Conexion";
                conexion = DriverManager.getConnection(url, strUsuario, null);
               // System.out.print("Ya estan todos los parametros\n");

                stmt = conexion.createStatement();
              //  System.out.println("LISTO YA ME CONECTE ");
            }
            catch (SQLException e)
            {
                error = url;
                System.out.print("\nError 1 " + e);
            }
            catch (java.lang.ClassNotFoundException e)
            {
                error = url;
                System.out.print("\nError 2 " + e);
            }
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------

    ConectarMS(String strIP,String strPuerto,String strTipo,String strDb,String strclassforname)
    {
        ip = strIP;				//Dirección IP del servidor donde este la base de datos
        puerto = strPuerto;			//Puerto del servidor de bases de datos
        tipo = strTipo;				//Tipo de Servidor
        bd = strDb;				//Nombre de la base de datos
        classforname = strclassforname;         //Para crear la clase por nombre segun el tipo y el driver

        if(ip.compareTo("")==0 || puerto.compareTo("")==0 || tipo.compareTo("")==0 || bd.compareTo("")==0  || classforname.compareTo("")==0)
        {
            System.out.print("No estan todos los parametros o no todos son correctos");
        }
        else
        {
            String url = "jdbc:"+tipo+"://" + ip + ":" + puerto + "/"+bd;

            try
            {
                Class.forName(classforname);
                error = "Creo la Conexion";
                conexion = DriverManager.getConnection(url, strUsuario, strClave);
                System.out.print("Ya estan todos los parametros\n");

                stmt = conexion.createStatement();
                System.out.println("LISTO YA ME CONECTE ");
            }
            catch (SQLException e)
            {
                error = url;
                System.out.print("\nError 3 " + e);
            }
            catch (java.lang.ClassNotFoundException e)
            {
                error = url;
                System.out.print("\nError 4 " + e);
            }
        }
    }

//-------------------------------------------------------------------------------------------------------------------------------
//Metodos del CRUD

//consulta
    public ResultSet query(String Consulta)
    {
        ResultSet rs;
        rs = null;

        try
        {
            rs = stmt.executeQuery(Consulta);
        }
        catch (SQLException e)
        {
            System.out.print("\nerror 5 " + e);
        }
        return rs;
    }

//---------------------------------------------------------------------------------------------------------------------------	
//UpDate Consulta de actualización

    public int querysUpdate(String Consulta)
    {
        int filas;
        filas = 0;

        try
        {
            filas = stmt.executeUpdate(Consulta);
        }
        catch (SQLException e)
        {
            System.out.print("\nerror 6 " + e);
        }

        return filas;
    }

//---------------------------------------------------------------------------------------------------------------------------	
//Resultado de una consulra

    public String[][] resultadoQuery(ResultSet rs)
    {
        String [][] elementos;
        elementos = null;
        int i,j;

        try
        {
            ResultSetMetaData rsmd;
            rsmd = rs.getMetaData();
            elementos = new String [100][rsmd.getColumnCount()];
            i=0;
            j=0;

            while(rs.next())
            {
                for(j = 0 ;j<rsmd.getColumnCount();j++)
                {
                    elementos[i][j]=rs.getString(j+1);
                }
                i++;
            }

        }
        catch (SQLException e)
        {
            System.out.print("\nerror 7 " + e);
        }

        return elementos;
    }

//---------------------------------------------------------------------------------------------------------------------------	
//para retornar un conjunto de consultas

    public String getFuncionxId(int idFuncion)
    {
        String funcion ="";

        try
        {
            ResultSet rs=query("select procedimiento from tbcatprocedimientos where estado = 1 and idprocedimiento = "+idFuncion);

            while(rs.next())
            {
                funcion = rs.getString(1);
            }
        }
        catch (SQLException e)
        {
            System.out.print("\nerror 8 " + e);
        }
        return funcion;
    }

//---------------------------------------------------------------------------------------------------------------------------	
// Retorna la conexión establecida

    public Connection getConexion()
    {
        return conexion;
    }

//==========================================================================================================================
// Main para hacer pruebas de conexión

    public static void main(String args[])
    {     
        
 
    }

}

