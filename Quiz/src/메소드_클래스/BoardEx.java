package 메소드_클래스;

import java.util.Iterator;
import java.util.Scanner;

public class BoardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller a = new Controller();
		a.init();
		//		scan.close();
	}
	public static Scanner sc = new Scanner(System.in);
	public static Board board[] = new Board[50];
}
class Board{
	private String title;
	private String name;
	private String article;
	private String password;




	public Board(String title, String name, String article, String password) {
		super();
		this.title = title;
		this.name = name;
		this.article = article;
		this.password = password;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getArticle() {
		return article;
	}


	public void setArticle(String article) {
		this.article = article;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void prt() {
		System.out.println("제목 : " + this.title);
		System.out.println("작성자 : " + this.name);
		System.out.println("내용 : " + this.article);
	}
}

class View{

	static boolean mainRun = true;
	public static Board creatBoard() {
		System.out.println("게시물을 작성합니다");
		System.out.println("작성자를 입력하세요");
		String creatName = BoardEx.sc.next();
		System.out.println("제목을 입력하세요");
		String creatTitle = BoardEx.sc.next();
		System.out.println("글 내용을 입력하세요");
		String creatArticle = BoardEx.sc.next();
		System.out.println("삭제나 수정시 사용할 비밀번호를 입력하세요");
		String creatPassword = BoardEx.sc.next();
		System.out.println("글 등록성공");

		Board board = new Board(creatTitle, creatName, creatArticle, creatPassword);
		return board;
	}

	public static int menu() {
		System.out.println("환영합니다");
		System.out.println("1. 게시물조회 2. 글 작성 3. 종료");
		System.out.println("번호를 입력해주세요");
		int selectMenuNum = BoardEx.sc.nextInt();
		return selectMenuNum;
	}


	public static void list() {
		System.out.println("*****리스트 목록을 확인하세요*****");
		System.out.println("보고 싶은 게시글의 번호를 선택하세요");
		int selectListNum = BoardEx.sc.nextInt();
		for(int i =0; i<BoardEx.board.length; i++) {
			if (BoardEx.board[selectListNum]==null) {
				System.out.println("게시물이 없습니다");
				break;
			}
			else {
				BoardEx.board[selectListNum].prt();
				System.out.println("1.수정 2.삭제 3.돌아가기");
				int returnListNum = BoardEx.sc.nextInt();
				switch (returnListNum) {
				case 1: {
					System.out.println("수정하기 위한 비밀번호를 입력하세요");
					String chkPassword = BoardEx.sc.next();
					if (BoardEx.board[selectListNum].getPassword().equals(chkPassword)) {
						System.out.println("수정할 제목을 입력하세요");
						String newTitle = BoardEx.sc.next();
						BoardEx.board[selectListNum].setTitle(newTitle);
						System.out.println("수정할 작성자이름을 입력하세요");
						String newName = BoardEx.sc.next();
						BoardEx.board[selectListNum].setName(newName);
						System.out.println("수정할 내용을 입력하세요");
						String newArticle = BoardEx.sc.next();
						BoardEx.board[selectListNum].setArticle(newArticle);
						System.out.println("수정 완료하였습니다");
						break;
					}
					else {
						System.out.println("비밀번호가 맞지 않습니다");
					}

				}
				case 2: {
					System.out.println("삭제하기 위한 비밀번호를 입력하세요");
					String chkPassword = BoardEx.sc.next();
					if (BoardEx.board[selectListNum].getPassword().equals(chkPassword)) {
						BoardEx.board[selectListNum] = null;
						System.out.println("삭제가 완료되었습니다");
					}
					else {
						System.out.println("비밀번호가 맞지 않습니다");
					}
					break;
				}
				case 3: {
					Controller.init();
					break;
				}
				}
			}
		}
	}

}
class Controller{
	static boolean mainMenuRun = true;
	public static void init() {
		while (mainMenuRun) {
			int selectNum = View.menu(); 

			switch (selectNum) {
			case 1: {
				View.list();
				break;
			}
			case 2: {
				//				View의 creatBoard 스태틱 메소드를 통해서 return타입의 Board를 전달받는다
				Board boards =  View.creatBoard();
				//				반복한다 얼마만큼?  BoardEx.board.length 만큼 반복한다
				for(int i=0; i<BoardEx.board.length; i++) {
					//					그리고 생성한다
					//					조건은 BoardEx.board[i]==null인 것들만 찾아서 새로운 i번째 인스턴스를 만든다
					//					그리고 break를 건다 만약 break를 없애면 모든 인스턴스는 초기 입력된 값으로 전부 만들어진다
					if (BoardEx.board[i]==null) {
						BoardEx.board[i] = boards;
						break;
					}
				}
				break;
			}
			case 3: {
				System.out.println("게시판 프로그램을 종료합니다");
				mainMenuRun = false;
				break;
			}
			}
		}
	}

}

