package day05;
/*
 * <확장 for문 (for-each문)>
 * : 배열과 컬렉션 등에 좀 더 편리하게 사용 할 수 있는 새로운 형태의 for문
 * : 읽기전용
 * 
 * 1. 형식
 * for(임시변수 선언 : 대상배열){
 * 		//반복할 문장(종속문장)
 *  }
 * 주의사항!!!
 * 1. 해당 배열의 모든 원소들 한번씩 임시변수에 복사하면서 종속문장을 진행
 * 2. 임시변수의 자료형은 배열의 자료형과 동일해야함
 * 3. 임시변수의 값을 변경하여도, 배열의 원소를 수정할 수 없다(주의)
 * 
 */
public class Work02 { //main class

	public static void main(String[] args) {
		int[] ar={63,2,39,11,30};
		
		//확장 for문 이용하여
		//배열의 원소를 출력
		//(63/2/39/11/30)
		//힌트. System.out.print (한줄 안띄우고 붙여쓰므로)
		
		for(int a:ar)
			System.out.print(a+"/");
		
		String[] sar={"피카츄","라이츄","파이리","꼬부기"};
		//확장 for문 이용하여
		//배열의 원소를 출력
		//(피카츄/라이츄/파이리/꼬부기/)
		System.out.println("");
		for(String a:sar)
			System.out.print(a+"/");
		
		
		
		
		
		
		

	}//main method

}//Work02 class
