package day12;
/*
 * 자식생성자 호출(객체 생성)=>부모생성자 호출=>
 * 부모객체 생성=>자식의 고유멤버 생성
 */
class Student extends Person{
	//Work01 클래스의 Person class 상속받음 
	String hakbun;
	
	Student(){
		super("길똥이",19,"01000000000"); //부모생성자 가져옴
		//"길똥이",19,"01000000000"이거 들어가면 매개변수있는 생성자 가져오고
		//"길똥이",19,"01000000000"안들어가면 기본생성자 가져옴
	}
}

public class Work04 {//main class

	public static void main(String[] args) {
		Student s=new Student(); 
		//부모생성자 호출됨, 
		//그래서 Person에 가봤더니 기본생성자가 없음 따라서 기본생성자 만들어줘야함
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.phone);
		System.out.println(s.hakbun);
	}//main method

}//Work04 class
