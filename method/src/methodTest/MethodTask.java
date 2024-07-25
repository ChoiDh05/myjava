package methodTest;

import java.util.Scanner;

public class MethodTask {
// 1~10까지 prinln()으로 출력하는 메소드
// void print(){
//	 for (int i = 0; i < 10; i++) {
//		System.out.println(i+1);
//	}
// }
// "홍길동"을 n번 println()으로 출력하는 메서드
//void printName(int number) {
//	for (int i = 0; i < number; i++) {		
//		System.out.println("홍길동");
//	}
//}
// 

//	이름을 n번 println()으로 출력하는 메서드
//	void nameprint(String name, int count) {
////		Scanner sc = new Scanner(System.in);
////		name = sc.next();
//		for (int i = 0; i < count; i++) {
//			System.out.println(name);
//		}
//	}

// 세 정수의 뺄셈메소드
//	 int minus(int num1, int num2, int num3) {
//		int result = num1 - num2 - num3;
//		return result;
//	}

//	두 정수의 나눗셈 후 몫과 나머지 두개를 구하는 메소드
//	return값은 1개만 가능
//	int[] division(int num1,int num2) {
//		int[] result = null;
////		몫은 num1/num2
////		나머지는 num1%num2
////		num2 != 0
//		if (num2 != 0) {
//		result = new int [] {num1 / num2, num1 % num2};
////		result = new int[2];
////		result[0] = num1 / num2;
////		result[1] = num1 % num2;
//		}
//		return result;
//	}

//	성과 이름 두 개를 받은 뒤
//	성과 이름을 그대로 리턴한다.

//	String[] fullName(String firstName, String lastName) {
//		String[] name = {firstName,lastName};
//		return name;
//		}

//	1부터 n까지의 합을 구해주는 메소드
//	int total (int number) {
//		int sumData = 0; //초기값을 설정해놔야 사용자가 틀린답을 입력할때 초기값이 나온다.
//		for (int i = 0; i < number; i++) {
//			sumData = i+1;
//		}
//		return sumData;
//	}

//	홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
//	int fullNumber (int n) {
//		int result = 0;
//		if (n!=0&&n%2 == 0) {
//			result = n+1;
//		}
//		else if (n!=0&&n%2 == 1) {
//			result = n + 1;
//		}
//		else {
//			result = 0;
//		}
//		return result;
//	}

//	문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
	String word(String wordUpper, String wordLower) {
		String inputword = null;
		int tmp = 0;
		String outputword = null;

		for (int i = 0; i < inputword.length(); i++) {
//			inputword를 아스키코드로 바꾼다
			tmp = (int) inputword.charAt(i);
			if (65 <= tmp && tmp <= 90) {
				outputword += (char) (tmp + 32);
			} else if (97 <= tmp && tmp <= 122) {
				outputword += (char) (tmp - 32);
			} else {
				outputword += (char) tmp;
			}
		}
		return outputword;
	}

//	한글을 정수로 바꿔주는 메소드(일공이사 -> 1024) 
//	int changeNumber(String numberWord) {
////		한글을 정수로 바꿔줘야함으로 문자배열 만든 후 변수에 저장
//		String hangle = "공일이삼사오육칠팔구";
////		저장한 변수의 index주소값을 가져와서 저장할 변수 초기값 선언
////		중간값
//		String temp = "";
////      위의 초기값을 형변환한 정수를 담을 초기값 선언
////      최종값
//		int result = 0;
//
////		사용자가 입력한 한글의 길이만큼 반복
//		for (int i = 0; i < numberWord.length(); i++) {
////    	  입력한 한글을 hangle의 index주소값을 참고하여 추출
////    	  예) 일공이사면 
//			temp += hangle.indexOf(numberWord.charAt(i));
//		}
//
//		result = Integer.parseInt(temp);
//		return result;
//	}

//	정수를 한글로 바꿔주는 메소드 (1024 -> 일공이사)
//	String changeToWord(String number) {
//		String hangle = "공일이삼사오육칠팔구";
//
//		String result = ""; // 출력할 답
//
//		for (int i = 0; i < number.length(); i++) {
//			result += hangle.charAt(number.charAt(i) - 48);
//		}
//
//		return result;
//	}

//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//	리턴타입은 void로하되, 사용하는 부분에서 결과를 쓸 수 있어야한다.
	int[] printMaxAndMin(int[] arNumbers) {
		int[] result = new int[2];
		int max = arNumbers[0];
		int min = arNumbers[0];

//		max와 min 각각 arData[0] 값을 가지므로 arData[i]부터
//		비교하기위해 i=1로 초기식 설정
		for (int i = 1; i < arNumbers.length; i++) {
//			max가 arData[i]보다 작은값일 때, arData[i]가
//			max보다 크므로 max값을 arData[i]로갱신
			if(max<arNumbers[i]) {
				max = arNumbers[i];
			}
//			min가 arData[i]보다 큰값일 때, arData[i]가 min보다
//			작으므로 min값을 arData[i]로갱신
			if(min>arNumbers[i]) {
				min=arNumbers[i];
			}
			result[0] = max;
			result[1] = min;
			return result;
		}

	public static void main(String[] args) {
		MethodTask methodTask = new MethodTask();
//	methodTask.printName(10);
//	methodTask.nameprint("최대환", 10);
//	methodTask.minus(5,4,1);
		methodTask.changeToWord("1204");

		System.out.println(methodTask.changeToWord("1204"));
//  int[] result = methodTask.division(10, 3);
//  String resultMessage = null;
//  
//  if(result == null) {
//     resultMessage = "0 으로 나눌 수 없습니다.";
//  }else {
//     resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
//  }
//  
//  System.out.println(resultMessage);
//	System.out.println(methodTask.fullName("최", "대환"));
//	System.out.println(methodTask.fullNumber(0));

	}
}

//=========================================================

//package methodTest;
//
//import java.util.Iterator;
//
//public class MethodTask {
////   1 ~ 10까지 println()으로 출력하는 메소드
//   void printFrom1To10(){
//      for (int i = 0; i < 10; i++) {
//         System.out.println(i + 1);
//      }
//   }
//   
////   "홍길동"을 n번 println()으로 출력하는 메소드
//   void printHong(int count) {
//      for (int i = 0; i < count; i++) {
//         System.out.println("홍길동");
//      }
//   }
//   
////   이름을 n번 println()으로 출력하는 메소드
//   void printName(String name, int count) {
//      for (int i = 0; i < count; i++) {
//         System.out.println(name);
//      }
//   }
//   
////   세 정수의 뺄셈 메소드
//   int subtract(int number1, int number2, int number3) {
//      return number1 - number2 - number3;
//   }
//   
////   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
////   return 값은 반드시 1개만 가능하다.
//   int[] divide(int number1, int number2) {
//      int[] result = null;
//      
//      if(number2 != 0) {
//         result = new int[] {number1 / number2, number1 % number2};
////         result = new int[2];
////         result[0] = number1 / number2;
////         result[1] = number1 % number2;
//         
//      }
//      return result;
//   }
//   
//   
//   public static void main(String[] args) {
//      MethodTask methodTask = new MethodTask();
////      methodTask.printFrom1To10();
////      methodTask.printHong(10);
////      methodTask.printName("한동석", 5);
////      int result = methodTask.subtract(3, 2, 1);
////      System.out.println(result);
//      int[] result = methodTask.divide(10, 3);
//      String resultMessage = null;
//      
//      if(result == null) {
//         resultMessage = "0 으로 나눌 수 없습니다.";
//      }else {
//         resultMessage = "몫: " + result[0] + "\n나머지: " + result[1];
//      }
//      
//      System.out.println(resultMessage);
//   }
//
//}
