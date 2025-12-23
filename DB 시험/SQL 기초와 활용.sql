# 4-1 : 다음 데이터를 추가하는 쿼리 작성
USE MALL;
# 회원
# - 아이디 : 1, 이름 :홍길동, 포인트 :1000
# - 아이디 : 2, 이름 :김철수, 포인트 :500
INSERT INTO MEMBER(M_ID, M_NAME, M_POINT) VALUES
(1, '홍길동', 1000), (2, '김철수', 500);

SELECT * FROM MEMBER;

# - 상품
# - 상품 번호 :101, 상품명 : 노트북, 가격 :1500000, 재고 :10
# - 상품 번호 :102, 상품명 : 마우스, 가격 :30000, 재고 :50
INSERT INTO PRODUCT(P_ID, P_NAME, P_PRICE, P_STOCK) VALUES
(101, '노트북', 1500000, 10), (102, '마우스', 30000, 50);

SELECT * FROM PRODUCT;