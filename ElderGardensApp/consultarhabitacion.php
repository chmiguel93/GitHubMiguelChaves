<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/habitacion.php'; //llama a la clase persona
extract($_POST);
?>
<style type="text/css">
	.error
	{
		color: red;
	}
</style>
<script type="text/javascript">
function eliminar(id_el)
{
	id_el = id_el.split("-");// la variable id_el llega algo como:"Eliminar-1" asi que se separa por el guion y en laposicion [1] se toma solo el # que será el id para eliminar el registro
	cargando("<img src='images/ajax-loader.gif' /> Eliminando");		
    //quita el cuadro de cargando de la pagina
    setTimeout(function() {
        parent.$("#loading").modal('hide');              
    }, 1000);
    $('#contenido2').load('consultarhabitacion.php?id_hab='+id_el[1]);// enviar variable id_el[1] a la misma pagina por medio de get
    $("#PrimeraDiv").hide();
}

function editar(id_ed)
{
	id_ed = id_ed.split("-");
	cargando("<img src='images/ajax-loader.gif' /> Eliminando");		
    //quita el cuadro de cargando de la pagina
    setTimeout(function() {
        parent.$("#loading").modal('hide');              
    }, 1000);
    $('#contenido2').load('editar_habitacion.php?id_hab='+id_ed[1]);
}

function todos()
{
	if ($('#check').is(":checked"))
	{
	 	$("#PrimeraDiv").hide();
	}else
	{
		$("#PrimeraDiv").show();
	}
}
 	$('#Enviar').click(function (){
 		
 		if ($("#formulario-principal").validate().form() === true){ // valida campos del formulario
 			cargando('<img src="images/ajax-loader.gif" /> Buscando');
 			
            //quita el cuadro de cargando de la pagina
            setTimeout(function() {
                parent.$("#loading").modal('hide');              
            }, 1000);

            $.ajax({
                url : "<?php echo $_SERVER['PHP_SELF']; ?>",
                type: "POST",
                data: $("#formulario-principal").serialize(),
                success: function(data){
                	$("#contenido2").html(data).show();
                	$("#formulario-principal").hide();
                },
                error: function (request, status, error) {
                    alert('Se produjo un error ' + request.responseText);
                }
            });
        }
        return false;	 		           
	});
</script>
<h2>Consultar Habitaciones</h2>
	<form id="formulario-principal">
	<div style="width:80%; padding: 1%" id="PrimeraDiv">			
		<div class="form-group">
		    <label for="numero">Ingrese # de habitación</label>
		    <input type="number" class="form-control" id="numero" name ="numero" required>
		  </div>
	</div>
		<div class="form-group">
			<span class="form-group">
				<label for="check"><h4>Consultar todas</h4></label>
				<input id="check" name="check" type="checkbox" onchange="todos()">
			</span>
		 </div>

		<button id = "Enviar" type="submit" class="btn btn-primary">Consultar</button>
	</form>


<?php
if(isset($_POST["check"]))
{	
	$query = 'SELECT * FROM `habitaciones`';
	$result = mysql_query($query);
	$numresul = mysql_num_rows($result); 
	echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>		
			<td><strong>Capacidad<strong></td>
			<td><strong>Descripción<strong></td>
			<td><strong>Precio<strong></td>
			<td><strong>Numero<strong></td>
			<td><strong>Acciones<strong></td>
		</tr>
		<tr></tr>';
	while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
	{
		$id_hab = $fila['id_habitacion'];
		$capacidad = $fila['capacidad'];
		$descripcion = $fila['descripcion'];
		$precio = $fila['precio'];
		$numero = $fila["numero"];

	echo "<tr>				
			<td>".$capacidad."</td>
			<td>".utf8_encode($descripcion)."</td>
			<td>".$precio."</td>
			<td>".$numero."</td>
			<td>
				<center>
					 <button class='btn btn-info' id='Editar-".$id_hab."' onClick='editar(this.id)'>Editar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
					 <button class='btn btn-danger' id='Eliminar-".$id_hab."' onClick='eliminar(this.id)'>Eliminar</button>
				</center>
			</td>
	  </tr>
	  <tr></tr>";
	}	
}// fin if
else{
	if(isset($_POST["numero"]))
	{	
		$numero = $_POST["numero"];
		// Realizar una consulta MySQL
		$query = 'SELECT * FROM `habitaciones` WHERE `numero`='.$numero;
		$result = mysql_query($query);
		$numresul = mysql_num_rows($result); 
		if($numresul>0)
			{
				echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>		
						<td><strong>Capacidad<strong></td>
						<td><strong>Descripción<strong></td>
						<td><strong>Precio<strong></td>
						<td><strong>Numero<strong></td>
						<td><strong>Acciones<strong></td>
					</tr>
					<tr></tr>';
				while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
				{
					$id_hab = $fila['id_habitacion'];
					$capacidad = $fila['capacidad'];
					$descripcion = $fila['descripcion'];
					$precio = $fila['precio'];
					$numero = $fila["numero"];

					echo "<tr>				
							<td>".$capacidad."</td>
							<td>".utf8_encode($descripcion)."</td>
							<td>".$precio."</td>
							<td>".$numero."</td>
							<td>
							 <center>
								 <button class='btn btn-info' id='Editar-".$id_hab."' onClick='editar(this.id)'>Editar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								 <button class='btn btn-danger' id='Eliminar-".$id_hab."' onClick='eliminar(this.id)'>Eliminar</button>
							</center>
							</td>
					  </tr>
					  <tr></tr>";
				}
			}else
			{
				echo '<script type="text/javascript">
						$("#msgbox").html("No hay habitaciones relacionadas con el numero ingresado!!!");
	                    ocultar(1, "alert alert-danger");
						$("#contenido2").load("consultarhabitacion.php")
					</script>';
			}	
	}// fin if
}// fin else

if (isset($_GET['id_hab'])) 
{
	$hab = new habitacion();
	$respuesta = $hab->eliminar($_GET['id_hab']);	
	if($respuesta == 1)
	{
		echo '<script type="text/javascript">					
					$("#msgbox").html("Registro eliminado exitosamente!!!");
                    ocultar(1, "alert alert-success");
					$("#contenido2").load("consultarhabitacion.php");
				</script>';
	}else
	{
		echo '<script type="text/javascript">
					$("#msgbox").html('.$respuesta.');
                    ocultar(1, "alert alert-danger");
					$("#contenido2").load("consultarhabitacion.php");
				</script>';
	}
} 
?> 
