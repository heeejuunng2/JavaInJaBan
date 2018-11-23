package day19;
/*
 * <java.lang.System클래스>
 * -운영체제 자원을 사용할때 쓰는 클래스
 * 
 */
public class Work01 {//main class
	
	public static void main(String[] args) {
		System.out.println("20704");
		System.out.println("out:ABC"); //운영체제의 표준 출력 스트링 //sysout할때 사용하는 표준 출력 스트링
		System.err.println("err:ABC"); //에러메세지를 출력 
		long time=System.currentTimeMillis();
		//1970년도 1월1일 00시부터 지금까지 경과한 밀리초를 long형으로 반환
		System.out.println(time);
		
	}//main method
	
}//Work01 class
