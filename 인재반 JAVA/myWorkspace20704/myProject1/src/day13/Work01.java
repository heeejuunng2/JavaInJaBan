package day13;
/*
 * <다형성(polymorphism)>
 * 완전중요! 엄청중요! 짱중요!
 * - 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있는 성질
 *   (조상타입의 참조변수로 자손타입의 인스턴스를 참조)
 *   부모타입의 참조변수=자식객체주소
 *   (부모타입은 모든 자식타입을 소화할 수 있다)
 * 
 * 다형성의 장점:
 * 1. 배열의 다양한 타입의 객체를 저장할 수 있다.
 * 2. 인자값으로 다양한 타입의 객체를 넣을 수 있다.
 */
class Pokemon{
	String name;
	
	Pokemon(){ //기본생성자
		
	}
	Pokemon(String name){
		this.name=name;
	}
	void notice(){
		System.out.println("==POKEMON==");
	}
	void attack(Pokemon p){
		System.out.println(this.name+"가 "+p.name+"을(를) 공격");
	}
} 
class Pikachu extends Pokemon{
	Pikachu(){
		super("피카츄");
	}
	@Override
	void notice() {
		System.out.println("==PIKACHU==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"가 "+p.name+"을(를) 백만볼트 공격");
	}
}
class Raichu extends Pokemon{
	Raichu(){
		super("라이츄");
	}
	@Override
	void notice() {
		System.out.println("==RAICHU==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"가 "+p.name+"을(를) 천만볼트 공격");
	}
}
class Ggobuki extends Pokemon{
	Ggobuki(){
		super("꼬부기");
	}
	@Override
	void notice() {
		System.out.println("==GGOBUKI==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"가 "+p.name+"을(를) 물대포 공격");
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		Pokemon p=null; //부모타입
		
		p=new Pokemon();
		p=new Pikachu();
		p=new Raichu();
		p=new Ggobuki();
		
		Pokemon[] arr={new Pikachu(),new Raichu(),new Ggobuki(),new Pokemon()};
		
		for(Pokemon pp:arr){
			pp.notice();
		}
		//피카츄가 라이츄 공격
		arr[0].attack(arr[1]);
		//꼬부기가 피카츄 공격
		arr[2].attack(arr[0]);
		
	}//main method

}//Work01 class
