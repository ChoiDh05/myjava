package castingTest;

public class CastingTest4 {
	public static void main(String[] args) {
//		문자열 타입은 클래스이므로 타입을 변경할 때 일반 자료형의 클래스타입의 
//		도움을 받아야한다. "1"이라는 문자열을 int의 클래스타입인 Integer.parseInt
//		로 감싸 정수로 변환하므로 5가 출력돈다
		System.out.println(Integer.parseInt("1")+4);
//		위와 똑같이 double의 클래스타입인 Double.parseDouble로 감싸
//		문자열 "3.5"를 실수 3.5로 변환하므로 6.0이 출력된다.
		System.out.println(Double.parseDouble("3.5")+2.5);
		
	}

}
