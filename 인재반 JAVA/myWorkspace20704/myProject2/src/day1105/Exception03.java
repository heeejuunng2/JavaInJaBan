package day1105;
/*
 * 
 */
public class Exception03 {//main class

	public static void main(String[] args) {
		int i=10, j=0, k=0;
		try {
			k = divide(i,j); //호출한 곳에서 예외처리
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}
		
	}//end of main method
	static int divide(int i, int j) throws ArithmeticException {
		return i/j;                   //여기서 발생할수 있는 예외를 throws로 선언
	}
}//end of main class
