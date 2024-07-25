package anonymousTest;

// 이걸 만든이유: Form은 인터페이스여서 강제성이 부여되므로 안에 메소드를
// 강제로 다 사용해야하지만 sell만 필요함으로
// 추상클래스로 만들어서 사용한다.

public abstract class FormAdapter implements Form {

//	sell을 사용하기 위해 오버라이딩
   @Override
   public void sell(String order) {
      // TODO Auto-generated method stub

   }

}
