package day16;

import day11.Work02;

public class Work02c extends Work02{
	//Work02 클래스와 다른 패키지, 상속 클래스
	public static void main(String[] args) {
	//public,protected 접근 가능
		Work02c wc=new Work02c();
		System.out.println(wc.s1+wc.s3);
		wc.m1();
		wc.m3();
		
	}
}
