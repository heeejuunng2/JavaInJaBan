package day1112;
/*
 * 강제로 예외처리를 해야 사용할 수 있는 메소드들이 있다.
 * ex) Thread.sleep(long 밀리초)
 *     (1초 = 1000밀리초) : 밀리초만큼 일시정지(os를 대기상태로)
 * 이 메소드는 위험요소가 있기때문에 반드시 예외처리 해야함
 */
public class ThreadEx01 {//main class

	public static void main(String[] args) {
		for(int c=10;c>0;c--) {
			System.out.println(c+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//end of main method

}//end of main class
