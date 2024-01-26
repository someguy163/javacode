package 자바API;

public class MathRandom으로_주사위 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int) (Math.random()*6) + 1;
		System.out.println("주사위 눈: " + num);
	}

}
