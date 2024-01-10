package Quiz;

import java.util.Iterator;

public class Quiz35_배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		
		int c[]= new int[6];
		
//		방법 : 1
		
//		int k =0;
//		
//		for(int i =0; i<c.length; i=i+2) {
//			c[i] = a[k];
//			k++;
//		}
//			k=0;
//		for(int i =1; i<c.length; i=i+2) {
//			c[i] = b[k];
//			k++;
//		}
//		for(int i =0; i<c.length; i++) {
//			System.out.println(c[i]);
//		}
		
		
//		방법 : 2
		
		int k=0;
		for (int i =0; i<a.length; i++) {
			System.arraycopy(a, i, c, k, 1);
			k=k+2;
		}
		k=1;
		for (int i =0; i<b.length; i++) {
			System.arraycopy(b, i, c, k, 1);
			k=k+2;
		}
		
		
//		방법 : 3
//		System.arraycopy(a, 0, c, 0, 1);
//		System.arraycopy(a, 1, c, 2, 1);
//		System.arraycopy(a, 2, c, 4, 1);
//		System.arraycopy(b, 0, c, 1, 1);
//		System.arraycopy(b, 1, c, 3, 1);
//		System.arraycopy(b, 2, c, 5, 1);
		
		for(int cs : c) {
			System.out.println(cs);
		}
		

		
		
	}

}
