package 다형성_Promotion;


public class PromotionEx {

	public static void main(String[] args) {
		 B b = new B();
		 C c = new C();
		 D d = new D();
		 E e = new E();
		 
		 A a1 = b;
		 A a2 = c;
		 A a3 = d;
		 A a4 = e;
		 
		 B b1 = d;
		 C c1 = e;
		 
//		 B b3 = e; // �Ұ���
//		 C c2 = d; // �Ұ���
		 
		 

	}

}
