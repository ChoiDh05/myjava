package controlStatementTest;

import java.util.Scanner;

public class IfTask {
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
      
      Scanner sc = new Scanner(System.in);
      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색";
      int choice = 0;
      String redMessage = "불같고 열정적이고 적극적이다.";
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "잘못 입력하셨습니다.";
      boolean answer1 = false, answer2 = false, answer3 = false, answer4 = false;
      String result = null;
      
      System.out.println(title);
      System.out.println(menu);
      
      choice = sc.nextInt();
//      if문을 사용해서 프로그램 완성
      
      answer1 = choice == 1;
      answer2 = choice == 2;
      answer3 = choice == 3;
      answer4 = choice == 4;
      
      
      if(answer1) {
    	  result = redMessage;
      }
      else if(answer2) {
    	  result = yellowMessage;
      }
      else if(answer3) {
    	  result = blackMessage;
      }
      else if(answer4) {
    	  result = whiteMessage;
      }
      else {
    	  result = "선택지에서 골라 주세요.";
      }
      System.out.println(result);
      
	}

}
