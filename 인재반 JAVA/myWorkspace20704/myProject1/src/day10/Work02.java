package day10;
/*
 * <기본형 반환타입 & 참조형 반환타입>
 * -기본형 : 기본형 리턴값을 반환(return a; (a는 int))
 * -참조형 : 래퍼런스 변수를 반환(return P; (P는 참조변수))
 * 
 */
class Data{
	int x;
	
}//Data class

public class Work02 {//main class
	public static Data copy(Data d){
		Data tmp=new Data();
		tmp.x=d.x;
		return tmp;
	}//copy method
	
	public static void main(String[] args) {
		Data d=new Data();
		d.x=100;
		Data d2=copy(d);
		System.out.println("d.x: "+d.x);
		System.out.println("d2.x:"+d2.x);

	}//main method

}//Work02 class
