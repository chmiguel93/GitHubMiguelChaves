<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
?>
<ul class="nav nav-tabs">
  <li role="presentation"><a href="#" onclick="$('#contenido2').load('consultarhabitacion.php');">Consultar Habitación</a></li>
  <li role="presentation"><a href="#" onclick="$('#contenido2').load('crear_habitacion.php');">Crear Habitación</a></li>	  
</ul>
<div id="contenido2" class="container"></div> <!-- /container  Aca se imprime lo seleeccionado en el menu principal-->  
