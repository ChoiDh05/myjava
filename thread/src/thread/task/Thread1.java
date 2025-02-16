package thread.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class Thread1 implements Runnable{
//	동석이네 동물원에는 3마리의 동물이 있다.
//	각 동물은 울음 소리가 다르고 2마리의 동물은 동시에 운다.
//	나머지 1마리 동물은 2마리 동물이 모두 울고 나면 마지막에 운다.
//
//	패키지명: threadTask
//
//	※ 클래스는 2개만 선언한다.
//	※ 반드시 join()을 사용한다.
//	※ 각 동물은 10번씩만 운다.
//	※ 람다식을 사용한다.
	public Thread1() {;}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			animal();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {;}
		}	
	}
	public void animal() {
//		if (Thread.currentThread().getName().equals("소")) {
//			System.out.println(Thread.currentThread().getName()+"가 웁니다: 음머");
//		} else if(Thread.currentThread().getName().equals("개")){
//			System.out.println(Thread.currentThread().getName()+"가 웁니다: 멍멍");
//		} else {System.out.println(Thread.currentThread().getName()+"가 웁니다: 야옹");
//	}
		String name = Thread.currentThread().getName();
		String sound = null;
		switch (name) {
		case "소":
			sound = "음머";
			break;
		case "개":
			sound = "멍멍";
			break;
		case "고양이":
			sound = "야옹";
			break;
		}
		System.out.println(name + "(이)가 웁니다: " + sound);
	}
}
