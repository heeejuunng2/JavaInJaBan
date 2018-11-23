package day1010.generic;
/*
 * <Quiz>
 * 아래 내용을 읽고, T Cup 클래스를 만들어보세요
 * Cup클래스는 모든 종류의 음료 객체(beverage)를 담을 수 있다
 * 음료 객체는 Beer와 Boricha 객체가 올 수 있다
 * - beverage 필드는 캡슐화되어 있다
 * - 생성자는 없고, setter&getter를 통해 필드에 값을 저장하고 읽어올수 있다
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
		//Cup cup = new Cup(); 이것도 가능 //T->Object로 인식
		Cup<Beer> beercup = new Cup<>();
		beercup.setBeverage(new Beer());
		//beercup.setBeverage(new Boricha());
		
		//보리차만 담을 수 있는 Cup객체 생성
		Cup<Boricha> borichacup = new Cup<>();
		borichacup.setBeverage(new Boricha());
		
	}//end of main method

}//end of main class
