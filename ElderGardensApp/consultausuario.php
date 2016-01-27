<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona
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
    $('#contenido2').load('consultausuario.php?idpersona='+id_el[1]);// enviar variable id_el[1] a la misma pagina por medio de get
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
    $('#contenido2').load('editar_paciente.php?idpersona='+id_ed[1]);
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
<h2>Consultar Pacientes</h2>
	<form id="formulario-principal">
	<div style="width:80%; padding: 1%" id="PrimeraDiv">			
		<div class="form-group">
		    <label for="num_doc">Ingrese # de documento</label>
		    <input type="number" class="form-control" id="num_doc" name ="num_doc" required>
		  </div>
	</div>
		<div class="form-group">
			<span class="form-group">
				<label for="check"><h4>Consultar todos</h4></label>
				<input id="check" name="check" type="checkbox" onchange="todos()">
			</span>
		 </div>

		<button id = "Enviar" type="submit" class="btn btn-primary">Consultar</button>
	</form>


<?php
if(isset($_POST["check"]))
{	
	$query = 'SELECT * FROM `persona` WHERE `tipo_persona`=1';
	$result = mysql_query($query);
	$numresul = mysql_num_rows($result); 
	echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>		
			<td><strong>CEDULA<strong></td>
			<td><strong>NOMBRE<strong></td>
			<td><strong>APELLIDO<strong></td>
			<td><strong>FECHA DE NACIMIENTO<strong></td>
			<td><strong>ESTADO<strong></td>
			<td><strong>Acciones<strong></td>
		</tr>
		<tr></tr>';
	while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
	{
		$id_persona = $fila['id_persona'];
		$num_doc = $fila['num_doc'];
		$nombrepersona = $fila['nombre'];
		$apellido = $fila['apellido'];
		$estado = $fila["estado"];
		$fecha = $fila["fech_nac"];
		//valida los estados para aplciar un boton diferente
		if($estado == 1 )
		{
			$ImgEstado = '<button style="background-color: green; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Activo</button>';
		}else
		{
			if($estado == 2)
			{
				$ImgEstado = '<button style="background-color: orange; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Inactivo</button>';
			}else
			{
				$ImgEstado = '<button style="background-color: red; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Cancelado</button>';
			}
		}
		echo "<tr>				
				<td>".$num_doc."</td>
				<td>".$nombrepersona."</td>
				<td>".$apellido."</td>
				<td>".$fecha."</td>
				<td>".$ImgEstado."</td>
				<td>
					<center>
						 <button class='btn btn-info' id='Editar-".$id_persona."' onClick='editar(this.id)'>Editar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						 <button class='btn btn-danger' id='Eliminar-".$id_persona."' onClick='eliminar(this.id)'>Eliminar</button>
					</center>
				</td>
		  </tr>
		  <tr></tr>";
	}	
}// fin if
else{
	if(isset($_POST["num_doc"]))
	{	
		$num_doc = $_POST["num_doc"];
		// Realizar una consulta MySQL
		$query = 'SELECT * FROM `persona` WHERE `num_doc`='.$num_doc.' AND `tipo_persona`=1'; //consulta por # de documento cuando el tipo de persona es 1, es decir paciente
		$result = mysql_query($query);
		$numresul = mysql_num_rows($result); 
		if($numresul>0)
			{
				echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>		
						<td><strong>CEDULA<strong></td>
						<td><strong>NOMBRE<strong></td>
						<td><strong>APELLIDO<strong></td>
						<td><strong>FECHA DE NACIMIENTO<strong></td>
						<td><strong>ESTADO<strong></td>
						<td><strong>Acciones<strong></td>
					</tr>
					<tr></tr>';
				while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
				{
					$id_persona = $fila['id_persona'];
					$num_doc = $fila['num_doc'];
					$nombrepersona = $fila['nombre'];
					$apellido = $fila['apellido'];
					$estado = $fila["estado"];
					$fecha = $fila["fech_nac"];
					//valida los estados para aplciar un boton diferente
					if($estado == 1 )
					{
						$ImgEstado = '<button style="background-color: green; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Activo</button>';
					}else
					{
						if($estado == 2)
						{
							$ImgEstado = '<button style="background-color: orange; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Inactivo</button>';
						}else
						{
							$ImgEstado = '<button style="background-color: red; border-radius: 20px; color: white; width: 6em;  height: 2.5em;" disabled>Cancelado</button>';
						}
					}
					echo "<tr>				
							<td>".$num_doc."</td>
							<td>".$nombrepersona."</td>
							<td>".$apellido."</td>
							<td>".$fecha."</td>
							<td>".$ImgEstado."</td>
							<td>
							 <center>
								 <button class='btn btn-info' id='Editar-".$id_persona."' onClick='editar(this.id)'>Editar</button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								 <button class='btn btn-danger' id='Eliminar-".$id_persona."' onClick='eliminar(this.id)'>Eliminar</button>
							</center>
							</td>
					  </tr>
					  <tr></tr>";
				}
			}else
			{
				echo '<script type="text/javascript">
						$("#msgbox").html("No hay pacientes relacionados con el numero de documento ingresado!!!");
	                    ocultar(1, "alert alert-danger");
						$("#contenido2").load("consultausuario.php")
					</script>';
			}	
	}// fin if
}// fin else

if (isset($_GET['idpersona'])) 
{
	$paciente = new persona();
	$respuesta = $paciente->eliminar($_GET['idpersona']);	
	if($respuesta == 1)
	{
		echo '<script type="text/javascript">					
					$("#msgbox").html("Registro eliminado exitosamente!!!");
                    ocultar(1, "alert alert-success");
					$("#contenido2").load("consultausuario.php");
				</script>';
	}else
	{
		echo '<script type="text/javascript">
					$("#msgbox").html('.$respuesta.');
                    ocultar(1, "alert alert-danger");
					$("#contenido2").load("consultausuario.php");
				</script>';
	}
} 
?> 
