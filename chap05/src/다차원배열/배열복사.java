package 다차원배열;

public class 배열복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String oldStrArrayString[] = {"java","array","copy"};
		String newStrArray[] = new String[5];
		
		
//		for(int i=0; i<newStrArray.length; i++) {
//			System.out.println(newStrArray[i]);
//		}
		
		System.arraycopy(oldStrArrayString, 0, newStrArray, 0, oldStrArrayString.length);
		
//		olStrArrayString을 newStrArray에다 복사한다 얼마만큼? oldStrArrayString의length만큼 가져온다
		
//		oldStrArrayString.length 을 2로 바꾸면 java , array만 가져온다.
		
//		System.arraycopy(oldStrArrayString, 0, newStrArray, 1, oldStrArrayString.length);
//		에서 newStrArray뒤에 있는 숫자는 newStrArray에서 몇번째 인덱스에 넣을것인지 지정하는 인덱스번호이다.
		
//		System.arraycopy(oldStrArrayString, 0, newStrArray, 1, oldStrArrayString.length);
//		에서 oldStrArrayString 뒤에 있는 숫자는 oldStrArrayString의 배열에서 몇번 인덱스 부터 가져올것인지 의미한다.
//		단 0이 아니라 1로 입력하면 뒤에있는 oldStrArrayString.length 를 2로 바꿔야한다
		
//		교제 196pg 
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.println(newStrArray[i]);
		}
	}

}
