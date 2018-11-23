package day17;
/*
 * <Quiz01>
 * �Ʒ� Ŭ�������� ����� �κ��� �̾Ƴ��� Elem �߻�Ŭ������ ������
 * ! �߻�ȭ : Ŭ�������� �������� ã�� �θ� Ŭ������ ����� ��
 *    <-> ��üȭ : ������� �ڽ� Ŭ���� ����
 * 1) class Soldier{ //����
 * 		int x, y; //������ġ
 * 		void move(int x, int y){ //������ ��ġ �̵�}
 * 		void stop(){ //���� ��ġ�� ����}
 * 		void stimPack(){ //������ ���}
 * }
 * 2) class Marine{ //�غ�
 * 		int x, y; //���� ��ġ
 * 		void move(int x, int y){ //������ ��ġ �̵�}
 * 		void stop(){ //���� ��ġ�� ����}
 * 		void changeMode(){ //���ݸ�� ��ȯ}
 * }
 * 3) class Dropship{ //���ۼ�
 * 		int x, y; //������ġ
 * 		void move(int x, int y){ //������ ��ġ �̵�}
 * 		void stop(){ //���� ��ġ�� ����}
 * 		void load(){ //���ô���� �¿��}
 * 		void unload(){ //���ô���� ������}
 * }
 */
abstract class Elem{
	int x, y;
	abstract void move(int x, int y);
	abstract void stop();
}
class Soldier extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("���� �⵿");
	}
	void stop(){
		System.out.println("���� ��ġ�� ����");
	}
	void stimPack(){
		System.out.println("������ ���");
	}
	@Override
	public String toString() {
		return "����";
	}
}//Soldier class

class Marine extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("�غ� �⵿");
	}
	void stop(){
		System.out.println("���� ��ġ�� ����");
	}
	void changeMode(){
		System.out.println("���ݸ�� ��ȯ");
	}
	@Override
	public String toString() {
		return "�غ�";
	}
}
class Dropship extends Elem{
	int x, y;
	
	void move(int x, int y){
		System.out.println("���ۼ� ���");
	}
	void stop(){
		System.out.println("���� ��ġ�� ����");
	}
	void load(){
		System.out.println("�¿�");
	}
	void unload(){
		System.out.println("����");
	}
	@Override
	public String toString() {
		return "���ۼ�";
	}
}
public class Quiz01 {//main class

	public static void main(String[] args) {
		Elem[] group = new Elem[] {new Marine(), new Soldier(), new Dropship()};
		
		for(Elem e:group){
			e.move(200, 100);
			System.out.println(e);
		}
		
		Object[] ob={new Marine(),new Soldier(),new Dropship()};
		
		for(Object obj:ob){
			System.out.println(obj);
			//obj.move(200,100); 
			//Object Ŭ�������� move�� ���⶧���� �ȵ�
		}

	}//main method

}//Quiz01 class
