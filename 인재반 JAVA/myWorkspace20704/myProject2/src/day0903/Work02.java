package day0903;
/*
 * <Quiz>
 * 나는 S전자 제품개발부 연구원이다.
 * 1. 모든 전자제품에 포함되어야 하는 제어 부분(Controllable)이 필요
 *   1)모든 전자제품에는 전원을 온오프(turnOn, turnOff)하는 기능이 있으며,
 *     라이트(light) 및 초기화(reset)기능을 할 수 있다.
 *   2)라이트 및 초기화 기능을 미리 구현해 놓아서 필요할 때 사용할 수 있어야 한다.
 *   3)라이트 기능은 자식클래스에서 오버라이딩 할 수 있다.
 *   
 * 2. 무선 제어 부분(RemoteControllable)은 제어부분 외에 다음 기능이 추가로 필요하다
 *    1)무선으로 전원을 온오프(remoteOn,remoteOff)하는 기능
 */
interface Controllable{
	void turnOn();
	
	void turnOff();
	
	default void light() { //오버라이드 O
		System.out.println("불이 들어온다");
	}
	
	static void reset() {//오버라이드 X
		System.out.println("초기화");
	}
}
interface Potable{ //기능 없이 그룹으로 묶기 위해 존재해도 가능
	void inMyBag();
}
interface RemoteControllable extends Controllable{
	void remoteOn();
	
	void remoteOff();
	
}
class Computer implements Controllable{
	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("컴퓨터 전원 OFF");
	}
	@Override
	public void light() {
		System.out.println("파란색 빛이 반짝인다");
	}
}
class Dryer implements Controllable, Potable{
	@Override
	public void turnOn() {
		System.out.println("드라이기 전원 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("드라이기 전원 끔");
	}
	void dry() {
		System.out.println("머리를 말리자 위이잉");
	}
	@Override
	public void inMyBag() {
		System.out.println("휴대 가능");
	}
}
class Tv implements RemoteControllable{
	@Override
	public void turnOn() {
		System.out.println("TV전원킴");
	}
	@Override
	public void turnOff() {
		System.out.println("TVzxxxx전원끔");
	}
	@Override
	public void remoteOn() {
		System.out.println("TV무선으로 킴");
	}
	@Override
	public void remoteOff() {
		System.out.println("TV무선으로 끔");
	}
	void changeChannel() {
		System.out.println("티비 채널 변경");
	}
}
class Notebook extends Computer implements Potable{
	@Override
	public void turnOn() {
		System.out.println("노트북 전원 ON");
	}
	@Override
	public void turnOff() {
		System.out.println("노트북 전원 OFF");
	}
	void search() {
		System.out.println("노트북으로 검색");
	}
	@Override
	public void inMyBag() {
		System.out.println("휴대 가능");
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Controllable[] c = {new Tv(), new Computer(), new Notebook(),
							new Dryer()};
		//확장 for문 이용하여 휴대가능한 전자제품은 inMyBag호출,
		//그렇지 않은건 turnOn()메소드 호출
		for(Controllable control:c) {
			if(control instanceof Potable) {
				((Potable) control).inMyBag();
			}else {
				control.turnOn();
			}
		}
		
	}//end of main method

}//end of Work02 class
