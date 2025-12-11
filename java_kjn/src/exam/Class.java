package exam;

/*
[평가 과제]
학생 정보를 객체로 관리하는 프로그램을 작성하시오.
- 학생 3명 추가
- 전체 출력
- 특정 학생 정보 입력 후 검색 출력
- 특정 학생 정보 입력 후 삭제
- 점수 기준 정렬 후 다시 전체 출력

[문항1]
[클래스 선언]
1) 학생 클래스를 선언
2) 필수 항목
- 학년, 반, 번호, 이름, 점수
- 이름은 공백이 없음
 */

public class Class implements Comparable<Class> {
    private int grade;      
    private int classNum;   
    private int num;       
    private String name;    
    private int score;     

    public Class(int grade, int classNum, int num, String name, int score) {
        this.grade = grade;
        this.classNum = classNum;
        this.num = num;
        this.name = name;
        this.score = score;
    }


    public int getGrade() { return grade; }
    public int getClassNum() { return classNum; }
    public int getNum() { return num; }
    public String getName() { return name; }
    public int getScore() { return score; }


    public void setScore(int score) { this.score = score; }


    @Override
    public int compareTo(Class other) {
        if (this.grade != other.grade) return this.grade - other.grade;
        if (this.classNum != other.classNum) return this.classNum - other.classNum;
        return this.num - other.num;
    }

	
}
