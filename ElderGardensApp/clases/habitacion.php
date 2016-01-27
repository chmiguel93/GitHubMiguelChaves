<?php
require_once '/../conexion.php';
/*** Clase Habitacion**/
class Habitacion {

    private $id_habitacion;
    private $capacidad;
    private $descripcion;
    private $precio;
    private $numero;

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

    public function insertar($capacidad,$descripcion,$precio,$numero) 
    {
        //
        $query = "INSERT INTO `habitaciones` (`capacidad`, `descripcion`, `precio`, `numero`) VALUES (".$capacidad.", '".utf8_decode($descripcion)."', '".$precio."', ".$numero.")";
        if ($result = mysql_query($query)) {                    
            return true;
        }else
        {
            $estado = 'Consulta fallida: ' . mysql_error();
            return $estado;
        }
    }

    public function actualizar($id_habitacion,$capacidad,$descripcion,$precio,$numero) 
    {
        $query = "UPDATE `habitaciones` SET `capacidad` = ".$capacidad.", `descripcion` = '".utf8_decode($descripcion)."', `precio` = '".$precio."', `numero` = ".$numero." WHERE `id_habitacion` = ".$id_habitacion;
        if ($result = mysql_query($query)) {                    
            return true;
        }else
        {
            $estado = 'Consulta fallida: ' . mysql_error();
            return $estado;
        }
    }

    public function eliminar($idHab)
    {
      $query = "DELETE FROM `habitaciones` WHERE `id_habitacion` =".$idHab;
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