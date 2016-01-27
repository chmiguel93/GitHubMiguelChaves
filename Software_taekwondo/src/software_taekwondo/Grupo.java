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
 * Esta clase llamada Grupo permite seleccionar, insertar, actualizar y        *
 * generar una lista con registros de la tabla tb_Grupos por medio de los      *
 * metodos crud                                                                *
 *******************************************************************************/
package software_taekwondo;

import javax.swing.JOptionPane;

/**
 * @author M&D software
 * @version 1.0
 * @created 07-nov-2013 01:45:46 a.m.
 */
public class Grupo {

	private int intIdGrupo;
	private String StringHorarioInicioGrupo;
	private String StringHorarioFinalGrupo;
        String mensajelistagrupo="error al desplegar el la lista de grupos ";

        
        public int getintIdGrupo(){
		return intIdGrupo;
	}		
        public String getStringHorarioInicioGrupo(){
		return StringHorarioInicioGrupo;
	}
        public String getStringHorarioFinalGrupo(){
		return StringHorarioFinalGrupo;
	}
        
        
	public void setintIdGrupo(int newVal){
		intIdGrupo = newVal;
	}
	public void setStringHorarioInicioGrupo(String newVal){
		StringHorarioInicioGrupo = newVal;
	}
	public void setStringHorarioFinalGrupo(String newVal){
		StringHorarioFinalGrupo = newVal;
	}
        
        
       
        
	public Grupo(){	}

	public Grupo(int intIdGrupo){	}

	public Grupo
                (
                int intCIdGrupo,                 
                String stringCHorarioInicioGrupo,
                String stringCHorarioFinalGrupo
                
                )
            {
             intIdGrupo=intCIdGrupo;
             StringHorarioInicioGrupo=stringCHorarioInicioGrupo;
             StringHorarioFinalGrupo=stringCHorarioFinalGrupo;
            }

        
	public void CrudSelect(int filtro)
        {
            ConectarMS cc = new ConectarMS();
            String [][] registro;//variable utilizada para guardar la consulta de los datos  
            registro= cc.resultadoQuery(cc.query("SELECT `id_grupo`, `horario_inicio_grupo`,`horario_final_grupo` FROM `tb_grupos` WHERE `id_grupo`='"+filtro+"';"));

            intIdGrupo=Integer.parseInt(registro[0][0]);
            StringHorarioInicioGrupo=registro[0][1];
            StringHorarioFinalGrupo=registro[0][2];
            
	}
        
	public void CrudInsert()
        {
            ConectarMS cc = new ConectarMS();
            int insert;
            insert=cc.querysUpdate("INSERT INTO `tb_grupos`(`id_grupo`, `horario_inicio_grupo`, `horario_final_grupo`) VALUES ("
                      +intIdGrupo+",'"+StringHorarioInicioGrupo+"','"+StringHorarioFinalGrupo+"');"); 
	}

	public void CrudUpdate(int filtro)
        {
            ConectarMS cc = new ConectarMS();
            int up;
             up=cc.querysUpdate("UPDATE `tb_grupos` SET `id_grupo`="+intIdGrupo+",`horario_inicio_grupo`='"+StringHorarioInicioGrupo+"',`horario_final_grupo`='"+StringHorarioFinalGrupo+"' WHERE `id_grupo`="+filtro+";");

	}

	public Grupo[] CrudLista()
        {
            ConectarMS cc=new ConectarMS();
            int intTama , intContador;

            try
            {
                    String [][] resul=cc.resultadoQuery(cc.query("SELECT `id_grupo`, `horario_inicio_grupo`,`horario_final_grupo` FROM `tb_grupos` ORDER BY `id_grupo` desc"));
                    //esto nos retorna el tamaño de los registros
                    intTama=Integer.parseInt(cc.resultadoQuery(cc.query("SELECT count(`id_grupo`) as total FROM tb_grupos"))[0][0]);       
                    Grupo[]vectgrupo = new Grupo [intTama];

                    for(intContador=0; intContador<intTama; intContador++)
                    {
                            Grupo grupAux = new Grupo
                                    
                                    (

                                    Integer.parseInt(resul[intContador][0]),
                                    resul[intContador][1],
                                    resul[intContador][2]                                 

                                    );
                            vectgrupo[intContador]=grupAux;
                    }       

                    return vectgrupo;

            }catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,mensajelistagrupo);
                return null;
            }
		
	}

}