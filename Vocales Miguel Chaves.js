                         /*******************************************************************************
                         *                                                                             *
                         *                    UNIVERSIDAD DE CUNDINAMARCA                              *
                         *                             EXT CHIA                                        *
                         *                    Desarrollador: Miguel Chaves                             *   
                         *                    Semestre  VIII                                           *
                         *                    Inteligencia Artificial                                  *
                         *                                                                             *
                         * Este Programa que permite decir cuantas vocales se repiten en una palabra   *
                         * o frase ingresada por el usuario                                    	 	   *
                         *                                                                             *
                         *******************************************************************************/


for(;;)
{  
   var palabra_usuario = prompt("Introduce un palabra o frase");
   if(palabra_usuario.length == 0)
     {
          alert("No se ha ingresado ninguna palabra ");

     }else
     {
     	//declaración de variables que luego seran usadas como contadores
     	var a = 0;
     	var e = 0;
		var i = 0;
		var o = 0;
		var u = 0;

	    palabra_usuario = palabra_usuario.toLowerCase();// convierte lo ingresado por el usuario en minusculas
	    palabra_usuario = palabra_usuario.split("");// convierte lo ingresado en un arreglo para manejarlo en el ciclo

	    for(var j=0; j<palabra_usuario.length; j++)  //cliclo que permite recorer la palabra ingesada
	    {
	    	if(palabra_usuario[j] == "a")
	    	{
	    		a++;
	    	}else if(palabra_usuario[j] == "e")
	    			{
	    				e++;
	    			}else if(palabra_usuario[j] == "i")
			    			{
			    				i++;
			    			}else if(palabra_usuario[j] == "o")
				    			{
				    				o++;
				    			}else if(palabra_usuario[j] == "u")
					    			{
					    				u++;
					    			}
		}// fin for

		palabra_usuario = palabra_usuario.toString().replace(/[,]/g,"");  
		Mayuscula = palabra_usuario.toUpperCase();
	/*buscamos por toda la palbra la expresion regular entre [] q en este caso es olo la coma(,) y al reemlpazamos con "" 
	para eliminar espacios y luego se convierte en un string con el comando ToString, todo esto se ahce solo para imprimir la frase 
	en le alert tal y como el usuario la ingreso*/
		alert(
				"La frase "+ Mayuscula+ " contiene: \n" 
				+ a + " veces la letra A\n"
				+ e + " veces la letra E\n"
				+ i + " veces la letra I\n"
				+ o + " veces la letra O\n"
				+ u + " veces la letra U\n"
			);
          
     } // fin else
}// fin primer for