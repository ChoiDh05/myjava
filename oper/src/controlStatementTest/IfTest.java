package controlStatementTest;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//	   스캐너 호출
      Scanner sc = new Scanner(System.in);
//      사용자가 입력할 값 변수 저장 및 초기값 설정(초기화)
      int number1 = 0, number2 = 0;
//      시용자에게 안내할 메세지 변수에 저장
      String message = "두 정수를 입력하세요.\n예)1 4";
//      조건식을 저장할 변수 선언 및 초기값 설정(초기화)
      boolean condition1 = false, condition2 = false;
//      결과값을 저장할 변수 선언 및 초기값 설정(초기화)
      String result = null;
      
//      사용자에게 안내할 메세지 출력
      System.out.println(message); 
      
//      사용자가 입력할 값을 저장한 변수 입력메소드
      number1 = sc.nextInt();
      number2 = sc.nextInt();
      
//      변수에 조건식 저장
      condition1 = number1 > number2;
      condition2 = number2 > number1;
      
//      if문으로 결과 도출
      if(condition1) {
         result = "큰 값: " + number1;
      }
      else if(condition2) {
         result = "큰 값: " + number2;
      }
      else {
         result = "두 수가 같습니다.";
      }
      
      System.out.println(result);
   }
}


















