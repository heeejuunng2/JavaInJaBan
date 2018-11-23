package day12;
/*
 * <상속(inheritance)>
 * - extends
 * - 기존클래스를 '확장' 하여 새 클래스를 만드는것
 *   (기존 클래스 재활용+ 내가 추가하고 싶은 기능)
 *   ==> 필드(멤버변수) & 메소드가 상속(생성자는 상속X)
 * -상속의 장점
 *  -클래스의 작성기간이 줄어듬
 *  -무한한 확장성
 * ex) 사람클래스==>학생 클래스==>고등학생 클래스==>중학생 클래스
 * 
 * Person class: 이름 나이 연락처
 * Employee class: 이름 나이 연락처 부서 월급
 * Customer class: 이름 나이 연락처 포인트 이메일
 * 
 * -부모클래스=슈퍼클래스=상위클래스=원본클래스
 * -자식클래스=서브클래스=하위클래스=확장클래스
 * <오버라이드> : 부모클래스의 메소드 "몸통"만 ★수정★!!!
 * 			   <리턴타입 변경X,매개변수추가X,수정X>
 * <오버로딩> : 메소드를 새로 ★생성★(메소드이름 똑같고, 매개변수 다르게)
 */
class Person{
	String name;
	int age;
	String phone;
	
	Person(){
		
	}
	Person(String name,int age,String phone){
		this.name=name;
		this.age=age;
		this.phone=phone;
	}
	
	String showInfo(){
		return "이름: "+name+"\n나이: "+age+"\n연락처: "+phone;
	}
}//Person class

class Employee extends Person{
	String department;
	int salary;
	
	@Override
	String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n부서: "+department+"\n월급: "+salary;
	}
}//Employee class

class Customer extends Person{
	int point;
	String email;
	
	@Override
	String showInfo() {
		// TODO Auto-generated method stub
		return super.showInfo()+"\n포인트: "+point+"\n이메일: "+email;
	}
}//Customer class

public class Work01 {//main class

	public static void main(String[] args) {
		Employee e=null;
		e=new Employee();
		e.name="GGG";
		e.age=10;
		e.phone="01080209447";
		System.out.println(e.showInfo());
		Person p=null;
		p=new Person();
		

	}//main class

}//Work01 class
