package 다형성;

import java.security.PublicKey;

public class CasherMain {

	public static void main(String[] args) {
		Product product = new Tv();
		
		Buyer buyer = new Buyer();
		buyer.buy(product);
		buyer.buy(new Audio());
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new Tv());
		buyer.buy(new Audio());
		buyer.buy(new PlayStation());
		buyer.buy(new Computer());
		buyer.summary();
		
	}


}


class Buyer{
	Product cart[] = new Product[3];
	int money =10000;
	int bonusPoint =0;
	int i;

	public void buy(Product Product) {
		if (money <= Product.price) {
			System.out.println("잔액이 부족해서 결제할수없습니다");
		}
		money -= Product.price;
		bonusPoint +=Product.bonusPrice;
		System.out.println(Product.toString() + "을(를) 구입하셨습니다");
		add(Product);
	}
	public void add(Product product) {
		if (i >=cart.length) {
			Product[] temp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, temp, 0, cart.length);
			cart = temp;

		}
		cart[i++] = product;
		return;
	}
	void summary() {
		String itemList ="";
		int sum=0;
		for(int i=0; i<cart.length; i++) {
			if (cart[i]==null) {
				break;

			}
			itemList += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건 : " +itemList);
		System.out.println("사용한 금액 : " +sum);
		System.out.println("보너스 보인트 : " +bonusPoint);
		System.out.println("남은금액 : " +money);
	}

}
class Product{
	int price;
	int bonusPrice;

	public Product(int Price) {
		this.price = price;
		this.bonusPrice = (int) (price/10);
	}
}
class Audio extends Product{

	public Audio() {
		super(40);
	}
	public String toString() {
		return "Audio";
	}
}
class PlayStation extends Product{

	public PlayStation() {
		super(120);
	}
	public String toString() {
		return "PlayStation";
	}
}
class Computer extends Product{

	public Computer() {
		super(300);
	}
	public String toString() {
		return "Computer";
	}
}
class Tv extends Product{

	public Tv() {
		super(420);
	}
	public String toString() {
		return "Tv";
	}

}
