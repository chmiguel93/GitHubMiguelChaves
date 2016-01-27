<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/habitacion.php'; //llama a la clase persona
if(isset($_POST["numero"]))
{
    $capacidad = $_POST["capacidad"];
    $descripcion = $_POST["descripcion"];
    $precio = $_POST["precio"];
    $numero = $_POST["numero"];
	
  $hab = new habitacion();
  $respuesta = $hab->insertar($capacidad,$descripcion,$precio,$numero);
  echo $respuesta;
  return;
}

?>
<style type="text/css">
	.error
	{
		color: red;
	}
</style>
<script type="text/javascript">
jQuery(document).ready(function()
{
	$('#Enviar').click(function (){
		if ($("#formulario-principal").validate().form() === true){
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
                        $("#msgbox").html("Habitaciónado Creada Exitosamente.");
                        ocultar(1, 'alert alert-success');
                        $("#contenido").load('habitaciones.php')
                    }else{
                        $("#msgbox").html(data);
                        ocultar(0, 'alert alert-danger');
                    }
                },
                error: function (request, status, error) {
                    alert('Se produjo un error ' + request.responseText);
                }
            });
        }
        return false;
    });

});
</script>
<div style="width:80%; padding: 1%">
  <h2>Crear Habitación</h2>
  <form id="formulario-principal">

    <div class="form-group">
      <label for="capacidad">Capacidad de la habitación</label>
      <input type="number" class="form-control" id="capacidad" name ="capacidad" placeholder="5" required>
    </div>    

    <div class="form-group">
      <label for="descripcion">Notas especiales</label>
      <textarea class="form-control" rows="2" id="descripcion" name="descripcion" ></textarea>
    </div>
    
    <div class="form-group">
      <label for="precio">Precio por mes</label>
      <input type="text" class="form-control" id="precio" name ="precio" placeholder="500000"required>
    </div>

    <div class="form-group">
      <label for="numero">Numero de Habitación</label>
      <input type="number" class="form-control" id="numero" name ="numero" placeholder="101" required>
    </div>
  
    <button id = "Enviar" type="submit" class="btn btn-primary">Crear</button>
  </form>
</div>