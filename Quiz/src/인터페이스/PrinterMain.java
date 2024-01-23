package 인터페이스;

public class PrinterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrinterRun(new Samsung());
		
		PrinterRun(new LG());
	}
	public static void PrinterRun(Printer print) {
		//		if (print instanceof Samsung) {
		//			print.print("스크립트 이론문서");
		//		}else {
		//			print.print("자바 이론 문서");	
		//		}
		print.print("자바 이론 문서");	

	}
}
interface Printer {
	void print(String doc);
}
interface ColorPrintabl extends Printer{
	void print(String doc);
}
class Samsung implements Printer{

	@Override
	public void print(String doc) {
		System.out.println("삼성프린터");
		System.out.println(doc+"를 인쇄합니다");
		System.out.println("삼성프린터");
		System.out.println("컬러로"+doc+"를 인쇄합니다");
	}




}
class LG implements Printer{

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("삼성프린터");
		System.out.println(doc+"를 인쇄합니다");
	}



}
