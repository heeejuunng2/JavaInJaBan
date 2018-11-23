package day0827;
/*
 * 상속의 목적: 1. 클래스 재사용 2. 다형성
 * 다형성 : 부모타입 참조변수에는 자식 객체가 올 수 있다.
 * Pokemon p = new Pikachu();
 * (Pikachu)p ->다운 캐스트(부모를 자식으로)
 * 모든 클래스의 조상: Object class
 * 오버라이드(오버라이딩): 부모의 메서드를 내가 수정하는 것
 * 오버로드(오버로딩): 새로운 메서드를 만드는것  
 */
class Person{
	String name;
	int age;
	
	Person(){
		
	}
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public String toString() { //클래스를 설명하는 말
		return "이름: "+name+" /나이: "+age;
	}
}

class Student extends Person{
	int hakbun;
	
	Student(){
		
	}
	Student(String name, int age, int hakbun){
		super(name, age);
		this.hakbun=hakbun;
	}
	
	@Override
	public String toString() {
		return super.toString()+" /학번: "+hakbun;
	}
}

class FrStudent extends Student{ //외국인 학생
	String nation; //국적
	
	FrStudent(){
		super(); //부모의 생성자 호출
	}
	FrStudent(String name, int age, int hakbun,String nation){
		//상속 받은 필드는 부모의 생성자로 초기화한다
		super(name, age, hakbun);
		this.nation=nation;
	}
	@Override
		public String toString() {
			return super.toString()+" / 국적: "+nation;
		}
}



public class Work01 {//main class

	public static void main(String[] args) {
		Person p= new Person();
		System.out.println(p.toString());
		System.out.println(p);
		
		FrStudent f = new FrStudent("푸린",10,20100,"미국");
		System.out.println(f.toString());
		
		Person[] parr= {new Person("망나뇽",8),
				     new Student("잠만보",15,20200),
				     new FrStudent("푸린",1,20100,"일본")};
		//for()(배열원소타입의 임시변수 선언: 배열명)
		for(Person p2:parr) {
			System.out.println(p2.toString());
		}
		
		Object[] object= {new Person("망나뇽",8),
			     new Student("잠만보",15,20200),
			     new FrStudent("푸린",1,20100,"일본")};
		for(Object o:object) {
			System.out.println(o.toString());
		}
		
	}//end of main method

}//end of Work01(main) class
