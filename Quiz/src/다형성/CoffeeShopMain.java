package 다형성;

import java.util.List;

public class CoffeeShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		James james = new James();
		Paribaguette paribaguette = new Paribaguette(new CreamDonut(), new RedBeanBread(), new MoccaBread());
		CoffeShop coffeShop = new CoffeShop(new Americano(), new Caffelatte(), new Capucchino());
		james.buy(coffeShop,paribaguette); 
		
		
		
//		오버로딩
//		System.out.println("제임스가 먹은 커피의 총 가격은 ? : "+james.buy(coffeShop)); ;
//		System.out.println("제임스가 먹은 빵의 총 가격은 ? : " +james.buy(paribaguette));


	}

}
class Product1{
	int price;

	public Product1(int price) {
		this.price = price;
	}
}
class Americano extends Product1{

	public Americano() {
		super(1000);
		System.out.println("아메리카노의 가격 : " + this.price);
	}

}
class Caffelatte extends Product1{

	public Caffelatte() {
		super(2000);
		System.out.println("카페라뗴의 가격 : " + this.price);
	}

}
class Capucchino extends Product1{

	public Capucchino() {
		super(3000);
		System.out.println("카푸치노의 가격 : " + this.price);
	}

}
class CreamDonut extends Product1{

	public CreamDonut() {
		super(1000);
		System.out.println("크림도넛의 가격 : " + this.price);
	}

}
class RedBeanBread extends Product1{

	public RedBeanBread() {
		super(1500);
		System.out.println("단팥빵의 가격 : " + this.price);
	}

}
class MoccaBread extends Product1{

	public  MoccaBread() {
		super(2000);
		System.out.println("모카빵의 가격 : " + this.price);
	}

}
class Paribaguette{
	Product1 product;
	Product1 creamDonut;
	Product1 redBeanBread;
	Product1 moccaBread;

	public Paribaguette(Product1 creamDonut, Product1 redBeanBread, Product1 moccaBread) {
		this.creamDonut = creamDonut;
		this.redBeanBread = redBeanBread;
		this.moccaBread = moccaBread;
		//		System.out.println(creamDonut.price + redBeanBread.price + moccaBread.price); 
	}



}
class CoffeShop{
	Product1 product;
	Product1 americano;
	Product1 caffelatte;
	Product1 capucchino;


	public CoffeShop(Product1 americano, Product1 caffelatte, Product1 capucchino) {
		this.americano = americano;
		this.caffelatte = caffelatte;
		this.capucchino = capucchino;
		//		System.out.println(americano.price + caffelatte.price + capucchino.price); 
	}

}
class James{
	int total =0;
	int result;
	public James() {

	}

	public void buy(CoffeShop coffeShop ,Paribaguette paribaguette) {
		System.out.println( "제임스가 먹은 커피의 총 가격은 ? : "+(coffeShop.americano.price + coffeShop.capucchino.price + coffeShop.caffelatte.price));
		System.out.println( "제임스가 먹은 빵의 총 가격은 ? : "+(paribaguette.redBeanBread.price + paribaguette.moccaBread.price + paribaguette.creamDonut.price));
	}	



//오버로딩
//	public int buy(Paribaguette paribaguette) {
//
//		return paribaguette.redBeanBread.price + paribaguette.moccaBread.price + paribaguette.creamDonut.price;
//	}
//	public int buy(CoffeShop coffeShop) {
//
//		return coffeShop.americano.price + coffeShop.capucchino.price + coffeShop.caffelatte.price;
//	}

}
