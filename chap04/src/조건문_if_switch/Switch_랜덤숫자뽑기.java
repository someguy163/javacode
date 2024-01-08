package 조건문_if_switch;

import java.util.Scanner;

public class Switch_랜덤숫자뽑기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		
		int random = (int) (Math.random()*6+1);
//		int random = (int) (Math.random()*6+1);
		double random1 = Math.random()*6+1;
		
		
		switch (random) {
		case 1: 
			System.out.println("1번이 나왔습니다");
			break;
		
		case 2: 
			System.out.println("2번이 나왔습니다");
			break;
		
		case 3: 
			System.out.println("3번이 나왔습니다");
			break;
		
		case 4: 
			System.out.println("4번이 나왔습니다");
			break;
		
		case 5: 
			System.out.println("5번이 나왔습니다");
			break;
		
		default:
			System.out.println("6");
			break;
//			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}
