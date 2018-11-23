package day18;
/*
 * <API(Application Programming Interface)>
 *  -라이브러리(library)
 *  -기본으로 제공되는 기능(프로그램 개발에 자주 사용되는 클래스 및 인터페이스 모음)
 *  
 * <java.lang 패키지>
 *  : String , Object, 포장클래스(Integer,Boolean, ....)
 *    Math, System 클래스
 * 1. Object 클래스
 *   :모든 클래스의 부모 (모든 클래스는 Object 클래스의 자식임 )
 */
class Person{
	String name;
	String ssn; //주민등록번호
	
	Person(){
		this("누구?","몰라");
	}
	Person(String name, String ssn){
		this.name=name;
		this.ssn=ssn;
	}
	@Override
	public String toString() {  //객체를 표현하는 한마디!!
		//레퍼런스변수를 출력하면 toString()이 실행이된다
		return "이름:"+name+"/주민번호:"+ssn;
	}
	@Override
	public boolean equals(Object obj) {
		//이 객체의 또 다른 객체obj의 "주소"가 같으면 true
		// 같지 않으면 false 주소는 다 다르므로 무조건 다 false나옴
		//주민 등록번호가 같으면 true나오게 하기
		if(this==obj) return true; //이럴일은 X
		if(obj instanceof Person){
			Person p=(Person)obj;
			return ssn.equals(p.ssn);
		}
		return false;
	}
	@Override
	public int hashCode() {	//객체의 hash코드를 알려준다
		//hashCode? 객체의 고유번호(레퍼런스 대신 보여줌)
		return super.hashCode();
	}
}
public class Work02 {//main class

	public static void main(String[] args) {
		Person p=new Person();
		Person p3=new Person();
		System.out.println(p.equals(p3));
		Person p4=new Person("이름","123");
		System.out.println(p.equals(p4));
		System.out.println(p);
		
		Object[] o = {new Person(),"ABC",3,'a',true};
		
		for(Object obj:o){
			System.out.println(obj);
		}
		
		Person p2=new Person();
		System.out.println(p.equals(p2));
		
		System.out.println(p.hashCode());
		System.out.println(p2.hashCode());
	}//main method

}//Work02 class
