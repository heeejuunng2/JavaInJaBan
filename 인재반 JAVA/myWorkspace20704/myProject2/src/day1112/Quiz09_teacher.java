package day1112;

import javax.swing.JOptionPane;

/*
 * �ܼ�â���� 1�ʺ��� ī��Ʈ�� �ǰ��ְ�
 * ������ ������ jop�� ��� ������ �ְ�
 * �������� 5���� ������ ����� �ʸ� ���
 */
class Count3 extends Thread{
	int i; //��
	@Override
	public void run() {
		while(true) {
			System.out.println(++i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
	}//end of run
}//end of Count3 class

public class Quiz09_teacher {//main class

	public static void main(String[] args) {
		Count3 t = new Count3();
		t.setDaemon(true);
		t.start();
		
		int ansCount=0;
		int n1, n2, input;
		
		while(ansCount !=5) {
			n1 = (int)(Math.random()*8)+2;
			n2 = (int)(Math.random()*9)+1;
			input = Integer.parseInt(JOptionPane.showInputDialog(null, n1+"*"+n2+"= ?"));
			
			if(input==n1*n2) {
				ansCount++;
				JOptionPane.showMessageDialog(null, "����~!\n�����:"+ansCount);
			}else {
				JOptionPane.showMessageDialog(null, "��~!\n�����:"+ansCount);
			}
			
		}//while
		
		JOptionPane.showMessageDialog(null, "������5���� Ǭ�ð� : "+t.i+"��");
		
	}//end of main method

}//end of main class
