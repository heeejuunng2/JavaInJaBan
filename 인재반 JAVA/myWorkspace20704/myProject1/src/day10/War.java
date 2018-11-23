package day10;

class Tank{
	String name;
	int atk; //���ݷ�
	int hp; //ü��
	boolean isAlive; //��������
	
	//������
	//1. �⺻������
	public Tank(){
		//name="Tank", atk=50, hp=500 �� ������ ȣ��
		this("Tank",50,500);
	}
	//2. name, atk, hp�� �Ű������� �޴� ������
	public Tank(String name, int atk, int hp){
		this.name=name;
		this.atk=atk;
		this.hp=hp;
		this.isAlive=true; //�� ���� �ʰ� �׳� true ��
	}
	
	void attack(Sniper s){
		
		System.out.println(name+"��(��) "+s.name+"��(��) �����߽��ϴ�.");
		s.hp-=atk; //������ ü���� �������� ���ݷ¸�ŭ ����
		
		if(Math.random()<0.3){
			System.out.println("��ġ��Ÿ��");
			s.hp-=2*atk;
		}//if 
		
		if(s.hp<=0){
			s.isAlive=false;
			System.out.println("���� �����߷Ƚ��ϴ�.");
		}else {
			System.out.println(s.name+"���� ���� ü���� "+s.hp+"�Դϴ�.");
		}
		
	}//attack method
	
}//Tank class

class Sniper{
	String name;
	int atk; //���ݷ�
	int hp; //ü��
	boolean isAlive; //��������
	
	//�⺻������
	// "Sniper", 30, 300���� ������ ȣ��
	Sniper(){
		this("Sniper",30,300);
	}
	//name, atk, hp�� �Ű������� �ִ� ������(isAlive=true)
	Sniper(String name, int atk,int hp){
		this.name=name;
		this.atk=atk;
		this.hp=hp;
		this.isAlive=true;
	}
	
	void attack(Tank t){
		//1. 00�� 00�� ���� ���
		System.out.println(name+"��(��)"+t.name+"��(��) �����߽��ϴ�.");
		//2. sniper�� ���ݷ¸�ŭ tank�� hp����
	    t.hp-=atk;
		//3. 10%�� Ȯ���� ��弦 �߻�
	    //   ��弦�� tank�� hp�� 0���� (�ٷ��׿�����)
	    if(Math.random()<0.1){
	    	System.out.println("��Head Shot��");
	    	t.hp=0;
	    }//if
	    //4. hp�� 0�̶�� "���� �����߷Ƚ��ϴ�" ���, isAlive=false
	    //   �ƴ϶��, tank�� ���� ü�� ���
	    if(t.hp<=0){
	    	t.isAlive=false;
	    	System.out.println("���� �����߷Ƚ��ϴ�.");
	    }else{
	    	System.out.println(t.name+"���� ���� ü���� "+t.hp+"�Դϴ�.");
	    }
	    
	}//attack method
	
	//change()
	//�̸��� Sniper2.0, atk�� 50, hp 400�� ���ο�
	//sniper ��ü�� ���� ����
	
	Sniper change(){
		System.out.println("Sniper2.0���� ü����!!");
		Sniper tmp=new Sniper("Sniper2.0",50,400);
		
		return tmp;
	}//change method
	
}//Sniper class

public class War { //main class

	public static void main(String[] args) {
		//Tank ��ü ����
		Tank tank=new Tank();
		//Sniper ��ü ����
		Sniper sniper=new Sniper();
		
		System.out.println("========Game Start=========");
		System.out.println("Unit1 : "+tank.name);
		System.out.println("Unit2 : "+sniper.name);
		System.out.println("===========================");
		
		while(true){
			//tank�� ���� ����
			tank.attack(sniper);
			//���� �׾��ٸ�, "tank�� �¸�" ���, ���ѷ��� ����
			if(!sniper.isAlive){
				System.out.println("***"+tank.name+"�� �¸�***");
				break;
			}
			//sniper����
			sniper.attack(tank);
			//���� tank�� �����ʰ�, 30%Ȯ���� change()ȣ��
			if(!tank.isAlive&&Math.random()<0.3){
				sniper=sniper.change();
			}
			//���� �׾��ٸ�, "sniper�� �¸�" ���, ���ѷ��� ����
			if(!tank.isAlive){
				System.out.println("***"+sniper.name+"�� �¸�***");
				break;
			}
		}//while 
		
	}//main method

}//War class
