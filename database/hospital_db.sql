-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: hospital_management_system
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `ambulance`
--

DROP TABLE IF EXISTS `ambulance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ambulance` (
  `Name` varchar(20) DEFAULT NULL,
  `Gender` varchar(20) DEFAULT NULL,
  `Car_name` varchar(20) DEFAULT NULL,
  `Available` varchar(20) DEFAULT NULL,
  `Location` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ambulance`
--

LOCK TABLES `ambulance` WRITE;
/*!40000 ALTER TABLE `ambulance` DISABLE KEYS */;
INSERT INTO `ambulance` VALUES ('alex','Male','bmw','Available','makardah'),('Rahul','Male','Toyota','Available','Howrah'),('Suman','Male','Tata','Busy','Salt Lake'),('Anita','Female','Mahindra','Available','New Town'),('Rakesh','Male','Force','Available','Dum Dum'),('Puja','Female','Ashok Leyland','Busy','Behala'),('Amit','Male','Maruti','Available','Sealdah'),('Kunal','Male','Tata','Busy','Baranagar');
/*!40000 ALTER TABLE `ambulance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `department`
--

DROP TABLE IF EXISTS `department`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `department` (
  `Department` varchar(20) DEFAULT NULL,
  `Phone_no` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `department`
--

LOCK TABLES `department` WRITE;
/*!40000 ALTER TABLE `department` DISABLE KEYS */;
INSERT INTO `department` VALUES ('Cardiology','03324567890'),('Neurology','03324567891'),('Orthopedics','03324567892'),('Pediatrics','03324567893'),('Dermatology','03324567894'),('Gynecology','03324567895'),('ENT','03324567896'),('Radiology','03324567897'),('Pathology','03324567898'),('Emergency','03324567899');
/*!40000 ALTER TABLE `department` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp_info`
--

DROP TABLE IF EXISTS `emp_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp_info` (
  `Name` varchar(20) DEFAULT NULL,
  `Age` varchar(20) DEFAULT NULL,
  `Phone_number` varchar(20) DEFAULT NULL,
  `Salary` varchar(20) DEFAULT NULL,
  `Gmail` varchar(20) DEFAULT NULL,
  `Adhaar_Number` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp_info`
--

LOCK TABLES `emp_info` WRITE;
/*!40000 ALTER TABLE `emp_info` DISABLE KEYS */;
INSERT INTO `emp_info` VALUES ('Doctor1','30','7890242523','50000','dr1@gmail.com','789963331254'),('Doctor2','35','7890242524','60000','dr2@gmail.com','789963331255'),('Doctor3','28','7890242525','45000','dr3@gmail.com','789963331256'),('Doctor4','42','7890242526','75000','dr4@gmail.com','789963331257'),('Doctor5','33','7890242527','52000','dr5@gmail.com','789963331258'),('Doctor6','38','7890242528','68000','dr6@gmail.com','789963331259'),('Doctor7','45','7890242529','80000','dr7@gmail.com','789963331260');
/*!40000 ALTER TABLE `emp_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login` (
  `ID` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('siddik','12345');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `patient_info`
--

DROP TABLE IF EXISTS `patient_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `patient_info` (
  `ID` varchar(20) DEFAULT NULL,
  `Number` varchar(40) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Gender` varchar(10) DEFAULT NULL,
  `Patient_disease` varchar(30) DEFAULT NULL,
  `Room_no` varchar(20) DEFAULT NULL,
  `Time` varchar(100) DEFAULT NULL,
  `Diposite` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `patient_info`
--

LOCK TABLES `patient_info` WRITE;
/*!40000 ALTER TABLE `patient_info` DISABLE KEYS */;
INSERT INTO `patient_info` VALUES ('Voter Card','78787878','siddik','Male','aaaa','201','Thu Dec 18 20:49:20 IST 2025','3921'),('Adhaar card','8778787','sijus','Male','saw','201','Thu Dec 18 23:38:08 IST 2025','1500'),('Adhaar card','966262','jai','Male','aaww','305','Thu Dec 18 23:39:34 IST 2025','2800'),('Adhaar card','213546','alex','Male','urioa','304','Sat Dec 20 11:13:36 IST 2025','500');
/*!40000 ALTER TABLE `patient_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `room_no` varchar(20) DEFAULT NULL,
  `Avilability` varchar(20) DEFAULT NULL,
  `Price` varchar(20) DEFAULT NULL,
  `Room_type` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES ('100','Available','500','G Bed 1'),('101','Available','500','G Bed 2'),('102','Available','500','G Bed 3'),('103','Available','500','G Bed 4'),('200','Available','1500','Private Room'),('201','Occupied','1500','Private Room'),('202','Available','1500','Private Room'),('203','Occupied','1500','Private Room'),('300','Available','3500','ICU Bed 1'),('301','Available','3500','ICU Bed 2'),('302','Available','3500','ICU Bed 3'),('303','Available','3500','ICU Bed 4'),('304','Occupied','3500','ICU Bed 5'),('305','Occupied','3500','ICU Bed 6');
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-01-30 14:17:40
