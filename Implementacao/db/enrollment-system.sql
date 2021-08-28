-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: enrollment-system
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  `CREDITS` mediumtext,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'Engenharia de Software','1200'),(2,'Pedagogia','1350');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course_subject_offer`
--

DROP TABLE IF EXISTS `course_subject_offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course_subject_offer` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `COURSE_ID` int unsigned DEFAULT NULL,
  `SUBJECT_OFFER_ID` int unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `COURSE_ID` (`COURSE_ID`),
  KEY `SUBJECT_OFFER_ID` (`SUBJECT_OFFER_ID`),
  CONSTRAINT `course_subject_offer_ibfk_1` FOREIGN KEY (`COURSE_ID`) REFERENCES `course` (`ID`),
  CONSTRAINT `course_subject_offer_ibfk_2` FOREIGN KEY (`SUBJECT_OFFER_ID`) REFERENCES `subject_offer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course_subject_offer`
--

LOCK TABLES `course_subject_offer` WRITE;
/*!40000 ALTER TABLE `course_subject_offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `course_subject_offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `enrollment`
--

DROP TABLE IF EXISTS `enrollment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `enrollment` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `STUDENT_CPF` int unsigned DEFAULT NULL,
  `SUBJECT_OFFER_ID` int unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `STUDENT_CPF` (`STUDENT_CPF`),
  KEY `SUBJECT_OFFER_ID` (`SUBJECT_OFFER_ID`),
  CONSTRAINT `enrollment_ibfk_1` FOREIGN KEY (`STUDENT_CPF`) REFERENCES `student` (`CPF`),
  CONSTRAINT `enrollment_ibfk_2` FOREIGN KEY (`SUBJECT_OFFER_ID`) REFERENCES `subject_offer` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `enrollment`
--

LOCK TABLES `enrollment` WRITE;
/*!40000 ALTER TABLE `enrollment` DISABLE KEYS */;
/*!40000 ALTER TABLE `enrollment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `professor`
--

DROP TABLE IF EXISTS `professor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `professor` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `INFO` text,
  `USER_ID` int unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `USER_ID` (`USER_ID`),
  CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `professor`
--

LOCK TABLES `professor` WRITE;
/*!40000 ALTER TABLE `professor` DISABLE KEYS */;
/*!40000 ALTER TABLE `professor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `semester`
--

DROP TABLE IF EXISTS `semester`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `semester` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `INFO` char(20) DEFAULT NULL,
  `ENROLLMENT_START_DATE` datetime DEFAULT NULL,
  `ENROLLMENT_END_DATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `semester`
--

LOCK TABLES `semester` WRITE;
/*!40000 ALTER TABLE `semester` DISABLE KEYS */;
/*!40000 ALTER TABLE `semester` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `CPF` int unsigned NOT NULL AUTO_INCREMENT,
  `USER_ID` int unsigned DEFAULT NULL,
  PRIMARY KEY (`CPF`),
  KEY `USER_ID` (`USER_ID`),
  CONSTRAINT `student_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  `IS_OPTIONAL` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject_offer`
--

DROP TABLE IF EXISTS `subject_offer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject_offer` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `SCHEDULE_CRON` char(50) DEFAULT NULL,
  `CREATION_DATE` datetime DEFAULT NULL,
  `STATUS` enum('OPEN','CLOSED','CANCELED','FINISHED') DEFAULT NULL,
  `SUBJECT_ID` int unsigned DEFAULT NULL,
  `PROFESSOR_ID` int unsigned DEFAULT NULL,
  `SEMESTER_ID` int unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `SUBJECT_ID` (`SUBJECT_ID`),
  KEY `PROFESSOR_ID` (`PROFESSOR_ID`),
  KEY `SEMESTER_ID` (`SEMESTER_ID`),
  CONSTRAINT `subject_offer_ibfk_1` FOREIGN KEY (`SUBJECT_ID`) REFERENCES `subject` (`ID`),
  CONSTRAINT `subject_offer_ibfk_2` FOREIGN KEY (`PROFESSOR_ID`) REFERENCES `professor` (`ID`),
  CONSTRAINT `subject_offer_ibfk_3` FOREIGN KEY (`SEMESTER_ID`) REFERENCES `semester` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject_offer`
--

LOCK TABLES `subject_offer` WRITE;
/*!40000 ALTER TABLE `subject_offer` DISABLE KEYS */;
/*!40000 ALTER TABLE `subject_offer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `ID` int unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) DEFAULT NULL,
  `EMAIL` varchar(50) DEFAULT NULL,
  `PASSWORD` char(20) DEFAULT NULL,
  `TYPE` enum('SECRETARY','PROFESSOR','STUDENT') DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-28 19:09:07
