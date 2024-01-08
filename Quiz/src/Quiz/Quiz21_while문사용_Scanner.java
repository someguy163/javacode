package Quiz;

import java.util.Scanner;

public class Quiz21_while문사용_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int balnce = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 , 2.출금 , 3.잔고 , 4.종료");
			System.out.println("-------------선택------------");
			System.out.println("----------------------------");
			int order = sc.nextInt();
			if (order==1) {
				System.out.println("금액을 입력하세요.");
				int price = sc.nextInt();		
				balnce = balnce + price;
				System.out.println("예금 후 잔액 : " + balnce);
			}
			else if (order==2) {
				System.out.println("금액을 입력하세요.");
				int price = sc.nextInt();
				balnce = balnce - price;
				System.out.println("출금 후 잔액 : " + balnce);
			}
			else if (order==3) {
				System.out.println("잔액 : " + balnce);
			}
			else if(order==4) {
				run=false;
				System.out.println("종료되었습니다");
			}
			else {
				System.out.println("선택지를 보다 다시 입력하세요");
			}
		}
		
	}

}
