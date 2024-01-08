package 반복문_for_while_do_While;

import java.util.Scanner;

public class while문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =1;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("어디까지 더할까요? ");
		int num = sc.nextInt();
		while(true) {
			sum=sum+i;
			i++;
			if (i==num+1) {
				break;
			}
			
		}
		System.out.println(sum);

	}

}
