package day10;
/*
 * <기본형 매개변수 & 참조형 매개변수> 중요!!
 * 기본형 매개변수 : 변수의 값을 읽기만 함
 * 참조형 매개변수 : 변수의 값을 읽고, 변경이 가능(주소값을 넘겨주기 때문)
 * 
 * 메소드 ==> 기계
 * 메소드 만드는것(메소드 선언) ==> 메소드 사용(메소드 호출)
 *  인자값을 넣어서 매개변수가 인자값을 받으면 메소드가 동작
 */

class Data1{
	int x;
	
}//Data1 class

class Data2{
	int y;
	
}//Data2 class

public class Work01 {//main class
	public static void change(int d1,int d2){
		int temp;
		temp=d1; 
		d1=d2;
		d2=temp;
	}//change method
	
	public static void change(Data1 d1,Data2 d2){
		int temp;
		temp=d1.x;
		d1.x=d2.y;
		d2.y=temp;
	}//change method
	
	public static void main(String[] args) {
		Data1 d1=new Data1();
		Data2 d2=new Data2();
		
		d1.x=1;
		d2.y=2;
		
		change(d1.x,d2.y); //d1에 있는 값을 넘김
		System.out.println("x="+d1.x+" y="+d2.y);
		
		change(d1, d2); //d1번지를 넘김
		System.out.println("x="+d1.x+" y="+d2.y);
		
	}//main method

}//Work01 class
