package day03;
//���⶧���� 5�� ������ ������ ��� ����(���ѷ���)

import javax.swing.JOptionPane;

public class Work04 { //main class
	public static void main(String[] args) {
		while(true){
		int rand=(int)(Math.random()*9)+1;//1~9
		String ans=JOptionPane.showInputDialog("5*"+rand+"=?");
		int answer=Integer.parseInt(ans); //������ȯ
		if(answer==5*rand){
			JOptionPane.showMessageDialog(null, "����");
			break;}//end of if
		else
			JOptionPane.showMessageDialog(null, "��!"); }//end of while
		JOptionPane.showMessageDialog(null, "�����մϴ�");
	}//end of main method
	
}//end of Work04 class
