                        /*******************************************************************************
                         *                                                                             *
                         *                    UNIVERSIDAD DE CUNDINAMARCA                              *
                         *                             EXT CHIA                                        *
                         *                    Desarrollador: Miguel Chaves                             *   
                         *                    Semestre  VIII                                           *
                         *                    Inteligencia Artificial                                  *
                         *                                                                             *
                         * Este programa que permmite jugar piedra papel o tijera de una forma especial*
                         * estas son las reglas:                                                       *
                         *                                                                             *
                         * Las tijeras cortan el papel, el papel cubre a la piedra, la piedra aplasta  * 
                         * al lagarto, el lagarto envenena a Spock, Spock destroza las tijeras, las    *
                         * tijeras decapitan al lagarto, el lagarto  come el papel, el papel refuta a  *
                         * Spock, Spock vaporiza la piedra, y, como es habitual la piedra aplasta las  * 
                         * tijeras.                                                                    *
                         *                                                                             *
                         *******************************************************************************/
package piedrapapelinterfaz;
/**
 *
 * @author miguel
 */
//librerias para capturar un numero ingresado por el usuario en consola
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class PiedraPapelInterfaz {
    
public static void main(String[] args) 
{
    
    InputStreamReader DatoEntrada=new InputStreamReader(System.in); //se captura el valor del usuario
    BufferedReader GuardarEntrada =new BufferedReader(DatoEntrada); // se guarda la variable capturada, siempre es un string
    int j=0; //variable j guardara la opción del jugador  
    int p = (int)Math.round(Math.random()*5); //se multiplica por 5 ya que deseamos tener valores entre 1 y 5 y no valores entre 0 y 1
    // es necesario hacer casting para redodear el math.random, ya que esta funcion nos retorna un valor double y necesitamos un entero
    
    if(p == 0)  //como no necesitamos tener en cuenta el 0, cava vez que en la función anterior el valor aleatorio sea 0 quedara en un 1 
    {
        p = p+1;
    }

    System.out.println("por favor escoja su jugada: ");
    System.out.println
    (
       " 1- tijeras \n"
       +" 2- papel \n"
       +" 3- piedra \n"
       +" 4- lagarto \n"        
       +" 5- spock \n"
    );
    try
    {
        j = Integer.parseInt(GuardarEntrada.readLine()); //se convierte la variablecapturada que en principio era string a entera para poder escoger una opcion en el switch
    }catch(Exception e)
    {
        System.out.println("Por favor ingrese el numero que pertenece a la opcion y no la palabra");
    }
    if(j>=1 & j<=5)
    {    //se valida que la opcion sea mayor a o igual 1 y menor o igual a 5
        switch (j) 
        {
            case 1:  
                System.out.println("Usted escogio tigeras");
                     switch (p) 
                            {
                                case 1:  
                                    System.out.println("Pc escogio tijeras");
                                    System.out.println("Se ha producido un empate");
                                break;
                                    
                                case 2:  
                                    System.out.println("Pc escogio papel");
                                    System.out.println("Ganador: Usuario");
                                break;
                                    
                                case 3:  
                                    System.out.println("Pc escogio piedra");
                                    System.out.println("Ganador: PC");

                                break;
                                case 4:  
                                    System.out.println("Pc escogio lagarto");
                                    System.out.println("Ganador: Usuario");

                                break;
                                case 5:  
                                    System.out.println("Pc escogio spock");
                                    System.out.println("Ganador: PC");
                                break;    
                            }
            break; //fin de la opcion tijeras para el usuario

            case 2:  
                System.out.println("Usted escogio papel");
                switch (p) 
                            {
                                case 1:  
                                    System.out.println("Pc escogio tijeras");
                                    System.out.println("Ganador: PC");
                                break;
                                    
                                case 2:  
                                    System.out.println("Pc escogio papel");
                                    System.out.println("Se ha producido un empate");
                                break;
                                    
                                case 3:  
                                    System.out.println("Pc escogio piedra");
                                    System.out.println("Ganador: Usuario");

                                break;
                                case 4:  
                                    System.out.println("Pc escogio lagarto");
                                    System.out.println("Ganador: PC");

                                break;
                                case 5:  
                                    System.out.println("Pc escogio spock");
                                    System.out.println("Ganador: Usuario");
                                break;    
                            }
            break; //fin de la opcion papel para el usuario

            case 3: 
                System.out.println("Usted escogio piedra");
                switch (p) 
                            {
                                case 1:  
                                    System.out.println("Pc escogio tijeras");
                                    System.out.println("Ganador: Usuario");
                                break;
                                    
                                case 2:  
                                    System.out.println("Pc escogio papel");
                                    System.out.println("Ganador: PC");
                                break;
                                    
                                case 3:  
                                    System.out.println("Pc escogio piedra");
                                    System.out.println("Se ha producido un empate");

                                break;
                                case 4:  
                                    System.out.println("Pc escogio lagarto");
                                    System.out.println("Ganador: Usuario");

                                break;
                                case 5:  
                                    System.out.println("Pc escogio spock");
                                    System.out.println("Ganador: PC");
                                break;    
                            }
            break;//fin de la opcion piedra para el usuario

            case 4:  
                System.out.println("Usted escogio lagarto");
                switch (p) 
                            {
                                case 1:  
                                    System.out.println("Pc escogio tijeras");
                                    System.out.println("Ganador: PC");
                                break;
                                    
                                case 2:  
                                    System.out.println("Pc escogio papel");
                                    System.out.println("Ganador: Usuario");
                                break;
                                    
                                case 3:  
                                    System.out.println("Pc escogio piedra");
                                    System.out.println("Ganador: PC");

                                break;
                                case 4:  
                                    System.out.println("Pc escogio lagarto");
                                    System.out.println("Se ha producido un empate");

                                break;
                                case 5:  
                                    System.out.println("Pc escogio spock");
                                    System.out.println("Ganador: Usuario");
                                break;    
                            }
            break;//fin de la opcion lagarto para el usuario

            case 5: 
                System.out.println("Usted escogio spock");
                 switch (p) 
                            {
                                case 1:  
                                    System.out.println("Pc escogio tijeras");
                                    System.out.println("Ganador: Usuario");
                                break;
                                    
                                case 2:  
                                    System.out.println("Pc escogio papel");
                                    System.out.println("Ganador: PC");
                                break;
                                    
                                case 3:  
                                    System.out.println("Pc escogio piedra");
                                    System.out.println("Ganador: Usuario");

                                break;
                                case 4:  
                                    System.out.println("Pc escogio lagarto");
                                    System.out.println("Ganador: PC");

                                break;
                                case 5:  
                                    System.out.println("Pc escogio spock");
                                    System.out.println("Se ha producido un empate");
                                break;    
                            }
            break;//fin de la opcion spock para el usuario
        }//fin switch jugador
    }else
    {
        System.out.println("Lo lamento, la opcion que se ha escogido no es valida");
    }
    System.out.println("Fin del juego!!");
}//fin main
}