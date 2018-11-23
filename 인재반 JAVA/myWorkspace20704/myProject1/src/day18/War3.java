package day18;

interface Item{
	void use(Unit u); //추상 메서드
	default void info(){
		System.out.println("이것은 아이템");
	}
}
interface Unit{
	int MAX_HP=10000;   //앞에 public static final 생략됨 자바 컴파일러가 해줌
	int MAX_ATTACK_GAUGE=1000;
	
	void attack(Unit enemy);  //public abstract 생략
	void move(int step);
}
class Tank implements Unit{
	@Override
	public String toString() {
		return "탱크";
	}
	@Override
	public void attack(Unit u) {
		System.out.println(u+"를 공격");
	}
	@Override
	public void move(int step) {
		System.out.println(step+"만큼 이동");
	}
}
class Sniper implements Unit{
	int hp;
	Sniper(int hp){
		if(hp>MAX_HP){
			this.hp=MAX_HP;
		}else{
			this.hp=hp;
		}
	}
	@Override
	public String toString() {
		return "스나이퍼";
	}
	@Override
	public void attack(Unit u) {
		System.out.println(u+"를 공격");
	}
	@Override
	public void move(int step) {
		System.out.println(step+"만큼 이동");
	}
}
public class War3 {//main class

	public static void main(String[] args) {
		Unit[] u1={new Tank(),new Sniper(100000)};
		
		u1[0].attack(u1[1]);
		//u1으로 Sniper의 hp를 출력해보자
		System.out.println(((Sniper)u1[1]).hp);
		//Unit타입을 Sniper타입으로 강제형변환 함(다운캐스팅)
		//MAX_HP를 출력해보자
		System.out.println(Unit.MAX_HP);
		
		Item i=new Item() { //익명클래스(Anonymous class)
			@Override
			public void use(Unit u) {
				System.out.println(u+"가 아이템 사용");
			}
		};
		i.use(u1[0]);
		i.info();
		//탱크가 20만큼 이동 출력
		u1[0].move(20);
		
	}//main method

}//War3 class
