package operTest;

import java.util.Scanner;

public class OperTest3 {
	public static void main(String[] args) {
//		사용자에게 키를 입력받고
//		정수라면 정수로 출력
//		실수라면 실수로 출력
//		예) 183 -> 183
//		   183.5 -> 183.5 츨력
//		   183.0 -> 183 출력

		Scanner sc = new Scanner(System.in);
		double height = 0.0;
		boolean isInteager = false; 
		
		String message = "숫자를 입력하세요";
//		
//		사용자가 입력할 값을 문자형으로 정하고, 사용자가 입력한 숫자를 if문이나 삼항연산자를 이용해서 정수로 형변환했을때, 그값이 true면 정수로 출력, false면 실수로 형변화하고 그값이 true일 때 그대로 출력하게 하면 되지않을까? 
//		String a = null;
//		int numberint = 0; double numberdouble = 0.0;
//		
		System.out.println(message);
		height = sc.nextDouble();
//		
//		a = Integer.parseInt(a) == numberint ? Integer.parseInt(a) :
//			Double.parseDouble(a) ? Double.parseDouble(a) : "실수 또는 정수를 입력해 주세요";
//		
//		System.out.println(a);
		
		
				}

}
