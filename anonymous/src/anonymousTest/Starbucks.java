package anonymousTest;

public class Starbucks {

	//Form타입의 form값을 받아서 처리할 메소드 register선언
   public void register(Form form) {
//	  form의 getmenu에서 받아온 값을 menu라는 배열에 저장
      String[] menu = form.getMenu();
//      menu의 길이만큼 반복
      for (int i = 0; i < menu.length; i++) {
//    	  menu의 index i번째에 위치한 값 출력
         System.out.println(menu[i]);
      }
//      무료 나눔 행사중인 지점에서는 "무료 나눔 행사중"출력
      
//    만약 form객체가 FormAdapter타입이라면
      if (form instanceof FormAdapter) {
//    	 무료나눔행사중 출력
         System.out.println("무료 나눔 행사중");
//     form객체가 FormAdapter타입이 아니라면
      }else {
//         일반 지점에서는 판매 방식 확인하기
    	  
//    	 form객체의 sell메소드에 "아메리카노" 넘겨서 호출
         form.sell("아메리카노");
      }
      
   }
   
   
}
