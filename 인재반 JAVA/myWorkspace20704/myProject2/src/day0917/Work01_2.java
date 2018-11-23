package day0917;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Product{//�߻�޼ҵ� ��� �߻�Ŭ���� ����� ����
	int price;
	int bonusPoint;
	
	Product(){
		price=0;
	}
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price*0.1);
	}
}//end of Product class
class Tv extends Product{
	Tv(){
		super(100);
	}
	@Override
	public String toString() {
		return "TV";
	}
}//end of Tv class
class Computer extends Product{
	Computer(){
		super(200);
	}
	@Override
	public String toString() {
		return "Computer";
	}
}//end of Computer class
class Audio extends Product{
	Audio(){
		super(50);
	}
	@Override
	public String toString() {
		return "Audio";
	}
}//end of Audio class
class Buyer{
	int money;
	int bonusPoint;
	ArrayList item = new ArrayList(10);
	
	Buyer(int money) {
		this.money=money;
	}
	void buy(Product p){
		if(money<p.price) {
			System.out.println("���ԺҰ�");
			return;
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p);
		System.out.println(p+"���ſϷ�");
	}
	
	void summary() {
		if(item.isEmpty()==true) {
			System.out.println("�����Ͻ� ��ǰ�� �ƴմϴ�.");
			return;
		}
		int sum=0;
		for(Object o:item) {
			sum+=((Product)o).price;
		}
		System.out.println("----------------------------");
		System.out.println("������ǰ�� �Ѿ�: "+sum+"\n�ܾ�: "+money+"/����Ʈ: "+bonusPoint+"\n������ǰ: "+item);
		System.out.println("----------------------------");
	}
	void refund(Product p){
		//pã�Ƽ� ����
//		if(item.contains(p)==false) {
//			System.out.println("��ǰ�� �� �����ϴ�.");
//			return;
//		}
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println("��ǰ�� �Ϸ� �Ǿ����ϴ�.");	
		}else {
			System.out.println("��ǰ�� �� �����ϴ�.");
		}
	}
	
}//end of Buyer class
public class Work01_2 {//main class
	
	public static void main(String[] args) {
		Tv tv=new Tv();
		Computer com=new Computer();
		Computer compu=new Computer();
		Audio a=new Audio();
		Buyer b=new Buyer(1000);
		b.buy(tv);
		b.buy(com);
		b.buy(a);
		b.summary();
		b.refund(com);
		b.refund(compu); // ��ǰ�� �� �����
		b.summary();
		b.buy(com); //���� ���� �� ����(����) ����
		b.buy(com); 
		b.summary();
		
		
	}//end of main method
	
}//end of main class
