package day1010;

class Box{
	private Object object; //��� ������ ��ü�� ������ �ִ�

	public void setObject(Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
	
}//end of Box class

public class Work01 {//main class

	public static void main(String[] args) {
		Box box = new Box();
		
		box.setObject("�ǰ���"); //String�� Object�� �ٲ� ==>��ĳ����
		
		String str=(String)box.getObject(); //Object -> String ==>�ٿ�ĳ����
		
		box.setObject(new Fruit("���"));
		
		//"�ڽ��� ����:���"���
		System.out.println("�ڽ��� ����:"+((Fruit)box.getObject()).name);
		
		box.setObject(10); //��ü 10�� ���� 10 ���� Integer->Object
		
		int num = ((Integer)box.getObject());
		
		System.out.println("�ڽ��� ����:"+num);
	}//end of main method

}//end of main class