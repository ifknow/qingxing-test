CREATE TABLE `t_student` (
 `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
 `stu_no` int(11) DEFAULT NULL COMMENT '学号',
 `stu_name` varchar(255) DEFAULT NULL COMMENT '学生姓名',
 `gender` tinyint(3) DEFAULT NULL COMMENT '性别',
 `age` int(11) DEFAULT NULL COMMENT '年龄',
 `class_id` int(11) DEFAULT NULL COMMENT '班级id',
 `native_place` varchar(255) DEFAULT NULL COMMENT '籍贯',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='学生表';

INSERT INTO `t_student`(`id`, `stu_no`, `stu_name`, `gender`, `age`, `class_id`, `native_place`) VALUES (1, 1001, '张三', 0, 23, 1, '江苏南京');
INSERT INTO `t_student`(`id`, `stu_no`, `stu_name`, `gender`, `age`, `class_id`, `native_place`) VALUES (2, 1002, '李四', 0, 22, 1, '江苏南京');
INSERT INTO `t_student`(`id`, `stu_no`, `stu_name`, `gender`, `age`, `class_id`, `native_place`) VALUES (3, 1003, '王五', 1, 26, 2, '江苏苏州');
INSERT INTO `t_student`(`id`, `stu_no`, `stu_name`, `gender`, `age`, `class_id`, `native_place`) VALUES (4, 1004, 'tom', 0, 30, 2, '上海');

