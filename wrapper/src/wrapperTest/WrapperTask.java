package wrapperTest;


public class WrapperTask {
	public static void main(String[] args) {
//		1, 3.56, 'A', false, "ABC"
//		위의 5개의 값을 하나의 배열에 모두 담는다.
//		각각의 값들을 boxing해서 배열에 담자
//		int intNumber = 1;
//		double doubleNumber = 3.56;
//		String string = "A";
//		boolean f = false;
//		String[] arString = {"A","B","C"};
////		String str = "A B C";
////		result = str.split("");
//		
//		Object[] arData = {intNumber, doubleNumber, string, f, arString};
//		
//		System.out.println(arData[2]);
		
		Object[] arObject = {1, 3.56, 'A', false, "ABC"};
		System.out.println(arObject[4]);
		
	}
}
