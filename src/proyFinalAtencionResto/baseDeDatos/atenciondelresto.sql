-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-10-2023 a las 16:16:05
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `atenciondelresto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `id_mesa` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `estado_mesa` tinyint(1) NOT NULL,
  `capacidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`id_mesa`, `numero`, `estado_mesa`, `capacidad`) VALUES
(1, 1, 1, 10),
(2, 2, 0, 10),
(3, 3, 1, 10),
(4, 4, 1, 10),
(5, 5, 1, 10),
(6, 6, 0, 10),
(7, 7, 1, 10),
(8, 8, 1, 10),
(9, 9, 1, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `id_mesero` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `dni` int(11) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `localidad` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `provincia` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`id_mesero`, `nombre`, `apellido`, `dni`, `direccion`, `localidad`, `telefono`, `provincia`) VALUES
(1, 'pedro', 'Mendez', 43444555, 'las algas marinas', 'LongChamps', '01143567788', 'Buenos Aires'),
(2, 'Martin', 'Pescador', 12345678, 'Caribe 2345', 'Tigre', '01176549569', 'Buenos Aires'),
(3, 'Mesero', 'A prueba 1', 18909876, 'Miami Beach 1234', 'Miami', '5555-77889-7899', 'EEUU'),
(4, 'Mesero1', 'A prueba 1', 18909176, 'Miami Beach 1234', 'Miami', '5555-77889-7899', 'EEUU'),
(5, 'Mesero2', 'A prueba 1', 18909976, 'Miami Beach 1234', 'Miami', '5555-77889-7899', 'EEUU'),
(6, 'Mesero3', 'A prueba 1', 18900876, 'Miami Beach 1234', 'Miami', '5555-77889-7899', 'EEUU'),
(7, 'Mesero4', 'A prueba 1', 16909876, 'Miami Beach 1234', 'Miami', '5555-77889-7899', 'EEUU');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `id_pedido` int(11) NOT NULL,
  `id_mesa` int(11) NOT NULL,
  `id_mesero` int(11) NOT NULL,
  `fecha_hora` datetime NOT NULL,
  `importe` double NOT NULL,
  `cobrada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`id_pedido`, `id_mesa`, `id_mesero`, `fecha_hora`, `importe`, `cobrada`) VALUES
(1, 2, 1, '2023-10-10 18:20:19', 6456, 0),
(2, 1, 2, '2023-10-10 18:20:19', 1099, 0),
(5, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(6, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(7, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(8, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(9, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(10, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(11, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(12, 2, 2, '2023-10-11 08:59:38', 37805.24, 0),
(13, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(14, 2, 2, '2023-10-11 08:59:38', 20200.02, 0),
(15, 2, 2, '2023-10-11 08:59:38', 5269.55, 0),
(16, 9, 7, '2023-10-13 01:15:18', 2175.58, 0),
(18, 9, 1, '2023-10-12 10:10:18', 1087.79, 0),
(19, 3, 5, '2023-10-12 10:10:54', 5809.21, 0),
(21, 4, 3, '2023-10-12 10:10:25', 1212.4079, 0),
(24, 8, 3, '2023-10-12 23:19:40', 1087.79, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoproducto`
--

CREATE TABLE `pedidoproducto` (
  `id_pedido_producto` int(11) NOT NULL,
  `id_pedido` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `pedidoproducto`
--

INSERT INTO `pedidoproducto` (`id_pedido_producto`, `id_pedido`, `id_producto`, `cantidad`) VALUES
(3, 1, 2, 100),
(4, 1, 2, 100),
(5, 2, 1, 4),
(6, 2, 2, 100),
(7, 11, 1, 4),
(8, 11, 2, 4),
(10, 12, 1, 4),
(11, 12, 2, 8),
(12, 12, 1, 4),
(13, 12, 2, 8),
(14, 13, 1, 4),
(15, 13, 2, 4),
(16, 13, 1, 4),
(17, 13, 2, 4),
(18, 14, 1, 4),
(19, 14, 2, 4),
(20, 14, 1, 4),
(21, 14, 2, 4),
(22, 15, 1, 4),
(23, 15, 2, 1),
(24, 15, 1, 4),
(25, 15, 2, 1),
(26, 15, 1, 1),
(27, 16, 1, 1),
(28, 5, 3, 1),
(29, 19, 2, 1),
(30, 19, 3, 1),
(32, 21, 6, 1),
(35, 24, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombre_producto` varchar(30) NOT NULL,
  `tipo_Producto` varchar(11) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre_producto`, `tipo_Producto`, `precio`, `stock`, `estado`) VALUES
(1, 'Hamburguesa', 'Comida', 899, 0, 1),
(2, 'Pizza', 'Comida', 3456, 0, 1),
(3, 'Coca Cola', 'Bebida', 1345, 0, 1),
(4, 'Cerveza', 'Bebida', 1001.99, 0, 1),
(5, 'Coca Cola', 'Bebida', 1345, 0, 1),
(6, 'Cerveza', 'Bebida', 1001.99, 0, 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`id_mesa`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`id_mesero`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`id_pedido`),
  ADD KEY `id_mesero` (`id_mesero`),
  ADD KEY `id_mesa` (`id_mesa`) USING BTREE;

--
-- Indices de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD PRIMARY KEY (`id_pedido_producto`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_pedido` (`id_pedido`,`id_producto`) USING BTREE;

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `id_mesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `id_mesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `id_pedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  MODIFY `id_pedido_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`id_mesa`) REFERENCES `mesa` (`id_mesa`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`id_mesero`) REFERENCES `mesero` (`id_mesero`);

--
-- Filtros para la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD CONSTRAINT `pedidoproducto_ibfk_1` FOREIGN KEY (`id_pedido`) REFERENCES `pedido` (`id_pedido`),
  ADD CONSTRAINT `pedidoproducto_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
