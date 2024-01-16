package 메소드_클래스;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card(3, false);
		Card card2 = new Card(2, true);
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
class Card{
	int num =1;
	boolean chk = true;

	public Card(int num, boolean chk) {
		this.num = num;
		this.chk = chk;
	}

	String info() {
		String str;
		this.num = num;
		this.chk = chk;
		if (chk==true) {
			str = String.valueOf(this.num) + "k"; 
		}
		else {
			str = String.valueOf(this.num); 
		}
		return str;
	}

}