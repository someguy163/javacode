package 접근제한자_클래스_메소드_싱글톤;

import java.util.Iterator;
import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Account bankAccount = new Account();

		String name[] = new String[100];
		//		예금주 배열

		int account[] = new int[100];
		//		계좌 배열

		int money[] = new int[100];
		//		잔액 배열

		boolean run = true;
		//		while문 무한반복

		boolean subMenuRun= true;

		int selectMenu;
		//		메인메뉴

		int selectSubmenu;
		//		서브메뉴

		int makeNewaccount=0;
		//		계좌생성시 + 되는 변수

		int findAccount;
		//		계좌찾는 스캐너

		int findName =0;
		//		계좌번호배열의 인덱스 값으로 예금주 배열 인덱스 추적하기

		while (run) {
			subMenuRun=true;
			System.out.println("MIT뱅그에 오신것을 환영합니다");
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1 계좌 생성");
			System.out.println("2 계좌 업무");
			System.out.println("3 종료");
			System.out.print("선택 > ");
			selectMenu = sc.nextInt();
			switch (selectMenu) {
			case 1:
				System.out.println("계좌를 생성합니다");
				System.out.println("이름을 입력하세요");
				name[makeNewaccount] = sc.next();
				System.out.println("계좌번호를 입력하세요");
				account[makeNewaccount]=sc.nextInt();
				System.out.println("초기 입금액을 입력하세요");
				money[makeNewaccount]=sc.nextInt();
				System.out.println("계좌 생성");
				makeNewaccount++;
				break;
			case 2:
				System.out.println("사용하고자 하는 계좌 번호를 입력하세요");
				findAccount=sc.nextInt();
				while (subMenuRun) {
					subMenuRun=true;
					for(int i=0; i<account.length; i++) {
						if(findAccount==account[i]) {
							System.out.println(name[i] + "님 환영합니다");
							i = bankAccount.findMoney;
//							findName=bankAccount.findMoney;
//							bankAccount.findMoney =findName;
							break;
						}
						else if (findAccount==account[findName]) {
							System.out.println("계좌가 없습니다");
						}
					}
						System.out.println("업무를 선택하세요");
						System.out.println("1 입금");
						System.out.println("2 출금");
						System.out.println("3 잔액조회");
						System.out.println("0 메인메뉴 돌아가기");
						System.out.println("선택 >");
						selectSubmenu=sc.nextInt();
						if (selectMenu == 2 && selectSubmenu ==1) {
							//						2번 -1 번 입급
							System.out.println("입금 금액을 입력하세요");
							int putMoney = sc.nextInt();
							bankAccount.putMoney(money,putMoney);
							break;
						}
						else if (selectMenu == 2 && selectSubmenu ==2) {
							//						출금
							System.out.println("출금 금액을 입력하세요");
							int outMoney = sc.nextInt();
							bankAccount.outMoney(money, outMoney);
							break;
						}
						else if (selectMenu == 2 && selectSubmenu ==3) {
							//						잔액조회
							int result = bankAccount.findMoneyMethod(money, bankAccount.findMoney);
							System.out.println("잔액은 : " + result);
							break;
						}
						else if (selectMenu == 2 && selectSubmenu ==0) {
							System.out.println("메인메뉴로 돌아갑니다");
							System.out.println();
							subMenuRun = false;
							break;
							//						메인메뉴 돌아가기
						}

					}
				
				break;
			case 3:
				System.out.println("프로그램을 종료합니다");
				run=false;
				break;
			}
		}
	}
}
class Account{
	//	String name[] = new String[100];
	//	int account[] = new int[100];
	//	int money[] = new int[100];
	String name;
	int account;
	int money;
	int findMoney;



	public Account(String name, int account, int money) {
		this.name = name;
		this.account = account;
		this.money = money;
	}


	public Account() {
	}


	void putMoney(int[] x , int money) {
		x[findMoney]= x[findMoney]+money;
		System.out.println(money + "원 입금합니다");
		System.out.println("입금완료");
	}
	void outMoney(int[] x,int money) {
		if (x[findMoney]<money ) {
			System.out.println("잔액이 부족합니다");
		}else {
			x[findMoney]= x[findMoney]-money;	
			System.out.println(money + "원 출금합니다");
			System.out.println("출금완료");
		}


	}
	int findMoneyMethod(int[]x , int y) {
		return x[y];
	}
}
