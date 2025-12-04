package homework;

public class HW06_Alphabet {

	public static void main(String[] args) {
		
		/* 다음 결과가 출력 되도록 코드를 작성하세요.
		 * 참고 예제 : day02.Ex02_ForTest에서 a부터 z까지 한줄로 출력 예제
		 * a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * ...
		 * abcdefghijk...xyz
		 */
		
		for(int i = 1; i <= 26; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print((char)(96 + j));
			}
			System.out.println();
		}
		
	}

}
