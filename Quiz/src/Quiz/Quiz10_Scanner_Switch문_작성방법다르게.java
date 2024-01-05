package Quiz;

import java.util.Scanner;

public class Quiz10_Scanner_Switch문_작성방법다르게 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:{
			System.out.println("31일 까지입니다");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:{
			System.out.println("30일 까지입니다");
			break;
		}
		default:
			System.out.println("28일 까지입니다");
		}
		
		
		switch (month) {

		case 1,3,5,7,8,10,12: 
			{
			System.out.println("31일 까지입니다");
			break;
		}
		case 4,6,9,11:
			{
			System.out.println("30일 까지입니다");
			break;
		}
		default:
			System.out.println("28일 까지입니다");
		}
	}

}
