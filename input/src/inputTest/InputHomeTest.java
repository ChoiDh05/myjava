package inputTest;

import java.util.Scanner;

public class InputHomeTest {
	public static void main(String[] args) {
		// 세 정수를 입력하고 앞에 두 정수를 더한 후 3번째 정수를 곱한 값을 구해라
		
		
//		입력 스캐너 호출
		Scanner sc = new Scanner(System.in);
		
//		사용자에게 출력될 메세지 변수에 저장
		String message = "세 정수를 한번에 입력하세요\n 예) 1 3 5";
		
//		사용자가 입력할 값을 저장할 변수에 초기값 저정(정수니까 0)
		int data1 = 0, data2 = 0, data3 = 0;
//		사용자에게 출력될 계산식 변수에 저장
		 String resultmessage = "(%d + %d) * %d = %d";
		
//		 사용자에게 출력될 메세지 출력
		 System.out.println(message);
//		 사용자가 입력할 정수 입력메소드
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		data3 = sc.nextInt();
		
//		사용자가 입력한 정수 계산
		int result = (data1 + data2) * data3;
		
//		계산된 값을 계산시과 함께 출력
		System.out.printf(resultmessage, data1, data2, data3, result);
	}
}
