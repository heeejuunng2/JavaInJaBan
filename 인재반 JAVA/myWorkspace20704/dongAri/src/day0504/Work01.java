package day0504;
/*
 * ������ ���� Scanner�� �Է¹޾� ū����� ���
 * (��: 30,29,50 �Է� -> 50,30,20 ���)
 */

import java.util.Scanner;

class Srt{
	//�������
	int su1, su2, su3; //�Է¹��� ��
	Scanner sc;
	
	//������
	public Srt(){
		sc=new Scanner(System.in);
	}
	
	//�Է¹޴� �޼���
	void input(){
		System.out.println("�� ���� ���� �Է��ϼ���");
		su1=sc.nextInt();
		su2=sc.nextInt();
		su3=sc.nextInt();
	}//input method
	
	//�Է¹��� ���� �����ϴ� �޼���
	void sort(){
		//ū ���� ã�Ƽ� su1�� �ֱ�
		if(su2>su1 && su2>su3) { //su2�� ���� ū���
			//su2�� su1�� ��ȯ
			int t=su2;
			su2=su1;
			su1=t;
		}else if(su3>su2&&su3>su1){ //su3�� ���� ū���
			//su3�� su1�� ��ȯ
			int t=su3;
			su3=su1;
			su1=t;
		}//�Ѵ� �ش� �ȵȰŸ� �ڵ����� su1�� ���� ū ����� 
		
		//�߰����� ã�Ƽ� su2�� �ֱ�
		if(su2<su3){
			//su2�� su3�� ��ȯ
			int t=su2;
			su2=su3;
			su3=t;
		}
		
	}//sort method
	
	//����ϴ� �޼���
	void show(){
		System.out.println("ū����� ���");
		System.out.println(su1+" > "+su2+" > "+su3);
	}//show method
	
	void run(){
		input();
		sort();
		show();
	}
	
}//Srt class

public class Work01 { //main class

	public static void main(String[] args) {
		Srt srt=new Srt();
		srt.run();

	}//main method

}//Work01 class
