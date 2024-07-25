package castingTest;

public class CastingTest3 {
	public static void main(String[] args) {
//		문자열 형변환 공백문자열로 취급하며, 공백과 3이 연결되서 출력
		System.out.println(""+3);
// JAVA는 좌에서 우로 가기 때문에 ("1" + 3 + 8)에서 ("1" + 3)이 먼저 '연결'되서
// 문자열로 13이 출력된다. 문자열 13에 +8이 '연산'이 아닌 연결로 가서 138이 나옴
		System.out.println("1"+3+8);
//		연산자의 우선순위로 인해 괄호안에 3+8이 먼저 계산되어 연결이 아닌 연산으로
//		11값이 나오고, 문자열1과 11값이 연결되어 111이 출력
		System.out.println("1"+(3+8));
//		"1+3="은 계산식이 아닌 하나의 값인 문자열 이므로 "1+3="과 4가 연결되어
//		1+3= 4 가 출력
		System.out.println("1+3=" + 4);
	}

}