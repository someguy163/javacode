package BuyEx;

public class CoffeShop{
	Product a, c, ca;
	
	public CoffeShop(Product a, Product c,Product ca) {
		this.a = a;
		this.c = c;
		this.ca = ca;
	}

	public void Americano() {
		System.out.println("아메리카노의 가격 : " + a);
	}
	public void Caffelatte() {
		System.out.println("카페라떼의 가격 : " + c);
	}
	public void Capuccino() {
		System.out.println("카푸치노의 가격 : " + ca);
	}

}
