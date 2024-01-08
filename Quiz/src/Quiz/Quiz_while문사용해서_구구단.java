package Quiz;

import java.util.Scanner;

public class Quiz_while문사용해서_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("몇단을 원하세요?");
		int x = sc.nextInt();
		int y=1;
		System.out.println(x + "단");
		do {
			System.out.println(x + " x " + y + " = " + x* y);
			y++;
		} while (y<=9);
	}

}
