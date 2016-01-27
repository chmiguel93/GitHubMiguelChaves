<?php
require_once '/../conexion.php';
/*** Clase Persona**/
class Persona {

    private $tipo_persona;
    private $estado;
    private $tipo_doc;
    private $nombre;
    private $apellido;
    private $num_doc;
    private $fecha;
    private $direccion;
    private $telefono;
    private $notas;

    public function __construct() {
        return true;
    }

    /**
     *
     * @return boolean
     */
    public function __destruct() {
        return true;
    }

    public function insertar($tipo_persona,$estado,$tipo_doc,$nombre,$apellido,$num_doc,$fecha,$direccion,$telefono,$cargo) 
    {
        $query = "INSERT INTO persona(`tipo_persona`, `estado`, `tipo_documento`,`fech_nac`,`num_doc`, `direccion`, `telefono`, `nombre`, `apellido`,`cargo`) 
                            VALUES (".$tipo_persona.",".$estado.",".$tipo_doc.",'".$fecha."',".$num_doc.",'".$direccion."','".$telefono ."','".$nombre."','".$apellido."','".$cargo."')";
        if ($result = mysql_query($query)) {                    
            return true;
        }else
        {
            $estado = 'Consulta fallida: ' . mysql_error();
            return $estado;
        }
    }

    public function actualizar($id_persona,$estado,$tipo_doc,$num_doc,$nombre,$apellido,$fecha,$direccion,$telefono,$notas,$cargo) 
    {
        $query = "UPDATE `persona` SET `estado` = ".$estado.",`tipo_documento` = ".$tipo_doc.",`fech_nac` = '".$fecha."',`notas` = '".$notas."',`num_doc` =".$num_doc.",`direccion` = '".$direccion."',`telefono` = '".$telefono."',`nombre` = '".$nombre."',`apellido` = '".$apellido."'  WHERE `id_persona` =".$id_persona;
        if ($result = mysql_query($query)) {                    
            return true;
        }else
        {
            $estado = 'Consulta fallida: ' . mysql_error();
            return $estado;
        }
    }

    public function eliminar($idpersona)
    {
      $query = "DELETE FROM `persona` WHERE `id_persona` =".$idpersona;
      if ($result = mysql_query($query)) {                    
            return true;
        }else
        {
            $estado = 'Consulta fallida: ' . mysql_error();
            return $estado;
        }
    }
}
?>