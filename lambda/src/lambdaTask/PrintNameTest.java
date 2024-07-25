package lambdaTask;

import java.util.Scanner;

public class PrintNameTest {
//	printFullName 메소드에 매개변수PrintName타입의 printName, 문자열 lastName과 fisrtName 입력
	public void printFullName(PrintName printName, String lastName, String firstName) {
//		문자열 fullName은 printName객체의 getFullName메소드에 lastName과 firstName을 전달한 리턴값 
		String fullName = printName.getFullName(lastName, firstName);
//		fullName 출력
		System.out.println(fullName);
	}

	public static void main(String[] args) {
		
		String message = "이름을 입력하세요\n 홍 길동";
		Scanner sc = new Scanner(System.in);
		String firstName1 = null;
		String lastName2 = null;
		
		
		System.out.println(message);
		lastName2 = sc.next();
		firstName1 = sc.next();
//		PrintNameTest 타입의 printNameTest 객체 생성 후 Heap메모리에 저장
		PrintNameTest printNameTest = new PrintNameTest();
//		printNameTest객체의 printFullName메소드 입력받은 값을 람다식으로 실행
//		매개변수 lastName, firstName을 + 붙이는 문장을 실행
		printNameTest.printFullName((lastName,firstName) -> lastName + firstName,lastName2,firstName1);
}
}
//		
//		
//		String[] fullname = {firstName,lastName};
//		
//		PrintName printName = (fullName) -> System.out.println();
//		
//	}
//	package lambdaTask;
//
//	public class PrintNameTest. {
//	   public void printFullName(PrintName printName, String lastName, String firstName) {
//	      String fullName = printName.getFullName(lastName, firstName);
//	      System.out.println(fullName);
//	   }
//	   
//	   public static void main(String[] args) {
//	      PrintNameTest printNameTest = new PrintNameTest();
//	      printNameTest.printFullName((l, f) -> l + f, "한", "동석");
//	   }
//	}
