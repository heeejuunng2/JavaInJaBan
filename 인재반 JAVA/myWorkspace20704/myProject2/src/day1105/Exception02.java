package day1105;

import javax.swing.JOptionPane;

public class Exception02 {//main class

	public static void main(String[] args) {
		int result=0, n1=1,n2=1;
		
		try {
			String s =JOptionPane.showInputDialog(null, "�����Է�:", "�Է�", JOptionPane.QUESTION_MESSAGE);
			if(s==null) {
				JOptionPane.showMessageDialog(null, "������ �Է��ϼ���:");
				return;
			} //���ó��
			n1 = Integer.parseInt(s);
			n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "�����Է�:", "�Է�", JOptionPane.QUESTION_MESSAGE));
			
			result = n1 / n2;
			JOptionPane.showMessageDialog(null, "��:"+result,"������",JOptionPane.PLAIN_MESSAGE);
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "����(����)�� �Է��ϼ���:","�Է�",JOptionPane.QUESTION_MESSAGE);
			e.printStackTrace();
		}catch(ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "0�Է� �Ұ�","������",JOptionPane.PLAIN_MESSAGE);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "���߻�Ȳ�߻�");
		}
		
	}//end of main method

}//end of main class
