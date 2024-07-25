package classTest;

class A {
//	전역변수
	int data;

//	지역 변수 지역변수는 지역에서만
	A(int data){
		System.out.println("생성자 호출");
		this.data = data;
	}
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
//	객체화
		A a = new A(10);
		A b = new A(20);
		
		System.out.println(a);
		System.out.println(a.data);
		System.out.println(b.data);
	}
}
