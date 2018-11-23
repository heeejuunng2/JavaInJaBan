package day11;

import day15.Person;

/*
 * <package>
 * : 폴더와 같은 개념(동네의 개념)
 * 1) 클래스들은 반드시 패키지에 포함되어야 함
 * 2) 하나의 패키지에 클래스이름이 똑같으면 안됨!!
 * 
 * <다른 package의 class를 사용하는 방법>
 * 1. 사용하고자 하는 클래스의 풀네임을 쓴다(패키지명.클래스명)
 * 2. import키워드 사용
 * 	     형식 : import 패키지명.클래스명;
 * 	  	  : import 패키지명.*;
 */
public class Work01 {//main class

	public static void main(String[] args) {
		day15.Person p=new day15.Person();
		
		Person p1=new Person();
		
		//System.out.println(p1.name);
		
	}//main method

}//Work01 class
