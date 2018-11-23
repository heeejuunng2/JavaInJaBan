package day19;
/*
 * <����Ŭ����(Wrapper classes)8��>
 * :�����ڷ���(8���� �ڷ���)�����͸� "��üȭ"�Ҷ� ����ϴ� Ŭ����
 *  ������: Integer, Long, Short, Byte
 *  �Ǽ���: Double, Float
 *  ������: Character
 *  ����: Boolean
 */
public class Work03 {//main class

	public static void main(String[] args) {
		Object[] o = {"ABC",1,3.14,true,'A'};
		
		for(Object obj:o){
			System.out.print(obj+" ");
		}
		
		System.out.println();
		
		Integer i=new Integer(10);
		//10�� Integer�� boxing�Ѵ�
		int num=i;
		System.out.println(i+10);
		//�ڵ� ��ڽ�(unboxing)
		
		Boolean b=new Boolean(true);
		if(b) { //��ڽ�
			System.out.println("b�� true");
		}
		
	}//main method

}//Work03 class
