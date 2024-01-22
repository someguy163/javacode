package CasherSys;

public class CaherDesk {

	public static void main(String[] args) {
		
		Product a = new Tv();
		
		
		Buyer casher = new Buyer();
		casher.buy(a);
		casher.buy(new Audio());
		casher.buy(new Tv());
		casher.buy(new Computer());
		casher.buy(new Tv());
		casher.buy(new Audio());
		casher.buy(new PlayStation());
		casher.buy(new Computer());
		casher.summary();
		
		
	}
	 String Goods() {
		return "123";
	}
}
