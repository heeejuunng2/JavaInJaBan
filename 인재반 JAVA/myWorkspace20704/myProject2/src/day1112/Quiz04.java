package day1112;

import javax.swing.JOptionPane;

class MyTh implements Runnable{

	@Override
	public void run() {
		String str = JOptionPane.showInputDialog("���ڿ� �Է�:");
		JOptionPane.showMessageDialog(null, str,"���ڿ�",JOptionPane.PLAIN_MESSAGE);
	}
	
}//end of MyTh class

public class Quiz04 {

	public static void main(String[] args) {//main class
		//<Quiz01>
		//10�� ī��Ʈ�ٿ� & jop�� ���ڿ� �Է¹޾� ����� ���ÿ� ó���ϼ���
		Thread mythread = new Thread(new MyTh());
		mythread.start();
		
		for(int i=10;i>0;i--) {
				System.out.println(i+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main method

}//end of main class
