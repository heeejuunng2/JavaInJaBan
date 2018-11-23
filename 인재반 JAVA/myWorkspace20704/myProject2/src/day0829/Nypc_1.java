package day0829;

import java.util.Scanner;

public class Nypc_1 {//main class

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳으로 바꿀 수를 입력하세요:");
		int n=sc.nextInt();
		if(n<1||n>1000) {
			System.out.println("오류");
		}
		for(int i=1;i<=n;i++) {
			int anw=sc.nextInt();
			System.out.print((char)anw+" ");
		}
	}//end of main method

}//end of Nypc_1 class
