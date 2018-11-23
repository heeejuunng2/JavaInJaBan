package day1112;
/*
 * <Thread클래스의 메소드>
 * 1. String getName() : 스레드 이름을 반환
 * 2. void setName() : 스레드의 이름을 설정
 * 3. int getPriority(): 스레드의 우선순위 값을 반환
 * 4. void setPriority(): 스레드와 우선순위 값을 설정
 *    cf) 우선순위 :1(최저)~10(최고), 기본으로 5
 *               우선순위가 높은 스피드가 start()를 늦게해도 먼저실행
 * 5. static Thread currentThread() : 현재 실행중인 스레드를 반환 
 */
class MyThread extends Thread{
	@Override
	public void run() {
		//현재 스레드이름을 "스레드"로 설정
		setName("스레드");
		setPriority(10);
		
		System.out.println("현재 실행중인 스레드 갯수:"
							+Thread.activeCount());
		System.out.println("현재 스레드 이름:"
							+Thread.currentThread().getName());
		System.out.println("현재 스레드 우선순위:"
							+Thread.currentThread().getPriority());
	}
}//end of MyThread class

public class ThreadEx03 {//main class

	public static void main(String[] args) {
		//메인 스레드 이름을 "메인스레도"로 설정
		Thread.currentThread().setName("메인스레드");
		
		System.out.println("main스레드 시작");
		
		MyThread mythread = new MyThread();
		mythread.start();
		
		System.out.println("main이 속한 스레드 끝");
		
	}//end of main method

}//end of main class
