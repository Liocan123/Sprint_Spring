unlock tables;
CREATE DATABASE  IF NOT EXISTS `accidentados`;
USE `accidentados`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: accidentados
-- ------------------------------------------------------
-- Server version	8.0.29


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acceso`
--

DROP TABLE IF EXISTS `acceso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `acceso` (
  `id` int NOT NULL,
  `pass` varchar(255) DEFAULT NULL,
  `user` varchar(255) DEFAULT NULL,
  `rol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acceso`
--

LOCK TABLES `acceso` WRITE;
/*!40000 ALTER TABLE `acceso` DISABLE KEYS */;
INSERT INTO `acceso` VALUES (1,'$2a$10$vD1BgPsC.ukgGeaX041H.uTYBmVvIpL0Mh08unmJxtSxmmYMlaRru','cliente','ROLE_CLIENTE'),(2,'$2a$10$sR4RmH9bzDs5TQ56cswpBukn53ND7ppo7uwZdtKozBhsBLh3MxXmq','profesional','ROLE_PROFESIONAL'),(3,'$2a$10$4fw7CmyZnp47K0lkD3V8qOqQ7WBM5JlHEwwFrF1X5dgIPI2XarIBG','administrativo','ROLE_ADMINISTRATIVO');
/*!40000 ALTER TABLE `acceso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `administrativo`
--

DROP TABLE IF EXISTS `administrativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrativo` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `area` varchar(20) NOT NULL,
  `experiencia_previa` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_usuario`),
  KEY `id_idx` (`id_usuario`),
  CONSTRAINT `id` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrativo`
--

LOCK TABLES `administrativo` WRITE;
/*!40000 ALTER TABLE `administrativo` DISABLE KEYS */;
INSERT INTO `administrativo` VALUES (1,3,'Operaciones','Cuatro años'),(2,6,'Comercial','Dos años'),(5,1,'dwadafawfawf','dadawfawfafw'),(6,1,'ssssssssssssssssss','eesgsegseg'),(7,1,'ssssssssssssssssss','eesgsegseg'),(8,18,'dwada','dad'),(9,20,'dwada','dad'),(10,8,'fawafnnifow','afawfmiawfmop');
/*!40000 ALTER TABLE `administrativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacitacion`
--

DROP TABLE IF EXISTS `capacitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `capacitacion` (
  `identificador` int NOT NULL AUTO_INCREMENT,
  `rut` int NOT NULL,
  `dia` varchar(9) DEFAULT NULL,
  `hora` varchar(5) DEFAULT NULL,
  `lugar` varchar(50) NOT NULL,
  `duracion` varchar(70) DEFAULT NULL,
  `asistentes` int NOT NULL,
  PRIMARY KEY (`identificador`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacitacion`
--

LOCK TABLES `capacitacion` WRITE;
/*!40000 ALTER TABLE `capacitacion` DISABLE KEYS */;
INSERT INTO `capacitacion` VALUES (1,13006775,'Lunes','18:00','Parque Cultural','30 minutos',55),(2,9373112,'Viernes','13:00','Teatro Municipal','90 minutos',100),(3,16232223,'Miércoles','20:00','Gimnasio Municipal','45 minutos',25),(4,23452453,'Miercoles','21:11','1awkdwakfnawfknfla','456',23),(5,467575,'Jueves','22:20','wfafga','345',674),(6,1234,'Miercoles','12:12','1awkdwakfnawfknfla','90',100),(8,1234,'Miercoles','12:12','1awkdwakfnawfknfla','90',100),(9,124556,'Miercoles','21:07','1awkdwakfnawfknfla','67',12),(10,12345,'Viernes','12:12','1awkdwafafwwfa','200',99),(11,19292,'Lunes','22:33','wiiiiiiiiiiiiiiiiiiiiiiii','1',3);
/*!40000 ALTER TABLE `capacitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `rut` int NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `afp` varchar(30) DEFAULT NULL,
  `sistema_de_salud` int DEFAULT NULL,
  `direccion` varchar(70) DEFAULT NULL,
  `comuna` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_usuario`),
  KEY `cl_us_idx` (`id_usuario`),
  CONSTRAINT `cli_us` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,1,9999999,'Pepe','López','+5657882','vital',1,'mi casa','Peru'),(2,4,12345678,'Arnold','Sotito','+5657882','Lucrum',2,'tu casa','Putaendo'),(6,13,3456,'pepitooo','riquelme','394893','planvital',2,'pormfanw','null'),(7,14,39488292,'ayudaaaaaaa','me muero','93488273779397','parque del mar',2,'la tumba', 'oli'),(8,23,11111,'afwf','afwfawf','224','fafaw',2,'fafw','affwa');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pago`
--

DROP TABLE IF EXISTS `pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pago` (
  `id` int NOT NULL AUTO_INCREMENT,
  `monto` int DEFAULT NULL,
  `rut_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pago`
--

LOCK TABLES `pago` WRITE;
/*!40000 ALTER TABLE `pago` DISABLE KEYS */;
INSERT INTO `pago` VALUES (1,3456,3345);
/*!40000 ALTER TABLE `pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesional`
--

DROP TABLE IF EXISTS `profesional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesional` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_usuario` int NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `fecha_ingreso` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`id`,`id_usuario`),
  KEY `pr_us_idx` (`id_usuario`),
  CONSTRAINT `pr_us` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesional`
--

LOCK TABLES `profesional` WRITE;
/*!40000 ALTER TABLE `profesional` DISABLE KEYS */;
INSERT INTO `profesional` VALUES (1,2,'Ingeniero en PPT','05-04-2022'),(2,5,'Ingeniero en Excel','12-08-2020'),(3,22,'tituloooooooooops','2022-08-19');
/*!40000 ALTER TABLE `profesional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rol`
--

DROP TABLE IF EXISTS `rol`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rol` (
  `rol_id` int NOT NULL AUTO_INCREMENT,
  `rol_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`rol_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rol`
--

LOCK TABLES `rol` WRITE;
/*!40000 ALTER TABLE `rol` DISABLE KEYS */;
/*!40000 ALTER TABLE `rol` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `enable` bit(1) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `rol` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` int NOT NULL AUTO_INCREMENT,
  `run` int NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `fecha_nacimiento` varchar(11) NOT NULL,
  `tipo_de_usuario` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,16232223,'Pepe López','01-01-1993','Cliente'),(2,15943970,'Juanito Morrego','04-01-1981','Profesional'),(3,14589007,'Mono Pitonizo','08-09-1976','Administrativo'),(4,13006775,'Animal Razonable','07-05-1971','Cliente'),(5,14589007,'Loco Odioso','08-11-1965','Profesional'),(6,16599111,'Camello Verde','27-07-1986','Administrativo'),(7,16599111,'Camello Verde','27-07-1986','Administrativo'),(8,16599111,'Camello Verde','27-07-1986','Administrativo'),(13,2345,'Auxilioooooo','2022-07-15','Cliente'),(14,39488584,'Ayuda totototoo','2013-02-15','Cliente'),(15,1,'ad2afafawfawf','2022-08-10','cliente'),(16,23456,'admin','2022-09-08','cliente');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visita_terreno`
--

DROP TABLE IF EXISTS `visita_terreno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visita_terreno` (
  `id` int NOT NULL AUTO_INCREMENT,
  `comentarios` varchar(255) DEFAULT NULL,
  `dia` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `rut_cliente` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visita_terreno`
--

LOCK TABLES `visita_terreno` WRITE;
/*!40000 ALTER TABLE `visita_terreno` DISABLE KEYS */;
INSERT INTO `visita_terreno` VALUES (1,'un comentario','2022-08-14','03:33','wiiiiiiiiiiiiiiiiiiiiiiii',224);
/*!40000 ALTER TABLE `visita_terreno` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-09 20:54:40