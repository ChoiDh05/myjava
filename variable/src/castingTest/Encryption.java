package castingTest;

public class Encryption {
   public static void main(String[] args) {
//	   비밀번호를 변수에 저장
      String password = "ehdtjrdl1234";
//      암호화할 비밀번호 변수와 복호화할 비밀번호 변수를 선언
      String encryptedPassword = "", decryptedPassword = "";
//      상수를 선언
      final int KEY = 3;
      
//      
      for (int i = 0; i < password.length(); i++) {
         encryptedPassword += (char)(password.charAt(i) * KEY);
      }
      
      System.out.println(encryptedPassword);
      
      for (int i = 0; i < encryptedPassword.length(); i++) {
         decryptedPassword += (char)(encryptedPassword.charAt(i) / KEY);
      }
      
      System.out.println(decryptedPassword);
   }
}
