package day03;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
 * Quiz02>
 * 정수 1개 입력 받고 2,3,5의 배수 판별하여 출력
 * 입력 6=> 2의 배수, 3의 배수
 * 입력 30=> 2의 배수, 3의 배수, 5의 배수
 * 입력 23=> 2,3,5의 배수 모두 아님
 */
public class Work02 {//main class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력:");
		int i=sc.nextInt();
		
			if(i%2==0)
				System.out.println(i+"는 2의 배수");
			if(i%3==0)
				System.out.println(i+"는 3의 배수");
			if(i%5==0)
				System.out.println(i+"는 5의 배수");
			if(i%2!=0&&i%3!=0&&i%5!=0)
				System.out.println("2,3,5의 배수 모두 아님");
		
	}//end of main method

}//end of Work02 class
