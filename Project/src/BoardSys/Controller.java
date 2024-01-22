package BoardSys;

public class Controller {
	public void init() {
		boolean run = true;
		
		while(run) {
			System.out.println("환영합니다 ^^");
			int selectNum = View.menu();
			
			switch(selectNum) {
				case 1:
					View.list();
					int selectNum2 = View.viewContent();
					if(selectNum2 == 0) {
						break;
					} else {
						int idx = -1;
						for(int i =0; i<BoardSys.boards.length; i++) {
							if(BoardSys.boards[i] == null) {
								continue;
							} else {
//								idx = i;
								BoardSys.boards[selectNum2-1].prt();
//								System.out.println("1.수정 | 2.삭제 | 3.돌아가기");
//								System.out.print("선택>");
//								int selectNum3 = BoardSys.scan.nextInt();
//								switch(selectNum3) {
//									case 1:
//										System.out.println("글 수정을 위해 비밀번호를 입력하세요.");
//										String pwd = BoardSys.scan.next();
//										if(pwd.equals(BoardSys.boards[i].getPassword())) {
//											BoardSys.boards[i] = null;
//											View.createBoard();
//											break;
//										} else {
//											System.out.println("비밀번호가 틀렸습니다.");
//											break;
//										}
//									case 2:
//										System.out.println("글 삭제를 위해 비밀번호를 입력하세요.");
//										String pwd2 = BoardSys.scan.next();
//										if(pwd2.equals(BoardSys.boards[i].getPassword())) {
//											BoardSys.boards[i] = null;
//										}
//										break;
//									case 3:
//										break;
//								}
//							}
						}
//						if( idx == -1) {
//							System.out.println("게시글 번호의 정보가 없습니다.");
//							System.out.println("다시 확인해 주세요.");
						}
					}
					break;
				case 2:
					View.createBoard();
					break;
				case 3:
					System.out.println("프로그램을 종료합니다.");
					run = false;
			}
		}
	}
}
