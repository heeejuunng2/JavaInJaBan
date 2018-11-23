package day1112;

import javax.swing.JOptionPane;

class MyTh implements Runnable{

	@Override
	public void run() {
		String str = JOptionPane.showInputDialog("문자열 입력:");
		JOptionPane.showMessageDialog(null, str,"문자열",JOptionPane.PLAIN_MESSAGE);
	}
	
}//end of MyTh class

public class Quiz04 {

	public static void main(String[] args) {//main class
		//<Quiz01>
		//10초 카운트다운 & jop로 문자열 입력받아 출력을 동시에 처리하세요
		Thread mythread = new Thread(new MyTh());
		mythread.start();
		
		for(int i=10;i>0;i--) {
				System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}//end of main method

}//end of main class
