package day1010.generic;
/*
 * <Quiz>
 * �Ʒ� ������ �а�, T Cup Ŭ������ ��������
 * CupŬ������ ��� ������ ���� ��ü(beverage)�� ���� �� �ִ�
 * ���� ��ü�� Beer�� Boricha ��ü�� �� �� �ִ�
 * - beverage �ʵ�� ĸ��ȭ�Ǿ� �ִ�
 * - �����ڴ� ����, setter&getter�� ���� �ʵ忡 ���� �����ϰ� �о�ü� �ִ�
 */
class Cup<T>{
	private T beverage;
	
	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
	public T getBeverage() {
		return beverage;
	}
	
}
class Beer{
	
}
class Boricha{
	
}
public class Quiz02 {//main class

	public static void main(String[] args) {
		//Cup cup = new Cup(); �̰͵� ���� //T->Object�� �ν�
		Cup<Beer> beercup = new Cup<>();
		beercup.setBeverage(new Beer());
		//beercup.setBeverage(new Boricha());
		
		//�������� ���� �� �ִ� Cup��ü ����
		Cup<Boricha> borichacup = new Cup<>();
		borichacup.setBeverage(new Boricha());
		
	}//end of main method

}//end of main class
