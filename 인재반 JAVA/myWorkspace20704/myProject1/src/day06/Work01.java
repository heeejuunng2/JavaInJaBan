package day06;
/*
 * <배열 활용 2번째-문자열을 랜덤하게 출력하기>
 * 
 */

public class Work01 { //main class

	public static void main(String[] args) {
		String[] p={"피카츄","푸린","피츄","라이츄","꼬부기","잠만보","야도란"};
		
		for(int i=0;i<2;i++){ //랜덤하게 2번 출력
			int rnd=(int)(Math.random()*p.length); //0~6까지의 랜덤수
			
			System.out.println(p[rnd]+"(이)가 달린다");
		}//for
	}	//main method

} //Work01 class
