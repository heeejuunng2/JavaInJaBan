package day0905;

interface StarUnit{
	String getClan(); //�߻�޼ҵ�, public abstract ����
	int getHp(); //�߻�޼ҵ�
	String getName();//�߻�޼ҵ�
	String getInfo();//�߻�޼ҵ�
	
	void attack(StarUnit enemy); //�߻�޼ҵ�
	
}//end of StarUnit

abstract class Zerg implements StarUnit{ //Zerg��� ����
	private String clan; //�����̸� , ����,���ͷ� ����
	protected int hp; //���� ��Ű��, �ڱ��ڽ�, �ڽĵ鸸 ���ٰ���
	
	Zerg(int hp){
		this.hp=hp;
		clan="����";
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

class Hydra extends Zerg{//Zerg��� ���� �� �����
	String name; 
	
	Hydra(){
		super(80); //�θ�Ŭ������ ������ �ҷ���
		this.name="�����";
	}
	@Override
		public String getName() {
			return name;
		}
	@Override
		public String getInfo() {
			return "���� �̸���"+name+", ������ "
					+getClan()+", �� ���߰����� ����";
		}
	@Override
		public void attack(StarUnit enemy) {
			//protoss�����̸�
			//"OO�� OO�� ����" ���
			//�ƴϸ� "��������!!"���
			if(enemy instanceof Zerg) {
				System.out.println("���� ����!!");
			}else {
				System.out.println(name+"(��)�� "+enemy.getName()+"(��)�� ����");
			}
		}

}//end of Hydra class

abstract class Protoss implements StarUnit{//Protoss��� ����
	private String clan; //������ , ����,���ͷ� ����
	protected int hp; //���� ��Ű��, �ڱ��ڽ�, �ڽĵ鸸 ���ٰ���
	
	Protoss(int hp){
		this.hp=hp;
		clan="�����佺";
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

class Zealot extends Protoss{//Protoss��� ���� �� ����
	String name;
	
	Zealot(){
		super(90);
		this.name="����";
	}
	@Override
		public String getName() {
			return name;
		}
	@Override
		public String getInfo() {
			return "���� �̸���"+name+", ������ "
					+getClan()+", �� ������ ��Ŀ�����̾�";
		}
	@Override
		public void attack(StarUnit enemy) {
		if(enemy instanceof Protoss) {
			System.out.println("���� ����!!");
		}else {
			System.out.println(name+"(��)�� "+enemy.getName()+"(��)�� ����");
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
	
	//getInfo()�� ���ϰ��� �޾Ƽ� ����ϴ� �޼ҵ�
	static void show(StarUnit unit){ //static ���̱� ����:�Ű������� �޾Ƽ� ó���ϱ� ����
		System.out.println(unit.getInfo());
	}
	
}//end of StarGame class
