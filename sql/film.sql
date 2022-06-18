/*
Navicat MySQL Data Transfer

Source Server         : root
Source Server Version : 50733
Source Host           : localhost:3306
Source Database       : film

Target Server Type    : MYSQL
Target Server Version : 50733
File Encoding         : 65001

Date: 2022-05-31 14:48:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for film
-- ----------------------------
DROP TABLE IF EXISTS `film`;
CREATE TABLE `film` (
                        `id` bigint(20) NOT NULL AUTO_INCREMENT,
                        `film_id` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
                        `film_name` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
                        `img_path` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
                        PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of film
-- ----------------------------
INSERT INTO `film` VALUES ('1', '1111', '肖申克的救赎', '/img/1.jpg');
INSERT INTO `film` VALUES ('2', '2222', '中国机长', '/img/2.jpg');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
                           `id` bigint(20) NOT NULL AUTO_INCREMENT,
                           `name` varchar(100) COLLATE utf8_bin DEFAULT NULL,
                           `age` int(11) DEFAULT NULL,
                           PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', 'yang', '18');
