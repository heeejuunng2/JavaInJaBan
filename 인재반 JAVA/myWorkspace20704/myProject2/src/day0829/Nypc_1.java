package day0829;

import java.util.Scanner;

public class Nypc_1 {//main class

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("���ĺ����� �ٲ� ���� �Է��ϼ���:");
		int n=sc.nextInt();
		if(n<1||n>1000) {
			System.out.println("����");
		}
		for(int i=1;i<=n;i++) {
			int anw=sc.nextInt();
			System.out.print((char)anw+" ");
		}
	}//end of main method

}//end of Nypc_1 class
