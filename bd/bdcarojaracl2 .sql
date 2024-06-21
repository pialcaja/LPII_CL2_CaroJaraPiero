-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 21-06-2024 a las 05:33:54
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `bdcarojaracl2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_productocl2`
--

CREATE TABLE IF NOT EXISTS `tbl_productocl2` (
  `idproductocl2` int(11) NOT NULL AUTO_INCREMENT,
  `nombrecl2` varchar(255) DEFAULT NULL,
  `precioventacl2` double DEFAULT NULL,
  `preciocompcl2` double DEFAULT NULL,
  `estadocl2` varchar(255) DEFAULT NULL,
  `descripcl2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idproductocl2`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `tbl_productocl2`
--

INSERT INTO `tbl_productocl2` (`idproductocl2`, `nombrecl2`, `precioventacl2`, `preciocompcl2`, `estadocl2`, `descripcl2`) VALUES
(1, 'Arroz', 4.9, 2, 'Con stock', 'Bolsa de 1kg.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_usuariocl2`
--

CREATE TABLE IF NOT EXISTS `tbl_usuariocl2` (
  `idusuariocl2` int(11) NOT NULL AUTO_INCREMENT,
  `usuariocl2` varchar(255) DEFAULT NULL,
  `passwordcl2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idusuariocl2`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `tbl_usuariocl2`
--

INSERT INTO `tbl_usuariocl2` (`idusuariocl2`, `usuariocl2`, `passwordcl2`) VALUES
(1, 'piero', 'cl2');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
