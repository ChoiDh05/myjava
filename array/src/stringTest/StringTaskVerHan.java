package stringTest;

import java.util.Scanner;

public class StringTaskVerHan {
   public static void main(String[] args) {
//      사용자에게 입력받은 문자열 중 소문자는 모두 대문자로,
//      대문자는 모두 소문자로 변경한다.
      
//      String message = "영어로 문장을 입력해주세요";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      String result = "";
//      
//      System.out.println(message);
//      data = sc.nextLine();
//      
//      for (int i = 0; i < data.length(); i++) {
//         char ch = data.charAt(i);
//         if(ch >= 97 && ch <= 122) { // 소문자 검사
//            result += (char)(ch - 32);
//            
//         }
//         else if(ch >= 65 && ch <= 90) { // 대문자 검사
//            result += (char)(ch + 32);
//            
//         }else {
//            result += ch;
//         }
//      }
//      
//      System.out.println(result);
      
//      정수를 한글로 변경한다.
//      입력 예) 1024
//      출력 예) 일공이사
//      String message = "정수 입력: "; //안내메세지
//      Scanner sc = new Scanner(System.in); // 입력클래스호출
//      String data = null; //정수를 문자열로 받는다
////      int number = 0;
//      String hangle = "공일이삼사오육칠팔구"; //변환해서 출력할 한글 저장공간
//      String result = ""; //출력할 답
//            
//      System.out.println(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         result += hangle.charAt(data.charAt(i) - 48);
//      } //입력받은 정수의 아스키코드 값에서 -48을 하면 변환해서
	   //출력할 한글의 위치의 index값을 알려주고 result에 차례대로저장
//      
//      System.out.println(result); // 해당 index에 위치한 한글 출력
      
//      number = sc.nextInt();//정수를 문자열이 아닌 int값으로 받는다
//      
//      while(number != 0) { //입력받은 정수가 0이 아닐때 
//	   아래 실행할 문장에서 뒤에 result를 붙이는 이유는
//	   안붙이면 result값이 입력한정수 거꾸로 출력함으로
//         result = hangle.charAt(number % 10) + result;
//	   	1024를 10으로 나누면 몫은 102, 나머지는 4
//	   	102를 10으로 나누면 몫은 10 나머지는 2
//	   	10을 10으로 나누면 몫은 1 나머지는 0
//	   	1을 10으로 나누면 몫은 0 나머지는 1
//         number /= 10; //10으로 나눈 몫을 계속 number에 저장
//      }
//      
//      System.out.println(result);
      
      
      
//      한글을 정수로 변경한다.
//      입력 예) 일공이사
//      출력 예) 1024
//      String hangle = "공일이삼사오육칠팔구";
//      String message = "정수를 한글로 입력: ";
//      Scanner sc = new Scanner(System.in);
//      String data = null;
//      String temp = "";
//      int result = 0;
//      
//      System.out.println(message);
//      data = sc.next();
//      
//      for (int i = 0; i < data.length(); i++) {
//         temp += hangle.indexOf(data.charAt(i));
//      }
//      
//      result = Integer.parseInt(temp);
//      System.out.println(result);
      
//      아래의 주소에서 "/news"만 분리하여 출력한다.
//      www.naver.com/news
      
//      String data = "www.naver.com/news";
//      int fromIndex = data.indexOf("/");
//      String result = data.substring(fromIndex);
//      
//      System.out.println(result);
   }
}















