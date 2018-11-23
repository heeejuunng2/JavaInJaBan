package day12;

class Pokemon{
	void attack(){
		System.out.println("포켓몬의 공격");
	}
}

//1.Pikachu class 생성(Pokemon 상속받아서)
//  attack() 오버라이드
class Pikachu extends Pokemon{
	@Override
	void attack() {
		System.out.println("피카츄 백만볼트 공격!!");
	}
}

//2. Raichu class 생성(Pokemon 상속받아서)
//   attack() 오버라이드
class Raichu extends Pokemon{
	@Override
	void attack() {
		System.out.println("라이츄 천만볼트 공격!!");
	}
}

public class Work02 {//main class

	public static void main(String[] args) {
		

	}//main method

}//Work01 class
