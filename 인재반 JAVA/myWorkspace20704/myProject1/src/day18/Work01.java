package day18;
/*
 * <인터페이스(interface)> 
 *  :밑그림만 그려져 있는 기본설계도 (추상클래스보다 더 추상적임)
 * 사용목적
 *  :메소드의 이름을 통일하기 위해서 (구현클래스끼리 하나의 그룹으로 묶음)
 *  
 *  (public/default) interface 이름{
 *  	   //public static final 타입 상수명=값;
 *  	   //public abstract 타입 메소드(); //추상메소드
 *  	   //public default 타입 메소드(){} //디폴트 메소드
 *  	   //public static 타입 메소드(){}
 *  }
 *  class D implements A{}
 *  interface B extends E,F{} //인터페이스가 다른 인터페이스 상속받기 가능
 *  						  //인터페이스끼리 다중상속O
 *  						  //클래스끼리는 다중상속 안됨
 *  class C implements E,F{}  //클래스의 다중구현O
 */
class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오 킴");
	}
	@Override
	public void turnOff() {
		System.out.println("오디오 끔");
	}
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME){
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME){
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 오디오 볼륨:"+volume);
	}
} //Audio class

public class Work01 {//main class

	public static void main(String[] args) {
		RemoteControl r=new Audio();
		//인터페이스 참조변수로 구현클래스의 객체가 온다(다형성)
		//RemoteControl[] r2={new Audio()};
		r.turnOn();
		r.setVolume(5);
		r.setMute(false); //디폴트 메소드 호출
		RemoteControl.changeBattery();

	}//main method

}//Work01 class
