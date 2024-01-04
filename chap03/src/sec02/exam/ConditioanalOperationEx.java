package sec02.exam;

import java.util.Scanner;



public class ConditioanalOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int i =0;
		
		do {
			System.out.println("점수를 입력하세요");
			int score = scanner.nextInt();
//			int score = 85;
			
			char grade =(score>90) ? 'A' : (score>80) ? 'B' : (score>70) ? 'C' : 'D';
			System.out.println("점수는 : " + score + " 등급은 : " + grade);
			i++;
		}
		while (i<5); {

			
		};


	}

}
