package operTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class OperTest3VerHan {
	public static void main(String[] args) {
//  사용자에게 키를 입력받고 
//  정수라면 정수로 출력
//  실수라면 실수로 출력
//  예)   183 -> 183 출력
//        183.5 -> 183.5 출력
//     183.0 -> 183 출력
  
//		스캐너 클래스 호출
  Scanner sc = new Scanner(System.in);
//  실수 또는 정수이니 double로 변수 초기값 저장
  double height = 0.0;
  String message = "키: ", format = null;
  boolean isInteger = false;
  int length = 0;
  BigDecimal originalHeight = null;
  BigDecimal exp = null;
  
  System.out.print(message);
  height = sc.nextDouble();
  
  originalHeight = new BigDecimal(String.valueOf(height));
  exp = new BigDecimal(String.valueOf((int)height));
  
  isInteger =(height - (int)height) == 0;
  length = originalHeight.subtract(exp).toString().length() - 2;
//  length = (height - (int)height + "").length() - 2;
  format = isInteger ? "%.0f" : "%." + length + "f";
  
  System.out.printf(format, height);
  
  
}


}
