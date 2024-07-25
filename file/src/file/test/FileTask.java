package file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTask {
//	생선 종류를 출력한 뒤
//	입력받은 내용을 모두 출력한다.
//	현재 경로에 fish.txt이름의 파일을 생성한다.
//	생선은 3개 출력한다.
	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fish.txt", true));
//		
////		Scanner sc = new Scanner(System.in);
//		bufferedWriter.write("고등어");
//		bufferedWriter.newLine();
//		bufferedWriter.write("참치");
//		bufferedWriter.newLine();
//		bufferedWriter.write("연어");
//		bufferedWriter.newLine();
////		bufferedWriter.write(sc.nextLine());
//		
//		bufferedWriter.close();

		BufferedReader bufferedReader = null;
		String line = null;
		try {
			bufferedReader = new BufferedReader(new FileReader("fish.txt"));

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일은 존재하지 않습니다.");
		}
		bufferedReader.close();

	}
}
