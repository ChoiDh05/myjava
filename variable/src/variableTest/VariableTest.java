package variableTest;

public class VariableTest {
	public static void main(String[] args) {
//		정수형, 변수명은 a, 값은 10 단, 기본형으로 선언한다
//		실수형, 변수명은 b, 값은 10.1563, 단, float으로 선언한다
//		실수형, 변수명은 c, 값은 10.1563, 단, double로 선언한다
//		문자형, d, 값은 A
//		문자열, e, 값은 ABC
		int age = 10;
		float floatnumber = 10.1563f;
		double doublenumber = 10.1563;
		char grade = 'A';
		char num = '1';
		String data ="ABC";
		String number = "1";
		
		
		System.out.println(age);
		System.out.println(floatnumber);
		System.out.println(doublenumber);
		System.out.println(grade);
		System.out.println(data);
		System.out.println(age + num);
		System.out.println(age + number);
	}
}
