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
 * El software esta diseñado para llevar de manera ordenada el control de la   * 
 * información de los estudiantes, profesores y grupos de una academia de      *
 * taekwondo.                                                                  *
 ******************************************************************************/
package software_taekwondo;

public class Software_taekwondo {

    public static void main(String[] args) {
        
/*******************************************************************************        
*******************Bloque que permite realizar consultas ***********************
********************************************************************************/
        
        
        persona perselect = new persona();
        perselect.CrudSelect(3);//El 2 indica el filtro de la consulta por el id, el usuario puede cambiar este valor para consultar otro registro por un id diferente
        System.out.println("consulta persona: ");
        System.out.println
                (
                perselect.getintIdPersona()+" "
                +perselect.getstrNombre1Persona()+" "
                +perselect.getstrNombre2Persona()+" "
                +perselect.getstrApellido1Persona()+" "
                +perselect.getstrApellido2Persona()+" "
                +perselect.getintTipoPersona()+" "
                +perselect.getintGradoPersona()+" "+"\n"
                );
                
        
        
        Dato datselect = new Dato();
        datselect.CrudSelect(2);//El 1 indica el filtro de la consulta por el id, el usuario puede cambiar este valor para consultar otro registro por un id diferente
        System.out.println("consulta datos : ");
        System.out.println
                (
                datselect.getintIdDato()+" "
                +datselect.getintTipoDato()+" "
                +datselect.getstrDato()+" "+
                datselect.getperPersona().getintIdPersona()+"\n"
                );
        
        
        
        
        Grupo grupselect = new Grupo();
        grupselect.CrudSelect(1);
        System.out.println("consulta grupos : ");
        System.out.println
                (
                grupselect.getintIdGrupo()+" "
                +grupselect.getStringHorarioInicioGrupo()+" "
                +grupselect.getStringHorarioFinalGrupo()+"\n"                
                );
        
        
/*******************************************************************************        
******Bloque que permite insertar una registro completo y vizualizarlo**********/
        
        
        persona perinsert = new persona(5, "juan" , "carlos ", "chaves ", "perilla", 1, 6);//estos son los valores del registro a insertar, el usuario puede cambiar estos valores para insertar los registros que desee 
        System.out.println("Nuevo registro se ha insertado en la tabla tb_personas: ");
        
        perinsert.CrudInsert();
        persona perselectin = new persona();//SE crea una nueva instancia de la clase persona para realizar la consulta sobre el nuevo registro creado
        perselectin.CrudSelect(5);//El 5 indica el filtro de la consulta por el id, debeser el mismo que el ingresado en el insert
        System.out.println("consulta actualizada de nueva persona: ");
        System.out.println
                (
                perselectin.getintIdPersona()+" "
                +perselectin.getstrNombre1Persona()+" "
                +perselectin.getstrNombre2Persona()+" "
                +perselectin.getstrApellido1Persona()+" "
                +perselectin.getstrApellido2Persona()+" "
                +perselectin.getintTipoPersona()+" "
                +perselectin.getintGradoPersona()+" "+"\n"
                );


        Grupo grupinsert = new Grupo(2, "12:00:00","14:00:00");
        System.out.println("Nuevo registro se ha insertado en la tabla tb_grupos: ");
        grupinsert.CrudInsert();
         
        Grupo grupselectin = new Grupo();
        grupselectin.CrudSelect(2); //El 2 indica el filtro de la consulta por el id, debeser el mismo que el ingresado en el insert
        System.out.println("consulta actualizada de nuevo grupo : ");
        System.out.println
                (
                grupselectin.getintIdGrupo()+" "
                +grupselectin.getStringHorarioInicioGrupo()+" "
                +grupselectin.getStringHorarioFinalGrupo()+"\n"                
                );
        
       
//        persona iddatopersona = new persona(); 
//        Dato datinsert = new Dato("318987574",1, 10,iddatopersona);
//        System.out.println("Nuevo registro se ha insertado en la tabla tb_datos_personas: ");
//        datinsert.CrudInsert();
        
         Dato datinsert = new Dato("318987574",1, 10,6); // requiere un tipo de persona
         datinsert.CrudInsert();
         
        Dato datselectin = new Dato();
        datselectin.CrudSelect(3);//El 6 indica el filtro de la consulta por el id, el usuario puede cambiar este valor para consultar otro registro por un id diferente
        System.out.println("consulta de insertar nuevos datos : ");
        System.out.println
                (
                datselectin.getintIdDato()+" "
                +datselectin.getintTipoDato()+" "
                +datselectin.getstrDato()+" "+
                datselectin.getperPersona()+"\n"
                );
        
 /******************************************************************************
 ********************Bloque que permite actualizar registros ******************/   
      
       persona perupdated= new persona(4,"sandra","nuevo2","moreno","aldana",1,3);
       perupdated.CrudUpdate(4);
       System.out.println("actualización de registro persona: ");
       System.out.println
                (
               perupdated.getintIdPersona()+" "
               +perupdated.getstrNombre1Persona()+" "
               +perupdated.getstrNombre2Persona()+" "
               +perupdated.getstrApellido1Persona()+" "
               +perupdated.getstrApellido2Persona()+" "
               +perupdated.getintTipoPersona()+" "
               +perupdated.getintGradoPersona()+"\n"

                );
        
       Grupo grupdated = new Grupo(2,"13:00:00","15:00:00");
       grupdated.CrudUpdate(2);
       System.out.println("actualización de registro de grupo: ");
       System.out.println
               (
                grupdated.getintIdGrupo()+" "+
                grupdated.getStringHorarioInicioGrupo()+" "+
                grupdated.getStringHorarioFinalGrupo()+" "
               );
             
       
       
/*******************************************************************************        
***Bloque que permite recorrer tablas para capturar todos los datos de ellas****
********************************************************************************/        
        
        persona perlista = new persona();
        persona[]vectpersona = perlista.CrudListaPersona();
        System.out.println("\n Lista de personas: ");
        for(int b=0;b<vectpersona.length;b++)
        {

            System.out.println
                    (
                    vectpersona[b].getintIdPersona()+" "
                    +vectpersona[b].getstrNombre1Persona()+" "
                    +vectpersona[b].getstrNombre2Persona()+" "
                    +vectpersona[b].getstrApellido1Persona()+" "
                    +vectpersona[b].getstrApellido2Persona()+" "
                    +vectpersona[b].getintTipoPersona()+" "
                    +vectpersona[b].getintGradoPersona()+" "
                    );
        }
        
        
//        Dato datlista = new Dato();
//        Dato []vectdato = datlista.CrudListaDato();
//        System.out.println("\n Lista de datos: ");
//        for(int p=0;p<vectdato.length;p++)
//        {
//
//            System.out.println
//                    (
//                    vectdato[p].getintIdDato()+" "
//                    +vectdato[p].getintTipoDato()+" "
//                    +vectdato[p].getstrDato()+" "           
//                    );        
//        }
        
        
        Grupo gruplista = new Grupo();
        Grupo[] vectgrupo = gruplista.CrudLista();
        System.out.println("\n Lista de grupos: ");
        for(int p=0;p<vectgrupo.length;p++)
        {

            System.out.println
                    (
                    vectgrupo[p].getintIdGrupo()+" "
                    +vectgrupo[p].getStringHorarioInicioGrupo()+" "
                    +vectgrupo[p].getStringHorarioFinalGrupo()+" "                               
                    );        
        }
    }//fin main
}
