package 클래스;

import java.util.Iterator;
import java.util.Scanner;

public class BookEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book[] = new Book[2];
		int i =0;
		Scanner sc = new Scanner(System.in);
		
//		for(int i =0; i<book.length; i++) {
//			System.out.print("제목 >> ");
//			String title = sc.nextLine();
//			System.out.print("저자 >> ");
//			String author = sc.nextLine();
//			book[i] = new Book(title, author);
//		}
		
//		
		for(Book books : book) {
			System.out.print("제목 >> ");
			String title = sc.nextLine();
			System.out.print("저자 >> ");
			String author = sc.nextLine();
			book[i] = new Book(title, author);
			i++;
		}
		
		for(Book books : book) {
			System.out.print("("+books.title+ ","+books.author+")");
		}
	}

}
