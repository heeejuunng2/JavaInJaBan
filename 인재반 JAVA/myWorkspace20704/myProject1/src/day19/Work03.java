package day19;
/*
 * <포장클래스(Wrapper classes)8개>
 * :원시자료형(8가지 자료형)데이터를 "객체화"할때 사용하는 클래스
 *  정수형: Integer, Long, Short, Byte
 *  실수형: Double, Float
 *  문자형: Character
 *  논리형: Boolean
 */
public class Work03 {//main class

	public static void main(String[] args) {
		Object[] o = {"ABC",1,3.14,true,'A'};
		
		for(Object obj:o){
			System.out.print(obj+" ");
		}
		
		System.out.println();
		
		Integer i=new Integer(10);
		//10을 Integer로 boxing한다
		int num=i;
		System.out.println(i+10);
		//자동 언박싱(unboxing)
		
		Boolean b=new Boolean(true);
		if(b) { //언박싱
			System.out.println("b는 true");
		}
		
	}//main method

}//Work03 class
