						/*******************************************************************************
                         *                                                                             *
                         *                    UNIVERSIDAD DE CUNDINAMARCA                              *
                         *                             EXT CHIA                                        *
                         *                    Desarrollador: Miguel Chaves                             *   
                         *                    Semestre  VIII                                           *
                         *                    Inteligencia Artificial                                  *
                         *                                                                             *
                         * Este programa permite jugar triqui, el tablero del triqui se llena          *
                         * aleatoriamente y por medio de un alert imprime las imagenes de cada figura  *
                         * y dice que figura gano el triqui. Los espacios vacios se representan con 0  *
                         * la X es = 1 y el ∆ = 2.                                                     *
                         *                                                                             *
                         *******************************************************************************/

var triqui = [ [0,0,0], [0,0,0], [0,0,0] ];
var nuevotriqui = [[],[],[]];
var aleatorio;
var aleatorio2;
var aleatorio3;
// los ciclos anidados permitiran recorrer todos los espacios del arreglo
for(var i = 0; i < 3; i++)
{	
	for(var j = 0; j < 3; j++)
	{
		/*
		si aleatorio es de 0 a 0.3 el resultado sera 0
		si aleatorio es de 0.4 a 0.6 el resultado sera 1
		si aleatorio es de 0.7 a 0.9 el resultado sera 2
		*/
		aleatorio = Math.floor(Math.random()*3); // Math.random() escoje numeros aleatorios entre 0.0 y 0.9, al multimplicarlo por  3 el mayor valor sera 2.7
		if(aleatorio == 0) // 0 representa vacio por lo cual debemos evitar que la matriz se llene con un 0
		{
			// si aleatorio es 0 se va a generar un nuevo valor random, si este nuevo valor es 0 o 1 se debe sumar un 1, pero
			//si es 2 debe dejar el 2 sin sumar nada
			aleatorio2 = Math.floor(Math.random()*3);
			if(aleatorio2 == 0 || aleatorio2 == 1) // solo si es 0 o 1 le sumara 1
			{
				aleatorio3 = aleatorio2+1;
				triqui[i][j] = aleatorio3;
			}else
			{
				triqui[i][j] =  aleatorio2;  
			}
		}else
		{
			triqui[i][j] =  aleatorio;
		}

	}// fin for de J
} // fin for de I

//el siguiente cilo busca y reemplaza los numeros del triqui por caracteres en este caso X y  ∆ y los guarda en el arreglo nuevotriqui
for(var i = 0; i < 3; i++)
{	
	for(var j = 0; j < 3; j++)
	{
		 if(triqui[i][j] == 1)
		 {
		 	nuevotriqui [i][j] = "X";
		 }else
		 {
		 	nuevotriqui [i][j] = "∆";
		 }
	}// fin for de J
} // fin for de I


if(triqui[0][0] == 1 && triqui[0][1] == 1 && triqui[0][2] == 1)
{
	alert(

			"                                 JUGADAS \n"+ 
			"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
			"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
			"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
			"                            -------------------\n\n"+
			"                   X ES EL GANADOR!!!"
		  );

}else if(triqui[1][0] == 1 && triqui[1][1] == 1 && triqui[1][2] == 1)
	{
				alert(

					"                                 JUGADAS \n"+ 
					"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
					"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
					"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
					"                            -------------------\n\n"+
					"                   X ES EL GANADOR!!!"
			  		);
	}else if(triqui[2][0] == 1 && triqui[2][1] == 1 && triqui[2][2] == 1)
		{
				alert(

				"                                 JUGADAS \n"+ 
				"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
				"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
				"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
				"                            -------------------\n\n"+
				"                   X ES EL GANADOR!!!"
		  			);
		}else if(triqui[0][0] == 1 && triqui[1][1] == 1 && triqui[2][2] == 1)
			{
				alert(

				"                                 JUGADAS \n"+ 
				"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
				"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
				"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
				"                            -------------------\n\n"+
				"                   X ES EL GANADOR!!!"
		  			);
			}else if(triqui[0][2] == 1 && triqui[1][1] == 1 && triqui[2][0] == 1)
				{
					alert(

						"                                 JUGADAS \n"+ 
						"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
						"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
						"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
						"                            -------------------\n\n"+
						"                   X ES EL GANADOR!!!"
		  			);
				}else if(triqui[0][0] == 2 && triqui[0][1] == 2 && triqui[0][2] == 2)
					{
						alert(

							"                                 JUGADAS \n"+ 
							"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
							"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
							"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
							"                            -------------------\n\n"+
							"                   ∆ ES EL GANADOR!!!"
		  					);
					}else if(triqui[1][0] == 2 && triqui[1][1] == 2 && triqui[1][2] == 2)
						{
							alert(

								"                                 JUGADAS \n"+ 
								"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
								"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
								"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
								"                            -------------------\n\n"+
								"                   ∆ ES EL GANADOR!!!"
		  						);
						}else if(triqui[2][0] == 2 && triqui[2][1] == 2 && triqui[2][2] == 2)
							{
								alert(

									"                                 JUGADAS \n"+ 
									"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
									"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
									"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
									"                            -------------------\n\n"+
									"                   ∆ ES EL GANADOR!!!"
				  					);
							}else if(triqui[0][0] == 2 && triqui[1][1] == 2 && triqui[2][2] == 2)
								{
									alert(

										"                                 JUGADAS \n"+ 
										"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
										"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
										"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
										"                            -------------------\n\n"+
										"                   ∆ ES EL GANADOR!!!"
					  					);
								}else if(triqui[0][2] == 2 && triqui[1][1] == 2 && triqui[2][0] == 2)
									{
										alert(

											"                                 JUGADAS \n"+ 
											"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
											"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
											"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
											"                            -------------------\n\n"+
											"                   ∆ ES EL GANADOR!!!"
						  					);
									}else
										{
											alert(

												"                                 JUGADAS \n"+ 
												"                                    "+ nuevotriqui[0][0]+nuevotriqui[0][1]+nuevotriqui[0][2]+ "\n"+
												"                                    "+ nuevotriqui[1][0]+nuevotriqui[1][1]+nuevotriqui[1][2]+ "\n"+
												"                                    "+ nuevotriqui[2][0]+nuevotriqui[2][1]+nuevotriqui[2][2]+ "\n"+
												"                            -------------------\n\n"+
												"                   NADIE GANA!!!"
							  					);
										}