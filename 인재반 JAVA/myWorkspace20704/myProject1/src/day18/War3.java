package day18;

interface Item{
	void use(Unit u); //�߻� �޼���
	default void info(){
		System.out.println("�̰��� ������");
	}
}
interface Unit{
	int MAX_HP=10000;   //�տ� public static final ������ �ڹ� �����Ϸ��� ����
	int MAX_ATTACK_GAUGE=1000;
	
	void attack(Unit enemy);  //public abstract ����
	void move(int step);
}
class Tank implements Unit{
	@Override
	public String toString() {
		return "��ũ";
	}
	@Override
	public void attack(Unit u) {
		System.out.println(u+"�� ����");
	}
	@Override
	public void move(int step) {
		System.out.println(step+"��ŭ �̵�");
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
		return "��������";
	}
	@Override
	public void attack(Unit u) {
		System.out.println(u+"�� ����");
	}
	@Override
	public void move(int step) {
		System.out.println(step+"��ŭ �̵�");
	}
}
public class War3 {//main class

	public static void main(String[] args) {
		Unit[] u1={new Tank(),new Sniper(100000)};
		
		u1[0].attack(u1[1]);
		//u1���� Sniper�� hp�� ����غ���
		System.out.println(((Sniper)u1[1]).hp);
		//UnitŸ���� SniperŸ������ ��������ȯ ��(�ٿ�ĳ����)
		//MAX_HP�� ����غ���
		System.out.println(Unit.MAX_HP);
		
		Item i=new Item() { //�͸�Ŭ����(Anonymous class)
			@Override
			public void use(Unit u) {
				System.out.println(u+"�� ������ ���");
			}
		};
		i.use(u1[0]);
		i.info();
		//��ũ�� 20��ŭ �̵� ���
		u1[0].move(20);
		
	}//main method

}//War3 class
