package LoginEx;

public class Controller{
	static boolean run =true;
	static void init() {
		while (run) {
			int mainSelectNum = View.menu();
			switch (mainSelectNum) {
			case 1: {
				Member newMember = View.CreateMember();
				for (int i=0; i<LoginEx.members.length; i++) {
					if (LoginEx.members[i]==null) {
						LoginEx.members[i] = newMember;
						break;
					}
				}
				break;
			}
			case 2: {
				String ConfirmLogin[] = View.Login();
				for (int i=0; i<LoginEx.members.length; i++) {
					if ( (LoginEx.members[i]!=null) && (LoginEx.members[i].id.equals(ConfirmLogin[0])) && (LoginEx.members[i].PassWord.equals(ConfirmLogin[1]))) {
						System.out.println("로그인완료");
						LoginEx.members[i].work();
						LoginEx.members[i].test();
					}
				}
				break;
			}
			case 3: {
				String Exit = View.ExitProgram();
				if ((Exit.equals("Y") || Exit.endsWith("y"))) {
					System.out.println("프로그램을 종료합니다");
					run=false;
				}
				else if ((Exit.equals("N") || Exit.endsWith("n"))) {
					init();
				} 
				break;
			}
			}
		}
	}
}
