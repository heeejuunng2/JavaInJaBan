package day05;

import javax.swing.JOptionPane;

/*
 * <�迭 Ȱ�� ����1 : ���հ� ���>
 * 1. ������ �����ϴ� score�迭(ũ��5)�� �����Ѵ�.
 * 2. jop�� �̿�(�Է´�ȭ����: ����1�� ������ �Է� �̶�� ���) ���� �Է¹޴´�
 * 3. ������ ���հ� ����� jop�� ����Ѵ�
 * 	  (200,88,100,100,90�� �Է� -> ���� :478, ��� :95.6�� ��µǾ���� )
 * ��, ������ ���Ҷ��� Ȯ�� for���� �̿��Ұ�
 */
public class Work04 { //main class
 
	public static void main(String[] args) {
		//1.sum, avg���� ����
		int sum=0;
		double avg=0;
		//2.�迭 ����
		int[] score = new int[5];
		//3.���� �Է¹޾Ƽ� �迭�� ���� ����
		for(int i=0;i<score.length;i++){
			score[i]=Integer.parseInt(JOptionPane.showInputDialog("����"+(i+1)+"�� ������ �Է�"));
		}//for
		//4.sum�� ���Ѵ�(Ȯ��for)
		for(int i:score){
			sum+=i;
		}//for
		//5.avg�� ���Ѵ�
		avg=(double)sum/score.length;
		//jop�� ���
		JOptionPane.showMessageDialog(null,"���� ������ "+sum+"�̰� \n����� "+avg+"�Դϴ�");
	} //main method

} //Work04 class
