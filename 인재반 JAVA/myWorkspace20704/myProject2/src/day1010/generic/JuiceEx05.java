package day1010.generic;
/*
 * <���׸� �޼���>
 * : �޼����� ����ο� ���׸� Ÿ���� ����� �޼���
 *   (�޼��� ��ȯŸ�� �ٷ� �տ� ����)
 *  ����! ���׸�Ŭ������ ���ǵ� Ÿ�Ժ����� ���׸��޼��忡 ���ǵ� Ÿ�Ժ����� ����!!
 */
class Juice{
	String name; //�ֽ� �̸�
	Juice(String name){
		this.name = name;
	}
	@Override
	public String toString() {
		return name+"Juice";
	}
}//end of Juice class

class Juicer{
	//static������� Ÿ�Ժ���<T> ��� �Ұ�
	//�ƿ� ���׸� �������� �ʰų� Ÿ�Ժ��� ��� Ư�� Ÿ���� �����������
	static Juice makeJuice(FruitBox<Fruit> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box��ü list�� ����ִ� ��ü �����ؼ� ���*/
	}
	//�Ű������� Apple�� FruitBox��ü�� �޵��� makeJuice()�� �����ε� => �Ұ���
	// ==> ���׸��� �ٸ������δ� �����ε� ���� X
//	static Juice makeJuice(FruitBox<Apple> box){
//		String tmp="";
//		for(Fruit f : box.getList()) {
//			tmp+=f+" "; //Apple Grape 
//		}
//		return new Juice(tmp);
//		/*box��ü list�� ����ִ� ��ü �����ؼ� ���*/
//	}
	static Juice makeJuice2(FruitBox<? extends Fruit> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box��ü list�� ����ִ� ��ü �����ؼ� ���*/
	}
	/*
	 * ���ϵ� ī��
	 * <? extends T> : T�� �� �ڼյ鸸 ����
	 * <? super T> : T�� �� ����鸸 ����
	 * <?> : ��� Ÿ���� ����, <T> �Ǵ� <? extends Object>�� ����
	 */
	
	//makeJuice()�� ���׸��޼���� ����
	//static����� Ÿ�Ժ��� ���X but ���׸�Ÿ���� �����ϰ� T��� ����
	static <T extends Fruit>Juice makeJuice3(FruitBox<T> box){
		String tmp="";
		for(Fruit f : box.getList()) {
			tmp+=f+" "; //Apple Grape 
		}
		return new Juice(tmp);
		/*box��ü list�� ����ִ� ��ü �����ؼ� ���*/
	}
	
	
}//end of Juicer class

public class JuiceEx05 {//main class

	public static void main(String[] args) {

		
	}//end of main method

}//end of main class
