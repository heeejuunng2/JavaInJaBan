package day14;

class Unit{ //�θ� Ŭ����
	String name; //�����̸�
	int att; //���ݷ�
	double hp; //ü��
	boolean isAlive; //��������
	
	Unit(){
		
	}
	
	Unit(String name,int att,double hp){
		this.name=name;
		this.att=att;
		this.hp=hp;
		this.isAlive=true;
	}
	
	void attack(Unit unit){
		System.out.println(unit.name+"�� ����!");
		unit.hp-=att;
		System.out.println("["+unit.name+"]�� ���� ü��:"+unit.hp);
		System.out.println();
		if(unit.hp<=0){
			unit.isAlive=false;
			System.out.println("���� �����߷ȴ�");
		}
	}
}//Unit class

class Tank extends Unit{
	Tank(){
		super("��ũ",10,800);
	}
	@Override
	//�������̵��, �Ű������� �̸��� �޶� �ȴ�
	void attack(Unit enemy) {
		System.out.println("["+name+"]��"+"["+enemy.name+"]�� ����!");
		enemy.hp-=att;
		//30%Ȯ���� ���ݷ� 2��� ����
		if(Math.random()<0.3){
			enemy.hp-=(att*2);
			System.out.println("ġ��Ÿ!");
		}
		if(enemy.hp<=0){
			enemy.isAlive=false;  }
		if(enemy.isAlive){
			System.out.println("���� ����ü��:"+enemy.hp);
			System.out.println();
		}else{
			System.out.println("��븦 ���񷶴�");
		}
	}
}//Tank class

class Sniper extends Unit{
	Sniper(){
		super("���ݼ�",30,200);
	}
	@Override
	void attack(Unit enemy) {
		System.out.println("["+name+"]��"+"["+enemy.name+"]�� ����!");
		enemy.hp-=att;
		//10%�� Ȯ���� ��弦(���� hp=0)�ϰ� ��弦! ���
		if(Math.random()<0.1){
			enemy.hp=0;
			System.out.println("��弦~��");
		}
		if(enemy.hp<=0){
			enemy.isAlive=false; }
		if(enemy.isAlive){
			System.out.println("���� ����ü��:"+enemy.hp);
			System.out.println();
		}else{
			System.out.println("��븦 ���񷶴�");
		}
	}
	
	Sniper change(){
		System.out.println("���� ����!");
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
				System.out.println("***u1�� �¸�***");
				break;
			}
			//u2�� Sniper��� change()�޼ҵ� ����
			if(u2 instanceof Sniper){
				//�ٿ�ĳ����(�θ� �ڽ�����) �̿��Ͽ� change()�޼ҵ� ����
				u2=((Sniper) u2).change();
			}
			/*
			 * ��ü&�ν��Ͻ�
			 * ��ü: Ŭ�����κ��� �޸𸮿� ���������(�߻���)
			 * �ν��Ͻ�: Ư��Ŭ�����κ��� ������� ��ü(��ü��)
			 * �߿�!) instanceof ������ : ���������� �����ϰ� 
			 * 		 �ִ� �ν��Ͻ��� ����Ÿ���� �ƴ� ��
			 *       ==> �������� instanceof Ÿ��(Ŭ������)
			 *       Ÿ�԰� instanceof�� ������ ture, �ƴϸ� false
			 */
			u2.attack(u1);
			if(!u1.isAlive){
				System.out.println("***u2�� �¸�***");
				break;
			}
		}
	}//main method
	
}//War2 class
