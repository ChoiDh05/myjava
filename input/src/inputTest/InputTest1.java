package inputTest;

import java.util.Scanner;

public class InputTest1 {
   public static void main(String[] args) {
//      초기값: 아직 어떤 값을 넣을 지 모를 때 넣는 값
//      정수: 0
//      실수: 0.0
//      문자: ' '
//      문자열: null
      
	   
//	   Scanner 클래스는 프로젝트가 아닌 java.util에 있으므로 호출을 따로 해야함(import)
//      Scanner sc = new Scanner(System.in);
	   
//	   name 변수 초기값 선언
//      String name = null;
//      
//      System.out.print("이름: ");
//      name = sc.next();
//      System.out.println(name + "님 환영합니다.");
      
//      Scanner sc = new Scanner(System.in);
//      String lastName = null, firstName = null;
//      
//      System.out.print("이름: ");
//      lastName = sc.next();
//      firstName = sc.next();
//      System.out.println(lastName + firstName + "님 환영합니다.");
      
      Scanner sc = new Scanner(System.in);
      String name = null;
      int age = 0;
      
      System.out.print("이름: ");
      name = sc.nextLine();
      System.out.println(name + "님 환영합니다.");
      
   }
}
