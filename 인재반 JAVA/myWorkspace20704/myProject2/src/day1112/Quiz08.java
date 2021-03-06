package day1112;

import javax.swing.JOptionPane;
/*
 * 구구단 문제 1개를 랜덤으로 낸뒤, 답입력받고 정답여부를 출력
 * 그런데 10초 안에 맞히면 WIN, 아니면 LOSE
 * 
 * 문제 출력과, 답입력, 정답여부는 jop이용
 * 10초 카운트는 콘솔로 출력
 */
class Count extends Thread{

	@Override
	public void run() {
		for(int i=10;i>=0;i--) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
}//end of Count class

public class Quiz08 {//main class

	public static void main(String[] args) {
		boolean bool = true;
		
		Count t = new Count();
		t.setDaemon(bool);
		t.start();
		
		int n1 = (int)(Math.random()*9)+1;
		int n2 = (int)(Math.random()*8)+2;
		int input = Integer.parseInt(JOptionPane.showInputDialog(null, n1+"*"+n2+"= ?"));
		
		if(input==n1*n2) {
			JOptionPane.showMessageDialog(null, "WIN");
		}else {
			JOptionPane.showMessageDialog(null, "정답이 아닙니다");
		}
		
		if(!bool) {
			JOptionPane.showMessageDialog(null, "LOSE");
		}
		
	}//end of main method

}//end of main class
