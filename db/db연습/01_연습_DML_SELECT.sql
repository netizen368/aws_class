/*
[가정 테이블]
member(id, name, email)
orders(id, member_id, price)
*/
/* 1단계 : SELECT 기초 (아무것도 모르는 상태)
1. member 테이블의 모든 데이터를 조회하시오.
*/
SELECT * FROM MEMBER;

/*2단계 : SELECT 컬럼 지정
1. member 테이블에서 name 컬럼만 조회하시오.
2. id와 name 컬럼만 조회하시오.
*/
# 1번
SELECT NAME FROM MEMBER;
# 2번
SELECT ID, NAME FROM MEMBER;

/*3단계 : WHERE 조건
1. id가 1인 회원을 조회하시오.
2. name이 '홍길동'인 회원을 조회하시오.
*/



