package day1112;

import javax.swing.JOptionPane;

/*
 * ������ ���� 1���� �������� ����, ���Է¹ް� ���俩�θ� ���
 * �׷��� 10�� �ȿ� ������ WIN, �ƴϸ� LOSE
 * 
 * ���� ��°�, ���Է�, ���俩�δ� jop�̿�
 * 10�� ī��Ʈ�� �ַܼ� ���
 */
class Timer2 extends Thread{
	boolean check = true;

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
		check = false;
	}
	
}//end of Timer2  class
public class Quiz08_teacher {//main class

	public static void main(String[] args) {
		Timer2 t = new Timer2();
		t.setDaemon(t.check);
		t.start();
		
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*8)+2;
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, n1+"*"+n2+"= ?"));
		
		if(input==n1*n2) {
			if(t.check) JOptionPane.showMessageDialog(null, "WIN");
			else JOptionPane.showMessageDialog(null, "Lose");
		}else {
			JOptionPane.showMessageDialog(null, "������ �ƴմϴ�");
		}
	}//end of main method

}//end of main class
