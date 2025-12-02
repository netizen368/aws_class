package day02;

public class HW02_Star {

	public static void main(String[] args) {

		/* 샘플 코드를 참고하여 아래와 같이 출력되도록 코드를 작성하세요. */
		
		int row = 5, col = 5;
		
		/* *****
		 * *****
		 * *****
		 * *****
		 * *****
		 */
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		/* 문제1
		 * *     i=1, *=1개
		 * **	 i=2, *=2개
		 * ***	 i=3, *=3개
		 * ****	 i=4, *=4개
		 * ***** i=5, *=5개
		 * 		       *=?
		 */
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		/* 문제2
		 *     * i=1, 공백=4, *=1개
		 *    ** i=2, 공백=3, *=2개
		 *   *** i=3, 공백=2, *=3개
		 *  **** i=4, 공백=1, *=4개
		 * ***** i=5, 공백=0, *=5개
		 */
		for(int i = 1; i <= row; i++) {
			for(int a = 5; a >= i; a--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
		/* 문제3
		 *     *     i=1, 공백=4, *=1개
		 *    ***	 i=2, 공백=4, *=3개
		 *   *****	 i=3, 공백=4, *=5개
		 *  *******  i=4, 공백=4, *=7개
		 * ********* i=5, 공백=4, *=9개
		 * 						 *=2*n-1개
		 */						 
		for(int i = 1; i <= row; i++) {
			for(int a = 5; a >= i; a--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 10	; j++ ) {
				if(j >= 1) {
					int num = j + 2;
					System.out.print("*");
					continue;
				}}
			System.out.println();
		
		}
	}
}
