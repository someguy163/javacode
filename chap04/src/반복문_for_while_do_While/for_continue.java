package 반복문_for_while_do_While;

public class for_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if (i%2!=0) {
				continue;
//				i%2!=0인 것들은 아래 무시하고 다시 위로 올라가라 
			}
			System.out.println(i);
		}
	}

}
