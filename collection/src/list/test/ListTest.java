package list.test;

import java.util.ArrayList;
import java.util.Collections;

public class ListTest {
	
	
	void data(String a) {
		String c = "a";
	}
	
	void data(int num) {
		int number = 1;
		
	}
   
   public static void main(String[] args) {
//      <?>: 제네릭(이름이 없는)
//      객체화 시 타입을 지정하는 기법
//      자료구조를 설계할 때 데이터의 타입을 지정할 수 없기 때문에 임시로 타입을 선언한다.
//      따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언한다.
      ArrayList<Integer> datas = new ArrayList<Integer>();
      
      datas.add(40);
      datas.add(50);
      datas.add(90);
      datas.add(70);
      datas.add(10);
      datas.add(80);
      datas.add(60);
      datas.add(30);
      datas.add(20);
      
      System.out.println(datas);
      System.out.println(datas.size());
      
//      정렬
      Collections.sort(datas);
      System.out.println(datas);
      
//      가운데를 기준으로 좌우 바꾸기
      Collections.reverse(datas);
      System.out.println(datas);
      
//      섞기
      Collections.shuffle(datas);
      System.out.println(datas);

//      추가(삽입), 60은 항상 30뒤에 삽입된다.
//      if(datas.contains(30)) {
//   //      1. 30을 찾는다.
//   //      ArrayList에 검색하는 메소드가 필요하다.
//   //      System.out.println(datas.indexOf(30));
//         
//   //      2. 원하는 위치에 원하는 값을 넣는다.
//         datas.add(datas.indexOf(30) + 1, 60);
//         System.out.println(datas);
//      }else {
//         System.out.println("찾는 값이 없습니다.");
//      }
      
//      수정, 10을 1로 수정한다.
//      먼저 배열에 10이 있는지 검사한다
//      int originalData = 0;
//      if(datas.contains(10)) { //if문으로 검사
      
//      set은 수정 전 값을 반환 함으로 잘 수정되었는지 originalData에 담고 검사
//         originalData = datas.set(datas.indexOf(10), 1);
//         System.out.println(originalData);
//         System.out.println(datas); //출력해보면 10이 1로 수정
//      }
      
//      삭제(값으로 삭제), 20을 삭제한다.
//		먼저 20이 있는지 검사하고 20이 있으면 삭제후 출력

//      if문으로 20이 삭제되었다면 다음과 같이 반환
//      if(datas.remove(Integer.valueOf(20))) {
//         System.out.println("삭제 성공");
//         System.out.println(datas);
//      }
      
//      remove는 인수를 (Object o)와 (int index)로 받는데, 그냥 정수를 
//      넣으면 int이므로 인덱스로 인식. 애초에 값을 지울때 (Object타입 o값)으로 되어있으니
//      값을 삭제하고싶다면 클래스타입으로 바꿔서 넣어줘야한다!
//      
//      삭제(인덱스로 삭제), 50을 삭제한다.
      int originalData = 0;
      if(datas.contains(50)) {
         originalData = datas.remove(datas.indexOf(50));
         System.out.println(originalData);
         System.out.println(datas);
      }
   }
}














