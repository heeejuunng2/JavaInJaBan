package day15;

public class PersonArr {//main class
	
	public static void main(String[] args) {
		//Person 객체 3칸 배열 선언
		//선언1.
		Person[] p=new Person[3];
		//객체 생성해서 멤버변수에 값을 저장 ==> 확장 for문 불가능
		for(int i=0;i<p.length;i++){
			p[i]=new Person();
			p[i].input();
		}
		//객체배열이 정보를 읽어오기 ==> ★확장for문 가능★
		for(Person tmp:p){
			tmp.show();
		}
		
		//선언2.
		Person[] p2={new Person(), new Person(), new Person()};
		
		
	}//main method
	
}//PersonArr calss
