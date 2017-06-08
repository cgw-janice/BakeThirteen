/*
To Run SQL script log on to my sql and run the command:

source C:\Users\GaGa\workspace\BakeThirteen\resources\bakeThirteen.sql

=============================================================================
Datasource:

JNDI: java:jboss/datasources/bakeThirteen_DS

	
Connection Url: jdbc:mysql://localhost:3306/bakeThirteen

*/

DROP DATABASE IF EXISTS `bakeThirteen_dev`;

CREATE DATABASE  IF NOT EXISTS `bakeThirteen_dev` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bakeThirteen_dev`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 138.197.142.3    Database: bakeThirteen
-- ------------------------------------------------------
-- Server version	5.7.17

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `catagories`
--

DROP TABLE IF EXISTS \'categories\';
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;


--
-- Table structure for table `catagories`
--
CREATE TABLE `categories` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT,
  `category_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`category_id`),
  UNIQUE KEY `cat_id_UNIQUE` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

USE 'bakeThirteen_dev';
  
INSERT INTO categories (category_name) VALUES
    ('Cakes'),
	('Cupcakes'),
	('Cookies'),
    ('Muffins'),
	('Donuts'),
	('Others');

