package Quiz;

import java.util.Scanner;




public class Quiz23_while_if_switch_별자리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int month;
		int day;
		boolean start =true;

		while(start) {
			System.out.print("월을 입력해주세요: ");
			month = scan.nextInt();

			System.out.print("일을 입력하세요: ");
			day = scan.nextInt();

			if (month==0 || day==0) {
				start =false;
				System.out.println("종료되었습니다");
			}
			else {
				System.out.println("다시입력하세요");
			}

			switch(month) {
			case 1:
				if (day >=20) {
					System.out.println("물병자리");
				} else {
					System.out.println("염소자리");
				}
				break;
			case 2:
				if (day >=19) {
					System.out.println("물고기자리");
				} else {
					System.out.println("물병자리");
				}
				break;
			case 3:
				if (day >=21) {
					System.out.println("양자리");
				} else {
					System.out.println("물고기자리");
				}
				break;
			case 4:
				if (day >=20) {
					System.out.println("황소자리");
				} else {
					System.out.println("양자리");
				}
				break;
			case 5:
				if (day >=21) {
					System.out.println("쌍둥이자리");
				} else {
					System.out.println("황소자리");
				}
				break;
			case 6:
				if (day >=22) {
					System.out.println("게자리");
				} else {
					System.out.println("쌍둥이자리");
				}
				break;
			case 7:
				if (day >=23) {
					System.out.println("사자자리");
				} else {
					System.out.println("게자리");
				}
				break;
			case 8:
				if (day >=23) {
					System.out.println("처녀자리");
				} else {
					System.out.println("사자자리");
				}
				break;
			case 9:
				if (day >=24) {
					System.out.println("천칭자리");
				} else {
					System.out.println("처녀자리");
				}
				break;
			case 10:
				if (day >=23) {
					System.out.println("전갈자리");
				} else {
					System.out.println("천칭자리");
				}
				break;
			case 11:
				if (day >=23) {
					System.out.println("사수자리");
				} else {
					System.out.println("전갈자리");
				}
				break;
			case 12:
				if (day >=25) {
					System.out.println("염소자리");
				} else {
					System.out.println("사수자리");
				}
				break;
			}

		}
	}
}
