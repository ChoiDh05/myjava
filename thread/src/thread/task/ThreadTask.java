package thread.task;

public class ThreadTask {
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
	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		
		Thread cow = new Thread(thread1,"소");
		Thread dog = new Thread(thread1,"개");
		Thread cat = new Thread(thread1,"고양이");
		
		dog.start();
		cat.start();
		
		try {
			dog.join();
			cat.join();
		} catch (InterruptedException e) {;}
		
		cow.start();
	}
}
