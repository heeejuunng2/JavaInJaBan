package day09;
/*
 * 1. 일반클래스 선언 : Tv
 * - 필드: no(tv번호), power(전원상태), channel(현재 채널번호)
 * 
 * 2.객체를 1개 생성하고, 필드에 값을 준다
 *   (1, false, 5)
 */
class Tv{
	//멤버변수 = 필드 : 객체의 모양
	int no , channel;
	boolean power;
	
}//tv class

public class Work01 {//main class
	
	public static void main(String[] args) {
		//래퍼런스 변수 : 클래스명 변수명;
		Tv tv=null;
		tv=new Tv();
		
		tv.no=1;
		tv.power=false;
		tv.channel=5;
		
		Tv tv1=new Tv();
		tv1.no=2;
		tv1.power=true;
		tv1.channel=10;
		
	}//main method
	
}//Work01 class



//객체 메모리에 생성됨 객체를 설계하는것은 클래스  
//클래스 ex> 설계도
//객체란 : new 명령어로 클래스의 내용대로 메모리에 만들어진 것 ex>집
//래퍼런스 변수는 주소를 저장한곳 ex> 집 문서
//클래스는 멤버변수 & 메소드로 이루어져 있음
//메소드(함수)->객체의 동작 : 일하는 기계
//메소드비유 ) 
//빵재료가 들어가는 통로 -> 밀가루 소금 등-> 밀가루 소금 반죽 빵만듬-> 빵 생성
//통로: 메개변수
//재료(들어가는거): 인자값
//반죽하는곳:메서드 본체
//결과 : 리턴값
//반환 -> return값 있음 -> 메서드 호출하고 저장하기 
//출력(반환X)->void->메서드 호출하고 저장안해도됨