package day0608;
/*
 * <Quiz01>
 * ������ ���� ������ �Է� �޾� �� �հ� ����� ���ϴ� ���α׷�
 * ��, ������ 0�� �Է��ϸ� �Է��� ����
 *     Scanner�� �����ϼ���
 *     ���ο� Ŭ������ �����, �޼��带 �̿��Ͽ� ���Ѵ�
 */

import java.util.Scanner;

class Calculate{		
	Scanner sc=new Scanner(System.in);
	int hap,count;
	double avg;
	
	void su1(){
		while(true){
			System.out.println("�� �Է�:");
			int a = sc.nextInt();
			if(a<=0){
				return;
			}
			hap+=a;
			count++;
		}
	}
	void su2(){
		avg=hap/count;
	}
	void su3(){
		System.out.println("�Է�Ƚ��:"+count+" ��:"+hap+" ���:"+avg);
	}
	void start(){
		su1();
		su2();
		su3();
	}
	
}
public class Work01 {//main class

	public static void main(String[] args) {
		Calculate c=new Calculate();
		c.start();
	}//main method

}//Work01 class
