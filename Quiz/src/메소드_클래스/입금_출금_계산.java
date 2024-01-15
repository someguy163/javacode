package 메소드_클래스;

import java.util.Scanner;

public class 입금_출금_계산 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		BankBook bankBook = new BankBook();

		
		for(int i =0; i<2; i++) {
			System.out.println("현재 잔액은 : " + bankBook.show());
			System.out.print("입금액 : ");
			int putMoney = sc.nextInt();
			bankBook.deposit(putMoney);
			System.out.print(putMoney + "원 입금");
			System.out.println("현재 잔액은 : " + bankBook.show());
			
			System.out.print("출금액 : ");
			int outMoney = sc.nextInt();
			System.out.print(outMoney + "원 출금");
			bankBook.withdraw(outMoney);
			System.out.println("현재 잔액은 : " + bankBook.show());
			System.out.println(bankBook.show());
		}
		
		System.out.println();
		System.out.println("최종잔액은 : " +bankBook.show());
	}

}

