package day01;

import java.util.Scanner;

public class EX15_HomeWork {

	public static void main(String[] args) {
		
		/*성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요. 
		 * - 추가 작업 없이 switch문을 간단히 활용하기 위해 점수 범위 설정
		 * A : 90 ~ 109
		 * B : 80 ~ 89
		 * C : 70 ~ 79
		 * D : 60 ~ 69
		 * F : -9 ~ 59
		 * 잘못된 성적 : -9미만, 110이상
		 */
		Scanner scan = new Scanner(System.in);
		// 입력 안내 문구
		System.out.print("점수 입력 : ");
		// 정수1를 입력 받음
		int num = scan.nextInt();
		// 연산자를 입력 받음(문자)
		
		switch(num / 10) {
		case 9, 10:
			System.out.println(num + "는 A");
			break;
		case 8:
			System.out.println(num + "는 B");
			break;
		case 7:
			System.out.println(num + "는 C");
			break;
		case 6:
			System.out.println(num + "는 D");
		case 0, 1, 2 ,3 , 4, 5:
			System.out.println(num + "는 F");
		default:
			System.out.println(num + " 잘못된 성적입니다.");
	}

	}}
