<?php
$id = $_POST["num_id"];
?>
<table border="1">
	<tr>
		<td>ID</td>
		<td>NOMBRE</td>
		<td>APELLIDO</td>
	</tr>
	<?php
	// Conectando, seleccionando la base de datos
	$link = mysql_connect('localhost', 'root')
	    or die('No se pudo conectar: ' . mysql_error());
	mysql_select_db('sanrafael') or die('No se pudo seleccionar la base de datos'); 

	// Realizar una consulta MySQL
	$query = 'SELECT * FROM `persona` WHERE `id_persona`='.$id;
	$result = mysql_query($query) or die('Consulta fallida: ' . mysql_error());
	while($fila = mysql_fetch_array($result, MYSQL_ASSOC))
	{
		$id_persona = $fila['id_persona'];
		$nombrepersona = $fila['nombre'];
		$apellido = $fila['apellido'];
		echo "<tr>
				<td>".$id_persona."</td>
				<td>".$nombrepersona."</td>
				<td>".$apellido."</td>
		  </tr>";
	}
	
	?>
</table>