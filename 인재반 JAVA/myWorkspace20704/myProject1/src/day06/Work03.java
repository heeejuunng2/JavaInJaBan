package day06;
/*
 * <배열활용 예제4: 배열의 최대값과 최소값 구하기>
 * 1. 최대값을 저장할 변수를 선언한다
 *	    배열의 첫번째 원소로 초기화 한다
 * 2. 최소값을 저장할 변수를 선언한다
 * 	    배열의 첫번째 원소로 초기화 한다
 * 3. 배열을 돌면서 값을 비교한다
 */
public class Work03 {//main class

	public static void main(String[] args) {
		int[] num={10,90,88,79,5};
		int max=num[0];
		int min=num[0];
		
		for(int a:num){
			if(a>max){
				max=a;
			}//if
			if(a<min){
				min=a;
			}//if
		}//for
		
	//	for(int i=0;i<num.length;i++){
	//		if(max<num[i]){
	//			max=num[i];
	//		}//if
	//		if(min>num[i]){
	//			min=num[i];
	//		}//if
	//	}//for
		System.out.println("최소값은 "+min+" 최대값은 "+max);
		
		
	} //main method

}//Work03 class
