package day0917;

import java.util.ArrayList;
import java.util.Arrays;

abstract class Product{//추상메소드 없어도 추상클래스 만들기 가능
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
			System.out.println("구입불가");
			return;
		}
		money -=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p);
		System.out.println(p+"구매완료");
	}
	
	void summary() {
		if(item.isEmpty()==true) {
			System.out.println("구입하신 제품이 아닙니다.");
			return;
		}
		int sum=0;
		for(Object o:item) {
			sum+=((Product)o).price;
		}
		System.out.println("----------------------------");
		System.out.println("구입제품의 총액: "+sum+"\n잔액: "+money+"/포인트: "+bonusPoint+"\n구입제품: "+item);
		System.out.println("----------------------------");
	}
	void refund(Product p){
		//p찾아서 삭제
//		if(item.contains(p)==false) {
//			System.out.println("반품할 수 없습니다.");
//			return;
//		}
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println("반품이 완료 되었습니다.");	
		}else {
			System.out.println("반품할 수 없습니다.");
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
		b.refund(compu); // 반품할 수 없어요
		b.summary();
		b.buy(com); //같은 물건 또 저장(구입) 가능
		b.buy(com); 
		b.summary();
		
		
	}//end of main method
	
}//end of main class
