package inputTest;

import java.util.Scanner;

public class InputTest2 {
	public static void main(String[] args) {
//		두 정수를 입력한 뒤 곱셈 결과 출력
//		단, next()만 사용한다.
		
		Scanner sc = new Scanner(System.in);
		int firstnum = 0, lastnum = 0;
		
		firstnum = Integer.parseInt(sc.next());
		lastnum = Integer.parseInt(sc.next());
		System.out.println(firstnum*lastnum);
		
				
	}

}
