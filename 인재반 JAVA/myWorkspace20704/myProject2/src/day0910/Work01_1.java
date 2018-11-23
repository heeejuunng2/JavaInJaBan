package day0910;

import java.util.Arrays;

abstract class Product implements Comparable<Product>{//�߻�޼ҵ� ��� �߻�Ŭ���� ����� ����
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
	private int i=0; //item �迭�� �ε��� ��ȣ
	Product[] item=new Product[10];
	
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
		item[i++]=p;
		System.out.println(p+"���ſϷ�");
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
		System.out.println("������ǰ�� �Ѿ�: "+sum+"\n�ܾ�: "+money+"/����Ʈ: "+bonusPoint+"\n������ǰ: "+p2);
		System.out.println("----------------------------");
	}
	void refund(Product p){
		//Arrays API�̿��ϱ�
		//����
		Arrays.sort(item,0,i);
						//i-1 ������
		//p�� ��ġã��
		int s=Arrays.binarySearch(item,0,i,p);
		if(s<0) {
			System.out.println("�����Ͻ� ��ǰ�� �ƴմϴ�");
		}
		//p��ġ�� �޺κп� ���ҵ��� ������ �����
		System.arraycopy(item, s+1, item, s, i-s-1);
		//3)system.arraycopy(�����迭,���������ε���,Ÿ�ٹ迭,Ÿ�ٽ����ε���,���簹��)
		item[i-1]=null;
		i--;
		System.out.println(p+"��ǰ �Ϸ�");
		money+=p.price;
		bonusPoint-=p.bonusPoint;
//		boolean find=false; //item�迭���� p�� �ִ��� ����
//		for(int j=0;j<=i;j++) {
//			if(item[j]==p) {
//				find=true;
//				money+=p.price;
//				bonusPoint-=p.bonusPoint;
//				System.out.println(p+"��ǰ�Ϸ�");
//				for(int k=j;k<i;k++) {//�� ���Ҹ� ������ �����ö�
//					//j: ��ǰ�� ��ġ�� item�迭 ��ġ��(index)
//					//i: 3
//					item[k]=item[k+1];
//				}
//			}
//		}//end of for
//		if(find==false) System.out.println("�����Ͻ� ��ǰ�� �ƴմϴ�");
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
