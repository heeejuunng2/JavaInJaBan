package day1024;

public class Test02 {//main class

	public static void main(String[] args) {
		//hashcode�� ��ü�� ����� ��ġ�� �ǹ�
		//��ü�� �ּҰ��� �̿��ؼ� ����� ������
		//��� ��ü�� ���� �ؽ��ڵ�x
		
		Pokemon p = new Pokemon("Ǫ��",2,100);
		System.out.println(p.hashCode());
		
		Pokemon p2 = new Pokemon("Ǫ��",2,100);
		System.out.println(p2.hashCode());
		
		System.out.println(p.equals(p2)); //false
	}//end of main method

}//end of main calss
