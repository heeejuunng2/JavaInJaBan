package day1112;

import javax.swing.JOptionPane;
/*
 * <daemon thread(보조스레드)>
 * 멀티스레드는 2개 이상의 스레드가 독립적으로 실행
 * 메인스레드가 종료되었을 때 다른 스레드는 살아잇다. ==> 위험
 *   ==>다른 스레드를 보조스레드로 설정하면 됨
 * 주의사항) start()하기 전에 setDaemon(true)를 호출
 */
class Time implements Runnable{

	@Override
	public void run() {
		//10초 9초 8초....0초 출력하도록 오버라이드
		for(int i=10;i>=0;i--) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//아무것도 안하고 대기
			}
		}
	}
	
}//end of Time class

public class ThreadEx07 {//main class

	public static void main(String[] args) {
		//프로그램 시작 출력 -> 10초 카운트 -> 프로그램 끝(카운트 세다가 종료)
		JOptionPane.showMessageDialog(null, "프로그램 시작");
		
		Thread t = new Thread(new Time());
		t.setDaemon(true);
		t.start();
		
		JOptionPane.showMessageDialog(null, "프로그램 끝");
	}//end of main method

}//end of main class
