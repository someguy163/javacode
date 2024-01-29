package 실습;

import java.util.Scanner;

public class CoffeeShopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Beverage.print();
		getSaleinfo(menu, CoffeeShopEx.selectCount);
		getTotalPrice(menu, CoffeeShopEx.selectCount); 
	}

	public static int amount=0;
	public static int coffeOrdercount =0;
	public static int TeaOrdercount =0;
	public static Beverage menu[];
	public static Scanner sc = new Scanner(System.in);
	public static int selectCount=0;

	//	출력문
	public static  void getSaleinfo(Beverage[] menu , int count) {
		for(int i=0; i<count; i++) {
			System.out.println(i+1 + "번째 판매 음료는 " + menu[i].getName() + " 가격은 : " + menu[i].getPrice());
		}
	};
	public static void getTotalPrice(Beverage[] menu ,int count) {
		int sum =0;
		for(int i=0; i<count; i++) {
			sum = menu[i].getPrice() + sum;
		}
		System.out.println();
		System.out.println("총 판매금액 ==> " + sum);
		System.out.println("Coffe의 판매 갯수 : " + coffeOrdercount);
		System.out.println("Tea의 판매 갯수 : " + TeaOrdercount);
	}


}
abstract class Beverage{

	String name;
	int price;



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Beverage(String name) {
		this.name = name;
	}


	abstract void calcPrice(String name, int price);

	static void print() {
		int resultMenuCount =0;

		System.out.println("***java nara CoffeShop영업개시***");
		System.out.println("몇잔을 주문하시겠습니까?");
		CoffeeShopEx.selectCount = CoffeeShopEx.sc.nextInt();
		CoffeeShopEx.menu = new Beverage[CoffeeShopEx.selectCount];
		System.out.println(CoffeeShopEx.selectCount + "잔의 음료를 선택하세요");

		System.out.println("1. Americano ");
		System.out.println("2. CafeLatte");
		System.out.println("3. Cappuccino ");
		System.out.println("4. LemonTea ");
		System.out.println("5. hinsengTea ");
		System.out.println("6. redginsengTea ");

		for(int i=0; i<CoffeeShopEx.selectCount; i++) {
			System.out.println("주문 >> ");
			int selectMenu = CoffeeShopEx.sc.nextInt();
			switch (selectMenu) {
			case 1: {
				Beverage beverage1 = new Coffee("Americano");
				beverage1.calcPrice("Americano", 1500);
				CoffeeShopEx.menu[resultMenuCount] = beverage1;
				CoffeeShopEx.coffeOrdercount++;
				resultMenuCount++;
				break;
			}
			case 2: {
				Beverage beverage2 = new Coffee("CafeLatte");
				beverage2.calcPrice("CafeLatte", 2500);
				CoffeeShopEx.menu[resultMenuCount] = beverage2;
				CoffeeShopEx.coffeOrdercount++;
				resultMenuCount++;
				break;
			}
			case 3: {
				Beverage beverage3 = new Coffee("Cappuccino");
				beverage3.calcPrice("Cappuccino", 3000);
				CoffeeShopEx.menu[resultMenuCount] = beverage3;
				CoffeeShopEx.coffeOrdercount++;
				resultMenuCount++;
				break;
			}
			case 4: {
				Beverage beverage4 = new Tea("lemonTea");
				beverage4.calcPrice("lemonTea", 1500);
				CoffeeShopEx.menu[resultMenuCount] = beverage4;
				CoffeeShopEx.TeaOrdercount++;
				resultMenuCount++;
				break;
			}
			case 5: {
				Beverage beverage5 = new Tea("ginsengTea");
				beverage5.calcPrice("ginsengTea", 2000);
				CoffeeShopEx.menu[resultMenuCount] = beverage5;
				resultMenuCount++;
				CoffeeShopEx.TeaOrdercount++;
				break;
			}
			case 6: {
				Beverage beverage6 = new Tea("redginsengTea");
				beverage6.calcPrice("redginsengTea", 2500);
				CoffeeShopEx.menu[resultMenuCount] = beverage6;
				resultMenuCount++;
				CoffeeShopEx.TeaOrdercount++;
				break;
			}
			}
		}
	};

}
class Coffee extends Beverage{

	public Coffee(String name) {
		super(name);
		System.out.println(this.name);
		CoffeeShop.amount++;
	}


	@Override
	void calcPrice(String name, int price) {
		this.name =name;
		this.price=price;

	}



}
class Tea extends Beverage{

	public Tea(String name) {
		super(name);
		System.out.println(this.name);
		CoffeeShop.amount++;
	}

	@Override
	void calcPrice(String name , int price) {
		this.name =name;
		this.price=price;
	}

}

