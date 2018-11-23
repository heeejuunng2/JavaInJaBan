package day0518;

import java.util.Scanner;

//로또 번호 생성 클래스
//로또 번호 : 1~45까지 중복 X, 숫자 6개

public class Lotto { 
	//필드
	//클래스 안에있는 필드는 자동으로 초기화 됨
	int[] lottonum; //컴퓨터가 생성할 로또 번호
	int[] inputnum; //사용자가 입력할 로또 번호
	int count; //맞춘 수
	Scanner sc=new Scanner(System.in);
	
	//생성자 : 반환 타입이 없다!
	public Lotto(){
		//배열생성
		lottonum=new int[6];
		inputnum=new int[6];
		sc=new Scanner(System.in);
	}//기본 생성자
	
	//메소드
	void makeNumber() {//로또 번호 생성
		for(int i=0; i<lottonum.length;i++) {
		 lottonum[i] = (int)(Math.random()*45)+1;
		 for(int j=0; j<i;j++) {
			if(lottonum[i]==lottonum[j]) {
			     i--;   
			     break;
			     //i를 감소시켜서 배열 주소값을 1줄여줌
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
		System.out.println("========로또 번호========");
		//확장 for문을 통해 lottonum배열의 값을 출력
		//줄바꿈 ㄴㄴ
		for(int a:lottonum){
			System.out.print(a+" ");
		}
		System.out.println("\n========나의 번호========");
		//확장 for문을 통해 inputnum배열의 값을 출력
		//줄바꿈 ㄴㄴ
		for(int a:inputnum){
			System.out.print(a+" ");
		}
		System.out.println("\n========당첨 결과========");
		if(count==6){
			System.out.println("축하합니다. 모두 맞추셨습니다!");
		}else {
			System.out.println(count+"개 맞추셨습니다");
		}
	}//show mehtod
	
	void input(){
		System.out.println("로또 번호 입력하세요\n"+"(1~45의 6개 숫자 입력)");
		//입력받은 6개의 숫자를 inputnum배열에 저장
		for(int i=0;i<inputnum.length;i++){
			int input=sc.nextInt();
			inputnum[i]=input;
		}
	}//input method
	
	void checkSame(){ //lottonum배열과 inputnum배열을 비교해서 
					 //같은 수가 나오면 count를 1씩 증가
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
