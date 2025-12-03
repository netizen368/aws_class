package homework;

import java.util.Scanner;
import java.util.Random;

public class HW04_UpDownGame {

	public static void main(String[] args) {
		
		/* 1~100사이의 랜덤한 수를 생성해서 맞추는 게임
		 * 랜덤한 후 : 33//안보여야함
		 * 정수입력 : 50
		 * DOWN
		 * 정수입력 : 25
		 * UP
		 * 정수입력 : 30
		 * UP
		 * 정수입력 : 33
		 * 정답입니다.
		 */
		
		int min = 1, max = 10;
		int r = (int)(Math.random() * (max - min + 1) + min);
		
		Random random = new Random();
		int r2 = random.nextInt(min, max+1);
			
		Scanner scan = new Scanner(System.in);
		for(min = 1, max = 10; max > min;) {	
			System.out.print("정수입력 : ");
			int num = scan.nextInt();
			if(r2 > num) {
				System.out.println("UP");
			}else if(r2 < num) {
				System.out.println("DOWN");
			}else if(r2 == num) {
				System.out.println("정답입니다.");
				System.out.println("정답 : " + r2);
				break;
			}
			
		}
	}

}
