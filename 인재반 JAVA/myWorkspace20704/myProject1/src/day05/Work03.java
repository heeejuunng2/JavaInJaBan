package day05;

import javax.swing.JOptionPane;

/*
 * �ο����� jop�� �Է¹޾Ƽ�
 * �ο��� ��ŭ�� �̸��迭�� ��ȭ��ȣ �迭�� �����
 * ������� �̸��� ��ȭ��ȣ�� �Է��Ѵ�(1��°, 2��° ~~)
 * �Է¹��� �̸��� ��ȭ��ȣ�� ����Ѵ�
 */
public class Work03 {// main class

	public static void main(String[] args) {
		//String person=JOptionPane.showInputDialog("�ο����� �Է��ϼ���");
		int person2=Integer.parseInt(JOptionPane.showInputDialog("�ο����� �Է��ϼ���"));
		
		String[] name=new String[person2];
		String[] phonnum=new String[person2];
		
		//�Է¹��� ������ �迭�� ���� ����
		for(int i=0;i<person2;i++){
			name[i]=JOptionPane.showInputDialog((i+1)+"��° �̸� �Է�");
			phonnum[i]=JOptionPane.showInputDialog((i+1)+"��° ��ȭ��ȣ �Է�");
		}//for
		
		String str="";
		for(int i=0;i<person2;i++){
			str+=name[i]+"���� ��ȭ��ȣ�� "+phonnum[i]+"�Դϴ�.\n";
		}//for
		
		JOptionPane.showMessageDialog(null, str);

	}//main method

}//Work03 class
