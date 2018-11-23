package day1112;
/*
 * 프로세스 = 실행중인 프로그램 ==> 자원 + 쓰레드(실제작업수행)
 * <멀티 스레드 프로그래밍>
 *  : 여러 쓰레드를 1개의 프로세스가 병렬처리
 *  - thread란 ? : 하나의 프로그램 흐름
 *  
 * <멀티 스레드 구현방법>
 *  1. Thread클래스 상속받음
 *  
 *  2. Runnable인터페이스의 구현
 *  
 */
class MyThread1 extends Thread{ //잘가5번
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("잘가");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}//end of MyThread1 class

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("내일보자");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}//end of MyThread2 class

public class ThreadEx02 {//main class
	//잘가 5번, 안녕 5번
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		//----------------------------------------
		
		//Thread 참조변수 = new Thread(Runnable r)
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();
		
		//----------------------------------------
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("내꿈꿔");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}});
		thread3.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("안녕");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}//end of main method

}//end of main class
