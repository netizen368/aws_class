package exam;

/* 
[문항4]
[예외처리]
1) 학생 정보 입력 할 때 정수 아닌 문자 입력하면 예외처리
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        System.out.println("=== 학생 3명 추가 ===");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.print("학년 입력: ");
                int grade = sc.nextInt();
                System.out.print("반 입력: ");
                int classNum = sc.nextInt();
                System.out.print("번호 입력: ");
                int num = sc.nextInt();
                sc.nextLine(); 
                System.out.print("이름 입력: ");
                String name = sc.nextLine().trim();
                System.out.print("점수 입력: ");
                int score = sc.nextInt();

                Student s = new Student(grade, classNum, num, name, score);
                if (manager.addStudent(s)) System.out.println("학생 추가 완료");
                else System.out.println("이미 존재하는 학생입니다");

            } catch (InputMismatchException e) {
                System.out.println("입력 오류: 정수를 입력해야 합니다!");
                sc.nextLine();
                i--; 
            }
        }

        System.out.println("\n=== 전체 출력 ===");
        manager.printAll();

        System.out.println("\n=== 학생 검색 ===");
        try {
            System.out.print("학년 입력: ");
            int grade = sc.nextInt();
            System.out.print("반 입력: ");
            int classNum = sc.nextInt();
            System.out.print("번호 입력: ");
            int num = sc.nextInt();

            Student s = manager.searchStudent(grade, classNum, num);
            if (s != null) System.out.println("검색 결과: " + s);
            else System.out.println("학생이 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("입력 오류: 정수를 입력해야 합니다!");
            sc.nextLine();
        }

        System.out.println("\n=== 학생 삭제 ===");
        try {
            System.out.print("학년 입력: ");
            int grade = sc.nextInt();
            System.out.print("반 입력: ");
            int classNum = sc.nextInt();
            System.out.print("번호 입력: ");
            int num = sc.nextInt();

            if (manager.deleteStudent(grade, classNum, num)) System.out.println("학생 삭제 완료");
            else System.out.println("학생이 없습니다.");
        } catch (InputMismatchException e) {
            System.out.println("입력 오류: 정수를 입력해야 합니다!");
            sc.nextLine();
        }

        System.out.println("\n=== 점수 기준 정렬 후 전체 출력 ===");
        manager.sortByScoreDesc();
        manager.printAll();

        System.out.println("\n=== 학년/반/번호 기준 정렬 후 전체 출력 ===");
        manager.sortByOrder();
        manager.printAll();
    }
}
