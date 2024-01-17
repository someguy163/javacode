package 접근제한자_클래스_메소드_싱글톤;

public class Bank{
	//	int Money = 0;
	int resultMoney=0;
	boolean run = true;

	void showMenu() {
		System.out.println("그린 뱅크에 오신것을 환영합니다");
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1. 예금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액조회");
		System.out.println("4. 종료");
	}
	void putMoney(int money) {
		if (resultMoney + money > 1000000) {
			System.out.println("잔액 100만원을 초과하였습니다");
			System.out.println("***************************"
					+ ""
					+ ""
					+ "");
		}
		else {
			resultMoney = resultMoney + money;  
			System.out.println(resultMoney+"원을 입금하였습니다");
			System.out.println("총 금액은 : " + resultMoney +"원");
			System.out.println("***************************");
		}

	}
	void outMoney(int money) {
		if (resultMoney < money) {
			System.out.println("금액이 부족합니다");
			System.out.println("***************************");
		}else {
			resultMoney = resultMoney - money;
			System.out.println(resultMoney+"원을 출금하였습니다");
			System.out.println("총 금액은 : " + resultMoney + "원");
			System.out.println("***************************");
		}

	}
	void showMoney() {
		System.out.println("잔액은 : " + resultMoney);
		System.out.println("***************************");
	}
	boolean exitRun() {
		System.out.println("프로그램을 종료합니다");
		System.out.println("***************************");
		return run=false;
	}
	void exception() {
		System.out.println("잘못입력하였습니다");
		System.out.println("1 ~ 4 값 중 선택해주세요");
		System.out.println("***************************");
	}

}