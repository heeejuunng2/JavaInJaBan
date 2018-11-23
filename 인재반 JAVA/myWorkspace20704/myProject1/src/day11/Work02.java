package day11;
/*
 * <����������> : �ٸ� Ŭ�����鿡�� ����Ǵ� ������ ����
 * 1. public : ����/�ٸ� ��Ű���� ��� Ŭ���� O
 * 	  ==>Ŭ���� , �ʵ�, ������, �޼ҵ�
 * 2. protected : ���� ��Ű���� O, �ٸ� ��Ű���� ���, �ڽ�Ŭ���������� O
 *    ==>�ʵ�,������,�޼ҵ�
 * 3. (�ƹ��͵� ����) : (default), ���� ��Ű���� Ŭ���� O\
 *    ==>Ŭ����, �ʵ�, ������, �޼ҵ�
 * 4. private : ���� Ŭ���������� O
 * 	  ==>�ʵ�, ������, �޼ҵ�
 * 
 * �����������ڸ� ���� ����ȭ�� �� �� �ִ�.
 */
public class Work02 {//main class
	public String s1="public field";
		   String s2="default field";
	protected String s3="protected field";
	private String s4="private field";
	
	public void m1(){
		System.out.println("public method");
	}
	
	void m2(){
		System.out.println("default method");
	}
	
	protected void m3(){
		System.out.println("protected method");
	}
	
	private void m4(){
		System.out.println("private method");
	}
	
	public static void main(String[] args) {
		//public,default,protected,private ���ٰ���
		Work02 w=new Work02();
		System.out.print(w.s1+" ");
		System.out.print(w.s2+" ");
		System.out.print(w.s3+" ");
		System.out.println(w.s4);
		w.m1();
		w.m2();
		w.m3();
		w.m4();

	}//main method

}//Work02 class
