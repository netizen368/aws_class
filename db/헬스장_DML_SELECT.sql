USE FITNESS;
# 헬스장에 등록된 회원 목록을 조회
SELECT * FROM MEMBER;

# 헬스장에 등록된 회원 수를 조회 
SELECT COUNT(*) FROM MEMBER;

# 헬스장에 등록된 강좌를 조회
SELECT * FROM CLASS;

# 모닝 요가를 수강신청한 인원 수를 조회 
# 방법1 : 모닝 요가의 키값을 알 때
SELECT COUNT(*) FROM ENROLLMENT WHERE CLASS_ID = 1;
# 방법2 : 모닝 요가의 키값을 모를 때. 서브쿼리
SELECT COUNT(*) FROM ENROLLMENT
WHERE
	CLASS_ID = (SELECT CLASS_ID FROM CLASS WHERE NAME = '모닝 요가');
# 방법3 : 모닝 요가의 키값을 모를 때. JOIN    
SELECT COUNT(*) FROM ENROLLMENT
	JOIN CLASS USING(CLASS_ID)
    WHERE
		NAME = '모닝 요가';
        
# 강좌별 수강 신청 인원 수를 조회 
# - 강좌의 수강 신청한 회원이 없어도 0명으로 조회 
SELECT CLASS.CLASS_ID 강좌번호, NAME 강좌명, IFNULL(COUNT(ENROLLMENT_ID), 0) 인원수 FROM ENROLLMENT
RIGHT JOIN CLASS USING(CLASS_ID)
GROUP BY CLASS.CLASS_ID;

# 사물함 전체를 조회
SELECT * FROM LOCKER;

# 사용중인 사물함을 조회
SELECT LOCATION `사용중인 사물함 위치`, LOCKER_ID FROM MEMBER
JOIN LOCKER USING(LOCKER_ID);

# 사용중인 전체에서 사용이 가능하면 사용 가능, 사용주이면 사용중이라고 조회
# A구역-01 사용중
# A구역-02 사용가능


# 사물함과 회원을 연결했을 때 
SELECT IF(NULL IS NULL, '사용가능', '사용중'); # 회원과 연결된 사물함이 아님 
SELECT IF(1 IS NULL, '사용가능', '사용중'); # 회원과 연결된 사물함. 1번 회원 

SELECT 
	LOCATION `사용중인 사물함 위치`, 
    IF(MEMBER.LOCKER_ID IS NOT NULL, '사용중', '사용가능') `IF 사용 가능 여부1`,
    # MYSQL에서 참 거짓을 융통성 있게 판별
    # FALSE, NULL, 0, ''등은 거짓, 거짓이 아닌 모든 값은 참 
    # 단, 사용하지 않은 사물함은 회원 사물함 정보에서 NULL로 되어 있어야 함 
    IF(MEMBER.LOCKER_ID, '사용중', '사용가능') `IF 사용 가능 여부2` ,
	CASE WHEN LOCKER.LOCKER_ID = MEMBER.LOCKER_ID IS NOT NULL THEN '사용중'
		ELSE '사용가능' 
		END AS `CASE 사용 가능 여부3`,
	CASE WHEN MEMBER.LOCKER_ID THEN '사용중'
		ELSE '사용가능' 
		END AS `CASE 사용 가능 여부4`
FROM LOCKER
LEFT JOIN MEMBER USING(LOCKER_ID);

# 각 강좌별 현재 출석한 회원 수를 조회 
# - WHERE 절을 GROUP BY 앞에 넣으면 OUTER JOIN을 한 결과에 
# 	조건을 걸기 때문에 출석 정보가 없는 강좌들이 조회가 안됨. 
# 	=> 서브쿼리를 이용하여 조건을 걸면, 조건을 검색한 후에 OUTER JOIN을 하기 때문에
# 	   출석 정보가 없는 강좌들도 조회가 됨. 
SELECT CLASS_ID, NAME, COUNT(MEMBER_ID) 
FROM (
	SELECT * FROM ATTENDANCE 
	WHERE 
		DATE(CHECK_IN_TIME) = DATE(NOW())
	) ATT
	RIGHT JOIN CLASS USING(CLASS_ID)
GROUP BY CLASS_ID;

SELECT NAME, CHECK_IN_TIME LIKE CONCAT(DATE(NOW()), '%') FROM CLASS
LEFT JOIN ATTENDANCE USING(CLASS_ID);

# 회원별 회원이 강좌에 사용한 총 금액을 조회 
SELECT MEMBER_ID, MEMBER.NAME, FORMAT(IFNULL(SUM(FEE), 0),0) 총금액 
FROM CLASS
JOIN 
	(SELECT * 
    FROM ENROLLMENT
WHERE PAYMENT_STATE = '결제') E
	USING(CLASS_ID)
RIGHT JOIN MEMBER USING(MEMBER_ID)
GROUP BY MEMBER_ID;


