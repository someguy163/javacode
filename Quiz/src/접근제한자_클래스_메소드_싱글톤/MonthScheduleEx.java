package 접근제한자_클래스_메소드_싱글톤;

import java.util.Scanner;

public class MonthScheduleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthScheduels april = new MonthScheduels(30);
		april.run();
	}

}
class Day1{
	private String work;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void show() {

		if (work==null) {
			System.out.println("없습니다");
		}
		else {
			System.out.println(work+" 입니다");
		}
	}

}
class MonthScheduels{
	Scanner sc =new Scanner(System.in);
	Day1 day1[];
	boolean Run =true;
	public MonthScheduels(int x) {
		this.day1 = new Day1[x];
		for(int i=0; i<day1.length; i++) {
			day1[i] = new Day1();
		}
		

	}
	void input() {
		System.out.println("날짜 ( 1 ~ 30 ) :");
		int date = sc.nextInt();
		System.out.println("할일 ( 빈칸없이 입력 )");
		String works = sc.next();
		day1[date].setWork(works);
		System.out.println();
	}
	void view() {
		System.out.println("날짜 ( 1 ~ 30 ) :");
		int work = sc.nextInt();
		day1[work].show();
	}
	boolean finish() {
		System.out.println("프로그램을 종료합니다");
		return Run = false;
	}
	void run() {
		boolean Run =true;
		System.out.println("이번달 스케줄 관리 프로그램");
		while (Run) {
			System.out.println("할일 (1 : 입력 , 2 : 보기 , 3 : 끝내기) >> ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1: 
				input();
				break;
			case 2: 
				view();
				break;
			case 3: 
				finish();
				break;
			}
		}
	}
}
