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
	
	void add(T item) { //�ڽ��� ���� �߰� 
		list.add(item);
	}
	int size() { //�ڽ��� ���� ������ ��ȯ
		return list.size();
	}
	T get(int i) {
		return list.get(i); //�ڽ����� i+1��° ������ �ϳ��� ����
	}
	ArrayList<T> getList(){ //�ڽ��� ��� ������ ����
		return list;
	}
	@Override
	public String toString() {
		return list.toString();
	}
}
class ToyBox<T extends Toy> extends Box2<T>{  }
//ToyBox���� �峭���� ���� �� �ֵ��� ���� 

class FruitBox<T extends Fruit> extends Box2<T> { }
              //FruitŸ�Ը� �� �� �ִ�
//�� ���� Ÿ�Ը� ���� �� ������, FruitŬ������ �� �ڽĵ鸸 ���� �� �ֵ��� ����

//Fruit�� �ڽ��̸鼭 Eatable �������̽��� �����ؾ� �ϴ� Ÿ�Ը� �� �� �ֵ���
class FruitBox2<T extends Fruit & Eatable> extends Box2{
					//Ŭ���� ���� �������̽� ��
}

class FoodBox<T extends Eatable> extends Box2<T> {
//���� �� �ִ� ���ĸ� ���� �� �ֵ��� ����
//����!! �������̽��� extends ���	
	
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
		fruitbox.add(new Grape()); //������
//		fruitbox.add(new Toy()); ����	
//		Box2<Fruit> fruitbox = new Box2<Toy>();
		//���������� Ÿ�԰� ��ü�� Ÿ���� ��ġ X
		System.out.println("fruitBox:"+fruitbox);
		
		ToyBox<Toy> toybox = new ToyBox<>();
		toybox.add(new Toy());
		toybox.add(new Robot());
		toybox.add(new Block());
		
		Box2<Toy> toybox2 = new ToyBox<>();
		//���׸�Ŭ������ ��Ӱ���, TŸ���� ��ġ ==> ����
		//toybox���
		System.out.println("toyBox:"+toybox);
		//����� ���� �� �ִ� Box2��ü ����
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
		//Fruit�� Toy�� �ڽ��� �ƴ϶� ����
		
		FoodBox<Fruit> foodbox = new FoodBox<>();
		FoodBox<Vegetable> foodbox2 = new FoodBox<>();
		
		//���� ä�ҵ� ���� �� �ִ� ������ �� ��� FoodBox��ü ����
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
		//Apple Grape Juice ���
		System.out.println(Juicer.makeJuice2(fruitbox2));
		System.out.println(Juicer.makeJuice2(applebox3));
		System.out.println(Juicer.makeJuice2(grapebox2));
		
	}//end of main method

}//end of main class
