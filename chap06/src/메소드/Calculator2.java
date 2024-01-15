package 메소드;

public class Calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calRec calrec = new calRec();
		double result =  calrec.areaRec(12, 1.2);
		System.out.println(result);
		double result2 = calrec.areaRec(12, 12);
		System.out.println(result2);

	}

}
class calRec {
	double areaRec(double width, double height) {
		return width * height;
	}
}
