package 메소드;

public class Char배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Content[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l','.'};

		replace(Content);
		ptr(Content);
	}
	static void replace(char[] arr) {
		int i = 0;
		//		for(int i = 0; i<arr.length; i++) {
		//			if (arr[i]==' ') {
		//				arr[i]=',';
		//			}	

		for(char arrs : arr) {
			if (arr[i] == ' ') {
				arr[i]=',';
			}
			i++;
		}
	}

	static void ptr(char[] arr) {
		int i = 0;
		for(char arrs : arr) {
			System.out.print(arr[i]);
			i++;
		}
	}
}
