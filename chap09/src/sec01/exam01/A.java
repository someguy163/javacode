package sec01.exam01;

/**바깥 클래스**/
class A {
	A() { System.out.println("A ��ü�� ������"); }
	
	/**인스턴스 멤버 클래스**/
	public class B {
		B() { System.out.println("B ��ü�� ������"); }
		int field1;
		//static int field2;
		void method1() { }
		//static void method2() { }
	}
	
	/**정적 멤버 클래스**/
	static class C {
		C() { System.out.println("C ��ü�� ������"); }
		int field1;
		static int field2;
		void method1() { }
		static void method2() { }
	}
	
	void method() {
		/**로컬 클래스**/
		class D {
			D() { System.out.println("D ��ü�� ������"); }
			int field1;
			//static int field2;
			
			
			void method1() { }
			//static void method2() { }
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
