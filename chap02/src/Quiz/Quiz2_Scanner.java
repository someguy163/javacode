package Quiz;

import java.util.Scanner;

public class Quiz2_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("주민번호 : ");
		String number = sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();

		System.out.println("[입력된 내용]");
		System.out.println("1. 이름 : " + name);
		System.out.println("2. 주민번호 앞 6자리 : " + number);
		System.out.println("2. 핸드폰 번호 : " + phone);
	}

}
