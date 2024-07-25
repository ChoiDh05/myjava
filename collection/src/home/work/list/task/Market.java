package home.work.list.task;

import java.lang.constant.DirectMethodHandleDesc.Kind;
import java.util.ArrayList;
import java.util.Iterator;

import list.task.DBConnecter;
import list.task.fruit.Fruit;

public class Market {
//	- 상품 이름으로 조회 가능
	public Product checkProductName(String name) {//화면에서 이름을 받아옴
		
		Product product = null; //초기값 생성
		
		for (int i = 0; i <DBConnecter.products.size(); i++) { //DB에 있는 상품 수만큼 반복
			if(DBConnecter.products.get(i).getName().equals(name)) { //만약 DB의 product에 i번째 상품의 이름이 입력받은 이름과 같다면
				product = DBConnecter.products.get(i); // product에 DB의 product i번째 제품의 정보를 담아라
			}
		}
		return product; //product를 반환
	}
	
	
//	- 상품 추가
	public void add(Product product) {
		DBConnecter.products.add(product);
	}
	
//	- 상품 이름 찾으면 해당 상품 재고 출력
	public int findByCount(String name) { //재고를 찾아야함으로 int로 선언
		for (int i = 0; i < DBConnecter.products.size(); i++) { //상품 수만큼 반복
			if (DBConnecter.products.get(i).getName().equals(name)) { //DB의 i번째 상품의 이름과 입력받은 이름이 같다면
				return DBConnecter.products.get(i).getCount(); // i번째 상품의 재고를 리턴한다.
			}
		}
		return -1; //없다면 -1 반환
	}

	
//	- 상품 삭제
	public void remove(Product product) { //삭제를 위한 remove 메소드 선언
		DBConnecter.products.remove(product); //remove함수로 해당 상품 삭제
	}
	
//	- 상품 종류로 해당 종류 상품 조회
	public ArrayList<Product> findByKind(String kind) { //종류로 찾아야하므로 kind를 받는다
//		ArrayList 타입의 products 변수에 ArrayList<Product> 타입의 DBConnDBConnecter.products의 클론을 담는다
		ArrayList<Product> products = (ArrayList<Product>) DBConnecter.products.clone();
//		해당 종류의 상품들을 담을 ArrayList타입의 result 선언
		ArrayList<Product> result = new ArrayList<Product>();
//		for문을 이용해서 해당 ArrayList의 size만큼 반복해서 같은 종류의 상품을 result에 add한다.
		for (int i = 0; i < products.size(); i++) {
			if(products.get(i).getKind().equals(kind)) {
				result.add(products.get(i));
			}
		}
//		result 반환
		return result;
	}
	
	
	
//	- 상품 재고 수정 시 10%할인
	public void update(Product product) {
//		수정이므로 원본의 index값을 찾는다
		int targetIndex = DBConnecter.products.indexOf(product);
//		만약 수정할 품목이 DB에 있다면 -1값이 아니므로 이조건이 true면
		if (targetIndex != -1) {
//			10% 할인 이므로 해당 i번째 제품의 가격에 0.9를 곱해주고 그가격을 set해준다.
			product.setPrice((int)(product.getPrice()*0.9));
//			원본에 set한다.
			DBConnecter.products.set(targetIndex, product);
		} else {
//			만약 -1이라면 상품이 존재하지 않는다 출력
			System.out.println("상품이 존재하지 않습니다.");
		}
	}
//	원본이 수정되었고 수정된 원본을 얉은 복사해서 리턴해서 수정된 값을 조회할 수 있다.
	public ArrayList<Product> findAll() {
	      return (ArrayList<Product>) DBConnecter.products.clone();
	   }
}
