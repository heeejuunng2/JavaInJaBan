package day03;

import javax.swing.JOptionPane;
//5���� ���⶧���� ������ ���� ����
public class Work05 {//main class

	public static void main(String[] args) {
		int count=0; //������� �����ϴ� ����
		double qcount=0; //�������� �����ϴ� ����
		while(count !=5){
		int rand=(int)(Math.random()*9)+1;//1~9
		String ans=JOptionPane.showInputDialog("5*"+rand+"=?");
		qcount++;
		int answer=Integer.parseInt(ans); //������ȯ
		if(answer==5*rand){
			count++;
			JOptionPane.showMessageDialog(null, "����\n"+
						"���� �����:"+count);		
		}//end of if
		else
			JOptionPane.showMessageDialog(null, "��!");
		}//end of while
		JOptionPane.showMessageDialog(null, "�����մϴ�. 5������ ���߼̽��ϴ�.\n������� "+
		count/qcount*100+"%�Դϴ�.\n���α׷��� �����մϴ�");
		//qcount�� double���̿����� int���̸� 0���� 
		
	}//end of main method

}//end of Work05 class
