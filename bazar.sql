-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-10-2023 a las 03:16:07
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
-- Base de datos: `bazar`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `idAdministrador` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `correo` varchar(255) NOT NULL,
  `contrasena` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`idAdministrador`, `nombre`, `correo`, `contrasena`) VALUES
(1, 'Administrador Principal', 'admin@mitienda.com', 'password123'),
(2, 'Jose', 'Jose@admini.ww', '12345678987654321'),
(3, 'Alex tapia', 'alesito@asdda', '12331');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `comprobantes`
--

CREATE TABLE `comprobantes` (
  `idComprobante` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idProducto` int(11) DEFAULT NULL,
  `cantidad` int(11) NOT NULL,
  `total` decimal(10,2) NOT NULL,
  `idAdministrador` int(11) NOT NULL DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `comprobantes`
--

INSERT INTO `comprobantes` (`idComprobante`, `fecha`, `idProducto`, `cantidad`, `total`, `idAdministrador`) VALUES
(1, '2023-10-15', 1, 3, 8.97, 1),
(2, '2023-10-15', 3, 2, 7.98, 1),
(3, '2023-10-16', 5, 4, 31.96, 1),
(4, '2023-10-16', 8, 1, 1.49, 1),
(5, '2023-10-17', 2, 2, 10.98, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idProducto` int(11) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `marca` varchar(255) DEFAULT NULL,
  `stock` int(11) NOT NULL,
  `contenido` varchar(50) DEFAULT NULL,
  `categoria` varchar(50) DEFAULT NULL,
  `tipo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idProducto`, `nombre`, `precio`, `marca`, `stock`, `contenido`, `categoria`, `tipo`) VALUES
(1, 'Gaseosa Pepsi', 2.99, 'PepsiCo', 100, '1L', 'Bebida', 'Gaseosa'),
(2, 'Cerveza Modelo', 5.49, 'Grupo Modelo', 50, '2L', 'Bebida', 'Cerveza'),
(3, 'Pan Integral', 3.99, 'Bimbo', 75, '1u', 'Alimento', 'Pan'),
(4, 'Arroz', 1.99, 'Superior', 200, '2KG', 'Alimento', 'menestra'),
(5, 'Detergente Ariel', 7.99, 'Procter & Gamble', 40, '1u', 'Limpieza', 'Detergente'),
(6, 'Toallas de Papel', 4.49, 'Scott', 60, '1u', 'Aceo Personal', 'Toallas'),
(7, 'Leche Desnatada', 2.29, 'Lácteos S.A.', 90, '1u', 'Bebida', 'Leche'),
(8, 'Jabón de Baño', 1.49, 'Johnson & Johnson', 30, '1u', 'Aceo Personal', 'Jabon'),
(9, 'Aceite de Oliva', 8.99, 'Aceitunas del Sur', 35, '500ml', 'Alimento', 'Aceite'),
(10, 'Agua Mineral', 0.99, 'Manantial', 150, '1L', 'Bebida', 'Agua'),
(11, 'Coca-Cola', 3.49, 'The Coca-Cola Company', 120, '1L', 'Bebida', 'Gaseosa'),
(12, 'Sprite', 2.89, 'The Coca-Cola Company', 100, '1L', 'Bebida', 'Gaseosa'),
(13, 'Fanta Naranja', 2.99, 'The Coca-Cola Company', 90, '1L', 'Bebida', 'Gaseosa'),
(14, '7up', 2.89, 'PepsiCo', 95, '1L', 'Bebida', 'Gaseosa'),
(15, 'Pepsi Cherry', 3.29, 'PepsiCo', 80, '1L', 'Bebida', 'Gaseosa'),
(16, 'Mountain Dew', 3.09, 'PepsiCo', 85, '1L', 'Bebida', 'Gaseosa'),
(17, 'Dr Pepper', 3.19, 'Dr Pepper Snapple Group', 70, '1L', 'Bebida', 'Gaseosa'),
(18, 'Fanta Uva', 2.99, 'The Coca-Cola Company', 65, '1L', 'Bebida', 'Gaseosa'),
(19, 'Pepsi Max', 3.39, 'PepsiCo', 75, '1L', 'Bebida', 'Gaseosa'),
(20, 'Coca-Cola Zero', 3.49, 'The Coca-Cola Company', 110, '1L', 'Bebida', 'Gaseosa'),
(21, 'Fanta', 1.50, 'FantaCorp', 0, '1.5L', 'Bebida', 'Gaseosa'),
(22, 'Papas', 1.50, NULL, 0, '1000g', 'Alimento', 'Cocina'),
(23, 'Zanahorias', 2.00, NULL, 0, '500.0g', 'Alimento', 'Cocina');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`idAdministrador`);

--
-- Indices de la tabla `comprobantes`
--
ALTER TABLE `comprobantes`
  ADD PRIMARY KEY (`idComprobante`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idAdministrador` (`idAdministrador`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `administradores`
--
ALTER TABLE `administradores`
  MODIFY `idAdministrador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `comprobantes`
--
ALTER TABLE `comprobantes`
  MODIFY `idComprobante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `comprobantes`
--
ALTER TABLE `comprobantes`
  ADD CONSTRAINT `comprobantes_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `productos` (`idProducto`),
  ADD CONSTRAINT `comprobantes_ibfk_2` FOREIGN KEY (`idAdministrador`) REFERENCES `administradores` (`idAdministrador`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
