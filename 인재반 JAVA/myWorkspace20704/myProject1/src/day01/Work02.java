package day01;
/*
 * <난수 생성>
 * -난수(랜덤수)란 무작위로 추출한 수
 * -자바에서는 Math.random()이라는 기능을 통해 난수를 생성
 * 			(0.0 ~ 0.9999... 까지 )
 * 			(int) 0.0~0.9999... => 0~9
 * -시작수부터 얼마개의 수를 추출할때(정수일때)
 *   -형식: (int)(Math.random()*얼마개)+시작수
 */
public class Work02 {

	public static void main(String[] args) {
		//1부터 10까지 출력(for문이용)
		
		for(int a=1;a<11;a++) {
			System.out.println((int)(Math.random()*10));
								//곱하기 한거를 int 로 바꾸는거
		}
		//1. 0부터 4까지의 난수를 발생
			System.out.println((int)(Math.random()*5));
			//0부터 4까지라서 *5
		//2. 1부터 5까지의 난수를 발생
			System.out.println((int)(Math.random()*5)+1);
			//1부터 5까지라서 *5, 1부터 시작하므로 +1
	}

}
