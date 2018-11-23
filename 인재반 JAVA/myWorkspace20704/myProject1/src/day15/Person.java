package day15;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	
	void input(){
		System.out.println("이름 입력: ");
		name = sc.next();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
	}
	
	void show(){
		System.out.println("이름: "+name+"\n나이: "+age);
		
	}
}
