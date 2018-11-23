package day14;

class Unit{ //부모 클래스
	String name; //유닛이름
	int att; //공격력
	double hp; //체력
	boolean isAlive; //생존여부
	
	Unit(){
		
	}
	
	Unit(String name,int att,double hp){
		this.name=name;
		this.att=att;
		this.hp=hp;
		this.isAlive=true;
	}
	
	void attack(Unit unit){
		System.out.println(unit.name+"을 공격!");
		unit.hp-=att;
		System.out.println("["+unit.name+"]의 남은 체력:"+unit.hp);
		System.out.println();
		if(unit.hp<=0){
			unit.isAlive=false;
			System.out.println("적을 쓰러뜨렸다");
		}
	}
}//Unit class

class Tank extends Unit{
	Tank(){
		super("탱크",10,800);
	}
	@Override
	//오버라이드시, 매개변수의 이름은 달라도 된다
	void attack(Unit enemy) {
		System.out.println("["+name+"]가"+"["+enemy.name+"]을 공격!");
		enemy.hp-=att;
		//30%확률로 공격력 2배로 공격
		if(Math.random()<0.3){
			enemy.hp-=(att*2);
			System.out.println("치명타!");
		}
		if(enemy.hp<=0){
			enemy.isAlive=false;  }
		if(enemy.isAlive){
			System.out.println("적의 남은체력:"+enemy.hp);
			System.out.println();
		}else{
			System.out.println("상대를 무찔렀다");
		}
	}
}//Tank class

class Sniper extends Unit{
	Sniper(){
		super("저격수",30,200);
	}
	@Override
	void attack(Unit enemy) {
		System.out.println("["+name+"]가"+"["+enemy.name+"]을 공격!");
		enemy.hp-=att;
		//10%의 확률로 헤드샷(상대방 hp=0)하고 헤드샷! 출력
		if(Math.random()<0.1){
			enemy.hp=0;
			System.out.println("헤드샷~♬");
		}
		if(enemy.hp<=0){
			enemy.isAlive=false; }
		if(enemy.isAlive){
			System.out.println("적의 남은체력:"+enemy.hp);
			System.out.println();
		}else{
			System.out.println("상대를 무찔렀다");
		}
	}
	
	Sniper change(){
		System.out.println("선수 교대!");
		Sniper sip=new Sniper();
		return sip;
	}
	
}//Sinper class

public class War2 {//main class
	
	public static void main(String[] args) {
		//1.
		Unit u1=(Math.random()>0.5)? new Tank():new Sniper();
		Unit u2=(Math.random()>0.5)? new Tank():new Sniper();
		
		//2.
		Unit[] uarr=new Unit[] {new Tank(), new Sniper()};
		Unit u11=uarr[(int)(Math.random()*2)];
		Unit u22=uarr[(int)(Math.random()*2)];
		System.out.println("u1: "+u1.name);
		System.out.println("u2: "+u2.name);
		System.out.println("-----Game Start-----");
		System.out.println();
		
		while(true){
			u1.attack(u2);
			if(!u2.isAlive){ //!u2.isAlive = u2.isAlive==false
				System.out.println("***u1의 승리***");
				break;
			}
			//u2가 Sniper라면 change()메소드 실행
			if(u2 instanceof Sniper){
				//다운캐스팅(부모를 자식으로) 이용하여 change()메소드 실행
				u2=((Sniper) u2).change();
			}
			/*
			 * 객체&인스턴스
			 * 객체: 클래스로부터 메모리에 만들어진것(추상적)
			 * 인스턴스: 특정클래스로부터 만들어진 객체(구체적)
			 * 중요!) instanceof 연산자 : 참조변수가 참조하고 
			 * 		 있는 인스턴스의 실제타입을 아는 것
			 *       ==> 참조변수 instanceof 타입(클래스명)
			 *       타입과 instanceof가 맞으면 ture, 아니면 false
			 */
			u2.attack(u1);
			if(!u1.isAlive){
				System.out.println("***u2의 승리***");
				break;
			}
		}
	}//main method
	
}//War2 class
