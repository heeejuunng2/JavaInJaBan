package day1112;
/*
 * <ThreadŬ������ �޼ҵ�>
 * 1. String getName() : ������ �̸��� ��ȯ
 * 2. void setName() : �������� �̸��� ����
 * 3. int getPriority(): �������� �켱���� ���� ��ȯ
 * 4. void setPriority(): ������� �켱���� ���� ����
 *    cf) �켱���� :1(����)~10(�ְ�), �⺻���� 5
 *               �켱������ ���� ���ǵ尡 start()�� �ʰ��ص� ��������
 * 5. static Thread currentThread() : ���� �������� �����带 ��ȯ 
 */
class MyThread extends Thread{
	@Override
	public void run() {
		//���� �������̸��� "������"�� ����
		setName("������");
		setPriority(10);
		
		System.out.println("���� �������� ������ ����:"
							+Thread.activeCount());
		System.out.println("���� ������ �̸�:"
							+Thread.currentThread().getName());
		System.out.println("���� ������ �켱����:"
							+Thread.currentThread().getPriority());
	}
}//end of MyThread class

public class ThreadEx03 {//main class

	public static void main(String[] args) {
		//���� ������ �̸��� "���ν�����"�� ����
		Thread.currentThread().setName("���ν�����");
		
		System.out.println("main������ ����");
		
		MyThread mythread = new MyThread();
		mythread.start();
		
		System.out.println("main�� ���� ������ ��");
		
	}//end of main method

}//end of main class
