package 클래스;

public class 생성자_this활용해서_중복제거 {

	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	public 생성자_this활용해서_중복제거(String title, String content) {
//		this.title = title;
//		this.content = content;
		this(title,content,null,null,0);
	}
	
	public 생성자_this활용해서_중복제거(String title, String content, String writer) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
		this(title,content,writer,null,0);
	}
	
	public 생성자_this활용해서_중복제거(String title, String content, String writer, String date) {
//		this.title = title;
//		this.content = content;
//		this.writer = writer;
//		this.date = date;
		this(title,content,writer,date,0);
	}
	
	public 생성자_this활용해서_중복제거(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}





}
