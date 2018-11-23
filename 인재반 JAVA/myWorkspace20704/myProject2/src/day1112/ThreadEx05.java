package day1112;
/*
 * <ThreadŬ������ �������� �޼���>
 * 1. void start() : �����带 ����
 * 2. void stop() : �����带 ����
 * 					==> ������� �ڿ��� �ҿ����� ���·� ���ܵ�
 * 3. void interrupt() : �������� �����忡 ���ͷ�Ʈ�� �ɾ ����
 *                       ==> �����ϰ� ����
 * 4. static void sleep() : �־��� �ð����� ���
 * 5. void join() : �����尡 ����ɶ����� ���
 */
class StopThread implements Runnable{

	@Override
	public void run() { //�������� 1�ʸ��� ���Ѵ�� ���
		try {
		while(true) {
			System.out.println("������");
				Thread.sleep(1000);
			}//end of while
		}catch (InterruptedException e) {
				System.out.println("����");
				//���ͷ�Ʈ ������ "����" ���
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
