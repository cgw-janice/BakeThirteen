/*
This script deletes the database if it exists and creates schema and default database



-- To Run SQL script log on to my sql and run the command
-- source C:\Users\GaGa\workspace\BakeThirteen\resources\bakeThirteen.sql

Datasource:

JNDI: java:jboss/datasources/bakeThirteen_DS

	
Connection Url: jdbc:mysql://localhost:3306/bakeThirteen

*/

DROP DATABASE IF EXISTS bakeThirteen_dev;

CREATE DATABASE  IF NOT EXISTS bakeThirteen_dev /*!40100 DEFAULT CHARACTER SET latin1 */;

USE bakeThirteen_dev;


--
-- Dumping data for table catagories
--
DROP TABLE IF EXISTS categories;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;


--
-- Table structure for table catagories
--
CREATE TABLE categories (
  category_id int(11) NOT NULL AUTO_INCREMENT,
  category_name varchar(45) NOT NULL,
  PRIMARY KEY (category_id),
  UNIQUE KEY cat_id_UNIQUE (category_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

USE bakeThirteen_dev;
  
INSERT INTO categories (category_name) VALUES
    ('Cakes'),
	('Cupcakes'),
	('Cookies'),
    ('Muffins'),
	('Donuts'),
	('Breads'),
	('Others');

--
-- Dumping data for table catagories
--
DROP TABLE IF EXISTS products;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;


--
-- Table structure for table products
--
CREATE TABLE products (
  product_id int(11) NOT NULL AUTO_INCREMENT,
  product_name varchar(45) NOT NULL,
  product_description VARCHAR(45) NOT NULL,
  product_price DECIMAL(11,2) NOT NULL,
  PRIMARY KEY (product_id),
  UNIQUE KEY prod_id_UNIQUE (product_id)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


INSERT INTO products (product_name, product_description, product_price) VALUES
    ('Banana Bread', 'Delicious!', 5.00),
	('Churros', 'Cinnamon Sugar!', 7.00);
