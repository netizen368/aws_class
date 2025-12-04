package homework;

import java.util.Scanner;

public class HW05_Reverse {

	public static void main(String[] args) {

		/* 4자리 정수를 입력받아 거꾸로 출력하는 코드를 작성하세요.
		 * 예시
		 * 입력 : 1234
		 * 결과 : 4321
		 * 예시
		 * 입력 : 2000
		 * 결과 : 0002
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("4자리 정수를 입력하세요. : ");
		int num1 = scan.nextInt();
		int arr[] = new int [4];
		arr[0] = (num1/1000*1000);
		arr[1] = ((num1 - arr[0])/100*100);
		arr[2] = ((num1 - (arr[0]+arr[1]))/10*10);
		arr[3] = (num1 - (arr[0]+arr[1]+arr[2]));
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp1 = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp1;
				}
			}
		}
		arr[1] = (arr[1]/10);
		arr[2] = (arr[2]/100);
		arr[3] = (arr[3]/1000);
		for (int num : arr) {
			System.out.print(num);
		}
		System.out.println();
	}

}
