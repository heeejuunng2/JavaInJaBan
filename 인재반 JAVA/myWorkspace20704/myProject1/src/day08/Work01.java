package day08;
/*
 * 객체지향 프로그래밍(OOP)
 * 1. 클래스 ==> 설계도
 * 	  - 메인클래스(메인메소드O) ; 프로그램
 * 	  - 일반클래스(메인메소드X) ; 객체를 위한 설계도
 * 
 * 	  ==> 멤버변수(==필드), 메서드 //이거외에는 클래스에 올수 없음
 * 
 * 2. 객체(==인스턴스) ==> 집
 * 	  - 객체 생성 : new class명(); //객체 생성 후, 주소를 알려줌
 * 	  - 메모리의 힙(heap)영역에 생성이 되고, 이 영역은 직접 접근X, 반드시 주소로만 접근
 * 
 * 3. 레퍼런스 변수(==참조변수) ==> 집문서(집주소 저장)
 * 	  - 클래스명 변수명; (Person p; ) //이 주소로 찾아가서 Person객체로 인식해!
 * 	  - 메모리의 스택(steak)영역에 생성이 된다
 */
class Person{
	//멤버변수(필드)
	String name;//이름
	int age;//나이
	boolean hasPhone;//휴대폰유무
	
	//메서드
	//반환데이터형 메서드명(매개변수선언){
	//      메서드 내용
	//}
	void show(){
		System.out.println("이름: "+name+"\n나이: "
						+age+"\n핸드폰 유무: "+hasPhone);
	}
}//Person class

public class Work01 { //main class

	public static void main(String[] args) {
		Person p1=null; //래퍼런스 변수의 선언, 초기화시 반드시 null
		p1=new Person(); //객체를 생성해서, 객체의 주소를 p1에 저장

		System.out.println(p1);
		//클래스명@객체의 해시코드(16진스)
		//해시코드(hasecode): 객체의 주소값을 이용해서 객체의 위치를 알려주는 것
		p1.show();
		//초기화하지 않은 멤버변수의 기본값
		//수치형: 0, String: null, boolean: false
		Person p2 = new Person(); //레퍼런스변수의 선언과 초기화를 동시에
		//p1과p2객체의 멤버변수에 값을 추가
		p1.name="피카츄";
		p1.age=10;
		p1.hasPhone=true;
		p1.show();
		
		p2.name="피츄";
		p2.age=7;
		p2.hasPhone=false;
		p2.show();
	} //main method

} //Work01 class
