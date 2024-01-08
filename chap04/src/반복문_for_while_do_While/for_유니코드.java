package 반복문_for_while_do_While;

public class for_유니코드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter:
			for(char upper ='A'; upper<='Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + " - " + lower);
					if (lower=='h') {
						break Outter;
					}
				}
			}
		System.out.println("프로그램 종료");
	}

}
