package myJobTest;

import java.util.Scanner;

public class MyJobTest {
	public static void main(String[] args) {
//	사용자에게 안내할 내용 변수에 저장
		String title = "돈많은 백수로 성공하기";
		String message = "1. 5억년 버튼 누르기 \n2. 정보 보기\n3. 종료";
//	입력클래스 호출
		Scanner sc = new Scanner(System.in);
//	사용자의 등급을 배열에 저장
		String[] arRank = { "브론즈", "실버", "골드", "플레티넘", "다이아" };
//	NeedMoreCash클래스 객체화
		NeedMoreCash cdh = new NeedMoreCash("최대환", 1_000_000, 0);

//	사용자가 선택할 선택지 값 초기화
		int choice = 0;
//	성공회수와 실패회수 초기화
		int successCount = 0, failCount = 0;

//	while문으로 게임 실행
		while (true) {
			System.out.println(title);
			System.out.println(message);
//	선택지 입력
			choice = sc.nextInt();
//	만약 사용자의 재산이 0미만일 때, 게임을 종료한다.
			if (cdh.money < 0) {
				System.out.println("재산이 마이너스입니다. 파산합니다! ㅠㅠ");
				System.exit(0);
			}
//			3번 선택지 고르면 게임 종료
			if (choice == 3) {
				break;
			}

//			선택지 시 발생하는 이벤트
			switch (choice) {
			case 1: { //1번 선택지 선택 시
				//cdh에서 cash메소드가 문자열을 리턴함으로 result를 문자열로 형변환
				cdh.money -= 100_000; //1번 선택지시 10만원의 값을 지불하게 하려했지만 작동이 이상함
				// cdh.cash가 문자열을 반환함으로 해당 값을 result변수에 문자열로 저장
				String result = cdh.cash();
				//result에 들어가는 문자열에 따라 다음과 같은 이벤트 발생
				switch (result) {
//				성공 리턴 시 
//				백만원 추가, 성공회수 증가, 실패회수 초기화
				case "성공":
					cdh.money += 1_000_000;
					cdh.successCount++;
					successCount++;
					failCount = 0;
//					안내메세지 출력, 
					System.out.println("5억년 버튼 탈출 성공!\n");
					System.out.println("현재" + successCount + "회 연속성공 중!");
					System.out.println(cdh.money+"원");
//					성공회수가4 이상이고 랭크 인덱스주소가 4미만 일 때, 랭크상승
			
					if (successCount % 4 ==0) {
						if (cdh.rank < 4) {
							cdh.rank++;
							cdh.money += 1_000_000;
//							랭크상승 안내메세지와 더불어 상금 지급
							System.out.println(arRank[cdh.rank] + "(으)로 승급! 축하합니다/n상금으로 100만원을 드립니다!");
							System.out.println(cdh.money+"원");	
						}
//						최고 티어 달성 시 선물!
						if (cdh.rank == 4) {
							cdh.money += 5_000_000;
							System.out.println("최고티어 달성!\n상금으로 500만원을 드립니다!");
							System.out.println(cdh.money+"원");
						}
					}
					break;
//					리턴값 실패 시 
				case "실패":
//					재산 50퍼 감소 및 실패 회수 증가 성공회수 초기화
					cdh.money /= 2;
					cdh.failCount++;
					failCount++;
					successCount = 0;
//					실패 안내메세지 및 현재 재산 출력
					System.out.println("5억년 버튼 탈출 실패! 재산의 절반을 내고 탈출했습니다.\n");
					System.out.println("현재" + failCount + "회 연속실패 중!");
					System.out.println(cdh.money);
//					만약 실패 회수가 3회 이상이면 랭크 다운 및 재산 -10만원
					if (failCount % 3 == 0) {
						if (cdh.rank > 0) {
							cdh.rank--;
							cdh.money -= 100_000;
							System.out.println(arRank[cdh.rank] + "(으)로 강등!\n벌금을 지불합니다.");
							System.out.println(cdh.money+"원");
						}
						if (failCount % 5 == 0) {
							cdh.money -= 3_000_000;
							System.out.println(arRank[cdh.rank] + "5회 이상 실패!\n벌금을 지불합니다.");
							System.out.println(cdh.money+"원");
						}
					}
					break;
//					대실패 작동 시 
				case "대실패":
					cdh.money = 0;
//					cdh.money -= 1; 사용자의 재산이 0원 미만일 때, 제대로 종료하는지 확인용
					successCount = 0;
					failCount = 0;
					System.out.println("버튼이 망가졌습니다!\n전 재산을 지불해서 버튼을 물어내고 파산했습니다.");
					System.out.println(cdh.money+"원");
				}	
				

			}
			break;
			case 2:
				cdh.printInfo();
				break;
			}
		}
	}
}

//		오류 기록: 
//		1번 오류: 확률결과를 3개로 구현했는데, 이를 선택지 1번에 담는 법을 못찾음
//		강사님 처럼 case1에 if를 담는게 아닌, 각 확률 마다 리턴값을 문자열로 주고
//		이제 이걸 switch문 안에 또 switch문을 넣어서 각 케이스마다 구현되게
//		단, 리턴값이 문자열이므로 문자열로 치환해줌
//		1번 오류: 처음에 제대로 작동하지 않고 성공, 실패, 대실패가 계속 작동됨.
//		해결: 원인은 break;문의 위치를 제대로 두지 않았음.
//		2번 오류: 1번 선택지를 누를 때마다, 10만원씩 비용을 차감하려고 했지만, 어째서인지
//		코드가 고장남
//		해결: 차감비용을 잘못 입력해놓음. 
//		3번 오류: 등급이 4회 연속 할때마다 승급이아니라 4회 이후 성공할때마다 등급업이됨
//		조건을 성공회수가 4이상이 아닌 4의 배수로 둬야할거 같음 <- 구현 실패
//		같은 이유로 등급 하락도 3의 배수와 5의배수로 조건을 정해야함
//		해결: 조건식을 따로 클래스에서 실행메소드가 아닌 if문의 조건에 바로 넣는게
//		더 직관적이고 쉬움