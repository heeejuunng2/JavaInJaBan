package day11;
/*
 * <���Ἲ�� ����ȭ>
 * 1. ���Ἲ(������ ���� ����)& ����ȭ(�����ͺ�ȣ�� ���� ����°�)
 *    ===>��ü���� ������ 'ĸ��ȭ'
 * 2. ����
 *    ���������private�̳� protected�� ����
 *    ���������� ������ �� �ֵ��� ����ٸ�(public�޼ҵ�)�� �����
 *    1)getter:��������� ���� �ܺο� �����ϴ� �޼ҵ�
 *    		   public ����ڷ��� get��������̸�(){
 *    				return ���;	
 *    			}
 *    2)setter:�ܺ��� ��û�� ������ ��������� ���� �����ϴ� �޼ҵ�
 *    		   public void set��������̸�(����ڷ��� �Ű�������){
 *    				this.���=���ڰ�;
 *    			}
 */
class Std{
	
	String name;
	private int age;
	//�⺻������
	public Std(){
		//name�� who, age�� 1�� ������ ȣ��
		this("who",1);
	}
	//name, age�� �Ű��� �ϴ� ������
	public Std(String name,int age){
		this.name=name;
		setAge(age);
	}
	//��getter
	public int getAge(){
		return age;
	}
	//��setter
	//age�� 1������ 110������ ����
	//�� ���� �ƴ϶�� age=0;
	public void setAge(int age){
		if(age>=1&&age<=110){
			this.age=age;
		}else{
			age=0;
		}
	}
	
}//Std class

public class Work03 {//main class

	public static void main(String[] args) {
		Std s=new Std();
		s.name="pika";
		s.setAge(20);

		System.out.println(s.name+s.getAge());
	}//main method

}//Work03 class
