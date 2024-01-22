package 다형성_Casting;

public class ChildEx {

	public static void main(String[] args) {
		Parent parent = new Child();
		
//		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		Child 클래스에는 method1,2가 없는 상황이다
//		따라서 Parent 타입의 child는 부모의 method1이 불러와진다
		
//		parent.field2 = "data2";
//		parent.method3();
//		
		

		Child child = (Child) parent;
		child.field2 = "yyy"; // ����
		child.method3(); // ����
//		parent에는 method3이 없다 따라서
//		child에만 있는 method3을 불러오려면 
//		변수 parent를 child로 타입변환하여 method3을 불러온다.
	}

}
