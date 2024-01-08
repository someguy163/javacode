package Quiz;

import java.util.Scanner;

public class Quiz22_while_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int score =0;
		
		
		while (score!=-1) {
			System.out.println("점수를 입력해주세요 : ");
			score = sc.nextInt();
			if (score >= 90) {
				System.out.println("수");
			}
			else if (score >= 80) {
				System.out.println("우");
				
			}else if (score >=70) {
				System.out.println("미");
				
			}else if (score >= 60) {
				System.out.println("양");
				
			}else if (score >= 0) {
				System.out.println("가");
			}else {
				
				System.out.println("종료되었습니다");
			} 
				
			
		}
		
		
	}

}
