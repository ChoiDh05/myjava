package operTest;

import java.util.Scanner;

public class OperTest2 {
   public static void main(String[] args) {
//      실습: 두 정수 입력받기
//	   입력 클래스 호출
      Scanner sc = new Scanner(System.in);
//      두 정수가 할당될 변수를 선언하고 초기값 입력
      int number1 = 0, number2 = 0;
//      int result = 0;
      
//      result 값이 더이상 정수가 아닌 문자열이기 때문에 String 클래스를 이용하여
//      문자열로 선언
      String result = null;
      
//      사용자가 볼 메세지
      String message = "두 정수를 입력하세요.\n예)1 4";
      
//      사용자가 볼 메세지 출력
      System.out.println(message); 
      
//      각 정수가 입력될 입력 메서드 할당. 정수이기 때문에 sc.nextInt(); 사용
      number1 = sc.nextInt();
      number2 = sc.nextInt();
      
//      두 정수 비교
      
//      참과 거짓 자리에 들어갈 값은 자료형이 서로 달라도 된다. 아래는 삼항연산자
//      System.out.println(number1 > number2 ? "큰 값:" + number1 : number2);
      
//      result = number1 > number2 ? number1 : number2;
//      System.out.println(result);
      
      
//      result의 값은 number1 > number2가 참일 때, "큰 값" + number1이 출력되고 거짓일 때, number1과 2가 같은지 확인하고 참일 경우
//      "두 수가 같습니다" 출력하고 거짓일 때, "큰 값: " + number2 를 출력한다. 
      result = number1 > number2 ? "큰 값: " + number1 : 
         number1 == number2 ? "두 수가 같습니다." : "큰 값: " + number2;
      
//      입력된 정수에 따른 result값을 출력
      System.out.println(result);
   }
}















