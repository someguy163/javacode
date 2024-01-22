package 다형성;



public class Parent {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child child1 = new child();
		Parent parent = child1;
		parent.method1();
		parent.method2();
		
	}

	public void method1() {
		System.out.println("Parent-method1");
	}
	public void method2() {
		System.out.println("Parent-method2");
	}
}
class child extends Parent{
	public void method1() {
		System.out.println("child-method1");
	}
	public void method2() {
		System.out.println("child-method2");
	}
}

