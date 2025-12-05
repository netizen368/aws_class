package homework;

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
		
		for(int i = 0; i < 3; ) {
			int r = (int)(Math.random() * (max - min + 1) + min);
			if(r != Baseball[0] && r != Baseball[1] && r != Baseball[2] ) {
				Baseball[i] = r;
				System.out.print(Baseball[i] + " ");
				i++;
			}
		}
		//반복문으로 같은 번지에 있는 걸 찾고 그걸 S, 이중 반복문으로 전체 번지에 숫자가 동일한게 있으면 B 갯수 찾기
		//S 정의
		//Baseball[0]이 p1와 동일하면 count2 + 1 
		//Baseball[1]이 p2와 동일하면 count2 + 1 
		//Baseball[2]이 p3와 동일하면 count2 + 1 
		//if로 count2가 1개이면 S1, 2개이면 S2=> S
		//B 정의
		//Baseball[0]이 p1와 같이 않고 p2나 p3이랑 동일하면 count1 + 1 
		//Baseball[1]이 p2와 같이 않고 p1나 p3이랑 동일하면 count1 + 1 
		//Baseball[2]이 p3와 같이 않고 p1나 p2이랑 동일하면 count1 + 1 
		//if로 count1가 1개이면 B1, 2개이면 B2, 3개이면 B3 => B
		
		
		
		//표시
		//B, S가 있다면 표시, 없다면 O를 표시 후 입력창 활성화
		//count2가 3개이면 정답입니다.를 표시하고 활동 종료
	}

}
