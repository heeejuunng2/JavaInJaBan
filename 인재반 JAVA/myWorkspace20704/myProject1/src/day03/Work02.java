package day03;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Quiz02>
 * ���� 1�� �Է� �ް� 2,3,5�� ��� �Ǻ��Ͽ� ���
 * �Է� 6=> 2�� ���, 3�� ���
 * �Է� 30=> 2�� ���, 3�� ���, 5�� ���
 * �Է� 23=> 2,3,5�� ��� ��� �ƴ�
 */
public class Work02 {//main class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int i=sc.nextInt();
		
			if(i%2==0)
				System.out.println(i+"�� 2�� ���");
			if(i%3==0)
				System.out.println(i+"�� 3�� ���");
			if(i%5==0)
				System.out.println(i+"�� 5�� ���");
			if(i%2!=0&&i%3!=0&&i%5!=0)
				System.out.println("2,3,5�� ��� ��� �ƴ�");
		
	}//end of main method

}//end of Work02 class
