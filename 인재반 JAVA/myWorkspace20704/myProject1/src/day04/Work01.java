package day04;
/*
 * ���� ���� ���α׷�
 */
import java.util.Scanner;

public class Work01 { //main class

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;  //���ѷ��� �ۿ� �־���� �ܾ� ����
		
		while(true){
			System.out.println("--------------------------");
			System.out.println("1.���� 2.��� 3.��ȸ 4.����");
			System.out.println("--------------------------");
			int a=sc.nextInt();
			
			if(a==1){
				System.out.println("�����Ͻ� �ݾ��� �Է��ϼ���.");
				int money=sc.nextInt();
				sum+=money; 
				System.out.println("���������� ���� �Ǿ����ϴ�");
				}//end of if
			if(a==2){
				System.out.println("����Ͻ� �ݾ��� �Է��ϼ���.");
				int money=sc.nextInt();
				if(sum>=money){
					sum-=money;
					System.out.println("����� �Ϸ�Ǿ����ϴ�.");}
				else if(sum<money)
					System.out.println("�ܾ��� �����մϴ�.");  
					}
			if(a==3)
				System.out.println("���� �ܾ��� "+sum+"�Դϴ�.");
			if(a==4)
				break;
			
		}//end of while
		

	}//end of main method

}//end of Work01 class
