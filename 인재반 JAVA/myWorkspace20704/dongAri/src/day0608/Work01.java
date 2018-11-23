package day0608;
/*
 * <Quiz01>
 * 임의의 수를 여러번 입력 받아 그 합과 평균을 구하는 프로그램
 * 단, 음수나 0을 입력하면 입력을 종료
 *     Scanner로 구현하세요
 *     새로운 클래스를 만들고, 메서드를 이용하여 구한다
 */

import java.util.Scanner;

class Calculate{		
	Scanner sc=new Scanner(System.in);
	int hap,count;
	double avg;
	
	void su1(){
		while(true){
			System.out.println("수 입력:");
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
		System.out.println("입력횟수:"+count+" 합:"+hap+" 평균:"+avg);
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
