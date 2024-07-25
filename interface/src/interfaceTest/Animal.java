package interfaceTest;
//	인터페이스
public interface Animal {
//	상수와 추상메소드만 존재한다.
	int eyes = 2;
	final static int nose =1;
	
	void showHands();
	abstract void sotDown();
	void waitNow();
	void poop();
}
