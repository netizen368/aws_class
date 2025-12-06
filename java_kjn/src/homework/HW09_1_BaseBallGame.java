package homework;

import java.util.Scanner;

public class HW09_1_BaseBallGame {

	public static void main(String[] args) {

		int [] Baseball = new int[3];
	      int min = 1, max = 9;

	      //중복되지 않는 숫자 생성
	      int i = 0;
	      for(i = 0; i < 3; ) {
	         int r = (int)(Math.random() * (max - min + 1) + min);
	         if(r != Baseball[0] && r != Baseball[1] && r != Baseball[2] ) {
	            Baseball[i] = r;
	            System.out.print(Baseball[i] + " ");  // 테스트용 출력
	            i++;
	         }
	      }

	      Scanner scan = new Scanner(System.in);
	      System.out.println("\n게임을 시작합니다.");

	      while(true) {

	         int S = 0, B = 0;
	         int num[] = new int[3];

	         // 숫자 입력
	         System.out.print("1~9 사이의 정수 3개를 입력하세요 : ");
	         num[0] = scan.nextInt();
	         num[1] = scan.nextInt();
	         num[2] = scan.nextInt();

	         // 스트라이크 계산
	         for(i = 0; i < 3; i++) {
	            if(num[i] == Baseball[i]) {
	               S = S + 1;
	            }
	         }

	         // 볼 계산 (숫자만 같고 위치는 다른 경우)
	         for(i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	               if(i != j && num[i] == Baseball[j]) {
	                  B = B + 1;
	               }
	            }
	         }

	         // 출력
	         if(S == 0 && B == 0) {
	            System.out.println("O");
	         } else {
	            System.out.println(S + "S " + B + "B");
	         }

	         // 정답
	         if(S == 3) {
	            System.out.println("정답입니다.");
	            break;
	         }
		   }

	}

}
