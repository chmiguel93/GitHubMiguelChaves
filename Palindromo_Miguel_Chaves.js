                         /*******************************************************************************
                         *                                                                             *
                         *                    UNIVERSIDAD DE CUNDINAMARCA                              *
                         *                             EXT CHIA                                        *
                         *                    Desarrollador: Miguel Chaves                             *   
                         *                    Semestre  VIII                                           *
                         *                    Inteligencia Artificial                                  *
                         *                                                                             *
                         * Este programa permite ingresar una palabra y como resultado sabremos si es  *
                         * palindromo o no.                                                            *
                         *                                                                             *
                         *******************************************************************************/

var palabra_usuario = prompt("Introduce un palabra o frase");
if(palabra_usuario.length == 0)
{
     alert("No se ha ingresado ninguna palabra ");

}else
{

     
     var cumple = 0;
     palabra_usuario = palabra_usuario.toLowerCase();// convierte lo ingresado por el usuario en minusculas
     var sinespacios = palabra_usuario.replace(/\s/g,''); // creamos una variable llamada sinespacios y por emdio de al formula replace buscamos donde halla un espacio y la reemplazamos con '' que quita los espacios 

     /*

     /\s/g : nos indica lo siguiente:
     // : estamos utilizando una expresión regular entre ambos slash
     \s : expresión regular definida para el caracter del espacio
     g : indica que se deben cambiar todas las coincidencias en la cadena - 
     replace(/\s/g,'');---> esta pequeña parte del codigo fue tomada de la pagina:
     http://www.nerdcoder.com/tip-eliminar-todos-los-espacios-de-una-cadena-con-javascript/#sthash.TJ3cfBJM.dpuf 
         
     */
     var final_usuario = sinespacios.split("");
     var palabraAux = sinespacios.split(""); //convierte la variable sin espacios en un array y guarda en las posiciones letra por letra para poder usar luego el reverse
     var alrevez = palabraAux.reverse(); //invierte el arreglo  palabraAux y lo guarda en variable alrevez

     for(var i = 0; i < palabra_usuario.length; i++) //recorre toda la palabra
     {
          if(final_usuario[i] === alrevez[i]) //valida el contenido de la misma posicion en los dos arreglos, si es igual se añade una unidad a cumple sino se deja el mismo valor
          {
               cumple ++;

          }else
          {               
               cumple = cumple;
          }
     }//fin del ciclo for

     if(cumple === palabra_usuario.length) //si la variable cumple es igual a la longitud de la palabra dira que es palindromo ya que la suma de todas las letras se efectuo y son iguales
     {
          alert("La cadena SI ES un palindromo");
     }else
     {
          alert("La cadena NO es un palindromo");     
     }
}
