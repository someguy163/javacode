package Quiz;

import java.util.Scanner;

public class Quiz01_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("첫번째 수를 입력하세요");
		String x = scanner.nextLine();
		int xx = Integer.parseInt(x);
		//		int x = scanner.nextInt();

		System.out.println("두번째 수를 입력하세요");
		String y = scanner.nextLine();
		int yy = Integer.parseInt(y);
		//		int y = scanner.nextInt();

		int result = xx+yy;

		System.out.println("두 수를 더한 값은 : " +result);
	}

}
