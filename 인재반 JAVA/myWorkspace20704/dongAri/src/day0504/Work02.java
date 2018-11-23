package day0504;

import java.util.Scanner;

/*
 * 정수를 1개 입력받고, 각 자릿수의 총 합 출력
 * 123 => 6
 * 34 => 7
 * 1006 => 7
 * 
 * hint > 4231 입력 => 10
 * 1) 4321%10 => 1, 4321/10 =432
 * 2) 432%10 => 2, 432/10 = 43
 * 3) 43%10 => 3, 43/10 = 3
 * 4) 4%10 =>4, 4/10=0
 */
class Num{
	int num;
	int tot;
	Scanner sc;
	
	public Num(){
		sc=new Scanner(System.in);
		tot=0;
	}//생성자
	
	void input(){
		System.out.println("숫자 입력:");
		num=sc.nextInt();
	}//input method
	
	void tot(){
		while(num!=0){
			int rem=num%10;
			//4321%10=1
			int mok=num/10;
			//4321/10=432
			tot+=rem;
			//tot=0+1
			num=mok;
			//num=432
			
			// tot+=num%10;
			// num/=10;
			//
		}//while
		
	}//tot method
	
	void output(){
		System.out.println("각 자릿수의 총합은 :"+tot+"입니다");
	}//output method
	
	void run(){
		input();
		tot();
		output();
	}//run method
	
}

public class Work02 {//main class

	public static void main(String[] args) {
		Num num=new Num();
		num.run();
	}//main method

}//Work02 class

