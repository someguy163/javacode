package Quiz;

import java.util.Scanner;

public class Quiz04_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("윗변 : ");
		double lengthTop = sc.nextDouble();
		System.out.print("아랫변 : ");
		double lengthBottom =sc.nextDouble();
		System.out.print("높이 : ");
		double height = sc.nextDouble();
		double result = (lengthTop + lengthBottom) * height / 2.0;
		
		System.out.println("--------------");
		System.out.println("사다리꼴의 넓이 : " + result);
	}

}
