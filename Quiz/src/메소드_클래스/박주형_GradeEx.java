package 메소드_클래스;

import java.util.Scanner;

public class 박주형_GradeEx {

	public static void main(String[] args) {
		Grade grade = new Grade();
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("수학 과학 영어 순으로 3개의 정수 입력하세요 : ");
		int math = sc.nextInt();
		grade.setMath(math);
		int science = sc.nextInt();
		grade.setScience(science);
		int eng = sc.nextInt();
		grade.setEnglish(eng);
		
		 
		System.out.println("평균은 : " + grade.average());
		
	}

}

