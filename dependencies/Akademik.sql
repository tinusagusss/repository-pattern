-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.13 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for akademik
CREATE DATABASE IF NOT EXISTS `akademik` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `akademik`;

-- Dumping structure for table akademik.mahasiswa
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nrp` varchar(12) NOT NULL,
  `nama` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table akademik.mahasiswa: ~30 rows (approximately)
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
INSERT INTO `mahasiswa` (`id`, `nrp`, `nama`) VALUES
	(1, '162020002', 'Farrel Mustafa'),
	(2, '162020003', 'Keanu Jaler Pangestu'),
	(3, '162020004', 'Meissy Arrahma Iskandar'),
	(4, '162020005', 'Muhammad Ichsan Apriliano'),
	(5, '162020008', 'Yaris Hernandi Nugraha'),
	(6, '162020009', 'Agil Rasyid Hashidiq'),
	(7, '162020010', 'Carissa Adnyana Putri Radja'),
	(8, '162020011', 'Kevin Jericho'),
	(9, '162020012', 'Fadhillah Irsyad'),
	(10, '162020013', 'Kirana Indria Revansa'),
	(11, '162020015', 'Monalisa Putri Rezeki'),
	(12, '162020016', 'Agus Tinus Turnip'),
	(13, '162020017', 'Usamah Hasan'),
	(14, '162020019', 'Aditama Putra'),
	(15, '162020020', 'Muhammad Awalidzan Ahda'),
	(16, '162020021', 'Rafi Ramdhan Pratama'),
	(17, '162020022', 'Muhammad Gaizka Agusti'),
	(18, '162020024', 'Fauzan Addien'),
	(19, '162020025', 'Zidan Chosyiyar Rochman'),
	(20, '162020026', 'Rizvan Achmad Sumantri'),
	(21, '162020027', 'Dhea Halimatu Sadiah'),
	(22, '162020028', 'Muhammad Faiz Himawan'),
	(23, '162020030', 'Galang Setia Yudana'),
	(24, '162020031', 'Sandi Yusup Sinaga'),
	(25, '162020032', 'Marisa Nia Cameliya'),
	(26, '162021033', 'Agus Tinus Turnip');
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
