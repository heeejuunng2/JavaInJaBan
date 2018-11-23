package day0905;

interface StarUnit{
	String getClan(); //추상메소드, public abstract 생략
	int getHp(); //추상메소드
	String getName();//추상메소드
	String getInfo();//추상메소드
	
	void attack(StarUnit enemy); //추상메소드
	
}//end of StarUnit

abstract class Zerg implements StarUnit{ //Zerg라는 종족
	private String clan; //종족이름 , 세터,개터로 접근
	protected int hp; //같은 패키지, 자기자신, 자식들만 접근가능
	
	Zerg(int hp){
		this.hp=hp;
		clan="저그";
	}
	@Override
		public String getClan() {
			return clan;
		}
	@Override
		public int getHp() {
			return hp;
		}
}//end of Zerg class

class Hydra extends Zerg{//Zerg라는 종족 중 히드라
	String name; 
	
	Hydra(){
		super(80); //부모클래스의 생성자 불러옴
		this.name="히드라";
	}
	@Override
		public String getName() {
			return name;
		}
	@Override
		public String getInfo() {
			return "나의 이름은"+name+", 종족은 "
					+getClan()+", 난 공중공격을 잘해";
		}
	@Override
		public void attack(StarUnit enemy) {
			//protoss종족이면
			//"OO가 OO을 공격" 출력
			//아니면 "같은종족!!"출력
			if(enemy instanceof Zerg) {
				System.out.println("같은 종족!!");
			}else {
				System.out.println(name+"(이)가 "+enemy.getName()+"(을)를 공격");
			}
		}

}//end of Hydra class

abstract class Protoss implements StarUnit{//Protoss라는 종족
	private String clan; //종족명 , 세터,개터로 접근
	protected int hp; //같은 패키지, 자기자신, 자식들만 접근가능
	
	Protoss(int hp){
		this.hp=hp;
		clan="프로토스";
	}
	@Override
		public String getClan() {
			return clan;
		}
	@Override
		public int getHp() {
			return hp;
		}
}//end of Protoss class

class Zealot extends Protoss{//Protoss라는 종족 중 질럿
	String name;
	
	Zealot(){
		super(90);
		this.name="질럿";
	}
	@Override
		public String getName() {
			return name;
		}
	@Override
		public String getInfo() {
			return "나의 이름은"+name+", 종족은 "
					+getClan()+", 난 러쉬와 탱커역할이야";
		}
	@Override
		public void attack(StarUnit enemy) {
		if(enemy instanceof Protoss) {
			System.out.println("같은 종족!!");
		}else {
			System.out.println(name+"(이)가 "+enemy.getName()+"(을)를 공격");
		}
		}
}//end of Zealot class



public class StarGame {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		StarUnit u1=Math.random()>0.5? new Hydra():new Zealot();
		StarUnit u2=Math.random()>0.5? new Hydra():new Zealot();
		
		show(u1);
		show(u2);
		u1.attack(u2);
		
		
		
	}//end of main method
	
	//getInfo()의 리턴값을 받아서 출력하는 메소드
	static void show(StarUnit unit){ //static 붙이기 가능:매개변수만 받아서 처리하기 때문
		System.out.println(unit.getInfo());
	}
	
}//end of StarGame class
