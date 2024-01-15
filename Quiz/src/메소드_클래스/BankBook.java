package 메소드_클래스;

public class BankBook {
	

		int sum =0;
		//	입금
		int deposit(int x) {
			sum = sum + x;
			return sum;
		}
		//	출금
		int withdraw(int x) {
			if (sum>=x) {
				sum = sum-x;
			}
			else if (sum<x) {
				System.out.println("잔액이 부족합니다");
			}
			return sum;
		}
		//	잔액출력
		int show() {
			return sum;
		}
	}

