package day05;
/*
 * <배열>
 * 동일한 자료형의 데이터를 여러개 저장하는 저장공간
 * - 저장 공간이 연속적으로 배치
 * - 배열의 각 저장공간 => 배열의 요소
 * - 배열의 요소마다 붙여진 일련번호 => 인덱스
 *   (인덱스 범위는 0 ~ 배열길이 -1)
 * - 배열은 객체이며, 참조형 변수로 배열에 접근한다
 */
public class Work01 { //main class

	public static void main(String[] args) {
		//배열의 선언
		int[] ar = new int[] {10,20,30,40,50};
		int[] ar2= new int[5];
		ar2[0]=10; ar2[1]=20; ar2[2]=30; ar2[3]=40; ar2[4]=50;
		int[] ar3={10,20,30,40,50};
		
		//배열을 대상으로 for문을 사용할 때는
		//i의 범위를 배열명.length로 지정하는 것이 좋다
		//배열의 길이가 변경될 경우, 수정 안해도 된다
		for(int i=0;i<ar2.length;i++){
			ar2[i]=(i+1)*10;
		}//for
	
		//스트링 배열
		String[] sar=new String[3];
		String[] sar2={"피카츄","라이츄","파이리","꼬부기"};
		
		
		

	} //main method

} //Work01 class