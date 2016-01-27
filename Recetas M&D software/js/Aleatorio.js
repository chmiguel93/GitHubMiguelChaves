// JavaScript Document
/*******************************************************************************
 *                                                                             *
 *                    UNIVERSIDAD DE CUNDINAMARCA                              *
 *                             EXT CHIA                                        *
 *                    Empresa M&D software                                     *
 *                    Desarrolladores: Miguel Chaves                           *   
 *                                   : Deisy Peña                              *
 *                                   : Camilo Urrea                            *
 *                    Semestre  VI                                             *
 *                    Ingenieria de software 1                                 *
 *                    Nombre del proyecto: Pagina web de recetas colombianas   *
 *                                                                             *
 * Este es un archivo tipo javascript,nos permite realizar toda la programación*
 * de nuestra pagina, en este caso tendremos tres funciones diferentes con     *
 * arreglos los cuales se van a imprimir aleatoriamente en la pagina por medio *
 * de la funcion Math.randomr() y Math.floor().								   *
 *																			   *
 ******************************************************************************/

function plato()
{
	var platos_fuertes = ["bandeja paisa", "Ajiaco", "Cazuela de mariscos", "Cocido boyasence", "Cuchuco de espinazo"];
	var resultado = Math.floor(Math.random() * platos_fuertes.length);//la funcion random solo coje valores entre 0 y 1 por eso es necesario multiplicarla por la longitud del arreglo y leugo sacarle el piso con la funcion de math.floor para siempre tener un valor entero
	//cuando multiplicamos el math.random()* un numero este nos dara el rango que necesitemos 
	//ej: math.random()*10   rango igual a 0.0 hasta 9.0, en este programa tenemos 5 espacios del arreglo por lo cual nuestro rango sera entre 0.0 y 5.0, si ahcemos esto dentro de la funcion math.floor solo sno va  atomar los valores positivos entre 0 y 5 
	//resultado indica el espacio o lugar de cada plato_fuerte 
	document.write(platos_fuertes[resultado]);
}

function entrada()
{
	var entradas = ["carimañolas", "Empanadas de pipian", "pasabocas de ciruela con tocineta", "tacos fantasmas", "tortillas de camarones"];
	var resultadoent = Math.floor(Math.random() * entradas.length);
	document.write(entradas[resultadoent]);
}

function postre()
{
	var postres = ["Cuajada con melao", "fresas con crema", "leche asada", "merengon", "torta de queso"];
	var resultadopos = Math.floor(Math.random() * postres .length);
	document.write(postres[resultadopos]);
}