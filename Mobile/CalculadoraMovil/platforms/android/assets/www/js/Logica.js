 						/*******************************************************************************
                         *                                                                             *
                         *                    	UNIVERSIDAD DE CUNDINAMARCA                            *
                         *                             	EXT CHIA                                       *
                         *                    	Desarrolladores: Miguel Chaves                         *  
                         *									   	Deisy Peña							   *
                         *									   	Camilo Urrea						   *
                         *									   	Fabio Diaz							   * 
                         *                    	Semestre  X                                            *
                         *                    	Electiva profesional IV                                *
                         *                                                                             *
                         *  Este programa está dividido en 3 secciones. La primera permite obtener la  *
                         *	dirección de red, de broadcast, la primera, la última, la cantidad de 	   *
                         *  host disponibles y la mascara de subred a partir de una dirección ip.	   *
                         *																			   *
                         *  La segunda sección permite ingresar n cantidad de ips para identificar si  *
                         *  se encuentran en la mismo segmento de red.		                           *
                         *																			   *
                         *  La tercera sección permite realizar la segmentación de una red a partir de *
                         *  una ip ingresada y al cantidad de segmentos escogidos.					   *
                         *																			   *
                         *******************************************************************************/

window.onload = function()
{
	/****************** Funciones para identificación de Ip *************************/
	GetId("Identificar").onclick=function()
	{
		var Resultado1 = "";
		var Oct11 = Number(GetId("1-Oct1").value);
		var Oct21 = Number(GetId("1-Oct2").value);
		var Oct31 = Number(GetId("1-Oct3").value);
		var Oct41 = Number(GetId("1-Oct4").value);
		var Prefijo1 = Number(GetId("1-Prefijo").value);

		//Validaciones
		if ( ValidarOctetoIp(Oct11)  && ValidarOctetoIp(Oct21)  && ValidarOctetoIp(Oct31)
			&&	ValidarOctetoIp(Oct41)  && 	ValidarPrefijo(Prefijo1) ) 
		{
			//Conversiones a binario
			var Oct1Bin = new Array();
			Oct1Bin[0] = ABinario(Oct11);
			Oct1Bin[1] = ABinario(Oct21);
			Oct1Bin[2] = ABinario(Oct31);
			Oct1Bin[3] = ABinario(Oct41);

			var Prefijo1Bin = ABinarioPref(Prefijo1);		

			//Operación And
			var ResulAnd = OperarAND(Oct1Bin,Prefijo1Bin);
			var DirRed = ADecimal(ResulAnd);

			Resultado1 = 
						"<table>"
				      		+"<tr>"
				      			+"<td><input class='form-control' value="+ Oct1Bin[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Oct1Bin[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Oct1Bin[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Oct1Bin[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value='IP' disabled></td>"
				      		+"</tr>"
				      		+"<tr style='border-bottom: 2px solid #000;'>"
				      			+"<td><input class='form-control' value="+ Prefijo1Bin[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Prefijo1Bin[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Prefijo1Bin[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ Prefijo1Bin[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value='MASCARA' disabled></td>"
				      		+"</tr><tr><td><br></td></tr>"
				      		+"<tr>"
				      			+"<td><input class='form-control' value="+ ResulAnd[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ ResulAnd[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ ResulAnd[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ ResulAnd[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value='DIRECCIÓN DE RED (bin)' disabled></td>"
				      		+"</tr>"
				      		+"<tr>"
				      			+"<td><input class='form-control' value="+ DirRed[0] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ DirRed[1] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ DirRed[2] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value="+ DirRed[3] + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
				      			+"<td><input class='form-control' value='DIRECCIÓN DE RED (dec)' disabled></td>"
				      		+"</tr>";

			//Obtener Primera Ip
			var PrimeraIp = GetPrimeraIp(ResulAnd);
			var PrimeraIpDec = ADecimal(PrimeraIp);

			Resultado1 += 
			      		"</tr><tr><td><br></td></tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ PrimeraIp[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIp[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIp[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIp[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value='PRIMERA DIR (bin)' disabled></td>"
			      		+"</tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ PrimeraIpDec[0] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIpDec[1] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIpDec[2] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ PrimeraIpDec[3] + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value='PRIMERA DIR (dec)' disabled></td>"
			      		+"</tr>";

			//Obtener última Ip
			var UltimaIp = GetultimaIp(PrimeraIp,Prefijo1);
			var UltimaIpDec = ADecimal(UltimaIp);

			Resultado1 += 
						"</tr><tr><td><br></td></tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ UltimaIp[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIp[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIp[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIp[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value=' ÚLTIMA DIR (bin)' disabled></td>"
			      		+"</tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ UltimaIpDec[0] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIpDec[1] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIpDec[2] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ UltimaIpDec[3] + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value=' ÚLTIMA DIR (dec)' disabled></td>"
			      		+"</tr>"

			//Obtener dirección de broadcast
			var Broadcast = UltimaIp;
			Broadcast[3][7] = "1";
			var BroadcastDec = ADecimal(Broadcast);

			Resultado1 += 
			      		"</tr><tr><td><br></td></tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ Broadcast[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ Broadcast[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ Broadcast[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ Broadcast[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value='BROADCAST (bin)' disabled></td>"
			      		+"</tr>"
			      		+"<tr>"
			      			+"<td><input class='form-control' value="+ BroadcastDec[0] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ BroadcastDec[1] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ BroadcastDec[2] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value="+ BroadcastDec[3] + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
			      			+"<td><input class='form-control' value='BROADCAST (dec)' disabled></td>"
			      		+"</tr>"
			      		+"</tr><tr><td><br></td></tr>"
			      +"</table> ";

			// Obtener cantidada de host disponibles
			var HostDisp = GetHostDisp(Prefijo1);
			Resultado1 += "<h3 style='color:orange;''>Cantidad de host disponibles: " +HostDisp+ "</h3><br>";
			GetId("Resultado1").innerHTML = Resultado1;			
		};
	}; // Final de identificación de Ip

	/*** Funciones para saber si una ip pertenece a un mismo segmento de red ********/

	GetId("MismaRed").onclick=function()
	{
		var ErrorValidacion = [];
		var ErrorValPref = [];
		var DireccionesRedes = [];
		var j = 0; //control de errores de validación
		var k = 0; //control de errores de validación de prefijo

		var CantidadIp = GetId("MismaRed").value;
		CantidadIp = CantidadIp.split(" ");
		CantidadIp = CantidadIp[3];
		
		var Resultado2 = "<h2 style='background-color: #5BBF6A; color: Snow'>Procedimiento</h2><table class='table table-striped table-bordered table-hover'>"
							+"<tr>"	
								+"<th colspan='2'>Mascara</th>"						
								+"<th colspan='2'>Direcciones Ip</th>"								
								+"<th colspan='2' align='center'>Dirección de Red</th>"
				      		+"</tr>"
				      		+"<tr>"
								+"<th>Decimal</th>"
								+"<th>Binaria</th>"
								+"<th>Binaria</th>"
								+"<th>Decimal</th>"
								+"<th>Decimal</th>"
								+"<th>Binaria</th>"
				      		+"</tr>";

		for (var i = 1; i <= CantidadIp; i++) {

			var Oct2_1 = Number(GetId("2_"+i+"-Oct1").value);
			var Oct2_2 = Number(GetId("2_"+i+"-Oct2").value);
			var Oct2_3 = Number(GetId("2_"+i+"-Oct3").value);
			var Oct2_4 = Number(GetId("2_"+i+"-Oct4").value);
			var Prefijo2= Number(GetId("2_"+i+"-Prefijo").value);
		
			//Validaciones
			if ( ValidarOctetoIp(Oct2_1)  && ValidarOctetoIp(Oct2_2)
			    && ValidarOctetoIp(Oct2_3) &&	ValidarOctetoIp(Oct2_4)  
			    	&& 	ValidarPrefijo(Prefijo2) ) 
			{
				//Conversiones a binario
				var OctBin = new Array();
				OctBin[0] = ABinario(Oct2_1);
				OctBin[1] = ABinario(Oct2_2);
				OctBin[2] = ABinario(Oct2_3);
				OctBin[3] = ABinario(Oct2_4);

				var Prefijo2Bin = ABinarioPref(Number(GetId("2_"+i+"-Prefijo").value));		

				//Operación And
				var ResulAnd = OperarAND(OctBin,Prefijo2Bin);
				var DirRed = ADecimal(ResulAnd);
				
				DireccionesRedes[i-1] = DirRed.join(".");
				Resultado2 += 
							"<tr>"	
								+"<td>"+Prefijo2+"</td>"
								+"<td>"+Prefijo2Bin[0].join("")+"."+Prefijo2Bin[1].join("")+"."+Prefijo2Bin[2].join("")+"."+Prefijo2Bin[3].join("")+"</td>"							

								+"<td>"+OctBin[0].join("")+"."+OctBin[1].join("")+"."+OctBin[2].join("")+"."+OctBin[3].join("")+"</td>"							
								+"<td>"+Oct2_1+"."+Oct2_2+"."+Oct2_3+"."+Oct2_4+"</td>"	

								+"<td>"+DirRed.join(".")+"</td>"
								+"<td>"+ResulAnd[0].join("")+"."+ResulAnd[1].join("")+"."+ResulAnd[2].join("")+"."+ResulAnd[3].join("")+"</td>"								
				      		+"</tr>";
				
			}else
			{				
				if(!ValidarPrefijo(Prefijo2))
				{
					ErrorValPref[k] = i;
					k++;
				}else
				{
					ErrorValidacion[j] = i;
					j++;
				}
			}
		};// fin for

		if(ErrorValidacion.length > 0)
		{
			ErrorValidacion = ErrorValidacion.join(" - ");
			GetId("Error").innerHTML = "Los octetos de la ip("+ErrorValidacion+")deben estar entre 0 y 255. Esta Ip no se tendra en cuenta para el proceso";
			setTimeout(QuitarMensaje, 5000);
		}
		if(ErrorValPref.length > 0)
		{
			ErrorValPref = ErrorValPref.join(" - ");
			GetId("Error").innerHTML = "El prefijo de la ip("+ErrorValPref+")debe estar entre 0 y 32. Esta Ip no se tendra en cuenta para el proceso";
			setTimeout(QuitarMensaje, 5000);
		}
		Resultado2 += "</table><h2 style='background-color: #3284F6; color: Snow'>Agrupación por redes</h2>";
		GetId("Resultado2").innerHTML = Resultado2;

		Resultado2_2 = "<table class='table table-striped table-bordered table-hover'><tr>"

		DireccionesRedes = DireccionesRedes.unique().sort(); //eliminar elementos repetidos

		var L = 0; //control de errores de validación
		var k = 0; //control de errores de validación de prefijo
		for (var j = 0; j < DireccionesRedes.length; j++) 
		{	
			Resultado2_2 += "<th>"+DireccionesRedes[j]+"</th>";
		};
		Resultado2_2 += "</tr>";
		for (var j = 0; j < DireccionesRedes.length; j++) 
		{
			for (var i = 1; i <= CantidadIp; i++) 
			{
				var Oct2_1 = Number(GetId("2_"+i+"-Oct1").value);
				var Oct2_2 = Number(GetId("2_"+i+"-Oct2").value);
				var Oct2_3 = Number(GetId("2_"+i+"-Oct3").value);
				var Oct2_4 = Number(GetId("2_"+i+"-Oct4").value);
				var Prefijo2= Number(GetId("2_"+i+"-Prefijo").value);
			
				//Validaciones
				if ( ValidarOctetoIp(Oct2_1)  && ValidarOctetoIp(Oct2_2)
				    && ValidarOctetoIp(Oct2_3) &&	ValidarOctetoIp(Oct2_4)  
				    	&& 	ValidarPrefijo(Prefijo2) ) 
				{
					//Conversiones a binario
					var OctBin = new Array();
					OctBin[0] = ABinario(Oct2_1);
					OctBin[1] = ABinario(Oct2_2);
					OctBin[2] = ABinario(Oct2_3);
					OctBin[3] = ABinario(Oct2_4);

					var Prefijo2Bin = ABinarioPref(Number(GetId("2_"+i+"-Prefijo").value));		

					//Operación And
					var ResulAnd = OperarAND(OctBin,Prefijo2Bin);
					var DirRed = ADecimal(ResulAnd);
					DirRed = DirRed.join(".");

					if(DireccionesRedes[j] == DirRed)
					{
						Resultado2_2 += "<tr>";	
						if(j == 0)
						{
							Resultado2_2 += "<td>"+Oct2_1+"."+Oct2_2+"."+Oct2_3+"."+Oct2_4+"</td>";
							for (var a = 0; a < DireccionesRedes.length-1; a++) {
								Resultado2_2 += "<td>--</td>";
							};
						}else
						{
							for (var a = 0; a < j; a++) {
								Resultado2_2 += "<td>--</td>";
							};
							Resultado2_2 += "<td>"+Oct2_1+"."+Oct2_2+"."+Oct2_3+"."+Oct2_4+"</td>";
							for (var a = 0; a < (DireccionesRedes.length-1)-j; a++) {
								Resultado2_2 += "<td>--</td>";
							};
						}
						Resultado2_2 += "</tr>";						
					}	
				}else
				{				
					if(!ValidarPrefijo(Prefijo2))
					{
						ErrorValPref[k] = i;
						k++;
					}else
					{
						ErrorValidacion[L] = i;
						j++;
					}
				}
			};// fin for
		}
		GetId("Resultado2_2").innerHTML = Resultado2_2;				
	}

	/****************** Funciones para segmentación de red *************************/
	GetId("Segmentar").onclick=function()
	{
		var Resultado3 = "";
		var Oct13 = Number(GetId("3-Oct1").value);
		var Oct23 = Number(GetId("3-Oct2").value);
		var Oct33 = Number(GetId("3-Oct3").value);
		var Oct43 = Number(GetId("3-Oct4").value);
		var Prefijo3 = Number(GetId("3-Prefijo").value);
		var Bits = Number(GetId("3-bits").value);

		if(Bits <= (32-Prefijo3))
		{
			//Validaciones
			if ( ValidarOctetoIp(Oct13)  && ValidarOctetoIp(Oct23)  && ValidarOctetoIp(Oct33)
				&&	ValidarOctetoIp(Oct43)  && 	ValidarPrefijo(Prefijo3) ) 
			{
				//Conversiones a binario
				var Oct3Bin = new Array();
				Oct3Bin[0] = ABinario(Oct13);
				Oct3Bin[1] = ABinario(Oct23);
				Oct3Bin[2] = ABinario(Oct33);
				Oct3Bin[3] = ABinario(Oct43);

				var Prefijo3Bin = ABinarioPref(Prefijo3);		

				//Operación And
				var ResulAnd3 = OperarAND(Oct3Bin,Prefijo3Bin);
				var DirRed3 = ADecimal(ResulAnd3);

				Resultado3 = 
							"<table>"
					      		+"<tr>"
					      			+"<td><input class='form-control' value="+ Oct3Bin[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Oct3Bin[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Oct3Bin[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Oct3Bin[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value='IP' disabled></td>"
					      		+"</tr>"
					      		+"<tr style='border-bottom: 2px solid #000;'>"
					      			+"<td><input class='form-control' value="+ Prefijo3Bin[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Prefijo3Bin[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Prefijo3Bin[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ Prefijo3Bin[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value='MASCARA' disabled></td>"
					      		+"</tr><tr><td><br></td></tr>"
					      		+"<tr>"
					      			+"<td><input class='form-control' value="+ ResulAnd3[0].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ ResulAnd3[1].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ ResulAnd3[2].join("") + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ ResulAnd3[3].join("") + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value='DIRECCIÓN DE RED (bin)' disabled></td>"
					      		+"</tr>"
					      		+"<tr>"
					      			+"<td><input class='form-control' value="+ DirRed3[0] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ DirRed3[1] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ DirRed3[2] + " disabled></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value="+ DirRed3[3] + " disabled></td><td>&nbsp;&nbsp;-----&nbsp;&nbsp;</td>"
					      			+"<td><input class='form-control' value='DIRECCIÓN DE RED (dec)' disabled></td>"
					      		+"</tr>"
					      		+"</tr><tr><td><br></td></tr>"
				      		+"</table> ";

				Resultado3 += 
							"<table class='table table-striped table-bordered table-hover'>"
								+"<tr>"
									+"<th>Red #</th>"
									+"<th>Dirección de Red Segmentada(Bin)</th>"
									+"<th>Dirección de Red Segmentada(Dec)</th>"
					      		+"</tr>";
				var Segmentos = Segmentar(Prefijo3Bin,ResulAnd3,Bits);
				var OctetosSegmento = [];
				var Control = 0;
				var OctetosSegmentoDec = [];
				//Obtener 4 octetos de cada segmento de red
				for (var a = 0; a < Segmentos.length; a++) {		
				
					for (var i = 0; i < 4; i++) {
						OctetosSegmento[i] = [];

						for (var j = 0; j < 8; j++) {
							if(Control == 32)
							{
								Control = 0;
							}
							OctetosSegmento[i][j] = Segmentos[a][Control];
							Control++;
						};
					};
					OctetosSegmentoDec = ADecimal(OctetosSegmento);

					Resultado3 += "<tr> <td>"+(a+1)+"</td>"
						+"<td>"+OctetosSegmento[0].join("")+"."+OctetosSegmento[1].join("")+"."+OctetosSegmento[2].join("")+"."+OctetosSegmento[3].join("")+"</td>"
						+"<td>"+OctetosSegmentoDec[0]+"."+OctetosSegmentoDec[1]+"."+OctetosSegmentoDec[2]+"."+OctetosSegmentoDec[3]+" /"+(Number(Prefijo3+Bits))+"</td>";
				};
				Resultado3 += "</table> ";

				// Obtener cantidada de host disponibles
				var HostDisp = GetHostDisp(Prefijo3+Bits);
				Resultado3 += "<h3 style='color:orange;''>Cantidad de host disponibles por segmento: " +HostDisp+ "</h3><br>";
				GetId("Resultado3").innerHTML = Resultado3;		
			}
		}else
		{
			GetId("Resultado3").innerHTML = "";		
			GetId("Error").innerHTML = "No es posible segmentar " +Math.pow(2,Bits)+ " redes debido a que no hay suficientes bits de host disponibles con un prefijo de red igual a "+Prefijo3;
			setTimeout(QuitarMensaje, 8000);
		}
	}; //Final de Segmentación de Ip
}

/******** Funciones generales *********/
function ABinario(Valor)
{
	var Conversiones = [128,64,32,16,8,4,2,1];
	var Binario = [];
	var ValorDeseado = true;
	
	for(var i=0; i < Conversiones.length; i++)
	{
		if (ValorDeseado) 
		{
			Valor = Valor - Conversiones[i];		
			if(Valor >= 0)
			{
			    Binario[i] = "1";
			    if(Valor == 0) //se alcanza el valor deseado, el resto deben ser 0
			    {
					ValorDeseado = false;
			    }		    
			}else
			{
				Binario[i] = "0";
				Valor = Valor + Conversiones[i];
			}
		}else
		{
			Binario[i] = "0";
		}
	}
	return Binario;	
}

function ABinarioPref(Valor)
{
	var PrefBinario = [];
	var Control = 0;

	for (var i = 0; i < 4; i++) 
	{
		PrefBinario[i] = [];
		for (var j = 0; j < 8; j++) 
		{
			if (Control < Valor)
			{
				PrefBinario[i][j] = "1";
			}else
			{
				PrefBinario[i][j] = "0";
			}
			Control ++;	
		};
			
	};
	return PrefBinario;
}

function OperarAND(Ip,Mascara)
{
	var AND = [];

	for (var i = 0; i < 4; i++) 
	{
		AND[i] = [];
		for (var j = 0; j < 8; j++) 
		{
			if (Ip[i][j] == "1" && Mascara[i][j] == "1")
			{
				AND[i][j] = "1";
			}else
			{
				AND[i][j] = "0";
			}
		};			
	};
	return AND;
}

function ADecimal(Ip)
{
	var Conversiones = [128,64,32,16,8,4,2,1];
	var Decimal = [0,0,0,0];
	for (var i = 0; i < 4; i++) 
	{
		for (var j = 0; j < 8; j++) 
		{
			if (Ip[i][j] == "1")
			{
				Decimal[i] = Decimal[i] + Conversiones[j];
			}else
			{
				Decimal[i] = Decimal[i] + 0;
			}
		};			
	};
	return Decimal;
}

function GetPrimeraIp(Dir)
{
	Dir[3][7] = "1";
	return Dir;
}

function GetultimaIp(Dir,Prefijo)
{
	var bitHost = 32-Prefijo;
	var j = 6; //posición del penultimo bit
	var k = 3;
	if(bitHost <= 8)
	{
		for (var i = 0; i < bitHost-1; i++) {
			Dir[3][j] = "1";
			j--;					
		};
	}else 
	{			
		for (var i = 0; i < bitHost-1; i++) 
			{
				Dir[k][j] = "1";					
				if(j == 0)
				{ 
					Dir[k][j] = "1";			
					j = 8;
					k--;
				}
				j--;
			}	
	}
	Dir[3][7] = "0";
	return Dir;
}

function GetHostDisp(Prefijo)
{
	var bitHost = 32-Prefijo;
	var resul = (Math.pow(2,bitHost))-2;
	return resul;	
}

function AddIp(id)
{
	//Cambiar id del botón añadir Ip (azul), Eliminar Ip (Rojo) y el valor del botón comparar (naranja)
	id = Number(id);
	Nid = id+1;
	GetId(id).setAttribute("id", Nid); //nuevo id a boton añadir
	GetId("e-"+id).setAttribute("id", "e-"+Nid); // nuevo id a botón eliminar
	GetId("MismaRed").setAttribute("value", "IP's a comparar: " + Nid);

	//Añadir nueva ip a la tabla
	//var Tabla = GetId("tbComparar");
    var Fila = GetId("tbComparar").insertRow(Nid);
    Fila.innerHTML = "<td><b>Ip # "+Nid+"</td><td><input type='number' class='form-control' id='2_"+Nid+"-Oct1' placeholder = '0' required></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
	      			+"<td><input type='number' class='form-control' id='2_"+Nid+"-Oct2' placeholder = '0' required></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
	      			+"<td><input type='number' class='form-control' id='2_"+Nid+"-Oct3' placeholder = '0' required></td><td>&nbsp;&nbsp;<b>.&nbsp;&nbsp;</td>"
	      			+"<td><input type='number' class='form-control' id='2_"+Nid+"-Oct4' placeholder = '0' required></td><td>&nbsp;&nbsp;<b>/&nbsp;&nbsp;</td>"
	      			+"<td><input type='number' class='form-control' id='2_"+Nid+"-Prefijo' placeholder = '0' required></td><td>&nbsp;&nbsp;</td>";	
}

function DeleteIp(id)
{
	//Cambiar id del botón añadir Ip (azul), Eliminar Ip (Rojo) y el valor del botón comparar (naranja)
	id = id.split("e-");
	id = Number(id[1]);
	Nid = id-1;

	//Eliminar última ip a la tabla
	if(Nid >= 2) 
	{
		GetId(id).setAttribute("id", Nid); //nuevo id a boton añadir
		GetId("e-"+id).setAttribute("id", "e-"+Nid); // nuevo id a botón eliminar
		GetId("MismaRed").setAttribute("value", "IP's a comparar: " + Nid);
		GetId("tbComparar").deleteRow(Nid+1);
	}else
	{
		GetId("Error").innerHTML = "Debe existir al menos 2 IP's para comparar";
		setTimeout(QuitarMensaje, 3000);
	}
}

Array.prototype.unique=function(a){
  return function(){return this.filter(a)}}(function(a,b,c){return c.indexOf(a,b+1)<0
});

function Segmentar(Mascara,Red,Bits)
{
	var Segmentos = [];
	var pos = 0;
	var CantRedes = Math.pow(2,Bits);
	var Control = 0;
	Red = Red.join(",").split(",");
	Mascara = Mascara.join(",").split(",");
	var NuevaMascara = Red;
	var MascarasCombinadas = [];
	var Resultado = [];

	//Crear dimensiones de la variable Segmentos
	for (var i = 0; i < Bits; i++) {
		
		for (var j = 0; j < Math.pow(2,Bits); j++) {
			Segmentos[j] = [];
		};
	};

	//generar combinaciones de bits
	for (var i = 0; i < Bits; i++) {

		for (var j = 0; j < Math.pow(2,Bits); j++) {
			if(j == 0){ Control = 0; }	

			if(Control == CantRedes)
			{				
				Control = 0;
			}	

			if(Control < (CantRedes/2))
			{
				Segmentos[j][i] = "0";
				Control++;
			}
			else
			{
				Segmentos[j][i] = "1";
				Control++;
			}

			if(j == Math.pow(2,Bits)-1)
			{
			 CantRedes = CantRedes / 2;
			 Control = 0;	
			}
		};
	};

	//identificar donde acaban los bits de red
	for (var i = 0; i < Mascara.length; i++) 
	{
		if(Mascara[i] == "0")
		{
			pos = i;
			break;
		}
	};

	//unir la combinacion de bits con el resto de la mascara
	for (var i = 0; i < Segmentos.length; i++) {
		 NuevaMascara.splice(pos, 1, Segmentos[i].join(""));
		 MascarasCombinadas[i] = NuevaMascara.join("");
	};
	return MascarasCombinadas;
}

function ValidarOctetoIp(Valor)
{
	var Cumple = true;

	if(Valor < 0 || Valor > 255)
	{
		GetId("Error").innerHTML = "Los octetos de la ip deben estar entre 0 y 255";
		setTimeout(QuitarMensaje, 4000);
		Cumple = false;
	}
	if(isNaN(Valor))
	{
		GetId("Error").innerHTML = "Los octetos de la ip no deben contener letras";
		setTimeout(QuitarMensaje, 4000);
		Cumple = false;
	}	

	return Cumple;
}

function ValidarPrefijo(Valor)
{
	var Cumple = true;

	if(Valor < 0 || Valor > 32)
	{
		GetId("Error").innerHTML = "Los valores del prefijo debe estar entre 0 y 32";
		setTimeout(QuitarMensaje, 4000);
		Cumple = false;
	}
	return Cumple;
}

function QuitarMensaje(){	GetId("Error").innerHTML = ""; }

function GetId(id){	return document.getElementById(id); }