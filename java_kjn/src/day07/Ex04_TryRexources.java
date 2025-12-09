package day07;

import java.io.*;
import java.util.Scanner;

public class Ex04_TryRexources {

	public static void main(String[] args) {
	
		/* try resources p.533
		 * - 스트림을 열면 닫아야 해서 보통 finally에 닫는 작업을 함
		 *   => 닫을 때도 예외가 발생할 수 있어서 finally에 다시 예외처리를 해야하는 번거로움이 발생
		 *   => 이를 해결하기 위해 try resource를 이용하면 코드가 간결해짐
		 * - 문법
		 *  try(스트림을 염){
		 *  	코드 구현
		 *  }catch(예외클래스명 e){
		 *  	예외처리
		 *  }
		 */
		
		String fileName = "src/day07/data.txt";
		Scanner scan = new Scanner(System.in);
		
		/* 기반 스트림을 보조하는 보조 스트림*/
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
			
		while(true) {
			System.out.println("저장할 문자열 입력(종료- exit) : ");
			String str = scan.nextLine();
			if(str.equals("exit")){
					break;
			}
			bw.write(str);
			bw.write("\n");
		}
			
			
		}catch(IOException e) {
			System.err.println("예외 발생");
		}
		try(FileWriter fw = new FileWriter(fileName);//파일에서 문자열로 읽어오는 기반 스트림
			BufferedWriter bw = new BufferedWriter(fw)/* 기반 스트림을 보조하는 보조 스트림*/){
			
		}catch(IOException e) {
			System.err.println("예외 발생");
		}
	}

}
