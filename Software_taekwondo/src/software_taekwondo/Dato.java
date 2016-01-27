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
 * generar una lista con registros de la tabla tb_datos_personas por medio de  *
 * los metodos crud                                                            *
 *******************************************************************************/
package software_taekwondo;

import javax.swing.JOptionPane;

public class Dato {

	private int intIdDato;
	private int intTipoDato;
	private String strDato;
        String mensajelistadato="error al desplegar el la lista de datos ";
	private persona perPersona = new persona();
        int id=perPersona.getintIdPersona();

        
	public Dato(String strDDato, int intDTipoDato, int intDIdDato, int iDd)
        {
           persona auxpersona= new persona(iDd); 
           strDato=strDDato;
           intTipoDato=intDTipoDato;
           intIdDato=intDIdDato;
           id=iDd;
           
	}
        
        public Dato(String strCDato, int intCTipoDato, int intCIdDato, persona perCPersona)
        {
           strDato=strCDato;
           intTipoDato=intCTipoDato;
           intIdDato=intCIdDato;
           perPersona= perCPersona;
           
	}

	public Dato(int intIdDato){}

	public Dato(){}

	public int getintIdDato(){
		return intIdDato;
	}
        
	public int getintTipoDato(){
		return intTipoDato;
	}
        
        public String getstrDato(){
		return strDato;
	}
	public void setintIdDato(int newVal){
		intIdDato = newVal;
	}

	public void setintTipoDato(int newVal){
		intTipoDato = newVal;
	}

	public void setstrDato(String newVal){
		strDato = newVal;
	}
        
        public persona getperPersona(){
		return perPersona;
	}

	public void setperPersona(persona newVal){
		perPersona = newVal;
	}


	public void CrudSelect(int filtro)
        {
            ConectarMS cc = new ConectarMS();
            String [][] registro;//variable utilizada para guardar la consulta de los datos  
            registro= cc.resultadoQuery(cc.query("SELECT `dato`, `tipo_dato`,`id_datos`,`persona` FROM `tb_datos_personas` WHERE `id_datos`='"+filtro+"';"));

            strDato=registro[0][0];
            intTipoDato=Integer.parseInt(registro[0][1]);
            intIdDato=Integer.parseInt(registro[0][2]);
            persona selectpersona = new persona(Integer.parseInt(registro[0][3]));
            perPersona=selectpersona;
            perPersona.getintIdPersona();
            System.out.println(perPersona.getintIdPersona()+"+++++++++++++++++++");
	}
        
	public void CrudInsert()
        {
            ConectarMS cc = new ConectarMS();
            persona perinsertdato = new persona(6, "pepito" , "arturo", "buen ", "dia", 1, 7);
            perinsertdato.CrudInsert();
            perinsertdato.getintIdPersona();
            int insert; 
            insert=cc.querysUpdate("INSERT INTO `tb_datos_personas`(`id_datos`, `tipo_dato`, `dato`, `persona`) VALUES ("
               +intIdDato+",'"+intTipoDato+"','"+strDato+"'"+perinsertdato+");");   
	}
        
	public void CrudUpdate(){

	}

//	public Dato[] CrudListaDato()
//        {
//            ConectarMS cc=new ConectarMS();
//            int intTama , intContador;
//
//            try
//            {
//                    String [][] resuldato=cc.resultadoQuery(cc.query("SELECT `dato`, `tipo_dato`,`id_datos`,`persona` FROM `tb_datos_personas` ORDER BY `id_datos` desc"));
//                    //esto nos retorna el tamaño de los registros
//                    intTama=Integer.parseInt(cc.resultadoQuery(cc.query("SELECT count(`id_datos`) as total FROM tb_datos_personas"))[0][0]);       
//                    Dato[]vectdato = new Dato [intTama];
//
//                    for(intContador=0; intContador<intTama; intContador++)
//                    {
//                            Dato datAux = new Dato
//                                    (
//                                    
//                                    resuldato[intContador][0],
//                                    Integer.parseInt(resuldato[intContador][1]),
//                                    Integer.parseInt(resuldato[intContador][2])  
////                                  Integer.parseInt(resuldato[intContador][3])
//                                    
//                                    );
//                            vectdato[intContador]=datAux;                            
//                    }       
//
//                    return vectdato;
//
//            }catch(Exception e)
//            {
//                JOptionPane.showMessageDialog(null,mensajelistadato);
//                return null;
//            }
//	}

	

}