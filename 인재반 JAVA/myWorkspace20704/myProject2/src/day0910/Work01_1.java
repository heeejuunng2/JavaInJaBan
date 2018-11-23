package day0910;

import java.util.Arrays;

abstract class Product implements Comparable<Product>{//추상메소드 없어도 추상클래스 만들기 가능
	int price;
	int bonusPoint;
	
	Product(){
		price=0;
	}
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price*0.1);
	}
	@Override
		public int compareTo(Product o) {
			return this.toString().compareTo(o.toString());
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
	private int i=0; //item 배열의 인덱스 번호
	Product[] item=new Product[10];
	
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
		item[i++]=p;
		System.out.println(p+"구매완료");
	}
	
	void summary() {
		int sum=0;
		String p2="";
		for(Product p:item) {
			if(p==null) {
				break;
			}
			sum+=p.price;
			p2+=p.toString()+",";
		}
		System.out.println("----------------------------");
		System.out.println("구입제품의 총액: "+sum+"\n잔액: "+money+"/포인트: "+bonusPoint+"\n구입제품: "+p2);
		System.out.println("----------------------------");
	}
	void refund(Product p){
		//Arrays API이용하기
		//정렬
		Arrays.sort(item,0,i);
						//i-1 까지임
		//p의 위치찾기
		int s=Arrays.binarySearch(item,0,i,p);
		if(s<0) {
			System.out.println("구매하신 제품이 아닙니다");
		}
		//p위치의 뒷부분에 원소들을 앞으로 땡기기
		System.arraycopy(item, s+1, item, s, i-s-1);
		//3)system.arraycopy(원본배열,원본시작인덱스,타겟배열,타겟시작인덱스,복사갯수)
		item[i-1]=null;
		i--;
		System.out.println(p+"반품 완료");
		money+=p.price;
		bonusPoint-=p.bonusPoint;
//		boolean find=false; //item배열에서 p가 있는지 여부
//		for(int j=0;j<=i;j++) {
//			if(item[j]==p) {
//				find=true;
//				money+=p.price;
//				bonusPoint-=p.bonusPoint;
//				System.out.println(p+"반품완료");
//				for(int k=j;k<i;k++) {//위 원소를 앞으로 가져올때
//					//j: 반품할 위치의 item배열 위치값(index)
//					//i: 3
//					item[k]=item[k+1];
//				}
//			}
//		}//end of for
//		if(find==false) System.out.println("구매하신 제품이 아닙니다");
	}
	
}//end of Buyer class
public class Work01_1 {//main class
	
	public static void main(String[] args) {
		Tv tv=new Tv();
		Computer com=new Computer();
		Audio a=new Audio();
		Buyer b=new Buyer(500);
		b.buy(tv);
		b.buy(com);
		b.buy(a);
		b.summary();
		b.refund(com);
		b.summary();
		
		
	}//end of main method
	
}//end of main class
