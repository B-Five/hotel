/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-03-15 18:09:56
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
  `o_checkinTime` date DEFAULT NULL,
  `o_checkoutTime` date DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------
INSERT INTO `order` VALUES ('1', '1', '1', '2018-03-13', '2018-03-14', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for room
-- ----------------------------
DROP TABLE IF EXISTS `room`;
CREATE TABLE `room` (
  `r_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `r_number` varchar(255) DEFAULT NULL,
  `r_type` int(10) DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room
-- ----------------------------
INSERT INTO `room` VALUES ('1', '001', '1', '2', null, '300', '2018-03-13 10:54:53', '2018-03-13 10:55:02', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `room` VALUES ('2', '002', '1', '2', null, '300', '2018-03-13 10:54:58', '2018-03-13 10:55:05', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `room` VALUES ('3', '003', '1', '2', null, '300', '2018-03-13 10:55:09', '2018-03-13 10:55:12', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `room` VALUES ('4', '004', '2', '2', null, '450', '2018-03-13 10:55:15', '2018-03-13 10:55:18', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `room` VALUES ('5', '005', '2', '2', null, '450', '2018-03-13 10:55:21', '2018-03-13 10:55:24', null, null, null, null, null, null, null, null, null, null);
INSERT INTO `room` VALUES ('6', '006', '2', '2', null, '450', '2018-03-13 10:55:28', '2018-03-13 10:55:30', null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for roomtype
-- ----------------------------
DROP TABLE IF EXISTS `roomtype`;
CREATE TABLE `roomtype` (
  `t_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `t_name` varchar(255) DEFAULT NULL,
  `t_bed` varchar(255) DEFAULT NULL,
  `t_member` int(10) unsigned DEFAULT NULL,
  `t_po` varchar(255) DEFAULT NULL,
  `t_bath` varchar(255) DEFAULT NULL,
  `t_remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of roomtype
-- ----------------------------
INSERT INTO `roomtype` VALUES ('1', '豪华客房', '一张特大床', '2', '1楼-2楼', '一间设备齐全的大理石浴室', '');
INSERT INTO `roomtype` VALUES ('2', '尊贵客房', '两张单人床', '2', '2楼-3楼', '一间设备齐全的大理石浴室', null);
INSERT INTO `roomtype` VALUES ('3', '行政客房', '一张特大床或两张单人床', '2', '3楼-4楼', '一间设备齐全的大理石浴室', '');
INSERT INTO `roomtype` VALUES ('4', '大使套房', '一张特大床 / 两张单人床', '2', '4楼-5楼', '一间设备齐全的大理石浴室', null);

-- ----------------------------
-- Table structure for services
-- ----------------------------
DROP TABLE IF EXISTS `services`;
CREATE TABLE `services` (
  `se_id` int(11) NOT NULL,
  `se_oid` int(11) DEFAULT NULL,
  `se_tid` int(11) DEFAULT NULL,
  `se_created` datetime DEFAULT NULL,
  `se_updated` datetime DEFAULT NULL,
  `se_order` enum('预定时间','立即服务') DEFAULT NULL,
  `se_otime` datetime DEFAULT NULL,
  `se_status` tinyint(1) DEFAULT NULL,
  `se_remarks` varchar(255) DEFAULT NULL,
  `se_intField1` int(11) DEFAULT NULL,
  `se_intField2` int(11) DEFAULT NULL,
  `se_stringField1` varchar(255) DEFAULT NULL,
  `se_stringField2` varchar(255) DEFAULT NULL,
  `se_dateField1` date DEFAULT NULL,
  `se_dateField2` date DEFAULT NULL,
  `se_datetimeField1` datetime DEFAULT NULL,
  `se_datetimeField2` datetime DEFAULT NULL,
  `se_booleanField1` tinyint(1) DEFAULT NULL,
  `se_booleanField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`se_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of services
-- ----------------------------

-- ----------------------------
-- Table structure for servicestype
-- ----------------------------
DROP TABLE IF EXISTS `servicestype`;
CREATE TABLE `servicestype` (
  `st_id` int(11) NOT NULL,
  `st_name` varchar(255) DEFAULT NULL,
  `st_desc` varchar(255) DEFAULT NULL,
  `st_price` double DEFAULT NULL,
  `st_created` datetime DEFAULT NULL,
  `st_updated` datetime DEFAULT NULL,
  `st_intField1` int(11) DEFAULT NULL,
  `st_intField2` int(11) DEFAULT NULL,
  `st_stringField1` varchar(255) DEFAULT NULL,
  `st_stringField2` varchar(255) DEFAULT NULL,
  `st_datetimeField1` datetime DEFAULT NULL,
  `st_datetimeField2` datetime DEFAULT NULL,
  `st_dateField1` date DEFAULT NULL,
  `st_dateField2` date DEFAULT NULL,
  `st_booleanField1` tinyint(1) DEFAULT NULL,
  `st_booleanField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`st_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of servicestype
-- ----------------------------

-- ----------------------------
-- Table structure for staff
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `s_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `s_code` varchar(255) DEFAULT NULL COMMENT '工号兼登录名',
  `s_name` varchar(255) DEFAULT NULL,
  `s_pssword` varchar(255) DEFAULT NULL,
  `s_gender` enum('女','男') DEFAULT '男',
  `s_job` varchar(255) DEFAULT NULL,
  `s_permission` int(11) DEFAULT NULL,
  `s_remarks` varchar(255) DEFAULT NULL,
  `s_created` datetime DEFAULT NULL,
  `s_updated` datetime DEFAULT NULL,
  `s_intField1` int(11) DEFAULT NULL,
  `s_intField2` int(11) DEFAULT NULL,
  `s_stringField1` varchar(255) DEFAULT NULL,
  `s_stringField2` varchar(255) DEFAULT NULL,
  `s_dateField1` date DEFAULT NULL,
  `s_dateField2` date DEFAULT NULL,
  `s_datetimeField1` datetime DEFAULT NULL,
  `s_datetimeField2` datetime DEFAULT NULL,
  `s_booleanField1` tinyint(1) DEFAULT NULL,
  `s_booleanField2` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
