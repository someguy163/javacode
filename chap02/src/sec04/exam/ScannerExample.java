package sec04.exam;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
//		Scanner scanner = new Scanner(System.in ,"EUC-KR);
//		Scanner scanner = new Scanner(System.in,"UTF-8");
//		dd
		String inputData;
		
		while (true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 :\"" + inputData +"\"");
			if (inputData.equals("q")) {
				break;
			}
		}
		System.out.println("종료");
		scanner.close();
	}

}
