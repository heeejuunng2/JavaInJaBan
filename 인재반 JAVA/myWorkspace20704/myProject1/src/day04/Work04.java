package day04;

import java.util.Scanner;

/*
 * <���������� ����>
 * 1. ����ڷκ��� ����(1),����(2),��(3)�� �ϳ��� �Է¹޴´�
 * 2. ��ǻ�ʹ� 1~3�� �������� ����,����,���� �����Ѵ�.
 * 3. ����� ���(�̱�/��/���)
 * ��, Scanner�� �̿�
 */
public class Work04 { //main class
	public static void main(String[] args) {
		System.out.println("����(1),����(2),��(3)�� �ϳ��� �Է�");
		
		Scanner sc=new Scanner(System.in);
		
		int user=sc.nextInt();//���� �Է��� ��
		int com=(int)(Math.random()*3)+1;
		String rs1=""; //������� ���������� ���
		String rs2=""; //��ǻ���� ���������� ���
		if(user==1)
			rs1="����";
		else if(user==2)
			rs1="����";
		else
			rs1="��";
		
		if(com==1)
			rs2="����";
		else if(com==2)
			rs2="����";
		else
			rs2="��";
		
		System.out.println("����� "+rs1+"�Դϴ�");
		System.out.println("���� "+rs2+"�Դϴ�");
		
		switch(com-user){
		case 0:
			System.out.println("���º�");
			break;
		case -1:
		case 2:
			 System.out.println("Win");
			 break;
		case -2:
		case 1:
			System.out.println("Lose");    }//end of switch
		
		/*  if(com-user==2||com-user==-1)
			System.out.println("Win");
		else if(com-user==1||com-user==-2)
			System.out.println("Lose");
		else
			System.out.println("Draw");  */
		
	}//end of main method
	
}//end of Work04 class