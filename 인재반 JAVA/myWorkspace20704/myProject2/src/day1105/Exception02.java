package day1105;

import javax.swing.JOptionPane;

public class Exception02 {//main class

	public static void main(String[] args) {
		int result=0, n1=1,n2=1;
		
		try {
			String s =JOptionPane.showInputDialog(null, "정수입력:", "입력", JOptionPane.QUESTION_MESSAGE);
			if(s==null) {
				JOptionPane.showMessageDialog(null, "정수를 입력하세요:");
				return;
			} //취소처리
			n1 = Integer.parseInt(s);
			n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "정수입력:", "입력", JOptionPane.QUESTION_MESSAGE));
			
			result = n1 / n2;
			JOptionPane.showMessageDialog(null, "몫:"+result,"결과출력",JOptionPane.PLAIN_MESSAGE);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "숫자(정수)를 입력하세요:","입력",JOptionPane.QUESTION_MESSAGE);
			e.printStackTrace();
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "0입력 불가","결과출력",JOptionPane.PLAIN_MESSAGE);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "돌발상황발생");
		}
		
	}//end of main method

}//end of main class
