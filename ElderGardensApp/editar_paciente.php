<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona


if(isset($_POST["nombre"]))
{
  $id_persona = $_POST["id_persona"];
  $estado = $_POST["estado"];  
  $tipo_doc = $_POST["tipo_doc"];  
  $num_doc = $_POST["num_doc"];
  $nombre = $_POST["nombre"];
  $apellido = $_POST["apellido"];  
  $fecha = $_POST["fecha"];
  $direccion = $_POST["direccion"];
  $telefono = $_POST["telefono"];
  $notas = $_POST["notas"];
  $cargo = NULL;
  //tipo de persona no se debe actualizar siempre sera un paciente y esto no puede cambiar

  $paciente = new persona();
  $respuesta = $paciente->actualizar($id_persona,$estado,$tipo_doc,$num_doc,$nombre,$apellido,$fecha,$direccion,$telefono,$notas,$cargo);
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
                        $("#msgbox").html("Paciente Editado Exitosamente.");
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
 <?php
 /**************** Valida si llego el id y consulta los datos relacionados a el ****************************/
 if (isset($_GET['idpersona'])) 
{
    $query = 'SELECT * FROM `persona` WHERE `id_persona`='.$_GET['idpersona'];
    $result = mysql_query($query);
    $numresul = mysql_num_rows($result); 
    if($numresul>0)
      {
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          $id_persona = $fila['id_persona'];
          $estado = $fila["estado"];
          $tipo_doc = $fila["tipo_documento"];         
          $fecha = $fila["fech_nac"];
          $notas = $fila["notas"];
          $num_doc = $fila['num_doc'];
          $direccion = $fila['direccion'];
          $telefono = $fila['telefono'];
          $nombre = $fila['nombre'];
          $apellido = $fila['apellido']; 
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
  <h2>Editar paciente </h2>
  <form id="formulario-principal">
    <div class="form-group">
      <input type="hidden" id="id_persona" name="id_persona" value="<?php echo  $id_persona;?>">      
      <label for="estado">Actualizar Estado</label>
      <select class="form-control" id="estado" name="estado" required>        
        <?php
        /****************** Consultar nombre del estado actual *****************/
        $query = 'SELECT * FROM `estado` WHERE `id_estado` ='.$estado;
        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          $descrActual = $fila['descripcion'];
        }
        ?>
        
        <option value="<?php echo $estado;?>"><?php echo $descrActual?></option>
        <?php
        $query = 'SELECT * FROM `estado`';
        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          if($fila['id_estado'] != $estado) // evita q imprima nuevamente el valor q se imrpimo en la consulta anterior
          {
            $id_estado = $fila['id_estado'];
            $descr = $fila['descripcion'];
            echo "<option value=".$id_estado.">".$descr."</option>";
          }          
        }
      ?>
      </select><br>
      <label for="tipo_doc">Actualizar tipo de documento</label>
      <select class="form-control" id="tipo_doc" name="tipo_doc" required>
        <?php
        /****************** Consultar nombre del estado actual *****************/
        $query = 'SELECT * FROM `tipo_documento` WHERE `id_documento` ='.$tipo_doc;
        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          $descrActual = $fila['descripcion'];
        }
        ?>
        <option value="<?php echo $tipo_doc;?>"><?php echo $descrActual?></option>
        <?php
        $query = 'SELECT * FROM `tipo_documento`';
        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
        {
          if($fila['id_documento'] != $tipo_doc)
          {
            $id_doc = $fila['id_documento'];
            $descr = $fila['descripcion'];
            echo "<option value=".$id_doc.">".$descr."</option>";
          }          
        }
      ?>
      </select>

    </div>

    <div class="form-group">
      <label for="num_doc"># de documento</label>
      <input type="number" class="form-control" id="num_doc" name ="num_doc" value="<?php echo $num_doc;?>" required>
    </div>    
    
    <div class="form-group">
      <label for="nombre">Nombre(s)</label>
      <input type="text" class="form-control" id="nombre" name ="nombre"  value="<?php echo $nombre;?>" required>
    </div>

    <div class="form-group">
      <label for="apellido">Apellido(s)</label>
      <input type="text" class="form-control" id="apellido" name ="apellido" value="<?php echo $apellido;?>" required>
    </div>

    <div class="form-group">
      <label for="fecha">Fecha de nacimiento</label>
      <input type="text" class="form-control" id="fecha" name ="fecha" class="fecha" style="cursor: text" readonly="readonly" value="<?php echo $fecha;?>" required>
    </div>

    <div class="form-group">
      <label for="direccion">Direccion</label>
      <input type="text" class="form-control" id="direccion" name ="direccion" value="<?php echo $direccion;?>">
    </div>

    <div class="form-group">
      <label for="telefono">Telefono</label>
      <input type="number" class="form-control" id="telefono" name ="telefono" value="<?php echo $telefono;?>" required>
    </div>

    <div class="form-group">
      <label for="notas">Notas especiales</label>
      <textarea class="form-control" rows="2" id="notas" name="notas" value="" required><?php echo $notas;?></textarea>
    </div>
    <button id = "Enviar" type="submit" class="btn btn-primary">Actualizar</button>
  </form>
</div>