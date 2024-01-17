package 접근제한자_클래스_메소드_싱글톤;

import java.util.Scanner;

public class BankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요 G BANK입니다");
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		while (bank.run) {
			bank.showMenu();
			int menu = sc.nextInt();
			if (menu==1) {
				System.out.println("입금할 금액을 입력해주세요");
				int putMoney = sc.nextInt();
				bank.putMoney(putMoney);
			}
			else if (menu ==2) {
				System.out.println("출금할 금액을 입력해주세요");
				int outMoney = sc.nextInt();
				bank.outMoney(outMoney);
			}
			else if (menu ==3) {
				bank.showMoney();
			}
			else if (menu ==4) {
				bank.exitRun();
			}
			else {
				bank.exception();
			}

		}
	}

}
