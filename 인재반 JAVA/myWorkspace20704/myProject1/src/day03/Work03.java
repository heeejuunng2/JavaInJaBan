package day03;

import javax.swing.JOptionPane;

/*
 * ���ѷ���
 * : �߰��� ���ߴ� ������ �ݵ�� ���� break�� �̿��Ѵ�
 * 
 * while(true){
 * 	 //���ѹݺ�
 * }
 */
public class Work03 {//main class

	public static void main(String[] args) {
		while(true){
		String menu="-------------------------------\n"+
					"1. �Է�	 2. ����	 3. ����\n"+
					"-------------------------------\n";
		String input=JOptionPane.showInputDialog(menu);
		if(input.equals("1"))
			JOptionPane.showMessageDialog(null, "�Է¿Ϸ�");
		else if(input.equals("2"))
			JOptionPane.showMessageDialog(null, "�����Ϸ�");
		else if(input.equals("3"))
			break;
		else 
			JOptionPane.showMessageDialog(null, "�߸��Է��ϼ̽��ϴ�");
		}//end of while
				
		

	}//end of main method

}//end of Work03 class
