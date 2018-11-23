package day10;

class Person{
	String name;
	String address;
	String tel;
	int age;
	
	Person(){
		
	}
	
	Person(String name,String address,String tel){
		this.name=name;
		this.address=address;
		this.tel=tel;
	}
	
	Person(String name,String address,String tel,int age){
		this(name,address,tel);
		//this() : 자신의 생성자를 호출
		this.age=age;
	}
	//생성자 선언
	//반환형이 X
	//내가 만든 생성자가 있다면 기본생성자 안만들어짐
	//내가 만든 생성자가 없다면 기본생성자 JVM이 만들어줌
}
public class Work03 {//main class

	public static void main(String[] args) {
		Person p=new Person(); //Person() : 생성자, 초기화 담당
// 		p.name="pika";
//		p.address="ansan";
//		p.age=10;
//		p.tel="010-2222-9999";

	}//main method

}//Work03 class
