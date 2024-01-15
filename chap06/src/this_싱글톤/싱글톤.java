package this_싱글톤;

public class 싱글톤 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton obj1 = new SiSingleton(); 에러
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1==obj2) {
			System.out.println("같은 싱글톤 객체입니다");
		}
		else {
			System.out.println("다른 싱글톤 객체입니다");
		}
	}

}
class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	}
	static Singleton getInstance() {
		return singleton;
	}
	
}