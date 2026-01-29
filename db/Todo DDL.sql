drop database if exists todo;
create database todo;

use todo;

create table todo(
	num int primary key auto_increment,
    date Date not null,
    text varchar(100) not null,
    `order` int not null
);
insert into todo(date,text, `order`) value("2026-01-29", "점심", 1);

insert into todo(date,text, `order`) value("2026-01-29", "저녁", 2);