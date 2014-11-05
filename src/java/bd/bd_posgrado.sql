-- phpMyAdmin SQL Dump
-- version 2.10.3
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 05-11-2014 a las 16:37:38
-- Versión del servidor: 5.0.51
-- Versión de PHP: 5.2.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `bd_posgrado`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `administrador`
-- 

CREATE TABLE `administrador` (
  `Id_administrador` int(10) NOT NULL auto_increment,
  `usuario` varchar(255) NOT NULL,
  `clave` varchar(255) NOT NULL,
  `estado` char(1) NOT NULL,
  PRIMARY KEY  (`Id_administrador`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Volcar la base de datos para la tabla `administrador`
-- 

