package 메소드;

import java.util.Scanner;

public class SumAvgEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int scores[] = new int[5];
		Cal cal = new Cal();
//		int sum =0;
		int j=0;
		int count=0;


		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		for(int i=0; i<scores.length; i++) {
			scores[i]=sc.nextInt();
		}
		
		int sum = Cal.sum(scores);
		System.out.println("합계 : "+sum);
		int avg = Cal.avg(scores);
		System.out.println("평균 : "+avg);

	}
//	public static int sum(int[] x) {
//		int sum=0;
//		for(int i =0; i<x.length; i++) {
//			sum = sum + x[i];
//		}
//		return sum;
//	}
//	public static int avg(int[] x) {
//		int sum =0;
//		int count=0;
//		int avg=0;
//		for(int i=0;i<x.length;i++) {
//			sum +=x[i];
//			count++;
//		}
//		avg = sum/count;
//		return avg;
//	}

}
class Cal{
	public static int avg(int[] x) {
		int sum =0;
		int count=0;
		int avg=0;
		for(int i=0;i<x.length;i++) {
			sum +=x[i];
			count++;
		}
		avg = sum/count;
		return avg;
	}
	public static int sum(int[] x) {
		int sum=0;
		for(int i =0; i<x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}
}
