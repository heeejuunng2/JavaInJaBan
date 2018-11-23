package day0829;
/*
 * <Quiz01>
 * 1. Phone class
 *    1) 필드 : protected String owner
 *    2) 생성자 : 모든 필드 초기화
 *    3) 메서드 : void talk() => "owner가 통화중"
 * 2. Telephone class : Phone class의 자식
 *    1) 필드 : private String when
 *    2) 생성자 : 모든 필드 초기화
 *    3) 메서드 : void autoAnswering()
 *              => "owner가 없다. when에 전화줄래"
 * 3. Smartphone class : Telephone class의 자식
 *    1) 필드 : private String game
 *    2) 생성자 : 모든 필드 초기화
 *    3) 메서드 : void playGame()
 *              => "owner가 game을 하는 중이야"출력
 */
class Phone{
	protected String owner;
	
	Phone(){
		
	}
	Phone(String owner){
		this.owner=owner;
	}
	void talk() {
		System.out.println(owner+"가 통화중");
	}
}
class Telephone extends Phone{
	private String when;
	
	Telephone(){
		
	}
	Telephone(String owner,String when){
		super(owner);
		this.when=when;
	}
	void autoAnswering() {
		System.out.println(owner+"가 없다."+when+" 전화줄래?");
	}
}
class Smartphone extends Telephone{
	private String game;
	
	Smartphone(){
		
	}
	Smartphone(String owner,String when,String game){
		super(owner,when);
		this.game=game;
	}
	void playGame() {
		System.out.println(owner+"가 "+game+"을 하는중이야");
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		Phone[] phone= {new Phone("보노보노"),
				    new Telephone("포로리","내일"),
				    new Smartphone("너부리"," ","쿠키런")};
		
		//자식이 부모를 가르키기 때문
		//Phone은 Phone만 가르키고
		//Telephone은 Phone과 Telephone을 가르킴
		//Smartphone은 Phone,Telephone,Smartphone을 가르킴
		for(Phone p:phone) {
		if(p instanceof Smartphone) {
			((Smartphone) p).playGame();
		}else if(p instanceof Telephone) {
			((Telephone) p).autoAnswering();
		}else if(p instanceof Phone) {
			p.talk();
		}
		}

	}//end of main method

}//end of Work01 class
