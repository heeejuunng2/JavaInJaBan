package day04;

import java.util.Scanner;

/*
 * <가위바위보 게임>
 * 1. 사용자로부터 가위(1),바위(2),보(3)중 하나를 입력받는다
 * 2. 컴퓨터는 1~3중 랜덤수로 가위,바위,보를 결정한다.
 * 3. 결과를 출력(이김/짐/비김)
 * 단, Scanner를 이용
 */
public class Work04 { //main class
	public static void main(String[] args) {
		System.out.println("가위(1),바위(2),보(3)중 하나를 입력");
		
		Scanner sc=new Scanner(System.in);
		
		int user=sc.nextInt();//내가 입력한 값
		int com=(int)(Math.random()*3)+1;
		String rs1=""; //사용자의 가위바위보 출력
		String rs2=""; //컴퓨터의 가위바위보 출력
		if(user==1)
			rs1="가위";
		else if(user==2)
			rs1="바위";
		else
			rs1="보";
		
		if(com==1)
			rs2="가위";
		else if(com==2)
			rs2="바위";
		else
			rs2="보";
		
		System.out.println("당신은 "+rs1+"입니다");
		System.out.println("컴은 "+rs2+"입니다");
		
		switch(com-user){
		case 0:
			System.out.println("무승부");
			break;
		case -1:
		case 2:
			 System.out.println("Win");
			 break;
		case -2:
		case 1:
			System.out.println("Lose");    }//end of switch
		
		/*  if(com-user==2||com-user==-1)
			System.out.println("Win");
		else if(com-user==1||com-user==-2)
			System.out.println("Lose");
		else
			System.out.println("Draw");  */
		
	}//end of main method
	
}//end of Work04 class