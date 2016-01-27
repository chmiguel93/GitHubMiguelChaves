<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona
if(isset($_POST["nombre"]))
{
	$tipo_persona = $_POST["tipo_persona"];
	$estado = $_POST["estado"];
	$tipo_doc = $_POST["tipo_doc"];
	$nombre = $_POST["nombre"];
	$apellido = $_POST["apellido"];
	$num_doc = $_POST["num_doc"];
	$fecha = $_POST["fecha"];
	$direccion = $_POST["direccion"];
	$telefono = $_POST["telefono"];
  $cargo = NULL;

	//$respuesta = Primero isntancial un objeto de lcase persona y luego llamar la funcion crear o persisitir con los algumentos
  $paciente = new persona();
  $respuesta = $paciente->insertar($tipo_persona,$estado,$tipo_doc,$nombre,$apellido,$num_doc,$fecha,$direccion,$telefono,$cargo);
  echo $respuesta;
  return;
}

?>

<script type="text/javascript">
jQuery(document).ready(function()
{
  
	$('#fecha').datepicker({
            format: "dd-mm-yyyy",
            autoclose: true,
            startView: 1
        });

	$('#Enviar').click(function (){
            cargando('<img src="images/ajax-loader.gif" /> Insertando');
            //quita el cuadro de cargando de la pagina
            setTimeout(function() {
                parent.$("#loading").modal('hide');              
            }, 2000);
            $.ajax({
                url : "<?php echo $_SERVER['PHP_SELF']; ?>",
                type: "POST",
                data: $("#formulario-principal").serialize(),
                success: function(data){
                    if (data == '1'){
                        $("#msgbox").html("Paciente Creado Exitosamente.");
                        ocultar(1, 'alert alert-success');
                        $("#contenido").load('pacientes.php')
                    }else{
                        $("#msgbox").html(data);
                        ocultar(0, 'alert alert-danger');
                    }
                },
                error: function (request, status, error) {
                    alert('Se produjo un error ' + request.responseText);
                }
            });
        return false;
    });

});
</script>
<div style="width:80%; padding: 1%">
  <h2>Paciente Nuevo</h2>
  <form id="formulario-principal">
    <div class="form-group">
    	<input type="hidden" id="tipo_persona" name="tipo_persona" value="1"> <!-- Es de tipo 1 por que es un paciente-->
    	<input type="hidden" id="estado" name="estado" value="1"> <!-- Es de estado 1 por que al crearse queda activado-->
      <label for="tipo_doc">Seleccione el tipo de documento</label>
      <select class="form-control" id="tipo_doc" name="tipo_doc" required>
      	<option>Seleccione tipo documento</option>
      	<?php
  			$query = 'SELECT * FROM `tipo_documento`';
  			$result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
  			while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
  			{
  				$id_doc = $fila['id_documento'];
  				$descr = $fila['descripcion'];
  				echo "<option value=".$id_doc.">".$descr."</option>";
  			}
  		?>
      </select>

    </div>

    <div class="form-group">
      <label for="num_doc"># de documento</label>
      <input type="number" class="form-control" id="num_doc" name ="num_doc" >
    </div>    
    
    <div class="form-group">
      <label for="nombre">Nombre(s)</label>
      <input type="text" class="form-control" id="nombre" name ="nombre" placeholder="Juanito" required>
    </div>

    <div class="form-group">
      <label for="apellido">Apellido(s)</label>
      <input type="text" class="form-control" id="apellido" name ="apellido" placeholder="perez" required>
    </div>

    <div class="form-group">
      <label for="fecha">Fecha de nacimiento</label>
      <input type="text" class="form-control" id="fecha" name ="fecha" class="fecha" style="cursor: text" readonly="readonly" required>
    </div>

    <div class="form-group">
      <label for="direccion">Direccion</label>
      <input type="text" class="form-control" id="direccion" name ="direccion" placeholder="Avenida Simpre Viva nº 742">
    </div>

    <div class="form-group">
      <label for="telefono">Telefono</label>
      <input type="number" class="form-control" id="telefono" name ="telefono" placeholder="555-55-55" required>
    </div>
    <button id = "Enviar" type="submit" class="btn btn-primary">Crear</button>
  </form>
</div>