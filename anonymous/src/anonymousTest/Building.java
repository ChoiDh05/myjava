package anonymousTest;

public class Building 
   public static void main(String[] args) {
//      무료나눔 행사중이기 때문에 판매방식은 구현할 필요 없다.
	   
//	  Starbucks 타입의 객체 jamsil 선언
      Starbucks jamsil = new Starbucks();
//    잠실 객체의 register메소드에 FormAdapter호출
      jamsil.register(new FormAdapter() {
         
         @Override //getMenu에 아메리카노와 카페라떼 문자열 담음
         public String[] getMenu() {
            return new String[] {"아메리카노", "카페라떼"};
         }
      }
}
//      Starbucks gangnam = new Starbucks();
//      gangnam.register(new Form() {
//         
//         @Override
//         public void sell(String order) {
//            String[] menu = getMenu();
//            for (int i = 0; i < menu.length; i++) {
//               if(menu[i].equals(order)) {
//                  System.out.println(order + "판매 완료");
//               }
//            }
//         }
//         
//         @Override
//         public String[] getMenu() {
//            return new String[] {"아메리카노", "카페라떼"};
//         }
//      });
   
      }











