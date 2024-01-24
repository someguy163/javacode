package 로그인_인터페이스;

public class Controller {
	public Controller(){
		init();
	}

	private void init() {
		while (true) {
			int selectMenu = View.menu();

			switch (selectMenu) {
			case 1:// 회원 가입
				Member m = View.signUp();
				if (m == null) {
					View.userError();
				} else {
					for (int i = 0; i < Main.members.length; i++) {
						if (Main.members[i] == null) {
							Main.members[i] = m;
							break;
						}
					}
				}
				break;
			case 2:// 로그인
				String[] login = View.signIn();

				int idx = -1;

				for (int i = 0; i < Main.members.length; i++) {
					if (Main.members[i] == null) {
						continue;
					} else if (Main.members[i].getId().equals(login[0])
							&& Main.members[i].getPassword().equals(login[1])) {
						// 로그인 성공
						task(Main.members[i]);
//						Main.members[i].work();
//						Main.members[i].test();
						idx = i;
					}
				}
				if (idx == -1) {
					View.signInFail();
				}
				break;
			case 3:// 프로그램 종료
				if (View.exit()) {
					System.exit(0);
				}
				break;
			default:
				View.userError();
			}
		}
	}

	private void task(Member member) {
		member.work();
		member.test();
	}
}
