package day13;
/*
 * <������(polymorphism)>
 * �����߿�! ��û�߿�! ¯�߿�!
 * - �� Ÿ���� ���������� ���� Ÿ���� ��ü�� ������ �� �ִ� ����
 *   (����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ����)
 *   �θ�Ÿ���� ��������=�ڽİ�ü�ּ�
 *   (�θ�Ÿ���� ��� �ڽ�Ÿ���� ��ȭ�� �� �ִ�)
 * 
 * �������� ����:
 * 1. �迭�� �پ��� Ÿ���� ��ü�� ������ �� �ִ�.
 * 2. ���ڰ����� �پ��� Ÿ���� ��ü�� ���� �� �ִ�.
 */
class Pokemon{
	String name;
	
	Pokemon(){ //�⺻������
		
	}
	Pokemon(String name){
		this.name=name;
	}
	void notice(){
		System.out.println("==POKEMON==");
	}
	void attack(Pokemon p){
		System.out.println(this.name+"�� "+p.name+"��(��) ����");
	}
} 
class Pikachu extends Pokemon{
	Pikachu(){
		super("��ī��");
	}
	@Override
	void notice() {
		System.out.println("==PIKACHU==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"�� "+p.name+"��(��) �鸸��Ʈ ����");
	}
}
class Raichu extends Pokemon{
	Raichu(){
		super("������");
	}
	@Override
	void notice() {
		System.out.println("==RAICHU==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"�� "+p.name+"��(��) õ����Ʈ ����");
	}
}
class Ggobuki extends Pokemon{
	Ggobuki(){
		super("���α�");
	}
	@Override
	void notice() {
		System.out.println("==GGOBUKI==");
	}
	@Override
	void attack(Pokemon p) {
		System.out.println(this.name+"�� "+p.name+"��(��) ������ ����");
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		Pokemon p=null; //�θ�Ÿ��
		
		p=new Pokemon();
		p=new Pikachu();
		p=new Raichu();
		p=new Ggobuki();
		
		Pokemon[] arr={new Pikachu(),new Raichu(),new Ggobuki(),new Pokemon()};
		
		for(Pokemon pp:arr){
			pp.notice();
		}
		//��ī�� ������ ����
		arr[0].attack(arr[1]);
		//���αⰡ ��ī�� ����
		arr[2].attack(arr[0]);
		
	}//main method

}//Work01 class
