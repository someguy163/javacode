package Quiz;

import java.util.Scanner;

public class Quiz03_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("연필자루수 : ");
		int pencil = sc.nextInt();
		System.out.print("학생수");
		int person = sc.nextInt();

		int result1 = pencil / person;
		int result2 = pencil % person;
		System.out.println("--------------");
		System.out.println("학생 1명당 연필 갯수 : " + result1 );
		System.out.println("남는 연필 갯수 : " + result2);
	}

}
