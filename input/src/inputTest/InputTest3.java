package inputTest;

import java.util.Scanner;

public class InputTest3 {
public static void main(String[] args) {
//	3개의 정수를 한 번에 입력받은 후 덧셈 결과 출력
//	nextInt(): 사용자가 입력한 정수 값
	
//	입력 클랙스 호출
	Scanner sc = new Scanner(System.in);
//	사용자가 확인할 문구 변수에 저장
	String message = "3개의 정수를 한 번에 입력하세요.", exampleMessage = "예) 3 5 6";
//	사용자가 입력한 값을 표시할 계산식 변수에 저장
	String resultMessage = "%d+ %d + %d = %d";
	
//	사용자가 입력할 값을 저장할 변수에 초기값 저장
	int data1 = 0, data2 = 0, data3 = 0, result=0;
	
//	사용자가 확인할 문구 출력
	System.out.println(message);
	System.out.println(exampleMessage);
	
//	사용자가 입력할 입력 메소드
	data1=sc.nextInt();data2=sc.nextInt();data3=sc.nextInt();
	
//	입력한 값을 합한 값을 변수에 저장
	result = data1 + data2 + data3;
	
//	연산결과 메세지 출력
	System.out.printf(resultMessage, data1, data2, data3, result);
//	System.out.println(data1+data2+data3);
	
}
}
