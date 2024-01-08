package Quiz;

import java.util.Random;

public class Quiz20_while_Math_random_주사위합5면_종료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			int	random = (int) (Math.random()*6+1);	
			int random2 = (int) (Math.random()*6+1);
			System.out.println("( "+random + " , " + random2+" )");
			if (random+random2==5) {
				break;
			}
		}

	}

}
