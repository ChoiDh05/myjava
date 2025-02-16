package set.test;

import java.util.HashSet;

public class SetTask {
public static void main(String[] args) {
//	태극기 색깔
//	흰색, 검은색, 빨간색, 파란색 사용하기
//	HashSet 자료구조의 메소드 사용하기
//	HashSet에서 중복검사를 진행할 때에는 hashCode로 비교하기 때문에,
//	객체끼리의 비교가 아닌, 원하는 필드의 비교를 원한다면 hashCode의 재정의가 필요하다.
	HashSet<Color> koreaTypeSet = new HashSet<Color>();
	
//	koreaTypeSet.add("Red");
//	koreaTypeSet.add("Blue");
//	koreaTypeSet.add("Black");
//	koreaTypeSet.add("Black");
//	koreaTypeSet.add("White");
//	koreaTypeSet.add("White");
	
	Color[] colors;
	
	System.out.println(koreaTypeSet.toString());
	System.out.println(koreaTypeSet);
	System.out.println(koreaTypeSet.contains("Black"));
	System.out.println(koreaTypeSet.contains("Yellow"));
	System.out.println(koreaTypeSet.size());
	
	koreaTypeSet.remove("Blue");
	System.out.println(koreaTypeSet.toString());
	System.out.println(koreaTypeSet.size());
	
}
}
