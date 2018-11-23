package day1010.generic;

import java.util.ArrayList;

class Fruit implements Eatable{
	@Override
	public String toString() {
		return "Fruit";
	}
}//end of Fruit class
class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}//end of Apple class
class Grape extends Fruit{
	@Override
	public String toString() {
		return "Grape";
	}
}//end of Grape class
class Toy{
	@Override
	public String toString() {
		return "Toy";
	}
}//end of Toy class
class Robot extends Toy{
	@Override
	public String toString() {
		return "Robot";
	}
}//end of Robot class
class Block extends Toy{
	@Override
	public String toString() {
		return "Block";
	}
}//end of Block class

class Box2<T>{
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) { //박스에 물건 추가 
		list.add(item);
	}
	int size() { //박스의 물건 갯수를 반환
		return list.size();
	}
	T get(int i) {
		return list.get(i); //박스에서 i+1번째 물건을 하나만 꺼냄
	}
	ArrayList<T> getList(){ //박스의 모든 물건을 꺼냄
		return list;
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
class ToyBox<T extends Toy> extends Box2<T>{  }
//ToyBox에는 장난감만 넣을 수 있도록 수정 

class FruitBox<T extends Fruit> extends Box2<T> { }
              //Fruit타입만 올 수 있다
//한 종류 타입만 담을 수 있지만, Fruit클래스와 그 자식들만 담을 수 있도록 제한

//Fruit의 자식이면서 Eatable 인터페이스도 구현해야 하는 타입만 올 수 있도록
class FruitBox2<T extends Fruit & Eatable> extends Box2{
					//클래스 먼저 인터페이스 후
}

class FoodBox<T extends Eatable> extends Box2<T> {
//먹을 수 있는 음식만 담을 수 있도록 제한
//주의!! 인터페이스도 extends 사용	
	
}

interface Eatable{}

class Vegetable implements Eatable{
	@Override
	public String toString() {
		return "Vegetable";
	}
}
class Carrot extends Vegetable{
	@Override
	public String toString() {
		return "carrot";
	}
}
public class BoxEx04 {//main class

	public static void main(String[] args) {
		Box2<Fruit> fruitbox = new Box2<>();
		fruitbox.add(new Fruit());
		fruitbox.add(new Apple()); //add(Fruit item)
		fruitbox.add(new Grape()); //다형성
//		fruitbox.add(new Toy()); 오류	
//		Box2<Fruit> fruitbox = new Box2<Toy>();
		//참조변수의 타입과 객체의 타입이 일치 X
		System.out.println("fruitBox:"+fruitbox);
		
		ToyBox<Toy> toybox = new ToyBox<>();
		toybox.add(new Toy());
		toybox.add(new Robot());
		toybox.add(new Block());
		
		Box2<Toy> toybox2 = new ToyBox<>();
		//지네릭클래스가 상속관계, T타입이 일치 ==> 가능
		//toybox출력
		System.out.println("toyBox:"+toybox);
		//사과만 담을 수 있는 Box2객체 생성
		Box2<Apple> applebox = new Box2<>();
		applebox.add(new Apple());
//		applebox.add(Grape());
		
		FruitBox<Apple> applebox2 = new FruitBox<>();
		applebox2.add(new Apple());
//		applebox2.add(new Fruit());
		
//		FruitBox<Toy> applebox3 = new FruitBox<>();
		FruitBox<Apple> applebox3 = new FruitBox<>();
		FruitBox<Fruit> fruitbox4 = new FruitBox<>();
		FruitBox<Grape> grapebox2 = new FruitBox<>();
		
//		ToyBox<Fruit> toybox3 = new ToyBox<>();
		//Fruit는 Toy의 자식이 아니라서 오류
		
		FoodBox<Fruit> foodbox = new FoodBox<>();
		FoodBox<Vegetable> foodbox2 = new FoodBox<>();
		
		//과일 채소등 먹을 수 있는 모든것을 다 담는 FoodBox객체 생성
		FoodBox<Eatable> foodbox3 = new FoodBox<>();
		foodbox3.add(new Fruit());
		foodbox3.add(new Vegetable());
		foodbox3.add(new Carrot());
		foodbox3.add(new Grape());
		
		System.out.println("foodbox: "+foodbox3);
		
		System.out.println("==================================");
		FruitBox<Fruit> fruitbox2 = new FruitBox<>();
		fruitbox2.add(new Apple());
		fruitbox2.add(new Grape());
		
		System.out.println(Juicer.makeJuice(fruitbox2));
		//Apple Grape Juice 출력
		System.out.println(Juicer.makeJuice2(fruitbox2));
		System.out.println(Juicer.makeJuice2(applebox3));
		System.out.println(Juicer.makeJuice2(grapebox2));
		
	}//end of main method

}//end of main class
