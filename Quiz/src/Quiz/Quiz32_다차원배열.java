package Quiz;



public class Quiz32_다차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{5,5,5,5,5},{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
		
		int result = 0;
//		int row =0;
//		int col =0;
		int count=0;
		for(int i =0; i<arr.length; i++) {
//			row = arr.length;
			for(int j =0; j<arr[i].length; j++) {
//				col = arr[i].length;
				result = result + arr[i][j];
				count++;
			}

		}
		System.out.println("합계 : " + result);
		System.out.println("평균 : " + result/(count));
	}

}
