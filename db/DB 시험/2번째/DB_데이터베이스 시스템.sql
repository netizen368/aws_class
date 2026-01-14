# library라는 데이터베이스 삭제
drop database if exists library;

# library라는 데이터베이스를 생성
create database if not exists library;

# 데이터베이스 선택
use library;

# 이 DB의 모든 권한을 가진 lib_admin 계정(비번: '5678')을 생성(접속 호스트는 자유)
CREATE USER 'lib_admin'@'%' IDENTIFIED BY '5678';
GRANT ALL PRIVILEGES ON library.* TO 'lib_admin'@'%';


