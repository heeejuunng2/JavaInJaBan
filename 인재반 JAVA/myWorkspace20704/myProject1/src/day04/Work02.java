package day04;

import java.util.Scanner;

/*
 * <Up and Down ���� �����>
 * 1. Scanner �̿��Ͽ� 1~100 ������ ���� �Է¹޴´�
 * 2. ��ǻ�Ͱ� �߻���Ų �������� ���Ͽ� ���⶧���� Up �Ǵ� Down���
 * 3. ������ ���, ���α׷��� �����ϸ� ������� ������� ���
 */
public class Work02 {//main class
	public static void main(String[] args) {
		int rnd=(int)(Math.random()*100)+1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1~100������ ���ڸ� �Է�");
			int a=sc.nextInt();
			if(rnd==a)
				break;
			if(rnd!=a){
				count++;
				if(a>rnd){System.out.println("Down");}
				if(a<rnd){System.out.println("Up");}
			}	
			
		}//end of while
		System.out.println("�����Դϴ� "+count+"�� ���� ���߼̽��ϴ�");
	}//end of main method
}//end of Work02 class
