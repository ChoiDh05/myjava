package operTest;

public class OperTest1 {
   public static void main(String[] args) {
//      논리형 변수에 조건식을 저장
      boolean isTrue = 10 == 11;
      boolean result = isTrue && 10 <= 20;
      
//      10과 11은 같지 않으므로 false 출력
      System.out.println(10 == 11);
//      10은 3보다 크므로 true
      System.out.println(10 > 3);
//      isTrue변수 안에는 10 == 11 값이 들어있으므로 isTrue는 false
      System.out.println(isTrue);
      
      System.out.println("=====================");
      
//      result변수 값은 &&를 사용하는 and문으로, 두 조건식이 모두 참이여야 
//      true값이 된다. isTrue와 10 <= 20 둘 모두 ture여야 하므로 false출력
      System.out.println(result);
      
//      실습:isTrue && 10 <= 20 의 결과를 true가 나오게 변경하기
      
//      isTrue앞에 단항연산자 !를 붙임으로써 true값으로 나오게함
      System.out.println(!isTrue && 10 <= 20);
//      result 앞에 단항연산자 !를 붙임으로써 ture값으로 나오게함
      System.out.println(!result);
//      and를 or문으로 바꿈으로써 10 <= 20이 true이므로 true 출력
      System.out.println(isTrue || 10 <=20);
//      삼항연산자이므로 0>11은 fasle므로 fasle에 해당하는 11이 출력
//      밑에서 10은 true, 11은 false에 해당한다.
      System.out.println(0 > 11 ? 10 : 11);
      
   }
}

