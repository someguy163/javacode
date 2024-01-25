package 자바API;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1= new Member("blue");
		Member obj2= new Member("blue");
		Member obj3= new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2는 동일합니다");
		}
		else {
			System.out.println("obj1 과 obj2는 다릅니다");
		}
		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3는 동일합니다");
		}
		else {
			System.out.println("obj1 과 obj3는 다릅니다");
		}
	}

}
