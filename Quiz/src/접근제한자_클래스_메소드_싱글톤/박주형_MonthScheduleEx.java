package 접근제한자_클래스_메소드_싱글톤;

import java.util.Scanner;

public class 박주형_MonthScheduleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이번달 스케쥴 관리 프로그램");
		MonthSchedule april = new MonthSchedule(30);
		april.run();
	}
}
class MonthSchedule{
	Scanner sc = new Scanner(System.in);
	Day days[];
	String works[];
	int date;

	static boolean run = true;
	public MonthSchedule(int x) {
		this.days = new Day[x];
		this.works = new String[x];
	}


	//	입력 메소드
	public void input() {
		System.out.println("날짜 ( 1 ~ 30 ) : " );
		int date = sc.nextInt();
		System.out.println("할일 (빈칸없이 입력) : ");
		String work = sc.next();
		works[date]=work;
	}

	//	결과 출력 메소드
	public void view() {
		System.out.println("날짜 ( 1 ~ 30 ) : " );
		int day = sc.nextInt();
		System.out.println("할일은 : " + works[day]);
		System.out.println();
	}

	//	종료 메소드
	boolean finish() {
		System.out.println("프로그램 종료");
		return run = false;
		
	}

	//	메뉴 메소드 
	void run() {
		while (run) {
			System.out.print("할일 (입력 : 1 , 보기 : 2 , 끝내기 : 3 ) >> ");
			int menu = sc.nextInt();
			if (menu == 1) {
				input();
			}
			else if (menu == 2) {
				view();
			}
			else if (menu == 3) {
				finish();
			}
		}
	}

}
class Day{
	private String work;

	public Day() {
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	void show() {
		if (work==null) {
			System.out.println("없습니다");
		}
		else {
			System.out.println(work +"입니다");
		}
	}

}
