package abstractTest;
//	클래스에 final붙이면 상속이 안됨
public abstract class Electronics {
//	무조건 재정의해라
	public abstract void on();
	public abstract void off();
	
//	선택해서 재정의해라
	public void printProduct() {
		System.out.println("전자제품");
	}
	
//	재정의 하지마라
	public final void sos() {
		System.out.println("긴급전화 119 연락");
	}
}
