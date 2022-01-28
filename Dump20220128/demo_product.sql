-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: localhost    Database: demo
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `pid` int NOT NULL AUTO_INCREMENT,
  `pname` varchar(20) NOT NULL,
  `Price` int NOT NULL,
  `info` varchar(3000) DEFAULT NULL,
  `Rating` int DEFAULT NULL,
  `category` varchar(20) NOT NULL,
  `shopinfo` varchar(30) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  PRIMARY KEY (`pid`),
  CONSTRAINT `product_chk_1` CHECK ((`category` in (_utf8mb4'grocery',_utf8mb4'cosmetics',_utf8mb4'sports',_utf8mb4'clothing',_utf8mb4'electronics')))
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (15,'Dragon Fruit',50,'It is a dragon',5,'grocery','lanceshop',10),(16,'Pomogranate',200,'it is a pomogranate',3,'grocery','lanceshop',10),(17,'Cucumber',10,'It is a cucumber',1,'grocery','lanceshop',10),(19,'Ball',30,'It is a tennis ball',4,'sports','sahilshop',30),(20,'Shuttle',30,'It is a Shuttle cock',4,'sports','sahilshop',20),(21,'TV',30,'It is a TV',4,'electronics','sahilshop',30),(22,'Racket',30,'It is a Racket',4,'sports','sahilshop',30),(23,'Mobile',30,'It is a Mobile',4,'electronics','sahilshop',30),(24,'bat',1600,'it is a bat',NULL,'sports','nihalshop',30),(25,'Makeup Kit',500,'it is a makeup kit',NULL,'cosmetics','nihalshop',10),(26,'T Shirt',500,'It is a sleeveless t shirt',NULL,'clothing','lanceshop',10),(27,'Monitor',3000,'It is a monitor for pc',NULL,'electronics','sahilshop',5),(28,'Jeans',1000,'It is a denim jeans',NULL,'clothing','nihalshop',15),(29,'Lipstick',30,'It is a lipstick',NULL,'cosmetics','nihalshop',10),(30,'Face Wash',100,'It is a face wash',NULL,'cosmetics','nihalshop',10),(31,'EyeLiner',20,'it is an eye liner',NULL,'cosmetics','nihalshop',10),(32,'Sunscreen',40,'It is a sunscreen',NULL,'cosmetics','nihalshop',10),(33,'Jacket',1000,'It is a jacket',NULL,'clothing','sahilshop',10),(34,'TrackSuit',800,'It is track suit',NULL,'clothing','sahilshop',10),(35,'Hawkeye Suit',1000,'It is a hawkeye suit from avengers',NULL,'clothing','sahilshop',10),(36,'Cauliflower',30,'It is a Cauliflower',NULL,'grocery','sahilshop',10),(37,'BaseBall',400,'Description',NULL,'sports','abc',10);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-01-28 10:48:31
