<!DOCTYPE html>
<html lang="es">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
	<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	<script type="text/javascript" src="js/jquery-2.1.3.js"></script>
	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/bootstrap-datepicker.js"></script>
    <link href="css/datepicker.css" rel="stylesheet">
    <script type="text/javascript" src="js/funciones.js"></script>
    <script src="js/jquery.validate.js" type="text/javascript" charset="utf-8"></script>

	<title>Elder Gardens App</title>
</head>
<body>
    <!-- Modal  -->
    <center>
	<div class="modal fade" id="loading" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" >
	  <div class="modal-dialog modal-sm" >
	    <div class="modal-content">
	      <div class="modal-header">
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
	        <h4 class="modal-title" id="myModalLabel">Elder Gardens App</h4>
	      </div>
	      <div id="lContent" class="modal-body"></div>
	    </div>
	  </div>
	</div>
	</center>
	<nav class="navbar navbar-default">
	  <div class="container-fluid">
	    <!-- Brand and toggle get grouped for better mobile display -->
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">    
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand" href="principal.php">Elder Gardens App</a>
	    </div>

	    <!-- Collect the nav links, forms, and other content for toggling -->
	    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	      <ul class="nav navbar-nav">
	        <li><a href="#" onclick="$('#contenido').load('pacientes.php');">Pacientes <span class="sr-only">(current)</span></a></li>
	        <li><a href="#" onclick="$('#contenido').load('empleados.php');">Empleados</a></li>
	        <li><a href="#" onclick="$('#contenido').load('habitaciones.php');">Habitaciones</a></li>
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Acciones<span class="caret"></span></a>
	          <ul class="dropdown-menu" role="menu">
	            <li><a href="#" onclick="$('#contenido').load('pacientesporhabitacion.php');">Asignar Pacientes a habitación</a></li>
	            <li><a href="#" onclick="$('#contenido').load('empleadosporhabitacion.php');">Asignar Empleados a habitación</a></li>
	            <li><a href="#" onclick="$('#contenido').load('consultarpacientehabitacion.php');">Consultar Pacientes por habitación</a></li>	            
	            <li><a href="#" onclick="$('#contenido').load('consultarempleadohabitacion.php');">Consultar Empleados por habitación</a></li>
	            <li class="divider"></li>
	            <li><a href="#" onclick="$('#contenido').load('FiltrosPersonas.php');">Busqueda de Personas</a></li>
	          </ul>
	        </li>
	      </ul>

	      <ul class="nav navbar-nav navbar-right">	        
	        <li class="dropdown">
	          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Desarrolladores<span class="caret"></span></a>
	          <ul class="dropdown-menu" role="menu">
	            <li><a href="#">Miguel Chaves <span><img src="images/m.png" style="width: 28px; height: 28px;"></span></a></li>
	            <li><a href="#">Deisy Peña <span><img src="images/pony.png" style="width: 38px; height: 28px;"></span></a></li>
	            <li><a href="#">Camilo Urrea <span><img src="images/Skull.png" style="width: 38px; height: 28px;"></span></a></li>
	          </ul>
	        </li>
	      </ul>
	    </div><!-- /.navbar-collapse -->
	  </div><!-- /.container-fluid -->
	</nav> <!-- fin de navegación -->
	<div id="mgsCont" style="width: 90%; margin: 0 auto; margin-top: 5px; text-align: center; display: none;">
            <button type="button" class="close" onclick="$('#mgsCont').toggle();">&times;</button>
            <div id="msgbox"></div>
        </div>
	<div id="contenido" class="container">
		<center>			
			<img src="images/elders.png" class="img-responsive">
		</center>
	</div> <!-- /container  Aca se imprime lo seleeccionado en el menu principal-->  

</body>
</html>