package staticTest;

class Data {
	int data;
	static int data_s = 10;
	
//	생산자 초기화
	public Data() {
		// TODO Auto-generated constructor stub
	}
//	생산자 선언
	public Data(int data) {
		this.data = data;
	}
//	실행할 문장
	void increase() {
		System.out.println(++data);
	}
//	모든 필드가 공유할 static 메소드 선언
	static void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data1 = new Data();
		Data data2 = new Data();
		
		
		Data.data_s = 100;
		
//		경고가 뜨는 이유: 너 왜 객체로 접근해?
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		
//		data2 = new Data();
//		
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
//		data2.increase_s();
		data2.increase_s();

		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		
//		
//		
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
//		data1.increase();
	}
}
