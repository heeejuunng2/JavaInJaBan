package day10;

class Tank{
	String name;
	int atk; //공격력
	int hp; //체력
	boolean isAlive; //생존여부
	
	//생성자
	//1. 기본생성자
	public Tank(){
		//name="Tank", atk=50, hp=500 로 생성자 호출
		this("Tank",50,500);
	}
	//2. name, atk, hp를 매개변수로 받는 생성자
	public Tank(String name, int atk, int hp){
		this.name=name;
		this.atk=atk;
		this.hp=hp;
		this.isAlive=true; //값 받지 않고 그냥 true 줌
	}
	
	void attack(Sniper s){
		
		System.out.println(name+"이(가) "+s.name+"을(를) 공격했습니다.");
		s.hp-=atk; //상대방의 체력은 내가가진 공격력만큼 빠짐
		
		if(Math.random()<0.3){
			System.out.println("★치명타★");
			s.hp-=2*atk;
		}//if 
		
		if(s.hp<=0){
			s.isAlive=false;
			System.out.println("적을 쓰러뜨렸습니다.");
		}else {
			System.out.println(s.name+"님의 남은 체력은 "+s.hp+"입니다.");
		}
		
	}//attack method
	
}//Tank class

class Sniper{
	String name;
	int atk; //공격력
	int hp; //체력
	boolean isAlive; //생존여부
	
	//기본생성자
	// "Sniper", 30, 300으로 생성자 호출
	Sniper(){
		this("Sniper",30,300);
	}
	//name, atk, hp를 매개변수로 주는 생성자(isAlive=true)
	Sniper(String name, int atk,int hp){
		this.name=name;
		this.atk=atk;
		this.hp=hp;
		this.isAlive=true;
	}
	
	void attack(Tank t){
		//1. 00가 00을 공격 출력
		System.out.println(name+"이(가)"+t.name+"을(를) 공격했습니다.");
		//2. sniper의 공격력만큼 tank의 hp감소
	    t.hp-=atk;
		//3. 10%의 확률로 헤드샷 발사
	    //   헤드샷은 tank의 hp를 0으로 (바로죽여버림)
	    if(Math.random()<0.1){
	    	System.out.println("♬Head Shot♬");
	    	t.hp=0;
	    }//if
	    //4. hp가 0이라면 "적을 쓰러뜨렸습니다" 출력, isAlive=false
	    //   아니라면, tank의 남은 체력 출력
	    if(t.hp<=0){
	    	t.isAlive=false;
	    	System.out.println("적을 쓰러뜨렸습니다.");
	    }else{
	    	System.out.println(t.name+"님의 남은 체력은 "+t.hp+"입니다.");
	    }
	    
	}//attack method
	
	//change()
	//이름이 Sniper2.0, atk의 50, hp 400인 새로운
	//sniper 객체를 만들어서 리턴
	
	Sniper change(){
		System.out.println("Sniper2.0으로 체인지!!");
		Sniper tmp=new Sniper("Sniper2.0",50,400);
		
		return tmp;
	}//change method
	
}//Sniper class

public class War { //main class

	public static void main(String[] args) {
		//Tank 객체 생성
		Tank tank=new Tank();
		//Sniper 객체 생성
		Sniper sniper=new Sniper();
		
		System.out.println("========Game Start=========");
		System.out.println("Unit1 : "+tank.name);
		System.out.println("Unit2 : "+sniper.name);
		System.out.println("===========================");
		
		while(true){
			//tank가 먼저 공격
			tank.attack(sniper);
			//만약 죽었다면, "tank의 승리" 출력, 무한루프 종료
			if(!sniper.isAlive){
				System.out.println("***"+tank.name+"의 승리***");
				break;
			}
			//sniper공격
			sniper.attack(tank);
			//만약 tank가 죽지않고, 30%확률로 change()호출
			if(!tank.isAlive&&Math.random()<0.3){
				sniper=sniper.change();
			}
			//만약 죽었다면, "sniper의 승리" 출력, 무한루프 종료
			if(!tank.isAlive){
				System.out.println("***"+sniper.name+"의 승리***");
				break;
			}
		}//while 
		
	}//main method

}//War class
