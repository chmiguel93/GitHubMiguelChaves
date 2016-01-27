<?php
require_once 'conexion.php'; // llama el archivo que permite la conección a la base de datos SanRafael 
?>
<ul class="nav nav-tabs">
  <li role="presentation"><a href="#" onclick="$('#contenido2').load('consultausuario.php');">Consultar Paciente</a></li>
  <li role="presentation"><a href="#" onclick="$('#contenido2').load('inscribir_paciente.php');">Incribir Paciente</a></li>	  
</ul>
<div id="contenido2" class="container"></div> <!-- /container  Aca se imprime lo seleeccionado en el menu principal-->  
