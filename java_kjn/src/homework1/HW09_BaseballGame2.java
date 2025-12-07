package homework1;

import java.util.Scanner;

public class HW09_BaseballGame2 {

	public static void main(String[] args) {

		/* 기본 게임 방식은 HW08과 동일한데 기록 관리를 추가
		 * 관리학 기록은 횟수와 입력한 이니셜
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록 확인
		 * 3. 종료
		 * 메뉴 선택 : 1
		 * //HW08에 했던 야구 게임이 진행
		 * //정답을 맞추면 맞춘 횟수를 출력
		 * 정답입니다.
		 * 시도횟수는 4회
		 * 5등안에 들었습니다. 
		 * 이니셜을 남겨주세요 : KYN
		 * 
		 * 메뉴
		 * 1. 플레이
		 * 2. 기록 확인
		 * 3. 종료
		 * 메뉴 선택 : 2
		 * 1. KYN - 4회
		 */
		
		/* 앞에 기능을 어떻게 가져올건지?
		 * 가져온다면 어떻게 기록관리(시도횟수, 입력한 이니셜)를 추가할 것인지?
		 * 등수를 어떻게 저장할 것인지?
		 */
		Scanner scan = new Scanner(System.in);
		int [] Baseball = new int[3];
		int min = 1, max = 9;
		
		//중복되지 않는 숫자 생성
		int i = 0;
		for(i = 0; i < 3;) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			if(r != Baseball[0] && r != Baseball[1] && r != Baseball[2]) {
				Baseball[i] = r;
				System.out.print(r + " ");
				i++;
			}
		}
		
		System.out.println("\n게임을 시작합니다.");
		
		//숫자 입력
		int S = 0, B = 0;
		int num[] = new int[3];
		while(true) {
			System.out.print("1~9 사이의 정수 3개를 입력하세요 : ");
			num[0] = scan.nextInt();
			num[1] = scan.nextInt();
			num[2] = scan.nextInt();
			
			//스트라이크 계산
			for(i = 0; i < 3; i++) {
				if(num[i] == Baseball[i]) {
					S = S + 1;
				}
			}
			// 볼 계산(숫자만 같음, 위치 다름)
			for(i = 0; i < 3; i++) {
				for(int j = 0; j < 3 ; j++) {
					if(i != j && num[i] == Baseball[j]) {
						B = B + 1;
					}
				}
			}
			//출력
			if(S == 0 && B == 0) {
				System.out.println("O");
			}else{
				System.out.println(S + "S " + B + "B");
			}
			//정답
			if(S == 3) {
				System.out.println("정답");
				break;
			}
		}		
		

	}

}
