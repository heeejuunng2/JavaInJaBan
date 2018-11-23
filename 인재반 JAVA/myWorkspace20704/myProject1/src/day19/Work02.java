package day19;

import java.util.Date;

/*
 * <java.util 클래스>
 * - 자주 사용하는 편리한 기능들이 들어있는 패키지
 * - Scanner, 컬렉션 프레임워크, Data, Calender 클래스 등
 * <java.util.Date 클래스>
 * - System.current...()를 활용하여 각종 월, 일, 년등을 알아옴
 */
public class Work02 {//main class

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		System.out.println(d.getMonth()); //1월을 0으로 생각함
		System.out.println(d.getTime()); 
		//**deprecated method : 폐기될 메소드
		//더이상 업데이트를 진행하지 않고 없어질 메소드
		//사용하지 않는것이 좋다
		System.out.println(d.getYear());
		//1900년도를 기준으로 (2018-1900=118)
		System.out.println(d.getDate());
		//

	}//main method

}//Work02 class
