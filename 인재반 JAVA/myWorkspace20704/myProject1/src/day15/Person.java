package day15;

import java.util.Scanner;

public class Person {
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	
	void input(){
		System.out.println("�̸� �Է�: ");
		name = sc.next();
		System.out.println("���� �Է�: ");
		age = sc.nextInt();
	}
	
	void show(){
		System.out.println("�̸�: "+name+"\n����: "+age);
		
	}
}
