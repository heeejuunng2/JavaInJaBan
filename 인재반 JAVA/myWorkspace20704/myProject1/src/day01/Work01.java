package day01;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * <�ڷ� �Է¹ޱ�>
 * 1. Scanner Ŭ����
 * - �ܼ�â���� �Է¹�����
 * - Scanner ��� ġ��, import�Ѵ�
 * 
 * 2. JOptionPane Ŭ����
 * - �ܼ�â ��� ���� â�� ��� �Է¹��� ��
 * - jop��� ġ�� �ڵ��ϼ� �Ѵ�
 * - JOptionPane Ŭ������ import�Ѵ�
 * - �Էµ����ʹ� ������ ���ڿ��̴�
 * - �Է¹��ڿ��� �ٸ� ������ �ٲ� ���� �Ľ��� �ؾ��Ѵ�
 * - Integer.parseInt()
 * - Double.paresDouble()
 */

public class Work01 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=sc.nextInt();
		
		System.out.println(i+"�� �Է��ϼ̱���");
		
		
		int c=Integer.parseInt(
				JOptionPane.showInputDialog(
						"���ڸ� �Է��ϼ���"));
		//�����͸� �Է¹��� ��
		
		//System.out.println(c+"�� �Է��ϼ̱���");
		
		JOptionPane.showMessageDialog(null,c+"�� �Է��ϼ̱���");
		//�޼����� ���ο� â�� �����ٶ�
	}
}
