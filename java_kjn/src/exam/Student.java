package exam;

/*
[문항3]
[정렬]
1) 학생 정보를 학년, 반, 번호순으로 정렬
2) Comparable 인터페이스 활용
 */

public class Student implements Comparable<Student> {
    private int grade;     
    private int classNum;   
    private int num;        
    private String name;  
    private int score;    

    public Student(int grade, int classNum, int num, String name, int score) {
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

    // 학년, 반, 번호 기준 정렬
    @Override
    public int compareTo(Student other) {
        if (this.grade != other.grade) return this.grade - other.grade;
        if (this.classNum != other.classNum) return this.classNum - other.classNum;
        return this.num - other.num;
    }

    @Override
    public String toString() {
        return String.format("%d학년 %d반 %d번 %s 점수:%d", 
                             grade, classNum, num, name, score);
    }
}
