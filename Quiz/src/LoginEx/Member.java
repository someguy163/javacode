package LoginEx;

public abstract class Member implements Task{
	String Name;
	String id;
	String PassWord;
	String Position;
	public Member(String name, String id, String passWord, String position) {

		this.Name= name;
		this.id = id;
		this.PassWord = passWord;
		this.Position = position;
	}


}
