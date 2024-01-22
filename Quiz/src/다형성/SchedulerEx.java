package 다형성;

import java.util.Iterator;

public class SchedulerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Event event[] = new Event[3];
		MyDate date1 = new MyDate(2021, 6, 17);
		MyDate date2 = new MyDate(2021, 6, 04);
		MyDate date3 = new MyDate(2021, 8, 30);
		event[0] = new OneDay("오늘", date1);
		event[1] = new Duration("java", date2, date3);
		event[2] = new Deadlined("마감날짜", date3);

		for(int i =0; i<event.length; i++) {
			System.out.println("일정 : " + event[i].toString());
		}
	}

}

class OneDay extends Event{
	MyDate myDate;
	public OneDay(String title , MyDate myDate) {
		super(title);
		this.myDate = myDate;
	}
	public String toString() {
		return this.title + " , " +this.myDate;
	}
}
////////////////////////////////////////////////////

class Duration extends Event{
	MyDate myDateBegin;
	MyDate myDateEnd;
	public Duration(String title , MyDate myDateBegin , MyDate myDateEnd) {
		super(title);
		this.myDateBegin = myDateBegin;
		this.myDateEnd = myDateEnd;
	}
	public String toString() {
		return this.title + " , 시작날짜 : " + this.myDateBegin + " 마감날짜 : " + this.myDateEnd;
	}

}
////////////////////////////////////////////////////

class Deadlined extends Event{
	MyDate MydateDeadline;
	public Deadlined(String title, MyDate MydateDeadline) {
		super(title);
		this.MydateDeadline = MydateDeadline;
	}
	public String toString() {
		return this.title + " , ~ " + this.MydateDeadline;
	}

	MyDate myDateDeadline;
}
////////////////////////////////////////////////////

class MyDate{
	public int year;
	public int month;
	public int day;

	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public String toString() {
		return this.year + "/" + this.month + "/" + this.day;
	}

}
////////////////////////////////////////////////////
class Event{
	public String title;

	public Event(String title) {
		this.title = title;
	}

}
