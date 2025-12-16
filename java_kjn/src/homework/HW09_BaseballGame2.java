package homework;

import java.util.Scanner;

public class HW09_BaseBallGame2 {
	/* 기본 게임 방식은 HW08과 동일한데 기록 관리를 추가
	 * 관리할 기록은 횟수와 입력한 이니셜
	 *  메뉴
	 *  1. 플레이
	 *  2. 기록 확인
	 *  3. 종료
	 *  메뉴 선택 : 1
	 *  //HW08에 했던 야구 게임이 진행
	 *  //정답을 맞추면 맞춘 횟수를 출력
	 *  정답입니다.
	 *  시도횟수는 4회
	 *  5등안에 들었습니다. 
	 *  이니셜을 남겨주세요 : JIK
	 *  
	 *  메뉴
	 *  1. 플레이
	 *  2. 기록 확인
	 *  3. 종료
	 *  메뉴 선택 : 2
	 *  1. JIK - 4회
	 *  메뉴
	 *  1. 플레이
	 *  2. 기록 확인
	 *  3. 종료
	 *  메뉴 선택 : 3
	 * */
	public static void main(String[] args) {
		//메뉴 생성
		//1. 플레이
		/* 1. 랜덤숫자 생성하여 게임 진행 메서드 생성
		 * 2. 5등 이상 시 이니셜 입력하여 기록 저장 메서드 생성
		 */
		//2. 기록확인
		/* 1. 1번의 2번에 있는 메서드를 가져와서 보여주는 메서드 생성
		 */
		//3. 종료

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
