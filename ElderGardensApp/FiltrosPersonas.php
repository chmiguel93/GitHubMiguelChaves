<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
require_once 'clases/persona.php'; //llama a la clase persona
?>

<script type="text/javascript">
 	$('#Enviar').click(function (){ 		

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
            	$("#contenido").html(data).show();
            	$("#formulario-principal").hide();
            },
            error: function (request, status, error) {
                alert('Se produjo un error ' + request.responseText);
            }
        });	 	
        return false;	           
	});
</script>
<h2 class = "well">Busqueda de Personas</h2>

		<form id="formulario-principal">
			<div class="row">
				<div class="col-lg-6 "><h5 class="well">Información General de Busqueda</h5>			
					<div class="form-group">
					    
					    <label for="num_doc">Ingrese # de documento</label>
					    <input type="number" class="form-control" id="num_doc" name ="num_doc">

					    <label for="nombre">Ingrese Nombre de la persona</label>
					    <input type="text" class="form-control" id="nombre" name ="nombre">

					    <label for="apellido">Ingrese Apellido de la persona</label>
					    <input type="text" class="form-control" id="apellido" name ="apellido">					    

					 </div>
				</div>

				<div class="col-lg-6">
					
					<label for="cargo">Filtrar por Cargo (Solo Aplica para empleados)</label>
				    <select class="form-control" id="cargo" name="cargo">
				        <option value="0">Seleccione Cargo </option>
				        <?php
					        $query = 'SELECT * FROM `cargo`';
					        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
					        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
					        {
					          $id_cargo = $fila['id_cargo'];
					          $descr = $fila['nombre'];
					          echo "<option value=".$id_cargo.">".$descr."</option>";
					        }
				        ?>
				    </select>

				    <label for="tipo_doc">Filtrar por Tipo de Documento</label>
				     <select class="form-control" id="tipo_doc" name="tipo_doc" >
				      	<option value="0">Seleccione tipo documento</option>
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

				    <label for="tipo_per">Filtrar por Tipo de Persona </label>
				    <select class="form-control" id="tipo_per" name="tipo_per">
				        <option value="0">Seleccione Tipo de persona </option>
				        <?php
				        $query = 'SELECT * FROM `tipo_persona`';
				        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
				        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
				        {
				          $id_tipo_persona = $fila['id_tipo_persona'];
				          $nombre_tipo_persona = $fila['nombre_tipo_persona'];
				          echo "<option value=".$id_tipo_persona.">".$nombre_tipo_persona."</option>";
				        }
				      ?>
				    </select>

				    <label for="estado">Filtrar por Estado de una Persona </label>
				    <select class="form-control" id="estado" name="estado">
				        <option value="0">Seleccione Estado </option>
				        <?php
				        $query = 'SELECT * FROM `estado`';
				        $result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
				        while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
				        {
				          $id_estado = $fila['id_estado'];
				          $descr_estado = $fila['descripcion'];
				          echo "<option value=".$id_estado.">".$descr_estado."</option>";
				        }
				      ?>
				    </select>

				</div>	
			</div> <!-- Fin class row -->
			<br>
			<button id = "Enviar" type="submit" class="btn btn-primary btn-block">Consultar</button>
			<br><br>
		</form>
<?php

// primera consulta que se realiza sin ningun filtro.
$query = 'SELECT p.`id_persona`, p.`nombre`, p.`num_doc`, p.`apellido`, p.`fech_nac`, p.`tipo_documento`, t.`nombre_tipo_persona`, 
			p.`estado`, p.`cargo` FROM `persona` p , `tipo_persona` t  WHERE p.`tipo_persona` = t.`id_tipo_persona` ';

									
									// FILTROS:
// -----------------------------------------------------------------------------------------
	if(isset($_POST["num_doc"]) && ($_POST["num_doc"] != ''))
	{
		$num_doc = $_POST["num_doc"];
		$query .= ' AND p.`num_doc`="'.$num_doc.'"';
	}
	if(isset($_POST["nombre"]) && ($_POST["nombre"] != ''))
	{	
		$nombre = $_POST["nombre"];
		$query .= ' AND p.`nombre`="'.$nombre.'"';
	}// fin if nombre

	if(isset($_POST["apellido"]) && ($_POST["apellido"] != ''))
	{
		$apellido = $_POST["apellido"];
		$query .= ' AND p.`apellido` = "'.$apellido.'"';
	}// fin if apellido

	if(isset($_POST["cargo"]) && ($_POST["cargo"] != "0"))
	{	
		$cargo = $_POST["cargo"];
		$query .= ' AND p.`cargo`="'.$cargo.'"';
	}// fin if cargo

	if(isset($_POST["tipo_doc"]) && ($_POST["tipo_doc"] != "0"))
	{	
		$tipo_doc = $_POST["tipo_doc"];
		$query .= ' AND p.`tipo_documento`="'.$tipo_doc.'"';
	}// fin if tipo dedocumento

	if(isset($_POST["tipo_per"]) && ($_POST["tipo_per"] != "0"))
	{	
		$tipo_per = $_POST["tipo_per"];
		$query .= ' AND p.`tipo_persona`="'.$tipo_per.'"';
	}// fin if	tipo de persona

	if(isset($_POST["estado"]) && ($_POST["estado"] != "0"))
	{	
		$estado_per = $_POST["estado"];
		$query .= ' AND p.`estado`="'.$estado_per.'"';
	}// fin if estado

// -----------------------------------------------------------------------------------------

//echo $query;
$result = mysql_query($query.'ORDER BY p.`apellido`'); //concatena la consulta con un string que permite ordenar los registros por apellido
echo '<table id="tabla" class="table table-condensed table-bordered table-hover">	<tr>
		<td><strong>TIPO DE DOCUMENTO<strong></td>		
		<td><strong># DE DOCUMENTO<strong></td>
		<td><strong>NOMBRE<strong></td>
		<td><strong>APELLIDO<strong></td>
		<td><strong>FECHA DE NACIMIENTO<strong></td>
		<td><strong>Cargo<strong></td>
		<td><strong>TIPO DE PERSONA<strong></td>
		<td><strong>ESTADO<strong></td>
		
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
	$cargo = $fila["cargo"];
	$tipo_persona = $fila["nombre_tipo_persona"];
	$tipo_doccumento = $fila["tipo_documento"];

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
	

	// obtener nombre del cargo de una persona
	if($cargo !='') // si es vacio , se refiere a un paciente
	{
		$ConsulCargo = 'SELECT * FROM `cargo` WHERE `id_cargo` = '.$cargo;
		$ResultCargo = mysql_query($ConsulCargo);
		while($filaCargo = mysql_fetch_array($ResultCargo, MYSQL_ASSOC))
		{
			$NombreCargo = $filaCargo['nombre'];
		}
	}else
	{
		$NombreCargo = 'N/A';
	}

	// obtener tipo de documento de una persona
	$ConsulDoc = 'SELECT * FROM `tipo_documento` WHERE `id_documento` = '.$tipo_doccumento;
	$ResultDoc = mysql_query($ConsulDoc);
	while($filaDoc= mysql_fetch_array($ResultDoc, MYSQL_ASSOC))
	{
		$NombreDoc = $filaDoc['descripcion'];
	}

	echo "<tr>	
			<td>".$NombreDoc."</td>			
			<td>".$num_doc."</td>
			<td>".$nombrepersona."</td>
			<td>".$apellido."</td>
			<td>".$fecha."</td>
			<td>".$NombreCargo."</td>
			<td>".$tipo_persona."</td>		
			<td>".$ImgEstado."</td>		
	  </tr>
	  <tr></tr>";
}
?>