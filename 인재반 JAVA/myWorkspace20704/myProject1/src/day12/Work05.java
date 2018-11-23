package day12;
/*
 * �θ�: Book
 *  -�ʵ�:title(å�̸�),price(����)
 * �ڽ�1: Novel
 *  -�ʵ�:title,price,writer,publisher(���ǻ�)
 * �ڽ�2: Comic
 *  -�ʵ�:title,price,writer,hero,publisher(���ǻ�)
 * �ڽ�3: Textbook
 *  -�ʵ�:title,price,subject
 * 
 * 1. 4�� Ŭ������ ��� ������ ����ϴ� String show()�޼ҵ带 ���弼��
 * 	  (�������̵� �̿�)
 * 2. �����ڸ� ���弼��
 * 	  -�⺻������
 *    -��� �ʵ带 �Ű������� �ϴ� ������
 */
class Book{
	String title;
	int price;
	
	Book(){
		
	}
	Book(String title,int price){
		this.title=title;
		this.price=price;
	}
	String show(){
		return "����:"+title+"\n����:"+price;
	}
}

class Novel extends Book{
	String writer;
	String publisher;
	
	Novel(){
		
	}
	Novel(String title,int price,String writer,String publisher){
		super(title,price);
		this.writer=writer;
		this.publisher=publisher;
	}
	@Override
	String show() {
		return super.show()+"\n����:"+writer+"\n���ǻ�:"+publisher;
	}
}

class Comic extends Novel{
	String hero;
	
	Comic(){
		
	}
	Comic(String title,int price,String writer,String publisher,String hero){
		super(title,price,writer,publisher);
		this.hero=hero;
	}
	@Override
	String show() {
		return super.show()+"\n����:"+writer+"\n�����̸�:"+hero+"\n���ǻ�:"+publisher;
	}
}

class Textbook extends Book{
	String subject;
	
	Textbook(){
		
	}
	Textbook(String title,int price,String subject){
		super(title,price);
		this.subject=subject;
	}
	@Override
	String show() {
		return super.show()+"\n����:"+subject;
	}
}

public class Work05 {//main class
	
	public static void main(String[] args) {
		
	}//main method
	
}//Work05 class
