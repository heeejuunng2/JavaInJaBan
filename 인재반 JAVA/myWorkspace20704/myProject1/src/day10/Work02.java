package day10;
/*
 * <�⺻�� ��ȯŸ�� & ������ ��ȯŸ��>
 * -�⺻�� : �⺻�� ���ϰ��� ��ȯ(return a; (a�� int))
 * -������ : ���۷��� ������ ��ȯ(return P; (P�� ��������))
 * 
 */
class Data{
	int x;
	
}//Data class

public class Work02 {//main class
	public static Data copy(Data d){
		Data tmp=new Data();
		tmp.x=d.x;
		return tmp;
	}//copy method
	
	public static void main(String[] args) {
		Data d=new Data();
		d.x=100;
		Data d2=copy(d);
		System.out.println("d.x: "+d.x);
		System.out.println("d2.x:"+d2.x);

	}//main method

}//Work02 class
