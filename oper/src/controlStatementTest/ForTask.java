package controlStatementTest;

import java.util.Iterator;
import java.util.Scanner;

public class ForTask {
	public static void main(String[] args) {
//      브론즈
//      1 ~ 100까지 출력
//      100 ~ 1까지 출력
//		for(int i=0; i<100; i++) {
//		System.out.println(i+1);
//		System.out.println(100-i);
		
//      1 ~ 100까지 중 짝수만 출력
//		for(int i=0; i<50; i++) {
//			System.out.println((i+1)*2);
//		}
		
//      실버
//      1 ~ 10까지 합 출력
//		int sum =0;
//		for (int i = 0; i < 10; i++) {
//			sum += i + 1;
//		}
//		System.out.println("합:" + sum);
		
//      1 ~ n까지 합 출력(n은 사용자에게 입력받는다)
		
//      Scanner sc = new Scanner(System.in);
//      String message = "1 ~ n까지의 합\nn: ";
//      int end = 0, result = 0;
//      
//      System.out.print(message);
//      end = sc.nextInt();
//      
//      for (int i = 0; i < end; i++) {
//         result += i + 1;
//      }
//      
//      System.out.println(result);
		
      
//      골드
//      A ~ F까지 출력
//      A ~ F까지 중 C 제외하고 출력(continue 사용하지 않기)

//		for (int i =65 ; i < 71; i++) {
//		System.out.printf("%c",i);
		
//      A: 65
//      for (int i = 0; i < 6; i++) {
//         System.out.println((char)(65 + i));
//      }
//      for (char i = 'A'; i < 'G'; i++) {
//         System.out.println(i);
//      } 

		
//	}
//		for (int i =65 ; i < 71; i++) {
//			if(i!=67) {
//				System.out.println((char)i);
//			}
//		}
//      for (int i = 0; i < 5; i++) {
//      System.out.println((char)(i > 1 ? i + 66 : i + 65));
//   }

		
//      다이아
//      0 1 2 3 0 1 2 3 0 1 2 3 출력
//       	for(int i=0; i<12; i++) {
//       		System.out.println(i%4);
//       	}
//      aBcDeFgH...Z 출력
//      알파벳은 총 26개
		for (int i = 0; i < 26; i++) {
			System.out.println((char)(i%2 !=0 ? i+65 : i+97)); 
			
		}

//			
			
		
//		}
}
}
