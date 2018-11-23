package day06;
/*
 * <배열 활용3 : 배열 요소 섞기(shuffle) ==> 카드섞기, 로또번호 생성>
 * 1. 배열에 0~9의 값을 저장하고, 0/1/...8/9 를 출력
 * 2. 배열에 요소를 50번 섞어서 출력
 */
public class Work02 { //main class

	public static void main(String[] args) {
		int arr[]=new int[10];
		//배열의 요소에 값을 저장하고 출력
		System.out.println("배열 : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
			//System.out.print(i==arr.length-1?i:i+"/");
								//i가 맨 마지막 번호니? 맞으면 i 틀리면 i/
			System.out.print(arr[i]+"/");
		}//for
		
		System.out.println();
		
		for(int i=0;i<50;i++){ 
			//0~9까지의 랜덤수를 뽑는다
			int rnd=(int)(Math.random()*arr.length);
			//그 랜덤수에 해당하는 원소와 첫번째 원소를 교환한다
			int t=arr[rnd];
			arr[rnd]=arr[0];
			arr[0]=t;
			
		}//for
		
		System.out.println("섞기 결과 : ");
		for(int a:arr){
			System.out.print(a+"/");
		}//for
	} //main method

} //Work02 class
