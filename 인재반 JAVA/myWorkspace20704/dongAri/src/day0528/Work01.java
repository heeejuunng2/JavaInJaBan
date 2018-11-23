package day0528;
/*
 * Quiz01>
 * 1. 부모클래스 : Shape
 * 	  -double getArea() {return 0.0}
 * 2. 자식1: Circle
 * 	  -필드: radius(반지름)
 * 	  -생성자(radius)
 * 	  -getArea() 메소드 오버라이드(원의 넓이 리턴)
 * 3. 자식2: Rectangle
 * 	  -필드: base(밑변), height(높이)
 *    -생성자(base,height)
 *    -getArea() 메소드 오버라이드(사각형 넓이 리턴)
 * 4. 자식3: Triangle
 *    -필드: base,height
 *    -생성자(base,height)
 *    -getArea() 메소드 오버라이드(삼각형 넓이 리턴)
 *    
 * 상속 : 그룹화/클래스재사용
 */
class Shape{
	double getArea(){
		return 0.0;
	}
}//class Shape

class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	double getArea() {
		return (radius*radius)*3.14;
	}
	
}//class Circle

class Rectangle extends Shape{
	 double base, height;
	 
	 Rectangle(double base,double height){
		 this.base=base;
		 this.height=height;
	 }
	 @Override
	double getArea() {
		// TODO Auto-generated method stub
		return base*height;
	}
}

class Triangle extends Shape{
	 double base, height;
	 
	Triangle(double base, double height) {
		 this.base=base;
		 this.height=height;
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return (base*height)*0.5;
	}
}

public class Work01 {

	public static void main(String[] args) {
		/*
		 * Shape 클래스에 4칸 배열을 만들고
		 * 위에서 만든 도형클래스들을 테스트해보자
		 */
		Shape[] s=new Shape[4];
		//래퍼런스변수가 4개만들어 진거임
		s[0]=new Shape();
		s[1]=new Circle(10.1);
		s[2]=new Rectangle(5.1,5.2);
		s[3]=new Triangle(3.1,3.2);
		
		for(Shape i:s){
			System.out.println(i.getArea());
		}
	}

}
