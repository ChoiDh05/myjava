package exceptionTask;

import java.util.Scanner;

import exceptionTest.BadWordException;
import exceptionTest.Chatting;

public class ExceptionTask {
//	캐릭터 이름을 입력받고
//	멍청이, 바보, 똥개 가 포함된 이름은 
//	예외를 발생시켜 사용자에게 경고 메세지를 출력해준다.
//	강제종료하지 않는다
	void crName(String name) {
//		제외 단어를 배열에 넣고 반복문으로 돌리기!
		if(name.contains("바보")||name.contains("똥개")||name.contains("멍청이")) {
			try {
				throw new BadWordException();
			} catch (BadWordException e) {
				System.out.println("사용할 수 없는 이름입니다.");
			}
		} else {
			System.out.println(name+"은(는)사용가능한 이름입니다.");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		객체화
		ExceptionTask exceptionTask = new ExceptionTask();
		String message = "캐릭터 이름을 입력하세요";
		String name = null;
		
		System.out.println(message);
		name = sc.nextLine();
		
		exceptionTask.crName(name);
	}

	   }
	   