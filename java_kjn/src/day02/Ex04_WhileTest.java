package day02;

public class Ex04_WhileTest {

	public static void main(String[] args) {
		
		//Hello World 5번 출력 예제
		int i = 5;
		while(i-- >= 1) {
			//조건식에서 i가 5면 여기 실행문에서는 i가 4
			System.out.println("Hellow World!");
			
		}
		System.out.println("------------------------------");
		//2단 구구단 출력 예제
		int num = 1;
		while(num <= 9) {
			System.out.println("2 x " + num + " = " + 2*num);
			num++;
		}

	}

}
