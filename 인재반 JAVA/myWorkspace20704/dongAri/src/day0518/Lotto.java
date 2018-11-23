package day0518;

import java.util.Scanner;

//�ζ� ��ȣ ���� Ŭ����
//�ζ� ��ȣ : 1~45���� �ߺ� X, ���� 6��

public class Lotto { 
	//�ʵ�
	//Ŭ���� �ȿ��ִ� �ʵ�� �ڵ����� �ʱ�ȭ ��
	int[] lottonum; //��ǻ�Ͱ� ������ �ζ� ��ȣ
	int[] inputnum; //����ڰ� �Է��� �ζ� ��ȣ
	int count; //���� ��
	Scanner sc=new Scanner(System.in);
	
	//������ : ��ȯ Ÿ���� ����!
	public Lotto(){
		//�迭����
		lottonum=new int[6];
		inputnum=new int[6];
		sc=new Scanner(System.in);
	}//�⺻ ������
	
	//�޼ҵ�
	void makeNumber() {//�ζ� ��ȣ ����
		for(int i=0; i<lottonum.length;i++) {
		 lottonum[i] = (int)(Math.random()*45)+1;
		 for(int j=0; j<i;j++) {
			if(lottonum[i]==lottonum[j]) {
			     i--;   
			     break;
			     //i�� ���ҽ��Ѽ� �迭 �ּҰ��� 1�ٿ���
			   }//if
		 	}//for
		 }//for
	}//makeNumber method
	
	void makeNumber2(){
		for(int i=0;i<lottonum.length;i++){
			int rnd=(int)(Math.random()*45)+1;
		for(int j=0;j<i;j++){
			if(lottonum[j]==rnd){
				i--;
				break;
				}
			}
		lottonum[i]=rnd;
		}
	}
	
	void show(){
		System.out.println("========�ζ� ��ȣ========");
		//Ȯ�� for���� ���� lottonum�迭�� ���� ���
		//�ٹٲ� ����
		for(int a:lottonum){
			System.out.print(a+" ");
		}
		System.out.println("\n========���� ��ȣ========");
		//Ȯ�� for���� ���� inputnum�迭�� ���� ���
		//�ٹٲ� ����
		for(int a:inputnum){
			System.out.print(a+" ");
		}
		System.out.println("\n========��÷ ���========");
		if(count==6){
			System.out.println("�����մϴ�. ��� ���߼̽��ϴ�!");
		}else {
			System.out.println(count+"�� ���߼̽��ϴ�");
		}
	}//show mehtod
	
	void input(){
		System.out.println("�ζ� ��ȣ �Է��ϼ���\n"+"(1~45�� 6�� ���� �Է�)");
		//�Է¹��� 6���� ���ڸ� inputnum�迭�� ����
		for(int i=0;i<inputnum.length;i++){
			int input=sc.nextInt();
			inputnum[i]=input;
		}
	}//input method
	
	void checkSame(){ //lottonum�迭�� inputnum�迭�� ���ؼ� 
					 //���� ���� ������ count�� 1�� ����
		for(int a:lottonum){
			for(int b:inputnum){
				if(a==b){
					count++;
				}
			}
		}
	}//checkSame method
	
	void run(){
		input();
		makeNumber();
		checkSame();
		show();
	}//run method
	
}//Lotto class
