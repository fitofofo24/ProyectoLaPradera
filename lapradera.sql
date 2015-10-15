-- phpMyAdmin SQL Dump
-- version 4.4.12
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-10-2015 a las 06:09:34
-- Versión del servidor: 5.6.25
-- Versión de PHP: 5.6.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `lapradera`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tboleta`
--

CREATE TABLE IF NOT EXISTS `tboleta` (
  `idboleta` int(11) NOT NULL,
  `idplato_bebida` int(11) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `idmozo` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `prec_u` double DEFAULT NULL,
  `sub_total` double DEFAULT NULL,
  `igv` double DEFAULT NULL,
  `tot_pagar` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcategoria`
--

CREATE TABLE IF NOT EXISTS `tcategoria` (
  `idcate` int(11) NOT NULL,
  `nom_cate` varchar(50) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tcategoria`
--

INSERT INTO `tcategoria` (`idcate`, `nom_cate`) VALUES
(1, 'plato tipico'),
(2, 'bebida');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tcliente`
--

CREATE TABLE IF NOT EXISTS `tcliente` (
  `idcliente` int(11) NOT NULL,
  `nom_cli` varchar(50) DEFAULT NULL,
  `ape_cli` varchar(50) DEFAULT NULL,
  `dni_cli` int(11) DEFAULT NULL,
  `tel_cli` int(11) DEFAULT NULL,
  `dir_cli` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tcliente`
--

INSERT INTO `tcliente` (`idcliente`, `nom_cli`, `ape_cli`, `dni_cli`, `tel_cli`, `dir_cli`) VALUES
(1, 'juan', 'perez', 198526585, 986523562, 'av. turmalinas 152'),
(2, 'pedro', 'vilca', 44526632, 985862520, 'pj. espiritu 420'),
(3, 'Maria', 'Bendezu', 11223344, 123456789, 'av siempreviva 666 springfield'),
(4, 'Luz Maria', 'Nananina', 147258369, 159357, 'av turmalinas 159 covica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tdetallepedido`
--

CREATE TABLE IF NOT EXISTS `tdetallepedido` (
  `idpedido` int(11) DEFAULT NULL,
  `idplato_bebida` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `sub_total` double DEFAULT NULL,
  `descuento` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tdetallepedido`
--

INSERT INTO `tdetallepedido` (`idpedido`, `idplato_bebida`, `cantidad`, `sub_total`, `descuento`) VALUES
(1, 2, 2, 30, NULL),
(2, 4, 2, 10, NULL),
(1, 3, 5, 40, NULL),
(1, 1, 1, 12.5, NULL),
(3, 2, 1, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tflujo_caja`
--

CREATE TABLE IF NOT EXISTS `tflujo_caja` (
  `idflu_caj` int(11) NOT NULL,
  `monto_ini` double DEFAULT NULL,
  `gastos` double DEFAULT NULL,
  `cierre` double DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `idboleta` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tflujo_caja`
--

INSERT INTO `tflujo_caja` (`idflu_caj`, `monto_ini`, `gastos`, `cierre`, `fecha`, `idboleta`) VALUES
(1, 300, NULL, NULL, NULL, NULL),
(2, 400, NULL, NULL, NULL, NULL),
(3, 800, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmesa`
--

CREATE TABLE IF NOT EXISTS `tmesa` (
  `idmesa` int(11) NOT NULL,
  `num_mesa` varchar(50) DEFAULT NULL,
  `idmozo` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tmesa`
--

INSERT INTO `tmesa` (`idmesa`, `num_mesa`, `idmozo`) VALUES
(1, 'mesa 1', 1),
(2, 'mesa 2', 1),
(3, 'mesa 3', 1),
(4, 'mesa 4', 1),
(5, 'mesa 5', 1),
(6, 'mesa 6', 2),
(7, 'mesa 7', 2),
(8, 'mesa 8', 2),
(9, 'mesa 9', 2),
(10, 'mesa 10', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tmozo`
--

CREATE TABLE IF NOT EXISTS `tmozo` (
  `idmozo` int(11) NOT NULL,
  `nom_mozo` varchar(50) DEFAULT NULL,
  `ape_mozo` varchar(50) DEFAULT NULL,
  `dni_mozo` int(11) DEFAULT NULL,
  `tel_mozo` int(11) DEFAULT NULL,
  `dir_mozo` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tmozo`
--

INSERT INTO `tmozo` (`idmozo`, `nom_mozo`, `ape_mozo`, `dni_mozo`, `tel_mozo`, `dir_mozo`) VALUES
(1, 'jose', 'perez', 42563258, 856985523, 'av. siempreviva sprimgfield'),
(2, 'diego', 'vilca', 44252563, 85695845, 'av. rosamelano 123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tpedido`
--

CREATE TABLE IF NOT EXISTS `tpedido` (
  `idpedido` int(11) NOT NULL,
  `idmesa` int(11) DEFAULT NULL,
  `idcliente` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tpedido`
--

INSERT INTO `tpedido` (`idpedido`, `idmesa`, `idcliente`, `fecha`, `hora`) VALUES
(1, 4, 2, NULL, NULL),
(2, 7, 1, NULL, NULL),
(3, 2, 4, '2015-09-29', '14:15:19'),
(4, 1, 3, '2015-09-28', '13:19:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tplato_bebida`
--

CREATE TABLE IF NOT EXISTS `tplato_bebida` (
  `idplato_bebida` int(11) NOT NULL,
  `nom_plato_beb` varchar(50) DEFAULT NULL,
  `prec_uni` double DEFAULT NULL,
  `idcate` int(11) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tplato_bebida`
--

INSERT INTO `tplato_bebida` (`idplato_bebida`, `nom_plato_beb`, `prec_uni`, `idcate`) VALUES
(1, 'ceviche de trucha', 12.5, 1),
(2, 'carnero al palo', 15, 1),
(3, 'cerveza cuzqueña', 8, 2),
(4, 'inca kola 1L', 5, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tusuario`
--

CREATE TABLE IF NOT EXISTS `tusuario` (
  `idusuario` int(11) NOT NULL,
  `nom_usu` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `pass_usu` varchar(50) NOT NULL,
  `perfil` varchar(20) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tusuario`
--

INSERT INTO `tusuario` (`idusuario`, `nom_usu`, `apellidos`, `dni`, `telefono`, `direccion`, `email`, `pass_usu`, `perfil`) VALUES
(1, 'adolfo', 'calle', 465132978, 964159357, 'Jr. Hipolito unanue 160', 'adolfoc@hotmail.com', 'calle', 'Administrador'),
(2, 'Grover', 'Rendich', 45068903, 964077537, 'Jr. Guido 320 - Hyo', 'nash_026@mail.com', 'g020386r', 'Administrador'),
(3, 'Jose', 'Fano', 456789123, 964753123, 'Av. Las flores 159', 'fanoc_11@hotmail.com', 'fano', 'Cajero'),
(4, 'Kristiam', 'Jimenez', 456789123, 954147852, 'Av. Ferrocarril 366', 'viridsoma@hotmail.com', '123', 'Cajero');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tboleta`
--
ALTER TABLE `tboleta`
  ADD PRIMARY KEY (`idboleta`),
  ADD KEY `idplato_bebida` (`idplato_bebida`),
  ADD KEY `idcliente` (`idcliente`),
  ADD KEY `idmozo` (`idmozo`);

--
-- Indices de la tabla `tcategoria`
--
ALTER TABLE `tcategoria`
  ADD PRIMARY KEY (`idcate`);

--
-- Indices de la tabla `tcliente`
--
ALTER TABLE `tcliente`
  ADD PRIMARY KEY (`idcliente`);

--
-- Indices de la tabla `tdetallepedido`
--
ALTER TABLE `tdetallepedido`
  ADD KEY `idplato_bebida` (`idplato_bebida`),
  ADD KEY `idpedido` (`idpedido`);

--
-- Indices de la tabla `tflujo_caja`
--
ALTER TABLE `tflujo_caja`
  ADD PRIMARY KEY (`idflu_caj`),
  ADD KEY `idboleta` (`idboleta`);

--
-- Indices de la tabla `tmesa`
--
ALTER TABLE `tmesa`
  ADD PRIMARY KEY (`idmesa`),
  ADD KEY `idmozo` (`idmozo`);

--
-- Indices de la tabla `tmozo`
--
ALTER TABLE `tmozo`
  ADD PRIMARY KEY (`idmozo`);

--
-- Indices de la tabla `tpedido`
--
ALTER TABLE `tpedido`
  ADD PRIMARY KEY (`idpedido`),
  ADD KEY `idmesa` (`idmesa`),
  ADD KEY `idcliente` (`idcliente`);

--
-- Indices de la tabla `tplato_bebida`
--
ALTER TABLE `tplato_bebida`
  ADD PRIMARY KEY (`idplato_bebida`),
  ADD KEY `idcate` (`idcate`);

--
-- Indices de la tabla `tusuario`
--
ALTER TABLE `tusuario`
  ADD PRIMARY KEY (`idusuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tboleta`
--
ALTER TABLE `tboleta`
  MODIFY `idboleta` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `tcategoria`
--
ALTER TABLE `tcategoria`
  MODIFY `idcate` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `tcliente`
--
ALTER TABLE `tcliente`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tflujo_caja`
--
ALTER TABLE `tflujo_caja`
  MODIFY `idflu_caj` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT de la tabla `tmesa`
--
ALTER TABLE `tmesa`
  MODIFY `idmesa` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT de la tabla `tmozo`
--
ALTER TABLE `tmozo`
  MODIFY `idmozo` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `tpedido`
--
ALTER TABLE `tpedido`
  MODIFY `idpedido` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tplato_bebida`
--
ALTER TABLE `tplato_bebida`
  MODIFY `idplato_bebida` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `tusuario`
--
ALTER TABLE `tusuario`
  MODIFY `idusuario` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tboleta`
--
ALTER TABLE `tboleta`
  ADD CONSTRAINT `tboleta_ibfk_1` FOREIGN KEY (`idplato_bebida`) REFERENCES `tplato_bebida` (`idplato_bebida`),
  ADD CONSTRAINT `tboleta_ibfk_2` FOREIGN KEY (`idcliente`) REFERENCES `tcliente` (`idcliente`),
  ADD CONSTRAINT `tboleta_ibfk_3` FOREIGN KEY (`idmozo`) REFERENCES `tmozo` (`idmozo`);

--
-- Filtros para la tabla `tdetallepedido`
--
ALTER TABLE `tdetallepedido`
  ADD CONSTRAINT `tdetallepedido_ibfk_1` FOREIGN KEY (`idplato_bebida`) REFERENCES `tplato_bebida` (`idplato_bebida`),
  ADD CONSTRAINT `tdetallepedido_ibfk_2` FOREIGN KEY (`idpedido`) REFERENCES `tpedido` (`idpedido`);

--
-- Filtros para la tabla `tflujo_caja`
--
ALTER TABLE `tflujo_caja`
  ADD CONSTRAINT `tflujo_caja_ibfk_1` FOREIGN KEY (`idboleta`) REFERENCES `tboleta` (`idboleta`);

--
-- Filtros para la tabla `tmesa`
--
ALTER TABLE `tmesa`
  ADD CONSTRAINT `tmesa_ibfk_1` FOREIGN KEY (`idmozo`) REFERENCES `tmozo` (`idmozo`);

--
-- Filtros para la tabla `tpedido`
--
ALTER TABLE `tpedido`
  ADD CONSTRAINT `tpedido_ibfk_1` FOREIGN KEY (`idmesa`) REFERENCES `tmesa` (`idmesa`),
  ADD CONSTRAINT `tpedido_ibfk_2` FOREIGN KEY (`idcliente`) REFERENCES `tcliente` (`idcliente`);

--
-- Filtros para la tabla `tplato_bebida`
--
ALTER TABLE `tplato_bebida`
  ADD CONSTRAINT `tplato_bebida_ibfk_1` FOREIGN KEY (`idcate`) REFERENCES `tcategoria` (`idcate`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
