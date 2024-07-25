package methodTest;

public class MethodTest {
//  javac 명령어로 .java파일 실행
//  javac MainTest.java
//  java methodTest.MainTest 값1 값2 값3, ...
  
//	f(x) = 2x +1
	int f(int x){
		int result = 2*x+1;
		return result;
	}
	
//	static
//	컴파일러가 가장 먼저 메모리에 할당해준다
//	일반 메소드를 static메소드에 사용하기위해서는 아래 두가지 방법이 존재
//	1. 일반 메소드에 static을 작성하여 같은 시간대에 메모리에 올려준다.
//	2. 일반 메소드가 소속된 클래스를 Heap메모리에 할당(new)하여 static이/
//	찾을수 있도록 한다. 즉, 메소드의 소속을 알려준다. 
	
	
	public static void main(String[] args) {
//	main메소드의 매개변수는 외부에서 전달된 다양한 정보를 받기위해 존재
//	java 명령어로 실행할 때 문자열을 같이 전달해주면 args 문자열 배열의
//	각 방에 저장된다.
	}
}
