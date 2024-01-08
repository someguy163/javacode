package Quiz;

public class Quiz15_for짝수판별 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		33부터 45까지 짝수 홀수판별기
		for(int i=33; i<=45; i++) {
			if (i%2==0) {
				System.out.println(i +" 짝수입니다");
			}
			else {
				System.out.println(i);
			}
		}
	}

}
