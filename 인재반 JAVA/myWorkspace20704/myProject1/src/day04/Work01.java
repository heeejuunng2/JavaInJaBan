package day04;
/*
 * 계좌 관리 프로그램
 */
import java.util.Scanner;

public class Work01 { //main class

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;  //무한루프 밖에 넣어야함 잔액 저장
		
		while(true){
			System.out.println("--------------------------");
			System.out.println("1.예금 2.출금 3.조회 4.종료");
			System.out.println("--------------------------");
			int a=sc.nextInt();
			
			if(a==1){
				System.out.println("예금하실 금액을 입력하세요.");
				int money=sc.nextInt();
				sum+=money; 
				System.out.println("성공적으로 예금 되었습니다");
				}//end of if
			if(a==2){
				System.out.println("출금하실 금액을 입력하세요.");
				int money=sc.nextInt();
				if(sum>=money){
					sum-=money;
					System.out.println("출금이 완료되었습니다.");}
				else if(sum<money)
					System.out.println("잔액이 부족합니다.");  
					}
			if(a==3)
				System.out.println("현재 잔액은 "+sum+"입니다.");
			if(a==4)
				break;
			
		}//end of while
		

	}//end of main method

}//end of Work01 class
