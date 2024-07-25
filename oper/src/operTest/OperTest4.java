package operTest;

import java.util.Scanner;

public class OperTest4 {
	public static void main(String[] args) {
//      심리 테스트
//      
//      Q. 당신이 좋아하는 색을 선택하세요.
//      1. 빨간색
//      2. 노란색
//      3. 검은색
//      4. 흰색
//      
//      빨간색 : 불같고 열정적이고 적극적이다.
//      노란색 : 발랄하고 밝고 귀엽고 개성있고 착하다.
//      검은색 : 묵묵하고 든든하고 냉철하고 멋지다.
//      흰색 : 천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.
		
		
//		입력 상태를 만들기 위해 Scanner 클래스 호출
		Scanner sc = new Scanner(System.in);
//		사용자를 위한 메세지 변수에 저장
		String message = "Q. 당신이 좋아하는 색을 선택하세요.";
		String colorMessage = "1. 빨간색\n2. 노란색\n3. 검은색\n4. 흰색";
//		사용자를 위해 메세지 출력
		System.out.println(message);
		System.out.println(colorMessage); 
		
//		사용자가 입력할 정수를 저장할 변수 선언 및 초기화
		int color = 0;
//		결과를 도출할 조건식이 문자열이므로 담을 변수를 문자열로 선언 및 초기화
		String result = null;
//		color1 = sc.nextInt();
//		color2 = sc.nextInt();
//		color3 = sc.nextInt();
//		color4 = sc.nextInt();
//		color1 || color2 || color3 || color4 = sc.nextInt();
		
//		사용자가 입력한 선택지(정수)를 변수에 저장
		color = sc.nextInt();
		
//		사용자가 입력한 값을 result에 저장
		result = color == 1 ? "불같고 열정적이고 적극적이다." :
			color == 2 ? "발랄하고 밝고 귀엽고 개성있고 착하다." :
				color == 3 ? "묵묵하고 든든하고 냉철하고 멋지다." :
					color == 4 ? "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다." :
						"선택지에서 골라주세요.";
		
//		조건식에 충족된 결과를 출력 
		System.out.println(result);



	}

}
