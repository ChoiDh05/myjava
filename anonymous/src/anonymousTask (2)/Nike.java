package anonymousTask;

public class Nike {
//	Form타입의 form 객체를 실행하며 고객이 입력한 메뉴(문자열)을 담을 register 선언
	public void register(Form form, String order) {
//		form타입의 getmenu에서 받아온 값을 문자배열 menu에 저장
		String[] menu = form.getMenu();
//		입력받은 menu의 길이만큼 반복해서 검사하고 i번째에 위치한 menu값을 호출
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
//		만약 form객체가 FormAdapter타입이라면 "무료 나눔 행사 출력"
		if (form instanceof FormAdapter) {
			System.out.print("무료 나눔 행사");
//			아니라면 form의 sell에 order를 값을 넣고 실행
		} else {
			form.sell(order);
		}
	} 
}
