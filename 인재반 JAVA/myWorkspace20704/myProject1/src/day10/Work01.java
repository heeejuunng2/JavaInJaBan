package day10;
/*
 * <�⺻�� �Ű����� & ������ �Ű�����> �߿�!!
 * �⺻�� �Ű����� : ������ ���� �б⸸ ��
 * ������ �Ű����� : ������ ���� �а�, ������ ����(�ּҰ��� �Ѱ��ֱ� ����)
 * 
 * �޼ҵ� ==> ���
 * �޼ҵ� ����°�(�޼ҵ� ����) ==> �޼ҵ� ���(�޼ҵ� ȣ��)
 *  ���ڰ��� �־ �Ű������� ���ڰ��� ������ �޼ҵ尡 ����
 */

class Data1{
	int x;
	
}//Data1 class

class Data2{
	int y;
	
}//Data2 class

public class Work01 {//main class
	public static void change(int d1,int d2){
		int temp;
		temp=d1; 
		d1=d2;
		d2=temp;
	}//change method
	
	public static void change(Data1 d1,Data2 d2){
		int temp;
		temp=d1.x;
		d1.x=d2.y;
		d2.y=temp;
	}//change method
	
	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2();
		
		d1.x=1;
		d2.y=2;
		
		change(d1.x,d2.y); //d1�� �ִ� ���� �ѱ�
		System.out.println("x="+d1.x+" y="+d2.y);
		
		change(d1, d2); //d1������ �ѱ�
		System.out.println("x="+d1.x+" y="+d2.y);
		
	}//main method

}//Work01 class
