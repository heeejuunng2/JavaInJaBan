package day11;
/*
 * <접근제한자> : 다른 클래스들에게 노출되는 범위를 지정
 * 1. public : 같은/다른 패키지의 모든 클래스 O
 * 	  ==>클래스 , 필드, 생성자, 메소드
 * 2. protected : 같은 패키지의 O, 다른 패키지일 경우, 자식클래스에서만 O
 *    ==>필드,생성자,메소드
 * 3. (아무것도 없음) : (default), 같은 패키지의 클래스 O\
 *    ==>클래스, 필드, 생성자, 메소드
 * 4. private : 같은 클래스에서만 O
 * 	  ==>필드, 생성자, 메소드
 * 
 * ☆접근제한자를 통해 은닉화를 할 수 있다.
 */
public class Work02 {//main class
	public String s1="public field";
		   String s2="default field";
	protected String s3="protected field";
	private String s4="private field";
	
	public void m1(){
		System.out.println("public method");
	}
	
	void m2(){
		System.out.println("default method");
	}
	
	protected void m3(){
		System.out.println("protected method");
	}
	
	private void m4(){
		System.out.println("private method");
	}
	
	public static void main(String[] args) {
		//public,default,protected,private 접근가능
		Work02 w=new Work02();
		System.out.print(w.s1+" ");
		System.out.print(w.s2+" ");
		System.out.print(w.s3+" ");
		System.out.println(w.s4);
		w.m1();
		w.m2();
		w.m3();
		w.m4();

	}//main method

}//Work02 class
