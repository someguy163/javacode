package 메소드_클래스;

public class Circle {
	int rad[] = {0,1,2,3,4};
	int i= 0;
	void result(int a[]) {
		for(int array : a) {
			double circleResult = a[i] * a[i] * 3.14;
			int resultCircle = (int) (circleResult);
			System.out.println("반지름" + a[i] + " 원의 넓이 : " + resultCircle);
			i++;
		}
	}
	
}
