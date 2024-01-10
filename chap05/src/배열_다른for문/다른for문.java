package 배열_다른for문;

public class 다른for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = {95,71,84,93,87};
		
		int sum =0;
//		배열과 같은 타입인 int를 선언하고 score 변수에다 scores 배열을 차례대로 넣는다
		for(int score : scores) {
			sum = sum+score;
		}
		System.out.println("총합 : "+ sum);
		double avg  = (double) sum / scores.length;
		System.out.println("평균 : " +avg);
	}

}
