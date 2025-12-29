# 데이터베이스 삭제
DROP DATABASE IF EXISTS TEST;

# 데이터베이스 생성
CREATE DATABASE TEST;

# 데이터베이스 선택
USE TEST;

# 테이블 삭제
DROP TABLE IF EXISTS `MEMBER`;

# 테이블 생성
CREATE TABLE `member` (
	`id`	varchar(50)	NOT NULL PRIMARY KEY,
	`name`	varchar(20)	NULL,
	`email`	varchar(50)	NULL
);

CREATE TABLE `orders` (
	`id`	varchar(50)	NOT NULL PRIMARY KEY,
	`price`	int	NOT NULL DEFAULT 0,
	`mb_id`	varchar(50)	NOT NULL
);

ALTER TABLE `orders` ADD CONSTRAINT `FK_member_TO_orders_1` FOREIGN KEY (
	`mb_id`
)
REFERENCES `member` (
	`id`
);


