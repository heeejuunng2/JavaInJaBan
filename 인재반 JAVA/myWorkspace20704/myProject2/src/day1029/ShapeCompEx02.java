package day1029;

import java.util.Arrays;
import java.util.Comparator;

class Shape{
	int getArea() {
		return 0;
	}
}//end of Shape class

class Rectangle extends Shape{
	int b, h;
	public Rectangle(int b, int h) {
		this.b=b;
		this.h=h;
	}
	@Override
	int getArea() {
		return b*h;
	}
	@Override
	public String toString() {
		return "사각형[넓이="+getArea()+"]";
	}
 
}//end of Rectangle class

public class ShapeCompEx02 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		Rectangle[] rs = {new Rectangle(3, 5),
						  new Rectangle(2, 10),
						  new Rectangle(5, 5)};
  
		//사각형의 넓이순서대로(큰-->작) 출력되도록 정렬하고 출력
		Arrays.sort(rs, new Comparator<Rectangle>() {

			@Override
			public int compare(Rectangle o1, Rectangle o2) {
				return (o2.b*o2.h)-(o1.b*o1.h);
			}
		});
		System.out.println("사각형 넓이 순서(큰것부터 작은것 까지)");
		for(Rectangle r : rs) {
			System.out.println(r);
		}
  
 }//end of main method

}//end of main class 
