package sec01.exam;

import java.util.Scanner;


public class Switch_텍스트입력예시 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급을 입력하세요 : ");
		String position = sc.nextLine();
		
		switch (position) {
		case "부장": {
			System.out.println(position +" 이면 700만원");
			break;
		}
		case "과장": {
			System.out.println(position +" 이면 500만원");
			break;
		}
		default:
			System.out.println(position +" 이면 300만원");
		}
	}

}
