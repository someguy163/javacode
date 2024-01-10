package Quiz;

import java.util.Iterator;

public class Quiz33_다차원배열_파스칼삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pascal[][] = new int[6][6];
		pascal[0][0] =1;
		for(int i=1; i<pascal.length; i++) {
			System.out.println();
			for(int j =1; j<=i; j++) {
					pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
//					pascal[2][1] = pascal[1][0] + pascal[1][1];
					System.out.print(pascal[i][j]);

				}

			}
			
		}


	}


