package day01;

import java.util.Scanner;

import javax.swing.JOptionPane;

//jop�� �̿��Ͽ� ���̸� �Է¹ް�
// "����� 00���̱���" ���
// "����� 10���� ���̴� 00 ���Դϴ�" ���
public class Quiz01 {

	public static void main(String[] args) {
		
		//JOptionPane.showInputDialog("����� ���̸� �Է��ϼ���");
		
		int age = Integer.parseInt(
					JOptionPane.showInputDialog(
						"����� ���̸� �Է��ϼ���"));
		JOptionPane.showMessageDialog(null,
					"����� ���̴�"+age+"�� �̱���"+
					" ����� 10�� �� ���̴�"+(age+10)+"�Դϴ�");
		}
	}
