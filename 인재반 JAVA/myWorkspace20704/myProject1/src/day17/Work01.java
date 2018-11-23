package day17;
/*
 * <abstract>
 *  :클래스, 메서드에 붙임
 *  1. 추상클래스란?
 *  - 미완성 설계도 : 객체 생성 불가능, 상속을 통해서 자식클래스에 의해서만 완성 가능
 *  - 선언이유  1) 자식클래스들의 공통된 필드와 메서드의 이름을 통일
 *  	     2) 클래스 자성할 때 시간을 절약 
 *  2. 추상메소드
 *  - 바디부분(중괄호 부분)이 없음 , 선언 부분만 있음
 *  abstract public void attack(Unit enemy);
 *  //abstract 붙으면 반드시 자식클래스에서 구현해야함 안하면 오류남
 */
abstract class Shape{
	abstract double getArea();
}//Shape class

class Circle extends Shape{
	double r;
	@Override
	double getArea() {
		return r*r*Math.PI;
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		Shape s=new Circle(); //다형성
		//Shape sh=new Shape(); 이거는 안됨
		
		Shape sh= new Shape(){ //익명클래스
			@Override
			double getArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		//<익명클래스>
		// : 추상클래스, 인터페이스를 객체화할때
		//   거기에 선언된 추상메소드들을 즉석에서 오버라이드
		sh.getArea();
		
	}//main method

}//Work01 class
