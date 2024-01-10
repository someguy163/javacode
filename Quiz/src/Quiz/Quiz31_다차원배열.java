package Quiz;

import java.util.Iterator;

public class Quiz31_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score[][] = {{88,89},{78,90},{95,90},{99,100}};
		int result = 0;
		int grade =0;
		int scores = 0;
		
		
		for(int i =0; i<score.length; i++) {
			grade = score.length;
			for(int j =0; j<score[i].length; j++) {
				scores = score[i].length;
				result = result + score[i][j];
			}
		}
		System.out.println("총점 : "+result);
		System.out.println("평균 : " +result/(grade*scores));
	}

}
