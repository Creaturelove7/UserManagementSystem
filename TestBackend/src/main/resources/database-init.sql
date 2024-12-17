drop table if exists user;

create table user
(
    username     varchar(256)  NULL ,
    id           int auto_increment primary key NOT NULL
);

INSERT INTO user
    (username, id)
VALUES
    ('David', 1);