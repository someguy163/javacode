package Quiz;

public class Quiz26_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[] = {1,5,3,8,2};

		int max = 0;
		for(int i=0; i<score.length; i++) {
			if (max<score[i]) {
				max=score[i];
			}
		}
		System.out.println(max);
	}

}
