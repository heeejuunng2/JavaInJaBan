package day11;
/*
 * <무결성과 은닉화>
 * 1. 무결성(결점이 없는 성질)& 은닉화(데이터보호를 위해 숨기는것)
 *    ===>객체지향 개념의 '캡슐화'
 * 2. 구현
 *    멤버변수를private이나 protected로 제한
 *    간접적으로 접근할 수 있도록 연결다리(public메소드)를 만든다
 *    1)getter:멤버변수의 값을 외부에 제공하는 메소드
 *    		   public 멤버자료형 get멤버변수이름(){
 *    				return 멤버;	
 *    			}
 *    2)setter:외부의 요청이 들어오면 멤버변수의 값을 셋팅하는 메소드
 *    		   public void set멤버변수이름(멤버자료형 매개변수명){
 *    				this.멤버=인자값;
 *    			}
 */
class Std{
	
	String name;
	private int age;
	//기본생성자
	public Std(){
		//name은 who, age는 1로 생성자 호출
		this("who",1);
	}
	//name, age를 매개로 하는 생성자
	public Std(String name,int age){
		this.name=name;
		setAge(age);
	}
	//★getter
	public int getAge(){
		return age;
	}
	//★setter
	//age가 1세부터 110세까지 설정
	//이 값이 아니라면 age=0;
	public void setAge(int age){
		if(age>=1&&age<=110){
			this.age=age;
		}else{
			age=0;
		}
	}
	
}//Std class

public class Work03 {//main class

	public static void main(String[] args) {
		Std s=new Std();
		s.name="pika";
		s.setAge(20);

		System.out.println(s.name+s.getAge());
	}//main method

}//Work03 class
