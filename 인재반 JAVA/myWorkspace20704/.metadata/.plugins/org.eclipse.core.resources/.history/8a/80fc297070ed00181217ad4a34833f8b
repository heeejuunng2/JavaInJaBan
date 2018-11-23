package day1112;

import javax.swing.JOptionPane;

/*
 * 콘솔창에는 1초부터 카운트가 되고있고
 * 구구단 문제가 jop로 계속 나오고 있고
 * 구구단을 5문제 맞히면 경과된 초를 출력
 */
class Count2 extends Thread{
	boolean check = true;
	int i;
	
	@Override
	public void run() {
		for(i=1;i>0;i++) {
			System.out.println(i+"초");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
		check = false;
	}
}//end of Count2 class
public class Quiz09 {//main class

	public static void main(String[] args) {
		Count2 c = new Count2();
		c.setDaemon(true);
	    c.start();
	    
	    while(true) {
	    	int count = 0;	
	    	
	    	int n1 = (int)(Math.random()*9)+1;
	    	int n2 = (int)(Math.random()*8)+2;
	    	int input = Integer.parseInt(JOptionPane.showInputDialog(null, n1+"*"+n2+"= ?"));
		
	    	if(input==n1*n2) {
	    		count++;
	    		if(count==5) {
		    		JOptionPane.showMessageDialog(null, c.i+"초만큼 경과됨");
		    		System.exit(0);
		    	}
	    	}else {
	    		JOptionPane.showMessageDialog(null, "정답이 아닙니다");
	    	}
		
	    }//while
		
	}//end of main method

}//end of main class
