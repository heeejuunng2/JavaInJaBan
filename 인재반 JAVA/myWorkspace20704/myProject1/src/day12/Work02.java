package day12;

class Pokemon{
	void attack(){
		System.out.println("���ϸ��� ����");
	}
}

//1.Pikachu class ����(Pokemon ��ӹ޾Ƽ�)
//  attack() �������̵�
class Pikachu extends Pokemon{
	@Override
	void attack() {
		System.out.println("��ī�� �鸸��Ʈ ����!!");
	}
}

//2. Raichu class ����(Pokemon ��ӹ޾Ƽ�)
//   attack() �������̵�
class Raichu extends Pokemon{
	@Override
	void attack() {
		System.out.println("������ õ����Ʈ ����!!");
	}
}

public class Work02 {//main class

	public static void main(String[] args) {
		

	}//main method

}//Work01 class
