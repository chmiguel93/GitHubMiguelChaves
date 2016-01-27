<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona
require_once 'clases/habitacion.php';
if(isset($_POST["numero"]))
{
	$id_hab = $_POST["numero"];
	$query = 'SELECT * FROM `habitaciones` WHERE id_habitacion='.$id_hab;
	$result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
	while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
	{
		$num_Hab = $fila['numero'];
	}
	echo '<script type="text/javascript">
				$("#SegundaDiv").hide();
              </script>
          <h3 class="well">Pacientes de la Habitación #'.$num_Hab.'</h3>';
	
	$consulta = 'SELECT id_persona FROM `habitacion_persona` WHERE id_habitacion ='.$id_hab;
	$resultado = mysql_query($consulta);
	$numresul = mysql_num_rows($resultado); 
	if($numresul>0)
	{
		echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>		
				<td><strong>CEDULA<strong></td>
				<td><strong>NOMBRE<strong></td>
				<td><strong>APELLIDO<strong></td>
				<td><strong>FECHA DE NACIMIENTO<strong></td>
				<td><strong>ESTADO<strong></td>
			</tr>
			<tr></tr>';
		while($fila1 = mysql_fetch_array($resultado, MYSQL_ASSOC))
		{
			$idPerHab = $fila1['id_persona'];
		
			$query = 'SELECT * FROM `persona` WHERE `id_persona`='.$idPerHab.' AND `tipo_persona` = 2';
			$result = mysql_query($query);

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
					  </tr>
					  <tr></tr>";
				}// fin while persona		
		}//fn while habitacion	
	}else
	{
		echo '<script type="text/javascript">
				$("#msgbox").html("No hay pacientes asignados a esta habitación");
              	ocultar(1, "alert alert-danger");
              	$("#contenido").load("consultarpacientehabitacion.php");
              </script>';
	}	
}
?>
<style type="text/css">
	.error
	{
		color: red;
	}
</style>
<script type="text/javascript">

$('#Consultar').click(function (){
	
	if ($("#formulario-principal").validate().form() === true){ // valida campos del formulario
		$("#SegundaDiv").hide();
		cargando('<img src="images/ajax-loader.gif" /> Asignando pacientes');
		
    //quita el cuadro de cargando de la pagina
    setTimeout(function() {
        parent.$("#loading").modal('hide');              
    }, 1000);

    $.ajax({
        url : "<?php echo $_SERVER['PHP_SELF']; ?>",
        type: "POST",
        data: $("#formulario-principal").serialize(),
        success: function(data){
        	$("#contenido").html(data).show();
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
<h3 class="well">Consultar Empleados en una Habitación</h3>	
<form id="formulario-principal">
		<div id="SegundaDiv">			
			<div class="form-group">
			    <label for="numero">Seleccione # de habitación</label>
			    <select class="form-control" id="numero" name="numero" required>
		      	<option>Seleccione # de habitación</option>
		      	<?php
		  			$query = 'SELECT * FROM `habitaciones`';
		  			$result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
		  			while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
		  			{
		  				echo "<option value=".$fila['id_habitacion'].">".$fila['numero']."</option>";
		  			}
		  		?>
		      </select>
			   <br><input type="button" id = "Consultar" type="submit" class="btn btn-primary" value="Elegir Habitación">
			  </div>
			</div>
</form>

		