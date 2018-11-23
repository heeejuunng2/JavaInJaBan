package day0504;
/*
 * 세개의 수를 Scanner로 입력받아 큰수대로 출력
 * (예: 30,29,50 입력 -> 50,30,20 출력)
 */

import java.util.Scanner;

class Srt{
	//멤버변수
	int su1, su2, su3; //입력받은 수
	Scanner sc;
	
	//생성자
	public Srt(){
		sc=new Scanner(System.in);
	}
	
	//입력받는 메서드
	void input(){
		System.out.println("세 개의 수를 입력하세요");
		su1=sc.nextInt();
		su2=sc.nextInt();
		su3=sc.nextInt();
	}//input method
	
	//입력받은 수를 정렬하는 메서드
	void sort(){
		//큰 수를 찾아서 su1에 넣기
		if(su2>su1 && su2>su3) { //su2가 제일 큰경우
			//su2와 su1을 교환
			int t=su2;
			su2=su1;
			su1=t;
		}else if(su3>su2&&su3>su1){ //su3이 제일 큰경우
			//su3과 su1을 교환
			int t=su3;
			su3=su1;
			su1=t;
		}//둘다 해당 안된거면 자동으로 su1이 제일 큰 경우임 
		
		//중간수를 찾아서 su2에 넣기
		if(su2<su3){
			//su2와 su3을 교환
			int t=su2;
			su2=su3;
			su3=t;
		}
		
	}//sort method
	
	//출력하는 메서드
	void show(){
		System.out.println("큰수대로 출력");
		System.out.println(su1+" > "+su2+" > "+su3);
	}//show method
	
	void run(){
		input();
		sort();
		show();
	}
	
}//Srt class

public class Work01 { //main class

	public static void main(String[] args) {
		Srt srt=new Srt();
		srt.run();

	}//main method

}//Work01 class
