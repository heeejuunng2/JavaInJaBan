package day01;

import javax.swing.JOptionPane;

/*
 * Math.random()�� Ȱ���Ͽ� ������ ������ �����ϰ�,
 *  �����Է½� "������~", ����� "��~"�� ����ϼ���
 *  (�̶�, ���ǿ����ڸ� �̿��ϼ���)
 *  ��, jop�� ��� ���
 */
public class Quiz02 {

	public static void main(String[] args) {
		//1. ���� 2���� �߻�
		// 2~9������ ����==> n1
		// 1~9������ ����==> n2
		int n1=(int)(Math.random()*8)+2;
		int n2=(int)(Math.random()*9)+1;
		//������ �Է¹޴´�
		int answer=Integer.parseInt(
				JOptionPane.showInputDialog(n1+"*"+n2+"= ?"));
		//2. ������ ���� ����� ��
		String result=n1*n2==answer?"������":"��";
		//if(n1*n2==answer)
			//jopshowinputdialog("������");
		//else
			//jopshowinputdialog("��");
		//3. ���
		System.out.println(result);
		JOptionPane.showMessageDialog(null, result);
	
		
	}

}
