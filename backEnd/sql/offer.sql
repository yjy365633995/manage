/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50562
 Source Host           : localhost:3306
 Source Schema         : pbs

 Target Server Type    : MySQL
 Target Server Version : 50562
 File Encoding         : 65001

 Date: 21/10/2021 11:50:51
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for offer
-- ----------------------------
DROP TABLE IF EXISTS `offer`;
CREATE TABLE `offer`  (
  `offer_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `bidding_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `turn` int(10) NOT NULL,
  `company_id` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `price` double NULL DEFAULT NULL,
  `day_num` int(12) NULL DEFAULT NULL,
  `delivery_date` datetime NULL DEFAULT NULL,
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price_ranking` int(10) NULL DEFAULT NULL,
  `quality_ranking` int(10) NULL DEFAULT NULL,
  `service_ranking` int(10) NULL DEFAULT NULL,
  `price_score` int(10) NULL DEFAULT NULL,
  `quality_score` int(10) NULL DEFAULT NULL,
  `service_score` int(10) NULL DEFAULT NULL,
  `total_score` int(10) NULL DEFAULT NULL,
  `winning_the_bid` int(2) NULL DEFAULT 0,
  `is_evaluation` int(2) NULL DEFAULT 0,
  `visible` int(2) NULL DEFAULT NULL,
  PRIMARY KEY (`offer_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
