package 자바API;

public class ClassExample {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
//		Class clazz = Car.class;
		
		Class clazz = Class.forName("자바API.Car");
		
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		}

}
class Car{
	
}
