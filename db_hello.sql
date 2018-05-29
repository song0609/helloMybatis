/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50524
Source Host           : localhost:3306
Source Database       : db_hello

Target Server Type    : MYSQL
Target Server Version : 50524
File Encoding         : 65001

Date: 2018-05-29 17:03:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for book
-- ----------------------------
DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `book_name` varchar(20) NOT NULL DEFAULT '',
  `book_type` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of book
-- ----------------------------
INSERT INTO `book` VALUES ('2', '软件设计', '1');
INSERT INTO `book` VALUES ('3', 'c语言开发', '1');
INSERT INTO `book` VALUES ('4', '建筑学入门', '2');

-- ----------------------------
-- Table structure for booktypes
-- ----------------------------
DROP TABLE IF EXISTS `booktypes`;
CREATE TABLE `booktypes` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型编号',
  `typeName` varchar(100) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=95 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of booktypes
-- ----------------------------
INSERT INTO `booktypes` VALUES ('1', '计算机软件开发');
INSERT INTO `booktypes` VALUES ('2', '建筑');
INSERT INTO `booktypes` VALUES ('3', '神话小说');
INSERT INTO `booktypes` VALUES ('4', '科幻小说');
INSERT INTO `booktypes` VALUES ('5', '外语');
INSERT INTO `booktypes` VALUES ('6', '金融');
INSERT INTO `booktypes` VALUES ('7', '地理');
