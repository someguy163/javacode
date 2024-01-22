package BoardSys;

public class View {
	public static int menu() {
		System.out.println("1. 게시 보기 2.글 작성 3.종료");
		System.out.println("번호를 입력해주세요");
		System.out.println(">");
		int selectNum = BoardSys.scan.nextInt();
		return selectNum;
	}
	
	public static void list() {
		System.out.println("***리스트 목록을 확인하세요****");
		for(int i=0; i<BoardSys.boards.length; i++) {
			if(BoardSys.boards[i] == null) {
				continue;
			} else {
				System.out.println((i+1) + "번째 게시글: " + BoardSys.boards[i].getTitle());
			}
		}
		System.out.println("보고싶은 게시글의 번호를 선택하세요.");
		System.out.println("(0번 입력시 메인 메뉴로 돌아갑니다.)");
	}
	
	
	public static int viewContent() {
		int selectNum2 = BoardSys.scan.nextInt();
		return selectNum2;
	}
	
	public static Board createBoard() {
		System.out.println("게시물을 작성합니다.");
		
		System.out.println("작성자를 입력하세요>");
		String writer = BoardSys.scan.next();
		System.out.println("제목을 입력하세요>");
		String title = BoardSys.scan.next();
		System.out.println("글 내용을 입력하세요.");
		String contents = BoardSys.scan.next();
		System.out.println("삭제나 수정시 사용할 비밀번호를 입력하세요.");
		String password = BoardSys.scan.next();
		
		System.out.println("글 등록 성공");
		System.out.println();
		
		Board board = new Board(title, writer, contents, password);
		int chk = -1;
		
		for(int i=0; i<BoardSys.boards.length; i++) {
			if(BoardSys.boards[i] == null) {
				BoardSys.boards[i] = board;
				chk = i;
				break;
			} 
		}
		if(chk == -1) {
			System.out.println("게시판 작성이 마감되었습니다.");
			System.out.println("나중에 다시 찾아와 주십시오.");
		}
		return board;
	}
}
