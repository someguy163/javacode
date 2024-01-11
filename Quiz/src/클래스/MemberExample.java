package 클래스;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member("최하얀",23,"id","sss");
		
//		member.Name="최하얀";
//		member.age=23;
//		member.id="white";
//		member.Password="1234";
		
		System.out.println("이름 : " + member.Name);
		System.out.println("나이 : " + member.age);
		System.out.println("ID : " + member.id);
		System.out.println("password : " + member.Password);
	}

}
