DROP DATABASE IF EXISTS mall;

# mall이라는 DB 생성
CREATE DATABASE mall;

DROP USER 'mall_admin'@'%';
# mall_admin(비번 : 1234)을 생성하는 쿼리를 작성(모든 권한)
CREATE USER 'mall_admin'@'%' IDENTIFIED BY '1234';

GRANT ALL PRIVILEGES ON mall.* TO 'mall_admin'@'%' WITH GRANT OPTION;

FLUSH PRIVILEGES;