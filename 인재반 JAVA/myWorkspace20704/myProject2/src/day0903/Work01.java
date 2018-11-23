package day0903;
/*
 * 추상클래스는 객체 생성 X 구현클래스를 상속받아야지만 객체생성 가능
      1)추상클래스가 가질 수 있는것 :
      필드, 생성자, (static안붙은거)인스턴스 메소드, 클래스 메소드, "추상메소드"
      인터페이스는 추상클래스보다 더 추상적임
      2)인터페이스가 가질 수 있는것:
      상수 ,클래스 메소드(오버라이드X),추상메소드(오버라이드O)
		,디폴트메소드(오버라이드 해도되고 안해도됨)
	-> 두개의 부모는 상속 받지 못함, 두개의 인터페이스 구현은 가능함 
	    하나의 클래스가 구현,상속 동시에 가능, 인터페이스는 다중상속 가능
 */
/*
 * 추상화(클래스들의 공통점을 찾아 부모 만드는 작업)
 *   <-> 구체화(상속통해 자식클래스 구현)
 *   
 *   부모 만든것 : 클래스,추상클래스,인터페이스
 */
interface Vehicle{ //공통점 묶어서 만든애들 객체만들어지면 안됨
	//->추상클래스or인터페이스가 더 남
	//필드(변수) 없으므로 인터페이스
	void move(); //public abstract 생략, 추상메소드는 바디가 없음, 반드시 오버라이드 해야함
					//공통적으로 가지는 특징
		
	default void stop() {
		System.out.println("멈추다");
	}
	static void info() {
		System.out.println("탈것입니다");
	}
	
}
abstract class Car implements Vehicle{ //공통점 묶어서 만든애들 객체만들어지면 안됨
	int speed;
	String color;
	
	abstract void parking();//자동차만 가지고 있는 특징
	
	//-> 추상메서드를 오버라이드 하지 않고 다음 클래스로 미룰 수 있음
}
class Truck extends Car{
	double ton;
	
	@Override
	public void move() {
		System.out.println("트럭이 움직인다");
	}
	
	@Override
	void parking() {
		System.out.println("트럭이 주차중");
	}
	
	void load() {
		System.out.println("짐을 싣다");
	}
	void unload() {
		System.out.println("짐을 내리다");
	}
}

public class Work01 {//main class

	public static void main(String[] args) {
		//인터페이스 or 추상클래스 = 구현클래스 or 자식클래스의 객체
		Vehicle h = new Truck();
		h.move(); //오버라이드 된 내용 출력
		h.stop(); 
		//load()메소드 실행
		((Truck)h).load();
		//parking()메소드 실행
		((Car)h).parking();
		//info()메소드 실행
		Vehicle.info();
		
	}//end of main method

}//end of Work01 class
