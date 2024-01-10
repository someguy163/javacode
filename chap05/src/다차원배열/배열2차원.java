package 다차원배열;

import java.util.Iterator;

public class 배열2차원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mathscore[][] = new int[2][3];
		
		for(int i=0; i<mathscore.length; i++) {
			for(int j =0; j<mathscore[i].length; j++) {
				System.out.print(mathscore[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		int engscore[][] = new int[2][];
		engscore[0] = new int[2];
		engscore[1] = new int[3];
		
		for(int i =0; i<engscore.length; i++) {
			
			for(int j =0; j<engscore[i].length; j++) {
				System.out.print(engscore[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------");
		int javascore[][] = {{95,80},{92,96,80}};
		
		for(int i =0; i<javascore.length; i++) {
			for(int j =0; j<javascore[i].length; j++) {
				System.out.print(javascore[i][j] +" ");
			}
			System.out.println();
		}
	}

}
