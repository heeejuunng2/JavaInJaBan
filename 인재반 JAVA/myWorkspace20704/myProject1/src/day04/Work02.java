package day04;

import java.util.Scanner;

/*
 * <Up and Down 게임 만들기>
 * 1. Scanner 이용하여 1~100 사이의 수를 입력받는다
 * 2. 컴퓨터가 발생시킨 랜덤수와 비교하여 맞출때까지 Up 또는 Down출력
 * 3. 맞췄을 경우, 프로그램을 종료하며 몇번만에 맞췄는지 출력
 */
public class Work02 {//main class
	public static void main(String[] args) {
		int rnd=(int)(Math.random()*100)+1;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("1~100사이의 숫자를 입력");
			int a=sc.nextInt();
			if(rnd==a)
				break;
			if(rnd!=a){
				count++;
				if(a>rnd){System.out.println("Down");}
				if(a<rnd){System.out.println("Up");}
			}	
			
		}//end of while
		System.out.println("정답입니다 "+count+"번 만에 맞추셨습니다");
	}//end of main method
}//end of Work02 class
