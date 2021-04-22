CREATE TABLE IF NOT EXISTS `t_user` (
    `id` bigint unsigned auto_increment,
    `username` varchar(100) not null,
    `password` varchar(100) not null,
    primary key(`id`)
    )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `t_role` (
    `id` bigint unsigned auto_increment,
    `username` varchar(100) not null,
    `name` varchar(10) not null,
    primary key(`id`)
    )ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
