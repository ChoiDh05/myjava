package lambdaTask2;

import java.util.Scanner;

public class MyMath {
//	더하기 구현 메소드
//	빼기 구현 메소드	
//	입력받은 식을 split으로 배열로 바꾼 후 함수형 인터페이스에 전달
	
//	함수클래스Calc타입의 operate객체 생성의 매개변수 문자열타입의 oper
	   public static Calc operate(String oper) {
//		  oper가 +연산자랑 같을 때, n1에 n2를 더하고 아닐 때 n1에서 n2를 뺀다
		      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
		   }// 삼항연산자
		   
//	   메인메소드 선언
		   public static void main(String[] args) {
//			   입력클래스
		      Scanner sc = new Scanner(System.in);
		      String message = "정수의 덧셈, 뺄셈에 대한 식을 입력하세요.";
		      String example = "예)9+7-5";
//		      입력받을 식 초기값 선언
		      String expression = null;
//		      
		      String[] opers = null;
		      String[] temp = null;
		      int number1 = 0, number2 = 0;
		      
		      System.out.println(message);
		      System.out.println(example);
		      expression = sc.next();
		      
		      OperCheck operCheck = e -> {
		         String result = "";
		         for (int i = 0; i < e.length(); i++) {
		            char c = e.charAt(i);
		            if(c == '+' || c == '-') {
		               result += c;
		            }
		         }
		         return result.split("");
		      };
		      
		      opers = operCheck.getOpers(expression);
		      temp = expression.split("\\+|\\-");
		      
		      for (int i = 0; i < opers.length; i++) {
//		         아래의 조건식은 number1이 음수라면, 평생 음수이다.
//		         if(number1 < 0) {continue;}
		         
//		         첫 번째 반복에서만 검사해야 한다!
		         if(i == 0 && number1 < 0) {continue;}
		         number2 = Integer.parseInt(temp[i + 1]);
		         number1 = MyMath.operate(opers[i]).calc(number1, number2);
		      }
		      
		      System.out.println(number1);

		   }

//	public static void main(String[] args) {
////		여기에 getOpers를 구현
////		OperCheck opercheck = (formula) -> formula.split("\\+|\\-");
////			
////		String[] str = "7+35-9".split("\\+|\\-");
////		for (int i = 0; i < str.length; i++) {
////			System.out.print(str[i]);
////		}
////		int num1 = 1;
////		int num2 = 2;
////Calc add = (number1, number2) -> num1 + num2;
////Calc minus = (number1, number2) -> num1 - num2;
//// System.out.println(add.calc(num1,num2));
////		
////	}
		
	

}