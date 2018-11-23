package day17;
/*
 * Hardware 추상 클래스 만들기
 * 1. run() 추상메소드 선언
 * 2. connect() 추상메소드 선언
 * 
 * Hardware의 구현 클래스
 * 1. Mouse
 *    :connect() 할 때 "마우스 연결됨!" sysout
 *    :run() 할 때 "마우스 포인터가 움직인당!" sysout
 * 2. Keyboard
 *    :connect() 할 때 "이제 키보드 칠 수 있습니다!" sysout
 *    :run() 할 때 "타이핑 중 .." sysout
 */
abstract class Hardware{
	abstract void run();
	abstract void connect(); 
}

class Mouse extends Hardware{
	@Override
	void connect() {
		System.out.println("마우스 연결됨!");
	}
	@Override
	void run() {
		System.out.println("마우스 포인터가 움직인당!");
	}
}

class Keyboard extends Hardware{
	@Override
	void connect() {
		System.out.println("이제 키보드 칠 수 있습니다!");
	}
	@Override
	void run() {
		System.out.println("타이핑 중 ..");
	}
}

public class Quiz02 {//main class

	public static void main(String[] args) {
		//객체 배열 만드세요
		//배열원소로 Mouse와 Keyboard 객체를 넣으세요
		Hardware[] hard = new Hardware[] {new Mouse(), new Keyboard()};
		//확장 for문 이용하여 run()과 connect()호출해보세요
		for(Hardware h:hard){
			h.connect();
			h.run();
		}
		//Hardware 클래스의 객체를 생성해보세요
		//그래서 run()을 호출해보세요
		Hardware h1=new Hardware(){
			@Override
			void connect() {	};
			@Override
			void run() {	};
		};
		h1.run();
		
	}//main method

}//Quiz02 class
