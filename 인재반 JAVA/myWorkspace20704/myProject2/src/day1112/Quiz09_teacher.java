package day1112;

import javax.swing.JOptionPane;

/*
 * 콘솔창에는 1초부터 카운트가 되고있고
 * 구구단 문제가 jop로 계속 나오고 있고
 * 구구단을 5문제 맞히면 경과된 초를 출력
 */
class Count3 extends Thread{
	int i; //초
	@Override
	public void run() {
		while(true) {
			System.out.println(++i+"초");
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
				JOptionPane.showMessageDialog(null, "정답~!\n정답수:"+ansCount);
			}else {
				JOptionPane.showMessageDialog(null, "땡~!\n정답수:"+ansCount);
			}
			
		}//while
		
		JOptionPane.showMessageDialog(null, "구구단5문제 푼시간 : "+t.i+"초");
		
	}//end of main method

}//end of main class
