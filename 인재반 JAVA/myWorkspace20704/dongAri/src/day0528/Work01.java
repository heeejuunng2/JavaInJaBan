package day0528;
/*
 * Quiz01>
 * 1. �θ�Ŭ���� : Shape
 * 	  -double getArea() {return 0.0}
 * 2. �ڽ�1: Circle
 * 	  -�ʵ�: radius(������)
 * 	  -������(radius)
 * 	  -getArea() �޼ҵ� �������̵�(���� ���� ����)
 * 3. �ڽ�2: Rectangle
 * 	  -�ʵ�: base(�غ�), height(����)
 *    -������(base,height)
 *    -getArea() �޼ҵ� �������̵�(�簢�� ���� ����)
 * 4. �ڽ�3: Triangle
 *    -�ʵ�: base,height
 *    -������(base,height)
 *    -getArea() �޼ҵ� �������̵�(�ﰢ�� ���� ����)
 *    
 * ��� : �׷�ȭ/Ŭ��������
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
		 * Shape Ŭ������ 4ĭ �迭�� �����
		 * ������ ���� ����Ŭ�������� �׽�Ʈ�غ���
		 */
		Shape[] s=new Shape[4];
		//���۷��������� 4������� ������
		s[0]=new Shape();
		s[1]=new Circle(10.1);
		s[2]=new Rectangle(5.1,5.2);
		s[3]=new Triangle(3.1,3.2);
		
		for(Shape i:s){
			System.out.println(i.getArea());
		}
	}

}
