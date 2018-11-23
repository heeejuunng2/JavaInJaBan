package day1112;
/*
 * <Thread클래스의 상태제어 메서드>
 * 1. void start() : 스레드를 실행
 * 2. void stop() : 스레드를 종료
 * 					==> 사용중인 자원을 불완전한 상태로 남겨둠
 * 3. void interrupt() : 실행중인 스레드에 인터럽트를 걸어서 중지
 *                       ==> 안전하게 종료
 * 4. static void sleep() : 주어진 시간동안 대기
 * 5. void join() : 스레드가 종료될때까지 대기
 */
class StopThread implements Runnable{

	@Override
	public void run() { //실행중을 1초마다 무한대로 출력
		try {
		while(true) {
			System.out.println("실행중");
				Thread.sleep(1000);
			}//end of while
		}catch (InterruptedException e) {
				System.out.println("종료");
				//인터럽트 만나면 "종료" 출력
			}//end of catch
		
	}//end of run method
	
}//end of StopThread class

public class ThreadEx05 {//main class

	public static void main(String[] args) {
		Thread t = new Thread(new StopThread());
		t.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		
		t.interrupt();
		
	}//end of main method

}//end of main class
