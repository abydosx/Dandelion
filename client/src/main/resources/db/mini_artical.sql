CREATE TABLE `mini_artical` (
  `uni_id` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `content` text CHARACTER SET big5 COLLATE big5_chinese_ci,
  `user_id` int DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`uni_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8