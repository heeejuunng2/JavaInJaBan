package day1010.generic;

import day1010.Fruit;

/*
 * <지네릭(generic)> : jdk1.5
 * - 클래스, 인터페이스, 메서드를 정의할때 사용
 * 이름뒤에 <>붙이고, <>사이에 타입변수를 사용
 * (T(Type), List컬렉션<E>, Map<K,V>)
 * - 적용할 타입은 참조타입O, 원시자료형X
 *   <int> X, <Integer> O , <Person> O
 *   ** 지네릭 사용의 장점
 *      1) 형변환이 없어서 코드가 간결
 *      2) 형변환이 없어서 프로그램 성능이 향상
 *      3) 컴파일할때 타입을 점검하기 때문에 오류를 미리 방지
 *   ** 지네릭의 한계
 *      - static 멤버에는 타입변수 사용 X
 */

//day1010의 Box클래스를 지네릭 클래스로 변경해보자
class Box<T>{
	private T object; //모든 종류의 객체를 담을수 있다
	//static T num; 지네릭은 static을 붙일수 없다

	public void setObject(T object) {
		this.object = object;
	}
	
	public T getObject() {
		return object;
	}
	
}//end of Box class

public class BoxEx01 {//main calss

	public static void main(String[] args) {
		Box<String> boxs = new Box<String>();
		boxs.setObject("또가스");
		//boxs.setObject(new Fruit("바나나")); 오류
		
		Box<Fruit> boxf = new Box<>(); //jdk1.7부터 생략이 가능함
		boxf.setObject(new Fruit("복숭아"));
		
		//"박스의 내용: 복숭아" 출력
		System.out.println("박스의 내용:"+boxf.getObject().name);
		
	}//end of main method

}//end of main class
