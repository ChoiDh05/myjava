package exceptionTest;

//	Exception 상속: 컴파일러가 체크(컴파일 오류), 강제종료 하지마라!
//	RuntimeException 상속: 컴파일러가 체크하지 않음(빌드 오류 또는 런타임 오류), 강제 종료해야한다!
public class BadWordException extends Exception{
//	원하는 메세지를 출력하고 싶으면 생성자에게 메세지를 전달한다.
//	public BadWordException (;)
}
