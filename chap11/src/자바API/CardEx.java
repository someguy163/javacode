package 자바API;

public class CardEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card card1 = new Card();
		Card card2 = new Card();
		
//		String card1toString = card1.toString();
		
		System.out.println(card1);
//		System.out.println(card1.toString());
//		System.out.println(card1toString);
	}

}
class Card{
	String kind;
	int number;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public Card() {
		this("spade", 1);
	}
	public String toString() {
		return kind + " , " + number; 
	}	
}
