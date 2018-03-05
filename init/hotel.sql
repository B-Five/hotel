/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-03-05 18:17:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `c_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `c_lastname` varchar(16) DEFAULT NULL COMMENT '姓',
  `c_firstname` varchar(16) DEFAULT NULL COMMENT '名',
  `c_password` varchar(20) DEFAULT NULL,
  `c_phone` varchar(20) DEFAULT NULL,
  `c_email` varchar(128) DEFAULT NULL,
  `c_gender` enum('女士','先生') DEFAULT '先生',
  `c_created` datetime DEFAULT NULL,
  `c_updated` datetime DEFAULT NULL,
  `c_intField1` int(11) DEFAULT NULL,
  `c_intField2` int(11) DEFAULT NULL,
  `c_stringField1` varchar(255) DEFAULT NULL,
  `c_stringField2` varchar(255) DEFAULT NULL,
  `c_dateField1` date DEFAULT NULL,
  `c_dateField2` date DEFAULT NULL,
  `c_datetimeField1` datetime DEFAULT NULL,
  `c_datetimeField2` datetime DEFAULT NULL,
  `c_boolField1` tinyint(1) DEFAULT NULL,
  `c_boolField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', 'test', 'test', 'test', 'test', 'test', '先生', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `customer` VALUES ('2', '小', '焉', '1', null, '12345@123.com', null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `customer` VALUES ('4', 'test1', 'test1', '1', '12312424', 'test1', null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `o_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `o_uid` int(11) NOT NULL,
  `o_rid` int(11) NOT NULL,
  `o_checkinTime` datetime DEFAULT NULL,
  `o_checkoutTime` datetime DEFAULT NULL,
  `o_deposit` double DEFAULT NULL,
  `o_price` double DEFAULT NULL,
  `o_status` tinyint(1) DEFAULT NULL,
  `o_created` datetime DEFAULT NULL,
  `o_updated` datetime DEFAULT NULL,
  `o_intField1` varchar(11) DEFAULT NULL,
  `o_intField2` varchar(11) DEFAULT NULL,
  `o_stringField1` varchar(255) DEFAULT NULL,
  `o_stringField2` varchar(255) DEFAULT NULL,
  `o_dateField1` date DEFAULT NULL,
  `o_dateField2` date DEFAULT NULL,
  `o_datetimeField1` datetime DEFAULT NULL,
  `o_datetimeField2` datetime DEFAULT NULL,
  `o_boolField1` tinyint(1) DEFAULT NULL,
  `o_boolField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `r_id` int(11) NOT NULL,
  `r_number` varchar(255) DEFAULT NULL,
  `r_type` varchar(255) DEFAULT NULL,
  `r_member` int(11) DEFAULT NULL,
  `r_order` int(11) DEFAULT NULL,
  `r_price` double(16,0) DEFAULT NULL,
  `r_created` datetime DEFAULT NULL,
  `r_updated` datetime DEFAULT NULL,
  `r_intField1` int(11) DEFAULT NULL,
  `r_intField2` int(11) DEFAULT NULL,
  `r_stringField1` varchar(255) DEFAULT NULL,
  `r_stringField2` varchar(255) DEFAULT NULL,
  `r_dateField1` date DEFAULT NULL,
  `r_dateField2` date DEFAULT NULL,
  `r_dateTimeField1` datetime DEFAULT NULL,
  `r_dateTimeField2` datetime DEFAULT NULL,
  `r_boolField1` tinyint(1) DEFAULT NULL,
  `r_boolField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
