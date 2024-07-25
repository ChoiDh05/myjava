package bankVerHan;

import java.util.Scanner;

public class ATM {
public static void main(String[] args) {
//	차원 배열(3행 100열)(은행은 3개, 고객은 은행마다 100명)
	Bank[][] arrBank = new Bank[3][100];
//	고객수를 담을 배열 생성 고객수는 arrBank.length길이가 인원수
	int[] arCount = new int[arrBank.length];
	String[] arBankName = {"신한은행", "국민은행", "카카오뱅크"};
	
	String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크";
	String menu = "1. 계좌건설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 선택 메뉴로 돌아가기";
//	Ctrl + Shift + o: 자동 import 사용하지 않는 import 삭제
	Scanner sc = new Scanner(System.in);
}
}