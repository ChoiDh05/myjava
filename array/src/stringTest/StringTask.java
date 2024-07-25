package stringTest;

import java.util.Iterator;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class StringTask {
	public static void main(String[] args) {
//		검색팁: JAVA에서 문자열 값 뒤에서부터 검색하는 방법
		
//		사용자에게 입력받은 문자열 중 소문자는 대문자로 
//		대문자는 모두 소문자로 변경
		
//		입력받을 메세지 input으로 선언
//		String input = "";
////	출력할 메세지 output으로 선언;
//		String output = "";
//		//input.charAt(i)는 문자열중 index i번째에 위치한 문자를
////		char형으로 바꿔주기 때문에 char타입 변수를 선언하고
////		tmp에 input.charAt(i)를 저장
//		char tmp = ' ';
//		String message = "문자열을 입력하세요";//안내메세지
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(message);
//		input = sc.nextLine(); //입력받은 문장 input에 저장
//		
//		
////		System.out.println(input); //입력 확인
////			입력받은 문자열을 한글자씩 char타입으로 변환해서 그 값이
////			65~90이면 대문자, 97~122면 소문자 
////			toUpperCase와 toLowerCase로 변환해서 출력
//		for (int i = 0; i < input.length(); i++) {
//			tmp = input.charAt(i);
//			if ((65<=tmp)&&(tmp<=90)) {
////				valueOf는 안에들어있는 값을 String값으로 변환해줌
////				tmp는 char타입이므로 valueOf로 String으로 바꾸고
////				이를 다시 toLowerCase로 소문자로 변경
//				output += input.valueOf(tmp).toLowerCase();
//			} 
//			else if ((97<=tmp)&&(tmp<=122)) {
//				tmp = input.charAt(i);
//				output += input.valueOf(tmp).toUpperCase();
//			}else { //위의 둘다가 아닐 때, 그대로 출력
//				output += (char)tmp; 
//			}
////			
//		}
//		System.out.println(output);
		
//		정수를 한글로 변경한다.
//		입력 예) 1024
//		출력 예) 일공이사
		
		Scanner sc = new Scanner(System.in);
		
//		정수를 입력하면 해당 정수값과 같은 인덱스값을 갖는 한글을 출력
//		배열에서 값은 index를 0, 1, 2,... 순서대로 갖는다
//		그럼 문자배열을 공,일,이,...구 순으로 입력해놓으면
//		입력한 정수 그대로를 index값으로 바꿔서 호출하면 되지않을까?
//		String inputNumber = null;//입력받은 정수를 저장할 변수 선언
////		int n =0;
//		String output =" "; //한글로 변환된 정수를 출력할 변수 선언
////		먼저 변경할 한글 저장
//		String data = "공일이삼사오육칠팔구"; //변환해서 출력할 한글을 갖는 문자배열
////		String result = "";
////		System.out.println(data.indexOf("구")); 인덱스값을 확인
//		String message = "정수를 입력하세요";
//		System.out.println(message);//메세지 출력
//		inputNumber = sc.next();//정수 입력
//		
//		for (int i = 0; i < inputNumber.length(); i++) {//입력받은 정수의 길이만큼 반복
//			output += data.charAt(inputNumber.charAt(i)-48);
//		// 	입력받은 정수의 index값을 0부터 순서대로 호출 후
////			char값으로 변환하면 아스키코드가 나오고,
////			나온 아스키 코드에 -48을 하면 해당 정수가 그대로 나온다
////			그값을 data.charAt에 넣으면?
////			data의 해당 index에 위치한 값을char로 변환해서 호출함으로
////			정수가 한글로 변환되서 나온다.
//		}
//		System.out.println(output); //작동확인 출력
		
		
		
//		한글을 정수로 변경한다.
//		입력 예)일공이사
//		출력 예) 1024
		
//		아래의 주소에서 "/news"만 분리하여 출력한다.
//		www.naver.com/news
//		문자열 자르기 검색 필요
	}
}
