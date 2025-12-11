package exam;

/*
[문항2]
[기능 구현 및 코드 완성도]
1) 기능:
- 추가 : 학년, 반, 번호가 같은 학생이 없으면 추가
- 삭제 : 학년, 반, 번호가 같은 학생을 삭제
- 검색 : 학년, 반, 번호가 같은 학생을 검색
 */
import java.util.ArrayList;
import java.util.Collections;

public class StudentManager {
    private ArrayList<Student> list = new ArrayList<>();

    public boolean addStudent(Student s) {
        for (Student existing : list) {
            if (existing.getGrade() == s.getGrade() &&
                existing.getClassNum() == s.getClassNum() &&
                existing.getNum() == s.getNum()) {
                return false;
            }
        }
        list.add(s);
        return true;
    }

    public boolean deleteStudent(int grade, int classNum, int num) {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getGrade() == grade && s.getClassNum() == classNum && s.getNum() == num) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public Student searchStudent(int grade, int classNum, int num) {
        for (Student s : list) {
            if (s.getGrade() == grade && s.getClassNum() == classNum && s.getNum() == num) {
                return s;
            }
        }
        return null;
    }

    public void printAll() {
        for (Student s : list) System.out.println(s);
    }

    public void sortByOrder() {
        Collections.sort(list);
    }

    public void sortByScoreDesc() {
        Collections.sort(list, (s1, s2) -> s2.getScore() - s1.getScore());
    }
}
