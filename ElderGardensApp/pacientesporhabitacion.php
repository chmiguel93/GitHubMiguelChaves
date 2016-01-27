<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona
require_once 'clases/habitacion.php';

?>
<style type="text/css">
	.error
	{
		color: red;
	}
</style>
<script type="text/javascript">

function allowDrop(ev) {
    ev.preventDefault();
}

function drag(ev) {
    ev.dataTransfer.setData("text", ev.target.id);
}

function drop(ev) {
    ev.preventDefault();
    var data = ev.dataTransfer.getData("text");
    ev.target.appendChild(document.getElementById(data));
}
$("#puerta").hide();

$('#Asignar').click(function (){
	
	if ($("#formulario-principal").validate().form() === true){ // valida campos del formulario
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
$('#ConsultarHabitacion').click(function (){

	$("#SegundaDiv").hide();
	$("#puerta").show();
	$("#numerodeHabitacion").text("Habtación # "+$("#numero").val());
	$("#numHab").val($("#numero").val());
			 		           
});
</script>
<h3 class="well">Asignar pacientes a una Habitación</h3>	

		<div class="row">
			<div class="col-lg-6 col-md-4 well"><h4>Arrastre los pacientes a la habitación seleccionada</h4>
				<?php

				$query = 'SELECT * FROM `persona` WHERE `tipo_persona`=1';
				$result = mysql_query($query);
				$numresul = mysql_num_rows($result); 
				echo '';
				$i=0;
				while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
				{
					$id_persona = $fila['id_persona'];
					$num_doc = $fila['num_doc'];
					$nombrepersona = $fila['nombre'];
					$apellido = $fila['apellido'];
					
					$array_id_persona[$i] = $id_persona;//guarda todos los ids de los pacientes
					$i++;

					echo '
					<div id="div-drag-'.$id_persona.'" draggable="true" ondragstart="drag(event)">
					<p width="100px" height="60px" style="font-size: 20px">'.$nombrepersona.'  '.$apellido.'<br><img src="images/anciano.png" ></p>
						<input type="hidden" value="'.$id_persona.'" id="drag-'.$id_persona.'"  name="drag-'.$id_persona.'" readonly="readonly">						
					</div>'
					;
					
				}?>

			</div>
			
				<div class="col-lg-6 col-md-8"><h4>Escoja la habitación que albergará a los pacientes</h4>
					<div id="SegundaDiv">			
						<div class="form-group">
						    <label for="numero">Seleccione # de habitación</label>
						    <select class="form-control" id="numero" name="numero" >
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
						    <br><input type="button" id = "ConsultarHabitacion" type="submit" class="btn btn-primary" value="Elegir Habitación">
						  </div>
						</div>

				<form id="formulario-principal">	
						<center><h5 id="numerodeHabitacion" class="well"></h5>
							<input type="hidden" id="numHab" name="numHab">
						<table id="puerta" style="background:url('images/puerta.png'); background-size: 100% 100%; background-repeat: no-repeat; height: 640px; width: 359px;">
							<tr>
								<td style="padding: 65px 70px 70px 80px;">							
										<div id="div1" ondrop="drop(event)" ondragover="allowDrop(event)" style="height: 100%; width: 100%;"></div>	
								</td>
							</tr>
						</table>
						</center><br><br>
				</div>
			<button id = "Asignar" type="submit" class="btn btn-primary btn-lg btn-block">Asignar Pacientes</button>
			</form>
		</div> <!-- Fin class row -->
<?php
if(isset($_POST["numHab"]))
{
	$exitos = 0; //cuenta la cantidad de regitros insetados exitosamente
	$id_Hab = $_POST["numHab"];
	// obtener los ids de las personas a asignar
	for ($i = 0; $i<count ($array_id_persona); $i++)
	{
		//$array_id_persona[$i];//contiene los ids de las personas consultadas
		if(isset($_POST["drag-".$array_id_persona[$i]])) // pregunta si el id que trajo de la base de datos fue seleccionado por el usuario
		{
			$id_paciente = $_POST["drag-".$array_id_persona[$i]];//guarda el valor de cada paciente que fue seleccionado en la puerta
			//inserta paciente por habitación
			date_default_timezone_set("America/Bogota");
			$query = "INSERT INTO `habitacion_persona` (`id_habitacion`, `id_persona`, `fecha_ini`) VALUES ('".$id_Hab."', '".$id_paciente."', '".date('d-m-Y')."');";
	        //$result = mysql_query($query);
	        if ($result = mysql_query($query)) {                    
	            $exitos = true;
	            //return true;
	        }else
	        {
	        	//$exitos = 0;
	            $exitos = 'Consulta fallida: ' . mysql_error();
	            return $exitos;
	        }
		}
	}//fin for
	if($exitos == true)
	{
		echo '<script type="text/javascript">
				//quita el cuadro de cargando de la pagina
			    setTimeout(function() {
			        parent.$("#loading").modal("hide");              
			    }, 1000);
				$("#msgbox").html("Pacientes Asignados Exitosamente.");
                ocultar(1, "alert alert-success");
                 setTimeout(function() {
                	window.location.href = "principal.php";
                	}, 3000);
                </script>';
	}else
	{
		echo '
				//quita el cuadro de cargando de la pagina
			    setTimeout(function() {
			        parent.$("#loading").modal("hide");              
			    }, 1000);
				$("#msgbox").html(data);
                ocultar(0, "alert alert-danger");';
	}	
}	
?>		