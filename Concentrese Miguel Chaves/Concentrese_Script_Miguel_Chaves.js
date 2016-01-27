window.onload = function()
{
	inicio();
}
function inicio()
{
	var txtFichas = ["1","1","2","2","3","3","4","4","5","5"]; // arreglo que contiene los numeros a imprimir
	var jugada = 1; // variable en la que va  apermitir contar la jugada que se realiza en cada turno
	var campo1;
	var campo2;
	var prueba = 0;

/**********************************************************************
*Funcion que permite crear el escenario desde javascrip enviando      *
*variables de texo directamente al archivo de html                    *
**********************************************************************/
	var creaEscenario = function()
	{
		var txt = "<table id = 'chess_board' cellpadding = '0' cellspacing = '0'>";
		var divTabla = "";
		for(var i = 1; i <= 2; i++)
		{
			txt += "<tr>";
			for(var c = 1; c <= 5; c++)
			{
				divTabla = i + "_" + c;
				txt += "<td id = '"+(divTabla)+"'></td>";
			}
			txt += "</tr>";
		}
		txt += "</table>";
		return txt;
	}
	nom_div("escenario").innerHTML = creaEscenario();
	
/**********************************************************************
*Funcion que permite enviar un texto vacio al escenario para que no se* 
imprima nada y asi poder limpiar todo el tablero                      *
**********************************************************************/
	var limpiaEscenario = function()
	{
		for(i = 1; i <= 2; i++)
		{
			for(c = 1; c <= 5; c++)
			{
				nom_div(i+"_"+c).innerHTML = "";
			}
		}
	}
/**********************************************************************
*Funcion que permite re-organizar los elementos del arreglo txtFichas *
*de manera aleatoria y luego imprimirlo en el escenario para que el   *
*usuario pueda vizualizar las fichas y aprenderselas para asi iniciar *
*el juego.															  *
**********************************************************************/
	var PonerFichas = function()
	{
		//carga y organiza el arreglo txtFichas aleatoriamente
		var aux = 0;
		var t = 0;
		for(i = 0; i < 10; i++)
		{
			var aleatorio = Math.round(Math.random() * 9);
			aux = txtFichas[i]; 
			txtFichas[i] = txtFichas[aleatorio]; 
			txtFichas[aleatorio] = aux; 
		}
		//imprime el arreglo aleatorio en el tablero
		for(i = 1; i <= 2; i++)
		{
			for(c = 1; c <= 5; c++)
			{
				nom_div(i+"_"+c).innerHTML = txtFichas[t];
				t++;
			}
		}
	}

/**********************************************************************
*Fracmento que permite despues de que se ocultaln las fichas, poder  *
*impimir la ficha q se le ha asiganado a acada espacio               *
**********************************************************************/
	// si turno es 1 hae la priemra si es dos ahce la segunda si desps del dos hay iguale shacer lod elso comen

	var idjugada1 = 0;
	for(var i = 1; i <= 2; i++)
	{
		for(var c = 1; c <= 5; c++)
		{
			//divTabla = i + "_" + c;
			//nom_div(divTabla).addEventListener('click', function(event)
			nom_div(i + "_" + c).addEventListener('click', function(event)	
			{
				var posClick = event.target.id.split("_");
				if(jugada == 1)
				{
					jugada = 2;

					if(posClick[0] == 1) // si es la primera fila imprime los valores de txtFichas en la poscicion entre el 0 y el 4
					{

					 campo1 = nom_div(posClick[0]+"_"+posClick[1]).innerHTML = txtFichas[posClick[1]-1]; 
					 idjugada1 = posClick[0]+"_"+posClick[1];
					 //console.log("el id es: " + idjugada1);
					}else
					{
					
					 campo1 = nom_div(posClick[0]+"_"+posClick[1]).innerHTML = txtFichas[(posClick[1]-1)+5];
					 idjugada1 = posClick[0]+"_"+posClick[1];	
					 //console.log("el id es: " + idjugada1);
					}

				}

				else
				{					
					if(posClick[0] == 1) // si es la primera fila imprime los valores de txtFichas en la poscicion entre el 0 y el 4
					{
					campo2 = nom_div(posClick[0]+"_"+posClick[1]).innerHTML = txtFichas[posClick[1]-1]; 
					}else
					{
					campo2 = nom_div(posClick[0]+"_"+posClick[1]).innerHTML = txtFichas[(posClick[1]-1)+5];
					}

					if(campo1 == campo2)
					{
						//no hace nada solo deja los numeros impresos
					}else
					{
						alert("Los numeros no son iguales");
						nom_div(posClick[0]+"_"+posClick[1]).innerHTML = "";// borra el texto de al posicion de la jugada dos
						nom_div(idjugada1).innerHTML = ""; // imprime un vacion en la posicion del priemr clic
						//console.log("el id en le else: " + idjugada1); // aca el idjugada uno deja de ser un object HTMLTableCellElement ys e convierte en un 0
					}
					idjugada1 = 0;
					jugada = 1;
				}
			});
		}
	}


	// al hacer clic  en la division limpiar que es el id de un boton en html
	//llamamos la funcion limpiaEscenario()
	nom_div("Limpiar").addEventListener('click', function(event)
	{
		limpiaEscenario();
	});
	// al hacer clic  en la division IniciarJuego que es el id de un boton en html
	//llamamos la funcion PonerFichas()
	nom_div("IniciarJuego").addEventListener('click', function(event)
	{
		PonerFichas();
	});
}

// funcion que permite capturar el id de un elemento de html
function nom_div(div)
{
	return document.getElementById(div);
}