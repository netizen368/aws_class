package homework;

import java.util.Scanner;

public class HW09_BaseballGame2 {
	
	final static int MAX_COUNT = 5;
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
		
		/* 메뉴 입력
		 * 선택한 메뉴에 맞는 기능 실행
		 * case 1 : 게임을 시작하는 메서드 구현 예정
		 *   => 게임 진행하는 메서드 구현 예정
		 *   => 게임진행되는 건 만들어져있음
		 *   => 시도 횟수 저장 후 확인시킬 메서드 구현 예정
		 *   => 이니셜 묻는 확인서 작성 후 등수에 맞게 저장하는 메서드 구현 예정
		 * case 2 : 기록 확인 메서드 구현 예정
		 * case 3 : 종료
		 */
		Scanner scan = new Scanner(System.in);
		char menu;
		int gameCount = 0;
		BaseballGame bbgs[] = new BaseballGame[MAX_COUNT];
		
		final char EXIT = '3';
		
		do {
			//메뉴 출력
			printMenu();
			
			//메뉴 입력
			menu = scan.next().charAt(0);
			
			//선택된 메뉴에 맞는 기능 싷행
			switch(menu) {
			case '1':
				//if로 정답을 맞추면 mainScore로 갈 수 있게끔
				gameCount = Game(0);
//				mainScore(bbgs, gameCount);
				break;
			case '2':
				
				break;
			case EXIT:
				System.out.println("게임을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");	
			}
		}while(menu != EXIT);
		
		
	}
	//메뉴 입력
	public static void printMenu() {
		System.out.println("=======메뉴=======");
		System.out.println("1. 게임 시작");
		System.out.println("2. 게임 기록 확인");
		System.out.println("3. 종료");
		System.out.print("메뉴 입력 : ");
	}
	//게임 시작 및 마무리
	public static int Game(int gameCount) {
		int [] Baseball = new int[3];
	      int min = 1, max = 9;
	      gameCount = 0;

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
	         
	         for(i = 0; i < 3; i++) {
	                if(num[i] == Baseball[i]) {
	                    S++;
	                }
	                else {
	                    for (int j = 0; j < 3; j++) {
	                        if (i != j && num[i] == Baseball[j])
	                            B++;
	                    }
	                }
	            }

	         // 출력
	         if(S == 0 && B == 0) {
	            System.out.println("O");
	            gameCount++;
	         } else {
	            System.out.println(S + "S " + B + "B");
	            gameCount++;
	         }

	         // 정답
	         if(S == 3) {
	            System.out.println("정답입니다.");
	            break;
	         }
			
		}
	    return gameCount;
	}
	//등수 확인, 이니셜 작성
//	public static BaseballGame[] mainScore(BaseballGame[]bbgs, int gameScore) {
//		//gameCount를 받아서 배열 정렬한 뒤에 5등 안이면 Score로 보낼수 있게 메인에 보내기
//		int i = 0;
//		for(i = 0; i < MAX_COUNT; i++) {
//			BaseballGame bbg = bbgs[i];
//			bbg.gameScore = gameScore;
//			System.out.println(bbgs[i]);
//		}
//		return bbgs;
//	}
	//기록 확인
	public static void Record() {
		//기록 확인에서 확인 할 수 있게 mainScore에서 정보 불러올수있게
	}
}

class BaseballGame{
	int gameScore, mainScore;
	String name;
}
