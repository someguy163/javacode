package 자바API;

public class 절대경로찾기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
		
		String photoPath1 = clazz.getResource("photo1.jpg").getPath();
		String photoPath2 = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photoPath1);
		System.out.println(photoPath2);
	}

}
