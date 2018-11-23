package day1112;

import javax.swing.JOptionPane;
/*
 * <daemon thread(����������)>
 * ��Ƽ������� 2�� �̻��� �����尡 ���������� ����
 * ���ν����尡 ����Ǿ��� �� �ٸ� ������� ����մ�. ==> ����
 *   ==>�ٸ� �����带 ����������� �����ϸ� ��
 * ���ǻ���) start()�ϱ� ���� setDaemon(true)�� ȣ��
 */
class Time implements Runnable{

	@Override
	public void run() {
		//10�� 9�� 8��....0�� ����ϵ��� �������̵�
		for(int i=10;i>=0;i--) {
			System.out.println(i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//�ƹ��͵� ���ϰ� ���
			}
		}
	}
	
}//end of Time class

public class ThreadEx07 {//main class

	public static void main(String[] args) {
		//���α׷� ���� ��� -> 10�� ī��Ʈ -> ���α׷� ��(ī��Ʈ ���ٰ� ����)
		JOptionPane.showMessageDialog(null, "���α׷� ����");
		
		Thread t = new Thread(new Time());
		t.setDaemon(true);
		t.start();
		
		JOptionPane.showMessageDialog(null, "���α׷� ��");
	}//end of main method

}//end of main class
