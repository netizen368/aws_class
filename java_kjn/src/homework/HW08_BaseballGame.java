package homework;

import java.util.Scanner;

public class HW08_BaseballGame {

	public static void main(String[] args) {

		/* 1~9사이의 중복되지 않은 3개의 수를 생성해서 맞추는 게임
		 * 규칙
		 * S : 숫자가 있고 위치가 같음
		 * B : 숫자가 있고 위치가 다름
		 * O : 일치하는 숫자가 하나도 없음
		 * 
		 * 예시
		 * 랜덤수 : 1 5 4
		 * 입력 : 1 2 3
		 * 1S
		 * 입력 : 4 5 6
		 * 1S 1B
		 * 입력 : 7 8 9
		 * O
		 * 입력 : 1 4 5
		 * 1S 2B
		 * 입력 : 1 5 4
		 * 정답입니다.
		 */
		int [] Baseball = new int[3];
		int min = 1, max = 9;
		//중복되지 않는 숫자 생성
		for(int i = 0; i < 3; ) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			if(r != Baseball[0] && r != Baseball[1] && r != Baseball[2] ) {
				Baseball[i] = r;
				i++;
			}
		}
		
		//숫자 입력 or 숫자를 배열에 인식
		Scanner scan = new Scanner(System.in);
		System.out.println("게임을 시작합니다.");
		while(true) {
			System.out.print("1~9 사이의 정수 3개를 입력하세요 : ");
			int S = 0;
			int B = 0;
			int num[] = new int[3];
			num[0] = scan.nextInt();
			num[1] = scan.nextInt();
			num[2] = scan.nextInt();
			for(int i = 0; i < 3; i++) {
				//반복문으로 같은 번지에 있는 걸 찾고 난 뒤 S라 지칭
				if(num[i] == Baseball[i]) {
					S = S + 1;
				}
			}
			int B1 = 0;
			int B2 = 0;
			int B3 = 0;
			//이중 반복문으로 전체 번지에 동일한 숫자가 있는 것을 찾고 B라 지칭
			for(B = 1; B < 4;) {
				for(B1 = 0; B1 <= 1;) {
					if(num[1] == Baseball[2] || num [1] == Baseball[0]) {
						B1 = B1 + 1;
					}else {
						B1 = 0;
					}
					break;
				}
				for(B2 = 0; B2 <= 1;) {
					if(num[0] == Baseball[1] || num [0] == Baseball[2]) {
						B2 = B2 + 1;
					}else {
						B2 = 0;
					}
					break;
				}
				for(B3 = 0; B3 <= 1;) {
					if(num[2] == Baseball[1] ||num [2] == Baseball[0]) {
						B3 = B3 + 1;
					}else {
						B3 = 0;
					}
					break;
				}
				B = B1 + B2 + B3;
				break;
			}
			//출력값
			if(S != 3) {
				while(true) {
					if(S < 3 || B <= 3) {
						System.out.println(S + "S " + B + "B");
					}else if(S == 0 && B == 0) {
						System.out.println("out");
					}
					break;
				}
			}else if(S == 3){
				System.out.println("정답");
				break;
			}
		}
		
	}

}
