-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           8.0.29 - MySQL Community Server - GPL
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para delivery
CREATE DATABASE IF NOT EXISTS `delivery` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `delivery`;

-- Copiando estrutura para tabela delivery.restaurants
CREATE TABLE IF NOT EXISTS `restaurants` (
  `id_restaurant` int NOT NULL AUTO_INCREMENT,
  `name` varchar(150) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `location_x` varchar(150) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `location_y` varchar(150) COLLATE utf8mb4_general_ci DEFAULT NULL,
  KEY `id_restaurant` (`id_restaurant`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- Copiando dados para a tabela delivery.restaurants: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `restaurants` DISABLE KEYS */;
INSERT INTO `restaurants` (`id_restaurant`, `name`, `created_at`, `location_x`, `location_y`) VALUES
	(1, 'thjs', '2023-10-21 22:08:51', 'aehbrth', 'aergghyre6t'),
	(2, 'Restaurante dos loucos', '2023-10-22 10:32:42', 'wfwefwfwef\\s', 'fwfwefaeg'),
	(3, 'aaaaaddd', '2023-10-22 21:05:04', 'dads', 'dasda'),
	(4, 'dfgsg', '2023-10-22 21:05:10', 'bfgbf', 'fgnfgn'),
	(5, 'gktyuk', '2023-10-22 21:05:45', 'tyjtyj', 'etyjytdj'),
	(6, 'rhtsrh', '2023-10-22 21:05:54', 'trh', 'srth'),
	(7, 'srtjhtyjtydjt', '2023-10-22 21:05:58', 'dtyjdtyj', 'srthjsrth'),
	(8, 'sthrsrthj', '2023-10-22 21:06:04', 'srtehshs', 'srhsrthsh'),
	(9, 'srtjtyjyuj', '2023-10-22 21:06:10', 'jytdj', 'dtyj'),
	(10, 'strhtyuj', '2023-10-22 21:06:18', 'ytj', 'dtyjjy'),
	(11, 'jytukukutk', '2023-10-22 21:06:29', 'ktuik', 'tuik');
/*!40000 ALTER TABLE `restaurants` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
