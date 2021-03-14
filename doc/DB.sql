CREATE TABLE `class` (
  `id` int NOT NULL AUTO_INCREMENT,
  `className` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '班级名称',
  `weekDay` int NOT NULL COMMENT '用来表示星期几，例如：1：星期一，2：星期二，以此类推',
  `beginTime` time DEFAULT NULL COMMENT '上课开始时间',
  `endTime` time DEFAULT NULL COMMENT '上课结束时间',
  `subjectIds` int DEFAULT NULL COMMENT '科目ID列表,逗号分割',
  `desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  `timeCreated` datetime DEFAULT CURRENT_TIMESTAMP,
  `timeModified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='班级表'

CREATE TABLE `courseOrder` (
  `id` int NOT NULL AUTO_INCREMENT,
  `studentId` int NOT NULL COMMENT '学员表ID',
  `classId` int NOT NULL COMMENT '班级ID',
  `totalQuantity` int NOT NULL COMMENT '总课程数量',
  `usedQuantity` int NOT NULL COMMENT '已使用课程数',
  `unusedQuantity` int NOT NULL COMMENT '未使用课程数',
  `payChannel` tinyint NOT NULL COMMENT '付款渠道  1：支付宝 2：微信  3：现金   ',
  `orderTime` datetime NOT NULL COMMENT '下单时间',
  `status` tinyint NOT NULL COMMENT '课程订单状态：1：进行中  2：已结课',
  `overTime` datetime DEFAULT NULL COMMENT '结课时间',
  `timeCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `timeModified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='课程订单表'


CREATE TABLE `courseware` (
  `id` int NOT NULL,
  `coursewareName` varchar(255) NOT NULL COMMENT '课件名称',
  `fileUrl` varchar(255) DEFAULT NULL COMMENT '文件地址',
  `desc` varchar(255) DEFAULT NULL,
  `timeCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `timeModified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='课件表'


CREATE TABLE `lesson` (
  `id` int NOT NULL AUTO_INCREMENT,
  `studentId` int DEFAULT NULL COMMENT '学员Id',
  `courseOrderId` int DEFAULT NULL COMMENT '课程订单Id',
  `subjectId` int DEFAULT NULL COMMENT '科目Id',
  `classId` int DEFAULT NULL,
  `coursewareId` int DEFAULT NULL COMMENT '课件Id',
  `studentPaintingUrl` varchar(255) DEFAULT NULL COMMENT '学员作品展示Url',
  `classTime` datetime DEFAULT NULL COMMENT '上课时间',
  `status` tinyint unsigned DEFAULT NULL COMMENT '状态：1：未上课  2：已上课',
  `timeCreated` datetime DEFAULT NULL,
  `timeModified` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci  COMMENT='课时表'


CREATE TABLE `student` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL COMMENT '姓名',
  `birthYear` year DEFAULT NULL COMMENT '出生年份',
  `gender` tinyint NOT NULL COMMENT '性别',
  `address` varchar(255) DEFAULT NULL COMMENT '家庭住址',
  `channel` tinyint DEFAULT NULL,
  `timeCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `timeModified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='学员表'

CREATE TABLE `subject` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `subjectName` varchar(255) DEFAULT NULL COMMENT '科目名称',
  `timeCreated` datetime DEFAULT CURRENT_TIMESTAMP,
  `timeModified` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='科目表'