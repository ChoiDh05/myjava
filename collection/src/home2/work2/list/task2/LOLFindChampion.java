package home2.work2.list.task2;

import java.util.ArrayList;

import list.task.DBConnecter;

public class LOLFindChampion {
//	- 챔피언 이름으로 챔피언 정보 조회
	public LoLChampion findChampionName(String name) {
//		조회한 챔피언 정보를 담을 변수
		LoLChampion lolChampion = null;
//		for문으로 반복해서 DB의 i번째 챔피언과 조회한 챔피언의 이름이 같으면 위의 변수에 저장
		for (int i = 0; i < DBConnecter.lolchampion.size(); i++) {
			if (DBConnecter.lolchampion.get(i).getName().equals(name)) {
				lolChampion = DBConnecter.lolchampion.get(i);
			}
		}
//		결과값으로 변수 반환
		return lolChampion;
	}
	
//	- 챔피언 직업군으로 챔피언 조회(이때, 주 직업군이든 부직업군이든 둘다 가능하게)
	public ArrayList<LoLChampion> findByClass (String className) {
//		DB에서 많은 챔피언 정보를 가져와야 함으로 빠르게 가져오기 위해 얉은 복사
		ArrayList<LoLChampion> lolChampions = (ArrayList<LoLChampion>) DBConnecter.lolchampion.clone();
//		조회한 챔피언의 수를 파악할 수 없으므로 ArrayList타입의 result에 저장
		ArrayList<LoLChampion> result = new ArrayList<LoLChampion>();
		
//		이미 ArrayList타입이고 얉은 복사를 해왔으므로 lolChampions의 size만큼 반복
		for (int i = 0; i < lolChampions.size(); i++) {
//			주 직업군 또는 부 직업군 둘다 조회가 되야함으로 ||(or)로 조건 2개 생성
			if (lolChampions.get(i).getMainClass().equals(className)||lolChampions.get(i).getSubClass().equals(className)) {
//				result에 조건이 참일때의 결과를 add로 추가
				result.add(lolChampions.get(i));
				
			} 
//			결과값으로 result를 반환
		} return result;
	}
	
	
//	- 마나 유무로 챔피언 조회
	public ArrayList<LoLChampion> findByMana(boolean mana) {//마나는 있거나 없음이므로 boolean으로 결정
//		마나 유무의 챔피언을 빠르게 조회하고 원본을 수정하지 않기 위해 얉은 복사
		ArrayList<LoLChampion> lolChampions = (ArrayList<LoLChampion>) DBConnecter.lolchampion.clone();
//		조회한 챔피언들을 담을 result 선언
		ArrayList<LoLChampion> result = new ArrayList<LoLChampion>();
//		for문으로 lolChapmions size만큼 반복
		for (int i = 0; i < lolChampions.size(); i++) {
//			mana값이 true일 때, result에 하나씩 저장
			if (mana == true) {
				result.add(lolChampions.get(i));
			}
//			결과값으로 result 반환
		}return result;
	}
	
	
	
//	- 챔피언이름으로 조회 후 라인 수정
	public void updateLine(LoLChampion lolChampion) {
//		수정은 원본데이터를 수정해야 함으로 수정할 챔피언의 원본데이터의 인덱스 값을 구한다.
		int targetIndex = DBConnecter.lolchampion.indexOf(lolChampion);
//		lolChapion의 setLine값은 getLine으로 덮어씌운다.
		lolChampion.setLine((String)lolChampion.getLine());
	}
//	원본이 수정 됬으니 복사본을 반환
	public ArrayList<LoLChampion> findLine() {
		return (ArrayList<LoLChampion>) DBConnecter.lolchampion.clone();
	}
}
