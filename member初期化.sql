DROP DATABASE IF EXISTS dbmag;

CREATE DATABASE dbmag;

USE dbmag;

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
  `mid` char(5) NOT NULL,
  `nam` varchar(20) DEFAULT NULL,
  `birth` date DEFAULT NULL,
  `sex` char(1) DEFAULT '0',
  PRIMARY KEY (`mid`)
) ;

--
-- Dumping data for table `member`
--

INSERT INTO `member` VALUES ('A0001','掛谷奈美','1910-12-04','1'),('A0002','山田リオ','2007-06-25','0'),('B0001','日尾有宏','1955-07-19','0'),('B0002','近藤朋子',NULL,'1');

