package Practice;

import java.util.Scanner;

public class H_완성 {

	public static void main(String[] args) {
		
		// 백준에서 정답인 것만 저장
		Scanner scan = new Scanner(System.in);
		int A, B, C; 

		// 1. Hello World 정답
		System.out.println("Hellow World!");
		
		// 2. A+B 정답
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A + B);
		
		// 3. A-B 정답
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A - B);
		
		// 4. A*B 정답
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A * B);
		
		// 5. A/B 정답
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A / (double)B);
		
		// 6. 사칙연산 정답
		A = scan.nextInt();
		B = scan.nextInt();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
		
		// 7. 나머지 정답
		A = scan.nextInt();
		B = scan.nextInt();
		C = scan.nextInt();
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
		
		// 8. 꼬마 정인 정답
		long D, E, F;
		D = scan.nextLong();
		E = scan.nextLong();
		F = scan.nextLong();
		System.out.println(D + E + F);
	}

}
