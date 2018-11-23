package day06;

import javax.swing.JOptionPane;

/*
 * <Quiz01>
 * 1. 5������ ������ �����ϴ� double�� �迭�� �����Ѵ�
 * 2. jop�� 5������ ������ ..�Է¹޾� �迭�� �����Ѵ�
 * 	  (�� : "1��° �����Է�(1~100�� �Ǽ�)�� �Է�" �̶�� â�� ��� ������ �Է¹޴´�)
 * 3. �Էµ� ���� 5���� �ִ�����. �ּ������� jop�� ����Ѵ�
 * 	  (��¿�: 74.2/88.9/94.1/90.8/80.6)
 * 			�ְ����� : 94.1
 * 			�ּ����� : 74.2
 * 
 * continue
 * -> �ݺ��������� ��밡��
 * �ݺ��� �����Ű�� ���� �ƴ϶� ���ӹ����� �ǳʶ��
 * for�� : continue���� ������ ���������� ������
 * while�� : continue���� ������ ���ǽ����� ���ϴ�
 */
public class Work04 { //main class

	public static void main(String[] args) {
		double[] grade=new double[5];
		for(int i=0;i<grade.length;i++){
		double a=Double.parseDouble(
				JOptionPane.showInputDialog(
						i+1+"��° ������ �����Է�(1~100�� �Ǽ�)"));
		if(a<0||a>100){
			JOptionPane.showMessageDialog(null, i+1+"��° ���� �߸��Է�..�ٽ��Է�");
			i--;
			continue;	
		}//if
		grade[i]=a; //�����Է��� ����� �Ȱ��, �迭�� ���� ����
		}//for
		
		//�迭�� ��� ���� ���
		String str=""; //������� ������ ����
		for(double b:grade){
			str+=b+"/";
		}//Ȯ��for
		
		//�ִ밪�� �ּҰ� ���ϱ�
		double max=grade[0]; double min=grade[0];
		for(double b:grade){
			if(b>max) max=b;
			else if(b<min) min=b;
		}//Ȯ�� for
		
		str+="\n�ְ�����: "+max+"\n�ּ�����: "+min;
		JOptionPane.showMessageDialog(null, str);
	} //main method

} //Work04
