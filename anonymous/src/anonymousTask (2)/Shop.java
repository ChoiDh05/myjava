package anonymousTask;

import java.awt.print.PrinterAbortException;
import java.util.Scanner;

public class Shop {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		손님이 신발 고르기 
		String message = "신발을 선택하세요.\n운동화 등산화";
//		신발 고르라는 메세지 출력
		System.out.println(message);
//		없는 신발을 고르면 반환하기 위한 while문 작성
//		while문에서 for문으로 반복해야함으로 신발을 문자배열 shoes에 저장
		String[] shoes = {"운동화", "등산화"};
//		손님이 고른 신발은 문자이므로 order 초기화
		String order;
//		while문 트루일때, 안내메세지 출력하고 입력받은 신발 order에 저장
		while (true) {
            System.out.println(message);
            order = sc.next();
//          boolean타입 stock 초기화
            boolean stock = false;
//          boolean타입으로 i번째에 위치한 shoes에 값과 입력한 order가 같을 때 stock에 true를 저장하고 for문 break
            for (int i =0; i< shoes.length; i++) {
                if (shoes[i].equals(order)) {
                	stock = true;
                    break;
                }
            }
//            만약 stock값이 true라면 while문 종료
            if (stock) {
                break;
            } else {//거짓이라면 아래문장 실행 후 while문 반복
                System.out.println("없는 신발입니다. 메뉴 중에서 고르세요.");
            }
        }
		
//		Nike타입의 jamsil객체 객체화
		Nike jamsil = new Nike();
		
//		잠실 타입의 register 호출하고 익명클래스 사용하여 Form인터페이스 구현
		jamsil.register(new Form() { //여기가 익명클래스
		
		@Override
		public void sell(String order) {
			String[] menu = getMenu();
			for (int i = 0; i < menu.length; i++) {
				if(menu[i].equals(order)) {
					System.out.println("잠실점"+ order + "판매 완료\n");
				}
			}
		}
		@Override
		public String[] getMenu() {
			return new String[] {"운동화", "등산화"};
		}
	},order);
	
	Nike gangnam = new Nike();
//	강남타입의 register 호출하고 FormAdapter 추상클래스 익명클래스사용해서 구현
	gangnam.register(new FormAdapter() {
		
		@Override
		public String[] getMenu() {
			return new String[] {"운동화", "등산화"};
		}
	},order);
	
	
//	Nike songpa = new Nike();
//	songpa.register(new Form() {
//		@Override
//		public String[] getMenu();
//		public void sell(String order) {}
//	}, order);
}
}
