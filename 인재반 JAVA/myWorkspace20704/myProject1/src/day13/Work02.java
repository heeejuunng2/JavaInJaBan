package day13;
/*
 * <다형성의 한계점>
 * :부모로부터 물려받은 필드,메소드(오버라이드포함)만 사용할 수 있다
 *  (자식이 가진 고유한 멤버는 사용X)
 *  
 * <업캐스트와 다운캐스트>
 * 1. 업캐스트 :자식타입을 부모타입으로 바꿈(자동형변환)
 * 2. 다운캐스트 :부모타입을 자식타입으로 바꿈(강제형변환)
 */
class Car{
	String color;
	int door;
	void drive(){
		System.out.println("drive!!");
	}
	void stop(){
		System.out.println("stop!!");
	}
	public void siren() {
		// TODO Auto-generated method stub
		
	}
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}
class Ambulance extends Car{
	String siren;
	
	public void sound(){
		System.out.println("Siren!!");
	}
	@Override
	void drive() {
		System.out.println("Ambulance drive");
	}
	@Override
	void stop() {
		System.out.println("Ambulance stop");
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Car car=new Ambulance();
		Ambulance amb=new Ambulance();
		//Quiz>
		//car참조변수로 Ambulance객체가 가진 siren을 출력!!
		System.out.println(((Ambulance)car).siren);
		((Ambulance)car).sound();
		//같은 객체이지만 참조변수의 타입에 따라 접근할 수 있는
		//필드와 메서드가 달라진다
		//car.siren;
		//car.sound;
		
		//부모의 메서드를 오버라이드 한 경우, 부모타입의 참조변수로
		//접근 하더라도 오버라이드 된 내용이 실행된다
		car.drive();
		car.stop();
		
		Car car2=null;
		Ambulance amb2=new Ambulance();
		
		car2=amb2; //업캐스트(부모<-자식)
		amb2=(Ambulance)car2; //다운캐스트(자식<-부모)
	}//main method

}//Work02 class
