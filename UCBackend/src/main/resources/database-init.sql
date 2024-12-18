drop table if exists authorities;
drop table if exists users;


# CREATE TABLE userEntity
# (
#     id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
#     username VARCHAR(50) NOT NULL UNIQUE,
#     first_name VARCHAR(255),
#     last_name VARCHAR(255),
#     password VARCHAR(100) NOT NULL
# );
-- 创建用户表
CREATE TABLE `users`(
                       `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                       `username` VARCHAR(50) DEFAULT NULL,
                       `password` VARCHAR(500) DEFAULT NULL,
                       `enabled` BOOLEAN NOT NULL
);

-- 唯一索引
CREATE UNIQUE INDEX `user_username_uindex` ON `users`(`username`);

-- 插入用户数据 (密码是 "abc")
INSERT INTO `users` (`username`, `password`, `enabled`) VALUES
                                                           ('admin', '{bcrypt}$2a$10$GRLDNijSQMUvl/au9ofL.eDwmoolzS7.rmNSJZ.0Fx0/BTk76klW', TRUE),
                                                           ('Helen', '{bcrypt}$2a$10$GRLDNijSQMUvl/au9ofL.eDwmoolzS7.rmNSJZ.0Fx0/BTk76klW', TRUE),
                                                           ('Tom', '{bcrypt}$2a$10$GRLDNijSQMUvl/au9ofL.eDwmoolzS7.rmNSJZ.0Fx0/BTk76klW', TRUE);


CREATE TABLE authorities
(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    username  VARCHAR(50) NOT NULL,
    authority VARCHAR(50) NOT NULL,
    FOREIGN KEY (username) REFERENCES users(username) ON DELETE CASCADE ON UPDATE CASCADE
);