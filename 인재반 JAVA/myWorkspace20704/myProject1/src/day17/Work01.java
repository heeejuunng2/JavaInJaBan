package day17;
/*
 * <abstract>
 *  :Ŭ����, �޼��忡 ����
 *  1. �߻�Ŭ������?
 *  - �̿ϼ� ���赵 : ��ü ���� �Ұ���, ����� ���ؼ� �ڽ�Ŭ������ ���ؼ��� �ϼ� ����
 *  - ��������  1) �ڽ�Ŭ�������� ����� �ʵ�� �޼����� �̸��� ����
 *  	     2) Ŭ���� �ڼ��� �� �ð��� ���� 
 *  2. �߻�޼ҵ�
 *  - �ٵ�κ�(�߰�ȣ �κ�)�� ���� , ���� �κи� ����
 *  abstract public void attack(Unit enemy);
 *  //abstract ������ �ݵ�� �ڽ�Ŭ�������� �����ؾ��� ���ϸ� ������
 */
abstract class Shape{
	abstract double getArea();
}//Shape class

class Circle extends Shape{
	double r;
	@Override
	double getArea() {
		return r*r*Math.PI;
	}
}
public class Work01 {//main class

	public static void main(String[] args) {
		System.out.println("20704");
		Shape s=new Circle(); //������
		//Shape sh=new Shape(); �̰Ŵ� �ȵ�
		
		Shape sh= new Shape(){ //�͸�Ŭ����
			@Override
			double getArea() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		//<�͸�Ŭ����>
		// : �߻�Ŭ����, �������̽��� ��üȭ�Ҷ�
		//   �ű⿡ ����� �߻�޼ҵ���� �Ｎ���� �������̵�
		sh.getArea();
		
	}//main method

}//Work01 class
