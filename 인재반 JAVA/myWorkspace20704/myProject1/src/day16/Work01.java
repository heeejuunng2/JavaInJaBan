package day16;

import day11.Work02;

public class Work01 {//main class
	//Work02와 다른 패키지, 다른 클래스
	
	public static void main(String[] args) {
		//public만 접근가능
		Work02 w=new Work02();
		System.out.println(w.s1);
		w.m1();
	}//main method

}//Work01 class
