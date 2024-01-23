package BuyEx;

public class Parisbaguette{
	Product cd, rb, mb;
	
	public Parisbaguette(Product cd, Product rb,Product mb) {
		cd = new CreamDonut();
		rb = new RedbeanBread();
		mb = new MoccaBread();
	}
	
	public void CreamDonut() {
		System.out.println("크림도넛의 가격 : " + cd);
	}
	public void RedbeanBread() {
		System.out.println("단팥빵의 가격 : " + rb);
	}
	public void MoccaBread() {
		System.out.println("모카빵의 가격 : " + mb);
	}

}
