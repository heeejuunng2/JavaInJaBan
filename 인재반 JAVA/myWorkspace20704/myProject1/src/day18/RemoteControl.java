package day18;

public interface RemoteControl {
	//상수
	int MAX_VOLUME=10; //앞에 public static final 생략됨 자바 컴파일러가 해줌
	int MIN_VOLUME=0;
	//추상 메소드
	void turnOn(); //public abstract 생략
	void turnOff();
	void setVolume(int volume);
	//디폴트 메소드
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리");
		}else{
			System.out.println("무음 해제");
		}
	}
	//클래스 메소드
	static void changeBattery(){
		System.out.println("건전지 교체해");
	}
}
