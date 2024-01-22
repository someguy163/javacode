package BoardSys;

public class Board {
	private String title;
	private String writer;
	private String contents;
	private String password;
	
	public Board(String title, String writer, String contents, String password) {
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		this.password = password;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void prt() {
		System.out.println("제목: " + this.title);
		System.out.println("작성자: " + this.writer);
		System.out.println("내용: " + this.contents);
	}
}
