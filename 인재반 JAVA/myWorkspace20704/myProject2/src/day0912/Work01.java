package day0912;

import java.util.Arrays;

/*
 * <Arrays 클래스>
 * :배열의 복사, 정렬, 탐색 등 배열 조작에 필요한 메소드 제공
 *  (모두 static 메서드)
 */
public class Work01 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		//1. 배열의 복사
		//1) 타겟배열 copyOf(원본배열,길이):인덱스 0부터 길이만큼
		char[] c1= {'J','a','v','a'};
		char[] c2=Arrays.copyOf(c1, c1.length);
		System.out.println(c2);
		
		c2=Arrays.copyOf(c1, 2);
		System.out.println(c2);
		
		//2) 타켓배열 copyOfRange(원본배열,시작인덱스,끝인덱스)
		//					:배열의 시작~ 끝전까지 복사 
		c2=Arrays.copyOfRange(c1, 1, 4);
		System.out.println(c2);
		
		//3)system.arraycopy(원본배열,원본시작인덱스,타겟배열,타겟시작인덱스,복사갯수)
		int[] src= {0,1,2,3,4,5};
		int[] dst= {0,100,200,300,400,500};
		//dst가 0,100,200,300,3,4가 되도록 복사
		System.arraycopy(src, 3, dst, 4, 2);
		
		//2. 배열의 출력
		//String toString(배열): 배열의 모든 요소를 문자열로 리턴
		System.out.println(Arrays.toString(dst));
		
		//3. 배열의 비교
		//boolean equals(배열,배열)
		int[] src2= {0,1,2,3,4,5};
		System.out.println(Arrays.equals(src, src2)); //true
		
		//4. 배열의 값 저장
		//1)void fill(배열, 값)
		Arrays.fill(src2, 7);
		System.out.println(Arrays.toString(src2));
		//2)void fill(배열,시작인덱스,끝인덱스,값)
		//src2 를 8,8,7,7,7,7
		Arrays.fill(src2, 0, 2, 8);
		System.out.println(Arrays.toString(src2));
		
		//5. 배열 오름차순 정렬
		//1) void sort(배열)
		Arrays.sort(dst);
		System.out.println(Arrays.toString(dst));
		
		//2) void sort(배열,시작인덱스,끝인덱스)
		//src2의 0번째원소부터 2번째원소까지 정렬
		//7,8,8,7,7,7
		Arrays.sort(src2, 0, 3);
		System.out.println(Arrays.toString(src2));
		
		//6. 배열 검색
		//1) int binarhSearch(배열,찾는값)
		//못찾으면 음수 반환
		String[] sa= {"케이크","도넛","밥버거","햄버거","떡볶이","갈매기살"};
		System.out.println(Arrays.binarySearch(sa, "케이크"));
		//반드시 정렬된 상태에서 사용해야함
		Arrays.sort(sa);
		System.out.println(Arrays.toString(sa));
		System.out.println(Arrays.binarySearch(sa, "떡볶이"));
		//2) int binarySearch(배열,시작인덱스,끝인덱스,값)
		//  원하는 범위에서 찾기
		System.out.println(Arrays.binarySearch(sa, 0,2,"케이크")); 
		//찾을수 x
		
	}//end of main method

}//end of main class
