package 자바API;

public class SmartPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");
		
		String obj = smartPhone.toString();
		System.out.println(obj);
		System.out.println(smartPhone);
	}

}
class SmartPhone{
	private String Company;
	private String os;
	public SmartPhone(String company, String os) {
		super();
		Company = company;
		this.os = os;
	}
	
	public String toString() {
		return Company +" , " + os;
	}
	
}
