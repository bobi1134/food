/*
SQLyog v10.2 
MySQL - 5.7.16-log : Database - data_food
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`data_food` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `data_food`;

/*Table structure for table `t_canteen` */

DROP TABLE IF EXISTS `t_canteen`;

CREATE TABLE `t_canteen` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `canteen_img` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '食堂封面',
  `canteen_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '食堂名称',
  `university_id` int(11) DEFAULT NULL COMMENT '大学-外键id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5a8mdm3mbh8m22x6bk15b3om0` (`canteen_name`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_canteen` */

insert  into `t_canteen`(`id`,`canteen_img`,`canteen_name`,`university_id`) values (1,NULL,'小木屋',1),(2,NULL,'杏苑',1),(3,NULL,'竹苑',1),(4,NULL,'桂苑',1),(5,NULL,'紫荆园',2),(6,NULL,'桃李园',2),(7,NULL,'丁香园',2),(8,NULL,'听涛园',2),(9,NULL,'清芬园',2),(10,NULL,'闻馨园',2),(11,NULL,'学一',3),(12,NULL,'康博斯',3),(13,NULL,'农园',3),(14,NULL,'艺园',3),(15,NULL,'勺园',3),(16,NULL,'家园',3),(17,NULL,'西园一餐厅',4),(18,NULL,'西园二餐厅',4),(19,NULL,'馨苑',4),(20,NULL,'银桦餐厅',5),(21,NULL,'紫荆餐厅',5),(22,NULL,'芙蓉餐厅',5);

/*Table structure for table `t_dish` */

DROP TABLE IF EXISTS `t_dish`;

CREATE TABLE `t_dish` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `canteen_id` int(11) DEFAULT NULL COMMENT '食堂-外键id',
  `dish_img` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '菜品封面',
  `dish_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '菜品名称',
  `dish_type` int(11) DEFAULT NULL COMMENT '菜品类别',
  `praise_num` int(11) DEFAULT '0' COMMENT '点赞数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_dish` */

insert  into `t_dish`(`id`,`canteen_id`,`dish_img`,`dish_name`,`dish_type`,`praise_num`) values (1,1,NULL,'泡椒鱼皮',1,3),(2,1,NULL,'皮蛋鸭卷',1,NULL),(3,1,NULL,'沙田蜜柚柚子皮',1,NULL),(4,1,NULL,'酸辣土豆片',1,NULL),(5,1,NULL,'飘儿白',2,NULL),(6,1,NULL,'莲花白',2,NULL),(7,1,NULL,'莴笋',2,NULL),(8,1,NULL,'小炒肉',3,NULL),(9,1,NULL,'土豆丝炒肉',3,NULL),(10,1,NULL,'土豆回锅',3,NULL),(11,1,NULL,'川味香肠',4,NULL),(12,1,NULL,'李庄白肉',4,NULL),(13,2,NULL,'番茄橘子烧排骨',1,NULL),(14,3,NULL,'糖醋排骨',1,NULL),(15,4,NULL,'辣子鸡丁',1,NULL),(16,5,NULL,'一层香锅',1,NULL),(17,6,NULL,'二层自选各种粥',1,NULL),(18,7,NULL,'老碗鱼/排骨/鸡块',1,NULL),(19,8,NULL,'一层肉夹馍+油泼面',1,NULL),(20,9,NULL,'地下清青快餐',1,NULL),(21,10,NULL,'清真素面',1,NULL),(22,11,NULL,'青菜鸡蛋汤',1,NULL),(23,12,NULL,'水饺/蒸饺',1,NULL),(24,13,NULL,'麻辣烫',1,NULL),(25,14,NULL,'泡椒牛肉',1,NULL),(26,15,NULL,'手抓面',1,NULL),(27,16,NULL,'河南大饼',1,NULL),(28,17,NULL,'西园一餐厅',1,NULL),(29,18,NULL,'盖浇饭',1,NULL),(30,19,NULL,'砂锅',1,NULL),(31,20,NULL,'干锅排骨',1,NULL),(32,21,NULL,'莲藕',1,NULL),(33,22,NULL,'血旺',1,NULL);

/*Table structure for table `t_remark` */

DROP TABLE IF EXISTS `t_remark`;

CREATE TABLE `t_remark` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `dish_id` int(11) DEFAULT NULL COMMENT '菜品-外键id',
  `remark_content` mediumtext COLLATE utf8_bin COMMENT '评论内容',
  `remark_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论时间',
  `user_id` int(11) DEFAULT NULL COMMENT '用户-外键id',
  `user` tinyblob,
  `dish` tinyblob,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_remark` */

insert  into `t_remark`(`id`,`dish_id`,`remark_content`,`remark_time`,`user_id`,`user`,`dish`) values (1,1,'非常好吃哟！','2017-06-13 20:17:02',1,NULL,NULL),(2,1,'我是22舍的，我也觉得非常好吃哟！','2017-06-13 20:17:02',2,NULL,NULL),(3,1,'赞赞赞赞赞赞！','2017-06-13 20:17:03',3,NULL,NULL),(4,5,'赞赞赞赞赞赞，很新鲜的蔬菜！','2017-06-13 20:17:03',3,NULL,NULL),(5,13,'666666！','2017-06-13 20:17:03',2,NULL,NULL),(6,1,'我也觉得好吃啦！O(∩_∩)O哈哈~','2017-06-13 22:56:26',2,NULL,NULL),(7,1,'我也觉得好吃啦！O(∩_∩)O哈哈~','2017-06-13 22:56:44',2,NULL,NULL),(8,17,'因为是自选的，所以我觉得好好啦！','2017-06-14 00:01:16',2,NULL,NULL);

/*Table structure for table `t_university` */

DROP TABLE IF EXISTS `t_university`;

CREATE TABLE `t_university` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `cn_description` mediumtext COLLATE utf8_bin COMMENT '大学中文描述',
  `en_description` mediumtext COLLATE utf8_bin COMMENT '大学英文描述',
  `university_cn_name` varchar(20) COLLATE utf8_bin DEFAULT NULL COMMENT '大学中文名称',
  `university_en_name` varchar(150) COLLATE utf8_bin DEFAULT NULL COMMENT '大学英文名称',
  `university_img` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '大学封面',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_48avk78pxfiihgtgq4rvqnq4d` (`university_cn_name`),
  UNIQUE KEY `UK_m58rhrqfpstu3ascwqi09mnty` (`university_en_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_university` */

insert  into `t_university`(`id`,`cn_description`,`en_description`,`university_cn_name`,`university_en_name`,`university_img`) values (1,'四川农业大学（Sichuan Agricultural University）简称“川农大（SAU）”，是由四川省人民政府主管的一所以生物科技为特色、农业科技为优势，农、理、工、经、管、医、文、教、法、艺多学科协调发展的重点大学，是国家“211工程”重点建设院校之一，入选“111计划“、“卓越农林人才教育培养计划”、“援疆学科建设计划”、“国家建设高水平大学公派研究生项目” ，是国家“973计划”承担高校，“四川2011计划”高校  ，全国首批高等学校新农村发展研究院试点单位，四川省首批人才优先发展试验区2所试点高校之一， 具备自主招生资格。','Sichuan Agricultural University (Sichuan Agricultural University) referred to as \"Sichuan Agricultural University (SAU)\", is the Sichuan Provincial People\'s Government in charge of a biotechnology for the characteristics of agricultural science and technology as an advantage, agriculture, science, industry, management, Is one of the key construction schools of the national \"211 Project\", selected as \"111 Plan\", \"Excellent Agriculture and Forestry Talents Education and Training Program\", \"Yuanjiang Discipline Construction Plan\", \" \"National Construction of high-level university public school graduate project\" [1], is the national \"973 plan\" to undertake colleges and universities, \"Sichuan 2011 Plan\" colleges and universities, the first batch of colleges and universities in the new rural development research pilot units, the first batch of Sichuan Province Talent priority development pilot area 2 one of the pilot colleges and universities, with independent enrollment qualifications','四川农业大学','Sichuan Agricultural University',NULL),(2,'清华大学（Tsinghua University），简称“清华”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“珠峰计划”、“2011计划”、“111计划”、“卓越工程师教育培养计划”、“卓越法律人才教育培养计划”、“卓越医生教育培养计划”，为九校联盟、东亚研究型大学协会、环太平洋大学联盟、亚洲大学联盟[1]  、清华大学—剑桥大学—麻省理工学院低碳能源大学联盟成员。','Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, Tsinghua University, \",\" 111 Program \",\" Excellent Engineer Education and Training Program \",\" Excellent Legal Personnel Education and Training Program \",\" Excellence Doctor Education Program \", Nine Schools, East Asian Research University Association, Pacific Rim Union, Asian University Alliance [1], Tsinghua University - Cambridge University - Massachusetts Institute of Technology Low Carbon Energy University Alliance member.','清华大学','Tsinghua University',NULL),(3,'北京大学（Peking University）简称“北大”，诞生于1898年，初名京师大学堂，是中国近代第一所国立大学，也是第一个以“大学”之名创办的学校，其成立标志着中国近代高等教育的开端。北大是中国近代以来唯一以国家最高学府身份创立的学校，最初也是国家最高教育行政机关，行使教育部职能，统管全国教育。北大催生了中国最早的现代学制，开创了中国最早的文科、理科、社科、农科、医科等大学学科，是近代以来中国高等教育的奠基者。','Peking University (Peking University) referred to as \"Peking University\", was born in 1898, the first name of the capital school, is the first modern Chinese university, is the first to \"university\" in the name of the school, its establishment marks the The Beginning of Modern Higher Education. Peking University is the only country in modern China since the creation of the highest institution of the school, initially the highest educational administrative organs, the exercise of the functions of the Ministry of Education, the national education. Peking University gave birth to China\'s earliest modern academic system, created China\'s earliest liberal arts, science, social science, agriculture, medical and other university disciplines, is the founder of modern Chinese higher education since modern times.','北京大学','Peking University',NULL),(4,'四川大学（Sichuan University），简称“川大”，由中华人民共和国教育部直属，中央直管副部级建制，位列“211工程”、“985工程”，入选“2011计划”、“珠峰计划”、“111计划”、“卓越工程师教育培养计划”、“海外高层次人才引进计划”，设有研究生院，拥有研究生自主划线资格，是一所综合性全国重点大学。','Sichuan University, Sichuan University (Sichuan University), referred to as \"Sichuan University\", by the People\'s Republic of China directly under the Ministry of Education, the central straight pipe vice ministerial level system, ranked \"211 project\", \"985 project\", selected \"2011 plan\" Plan \",\" 111 plan \",\" excellent engineer education and training program \",\" overseas high-level talent introduction plan \", with graduate school, with graduate students qualified crossed, is a comprehensive national key university.','四川大学','Sichuan University',NULL),(5,'电子科技大学（University of Electronic Science and Technology of China）简称“电子科大”，坐落于有“天府之国”之称的成都市，由中华人民共和国教育部直属，为教育部 、工信部 、四川省人民政府重点共建，位列“211工程”、“985工程”，入选国家“2011计划”、“111计划”、“卓越工程师教育培养计划”，两电一邮成员，设有研究生院，是一所以电子信息科学技术为核心、以工为主，理工渗透，理、工、管、文协调发展的多科性研究型全国重点大学，被誉为“中国电子类院校的排头兵”。','University of Electronic Science and Technology (University of Electronic Science and Technology of China) referred to as \"electronic science\", is located in the \"land of abundance,\" said the city of Chengdu, by the People\'s Republic of China directly under the Ministry of Education, Ministry of Education, Ministry of Industry, Sichuan Provincial People\'s Government The \"211 Project\", \"985 Project\", selected in the \"2011 Plan\", \"111 Plan\", \"Excellent Engineer Education and Training Program\", two electric and one postal member, with a graduate school, Information science and technology as the core, to the main work, science and technology penetration, management, management, management of the coordinated development of multi-disciplinary research-based national key universities, known as \"China\'s electronic institutions of the vanguard.\"','电子科技大学','University Of Electronic Science And Technology Of China',NULL);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `email` varchar(30) COLLATE utf8_bin NOT NULL COMMENT '邮箱作为用户名',
  `enabled` int(11) DEFAULT '-1' COMMENT '是否启用,-1未启用(默认),1启用',
  `img` varchar(100) COLLATE utf8_bin DEFAULT NULL COMMENT '头像',
  `nick_name` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '昵称姓名',
  `pwd` varchar(30) COLLATE utf8_bin DEFAULT NULL COMMENT '密码',
  `reg_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `role` int(11) DEFAULT '3' COMMENT '角色,1超级管理员,2网站管理员,3网站会员(默认)',
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_i6qjjoe560mee5ajdg7v1o6mi` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`email`,`enabled`,`img`,`nick_name`,`pwd`,`reg_time`,`role`) values (1,'jxjy.ing@foxmail.com',1,NULL,'Mr.X','111111','2017-06-13 20:16:55',1),(2,'1451965355@qq.com',1,NULL,'Old friend','111111','2017-06-13 20:16:55',2),(3,'admin@qq.com',1,NULL,'Admin','111111','2017-06-13 20:16:56',2),(4,'test1@qq.com',1,NULL,'测试账号1','111111','2017-06-13 20:16:56',3),(5,'test2@qq.com',-1,NULL,'测试账号2','111111','2017-06-13 20:16:56',3),(6,'test3@qq.com',-1,NULL,'测试账号3','111111','2017-06-13 20:16:56',3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
