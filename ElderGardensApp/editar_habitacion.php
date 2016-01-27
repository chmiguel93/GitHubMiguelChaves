<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/habitacion.php'; //llama a la clase persona

if(isset($_POST["numero"]))
{
    $id_habitacion = $_POST["id_habitacion"];
    $capacidad = $_POST["capacidad"];
    $descripcion = $_POST["descripcion"];
    $precio = $_POST["precio"];
    $numero = $_POST["numero"];

  $hab = new habitacion();
  $respuesta = $hab->actualizar($id_habitacion,$capacidad,$descripcion,$precio,$numero);
  echo $respuesta;
  return;
}

?>

<script type="text/javascript">
jQuery(document).ready(function()
{

  $('#Enviar').click(function (){
            cargando('<img src="images/ajax-loader.gif" /> Actualizando');
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
                        $("#msgbox").html("Habitación Editada Exitosamente.");
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
        return false;
    });

});
</script>
<div style="width:80%; padding: 1%">
 <?php
 /**************** Valida si llego el id y consulta los datos relacionados a el ****************************/
 if (isset($_GET['id_hab'])) 
{
    $query = 'SELECT * FROM `habitaciones` WHERE `id_habitacion`='.$_GET['id_hab'];
    $result = mysql_query($query);
    $numresul = mysql_num_rows($result); 
    if($numresul>0)
      {
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          $id_hab = $fila['id_habitacion'];
          $capacidad = $fila['capacidad'];
          $descripcion = $fila['descripcion'];
          $precio = $fila['precio'];
          $numero = $fila["numero"]; 
        }
      }else
      {
        echo '<script type="text/javascript">
            $("#msgbox").html("No se encontraron registros para editar!!!");
            ocultar(1, "alert alert-danger");
            $("#contenido2").load("consultausuario.php")
          </script>';
      } 

      /*****************************/
}// fin if get idpersona
 ?> 
  <h2>Editar Habitación </h2>
  <form id="formulario-principal">
    <input type="hidden" id="id_habitacion" name="id_habitacion"value="<?php echo $id_hab?>">
    <div class="form-group">
      <label for="capacidad">Capacidad de la habitación</label>
      <input type="number" class="form-control" id="capacidad" name ="capacidad" value="<?php echo $capacidad?>" required>
    </div>    

    <div class="form-group">
      <label for="descripcion">Notas especiales</label>
      <textarea class="form-control" rows="2" id="descripcion" name="descripcion" value="<?php echo $descripcion ?>"><?php echo utf8_encode($descripcion) ?></textarea>
    </div>
    
    <div class="form-group">
      <label for="precio">Precio por mes</label>
      <input type="text" class="form-control" id="precio" name ="precio" value="<?php echo $precio ?>" required>
    </div>

    <div class="form-group">
      <label for="numero">Numero de Habitación</label>
      <input type="number" class="form-control" id="numero" name ="numero" value="<?php echo $numero ?>" required>
    </div>
    <button id = "Enviar" type="submit" class="btn btn-primary">Actualizar</button>
  </form>
</div>