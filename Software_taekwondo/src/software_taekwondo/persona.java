/******************************************************************************
 *                    UNIVERSIDAD DE CUNDINAMARCA                              *
 *                             EXT CHIA                                        *
 *                    Empresa M&D software                                     *
 *                    Desarrolladores: Miguel Chaves                           *   
 *                                   : Deisy Peña                              *
 *                                   : Camilo Urrea                            *
 *                    Semestre  VII                                            *
 *                    Ingenieria de software 2                                 *
 *                    Nombre del proyecto: Taekwondo Management                *
 *                                                                             *
 *                                                                             *
 * Esta clase llamada persona permite seleccionar, insertar, actualizar y      *
 * generar una lista con registros de la tabla tb_personas por medio de los    *
 * metodos crud                                                                *
 *******************************************************************************/

package software_taekwondo;

import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */

public class persona {

    private int intIdPersona;
    private String strNombre1Persona;
    private String strNombre2Persona;
    private String strApellido1Persona;
    private String strApellido2Persona;
    private int intTipoPersona;
    private int intGradoPersona;
    String mensajelista="error al desplegar el la lista de personas";

    
    

    public persona(){    }

    public persona(int intDIdPersona)
    {
        
        ConectarMS cc = new ConectarMS();
        String [][] registro;//variable utilizada para guardar la consulta de los datos  
        registro= cc.resultadoQuery(cc.query("SELECT `id_persona`,`nombre1`,`nombre2`,`apellido1`,`apellido2`,`tipo_persona`,`grado` FROM `tb_personas`WHERE `id_persona`='"+intDIdPersona+"';"));

        intIdPersona=Integer.parseInt(registro[0][0]);
        strNombre1Persona=registro[0][1];
        strNombre2Persona=registro[0][2];
        strApellido1Persona=registro[0][3];
        strApellido2Persona=registro[0][4];
        intTipoPersona= Integer.parseInt(registro[0][5]);
        intGradoPersona =Integer.parseInt(registro[0][6]);   
    }

    public persona(int intCIdPersona,String strCNombre1Persona, String strCNombre2Persona, String strCApellido1Persona, String strCApellido2Persona, int intCTipoPersona, int intCGradoPersona)
    {
        intIdPersona=intCIdPersona;
        strNombre1Persona=strCNombre1Persona;
        strNombre2Persona=strCNombre2Persona;
        strApellido1Persona=strCApellido1Persona;
        strApellido2Persona=strCApellido2Persona;
        intTipoPersona= intCTipoPersona;
        intGradoPersona =intCGradoPersona;

    }
    
    public int getintIdPersona(){
            return intIdPersona;
    }
    public String getstrNombre1Persona(){
            return strNombre1Persona;
    }
    public String getstrNombre2Persona(){
            return strNombre2Persona;
    }
    public String getstrApellido1Persona(){
            return strApellido1Persona;
    }
    public String getstrApellido2Persona(){
            return strApellido2Persona;
    }
    public int getintTipoPersona(){
            return intTipoPersona;
    }
    public int getintGradoPersona(){
            return intGradoPersona;
    }
    
    
    
    public void setintIdPersona(int newVal){
            intIdPersona = newVal;
    }
    public void setstrNombre1Persona(String newVal){
            strNombre1Persona = newVal;
    }
    public void setstrNombre2Persona(String newVal){
            strNombre2Persona = newVal;
    }
    public void setstrApellido1Persona(String newVal){
            strApellido1Persona = newVal;
    }
    public void setstrApellido2Persona(String newVal){
            strApellido2Persona = newVal;
    }
    public void setintTipoPersona(int newVal){
            intTipoPersona = newVal;
    }
    public void setintGradoPersona(int newVal){
            intGradoPersona = newVal;
    }

    
    
    public void CrudSelect(int filtro)
    {                                 
        ConectarMS cc = new ConectarMS();
        String [][] registro;//variable utilizada para guardar la consulta de los datos  
        registro= cc.resultadoQuery(cc.query("SELECT `id_persona`,`nombre1`,`nombre2`,`apellido1`,`apellido2`,`tipo_persona`,`grado` FROM `tb_personas`WHERE `id_persona`='"+filtro+"';"));

        intIdPersona=Integer.parseInt(registro[0][0]);
        strNombre1Persona=registro[0][1];
        strNombre2Persona=registro[0][2];
        strApellido1Persona=registro[0][3];
        strApellido2Persona=registro[0][4];
        intTipoPersona= Integer.parseInt(registro[0][5]);
        intGradoPersona =Integer.parseInt(registro[0][6]);   
    }
    
    public void CrudInsert()           
    {
       ConectarMS cc = new ConectarMS();
       int insert;
       insert=cc.querysUpdate("INSERT INTO `tb_personas`(`id_persona`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `tipo_persona`, `grado`) VALUES ("
               +intIdPersona+",'"+strNombre1Persona+"','"+strNombre2Persona+"','"+strApellido1Persona+"','"+strApellido2Persona+"','"
               +intTipoPersona+"','"+intGradoPersona+"');");   
    }
    
    public void CrudUpdate(int filtro)
    {
        ConectarMS cc = new ConectarMS();
        String [][] registro;//variable utilizada para guardar la consulta de los datos  
        int up;
        up=cc.querysUpdate("UPDATE `tb_personas` SET `id_persona`="+intIdPersona+",`nombre1`='"+strNombre1Persona+"',`nombre2`='"+strNombre2Persona+"',`apellido1`='"+strApellido1Persona+"',`apellido2`='"+strApellido2Persona+"',`tipo_persona`="+intTipoPersona+",`grado`="+intGradoPersona+" WHERE `id_persona`="+filtro+";");

    }
    
    public persona[] CrudListaPersona()
            
    {
            ConectarMS cc=new ConectarMS();
            int intTama , intContador;

            try
            {
                    String [][] resul=cc.resultadoQuery(cc.query("SELECT `id_persona`, `nombre1`, `nombre2`, `apellido1`, `apellido2`, `tipo_persona`, `grado` FROM `tb_personas` ORDER BY `id_persona` desc"));
                    //esto nos retorna el tamaño de los registros
                    intTama=Integer.parseInt(cc.resultadoQuery(cc.query("SELECT count(`id_persona`) as total FROM tb_personas"))[0][0]);       
                    persona[]vectpersona = new persona [intTama];

                    for(intContador=0; intContador<intTama; intContador++)
                    {
                            persona perAux = new persona
                                    (

                                    Integer.parseInt(resul[intContador][0]),
                                    resul[intContador][1],
                                    resul[intContador][2],
                                    resul[intContador][3],
                                    resul[intContador][4],
                                    Integer.parseInt(resul[intContador][5]),
                                    Integer.parseInt(resul[intContador][6])

                                    );
                            vectpersona[intContador]=perAux;
                    }       

                    return vectpersona;

            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,mensajelista);
                return null;
            }
    }

   

   
}