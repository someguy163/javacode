package 클래스;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}
	public Board(String title, String content, String writer, String date) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	public Board(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	
	
	
	
}
