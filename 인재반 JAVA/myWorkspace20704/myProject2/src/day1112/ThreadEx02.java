package day1112;
/*
 * ���μ��� = �������� ���α׷� ==> �ڿ� + ������(�����۾�����)
 * <��Ƽ ������ ���α׷���>
 *  : ���� �����带 1���� ���μ����� ����ó��
 *  - thread�� ? : �ϳ��� ���α׷� �帧
 *  
 * <��Ƽ ������ �������>
 *  1. ThreadŬ���� ��ӹ���
 *  
 *  2. Runnable�������̽��� ����
 *  
 */
class MyThread1 extends Thread{ //�߰�5��
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("�߰�");
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
			System.out.println("���Ϻ���");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}//end of MyThread2 class

public class ThreadEx02 {//main class
	//�߰� 5��, �ȳ� 5��
	public static void main(String[] args) {
		MyThread1 thread1 = new MyThread1();
		thread1.start();
		
		//----------------------------------------
		
		//Thread �������� = new Thread(Runnable r)
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();
		
		//----------------------------------------
		
		Thread thread3 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("���޲�");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}});
		thread3.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("�ȳ�");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}//end of main method

}//end of main class
