package myJAVA;

import db.DB;

public class Danawa {
//	부품 추가 메서드
	public void addComponents(PC component) { //리턴값이 없는 메소드임으로 void
		DB.db.add(component);
	}
//	각 부품별로 검색이 가능하다.
	public PC findComponent(PC pc) {
		
	}
//	예) 파워로 검색하면 파워 제품만, 케이스를 검색하면 케이스 제품만
	
	
//	각 부품별로 조건을 추가로 검색가능하다
//	예) 파워 700W제품들 출력
//	예) 그래픽카드에서 엔비디아 제품들 출력
//	
//	브랜드를 검색시 해당 브랜드의 모든 제품들이 조회가 가능하다.
//	예) ASUS 검색하면 ASUS브랜드의 그래픽카드, 메인보드, 파워, 케이스가 검색되어야함

	
	
	
	

}
