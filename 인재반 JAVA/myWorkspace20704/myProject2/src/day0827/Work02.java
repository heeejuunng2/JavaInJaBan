package day0827;
/*
 * 1. Animal 클래스 : 부모클래스
 *    1)필드: body(String)
 *    2)toString 오버라이드
 *        : "동물" return
 *    
 * 2. Birds 클래스 : 자식클래스
 *    1)필드: wing(String)
 *    2)toString 오버라이드
 *        : "조류" return
 */
class Animal{
	String body="몸";
	
	void move() {
		System.out.println("움직이다");
	}
	
	void animal() {
		System.out.println("only animal's method");
	}
	
	static void info() {//상속 불가능
		System.out.println("Animal's static mehtod");
	}
	
	@Override
	public String toString() {
		return "동물";
	}
}
class Birds extends Animal{
	String wing="날개";
	
	@Override
	void move() { //상속받은 메소드
		System.out.println("날다");
	}
	
	void birds() {
		System.out.println("only birds' method");
	}
	
	static void info() {//부모의 info 메서드와 별개임
		System.out.println("Birds' static mehtod");
	}
	
	@Override
	public String toString() {
		return "조류";
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		Animal animal = new Animal();
		animal.animal();
		animal.move();
		Animal.info();
		System.out.println(animal.body);
		System.out.println("*******************");
		//참조변수 instanceof 클래스명
		//참조변수가 실제로 가리키는 객체타입을 알려주는 연산자
		System.out.println(animal instanceof Animal);
		System.out.println(animal instanceof Birds);
		System.out.println("*******************");
		
		animal = new Birds(); 
		//타입이 animal임 따라서 Birds꺼는 접근 불가능
		//상속된건 접근 가능
		animal.move();
		System.out.println(animal.body);
		Birds.info();
		
		//animal참조변수로 birds()메소드 접근
		((Birds)animal).birds();
		//animal참조변수로 wing필드 접근
		System.out.println(((Birds)animal).wing);
		System.out.println("*******************");
		System.out.println(animal instanceof Animal); //true
		System.out.println(animal instanceof Birds); //true
		System.out.println("*******************");
		
		Object[] objects= {new Animal(), new Birds()};
		
		for(Object o:objects) {
			System.out.println(o);
			//o.move(); Object클래스에 move()가 없어서 안됨
			
		}
		
		Animal[] animals = {new Animal(),new Birds()};
		for(Animal a:animals) {
			System.out.println(a);
			a.move();
		}
	}//end of main method

}//end of Work02 class
