package day02;

import javax.swing.JOptionPane;

/*
 * jop��� Ÿ�����ϰ� ��Ʈ��+�����̽�
 * JOptionPane.showInputDialog("�Է��ϼ����");
 * JOptionPane.showMessageDialog(null,"��Ÿ����");
 * ���ڿ�==> ����
 * Integer.parseInt(JOptionPane.showInputDialog("�Է��ϼ����"));
 */
public class Work03 { //main class 

	public static void main(String[] args) {
		//jop�� �̿��Ͽ� �� �л��� �̸��� �Է¹ް�, �̰��� ���
		String name="";
		for(int i=1;i<=3;i++) {
			String input = JOptionPane.showInputDialog(i+"��° �̸��Է�");
			name += input + "	";
		}//for��
		JOptionPane.showMessageDialog(null, name);

	}//main class ��

}//class Work03 ��
