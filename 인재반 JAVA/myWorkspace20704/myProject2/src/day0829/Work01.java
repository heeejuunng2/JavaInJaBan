package day0829;
/*
 * <Quiz01>
 * 1. Phone class
 *    1) �ʵ� : protected String owner
 *    2) ������ : ��� �ʵ� �ʱ�ȭ
 *    3) �޼��� : void talk() => "owner�� ��ȭ��"
 * 2. Telephone class : Phone class�� �ڽ�
 *    1) �ʵ� : private String when
 *    2) ������ : ��� �ʵ� �ʱ�ȭ
 *    3) �޼��� : void autoAnswering()
 *              => "owner�� ����. when�� ��ȭ�ٷ�"
 * 3. Smartphone class : Telephone class�� �ڽ�
 *    1) �ʵ� : private String game
 *    2) ������ : ��� �ʵ� �ʱ�ȭ
 *    3) �޼��� : void playGame()
 *              => "owner�� game�� �ϴ� ���̾�"���
 */
class Phone{
	protected String owner;
	
	Phone(){
		
	}
	Phone(String owner){
		this.owner=owner;
	}
	void talk() {
		System.out.println(owner+"�� ��ȭ��");
	}
}
class Telephone extends Phone{
	private String when;
	
	Telephone(){
		
	}
	Telephone(String owner,String when){
		super(owner);
		this.when=when;
	}
	void autoAnswering() {
		System.out.println(owner+"�� ����."+when+" ��ȭ�ٷ�?");
	}
}
class Smartphone extends Telephone{
	private String game;
	
	Smartphone(){
		
	}
	Smartphone(String owner,String when,String game){
		super(owner,when);
		this.game=game;
	}
	void playGame() {
		System.out.println(owner+"�� "+game+"�� �ϴ����̾�");
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		Phone[] phone= {new Phone("���뺸��"),
				    new Telephone("���θ�","����"),
				    new Smartphone("�ʺθ�"," ","��Ű��")};
		
		//�ڽ��� �θ� ����Ű�� ����
		//Phone�� Phone�� ����Ű��
		//Telephone�� Phone�� Telephone�� ����Ŵ
		//Smartphone�� Phone,Telephone,Smartphone�� ����Ŵ
		for(Phone p:phone) {
		if(p instanceof Smartphone) {
			((Smartphone) p).playGame();
		}else if(p instanceof Telephone) {
			((Telephone) p).autoAnswering();
		}else if(p instanceof Phone) {
			p.talk();
		}
		}

	}//end of main method

}//end of Work01 class
