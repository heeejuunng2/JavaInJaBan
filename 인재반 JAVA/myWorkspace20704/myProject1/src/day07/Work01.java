package day07;

import java.util.Scanner;

/*
 * <배열활용 Quiz>
 * 1. Scanner로 인원수를 입력받는다
 * 2. 인원수만큼 학생이름, 국어점수, 영어점수, 수학점수를 입력받아서
 * 	  name배열, kor배열, eng배열, mat배열에 저장한다
 * 3. 학생의 국어, 영어, 수학 점수의 총합을 tot배열에 저장한다
 * 4. tot점수에 따라 순위를 매기고 rank배열에 저장한다
 * 5. 이름	국어		영어		수학		총점		순위 순으로
 * 	  모든 배열의 내용을 출력한다
 */
public class Work01 { //main class
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("인원수 입력");
		//1. 인원수 입력받아서 저장
		int a=sc.nextInt(); //인원수 입력
		//2. 인원수만큼 배열 생성
		String[] name=new String[100];
		int[] kor=new int[a];
		int[] eng=new int[a];
		int[] mat=new int[a];
		int[] tot=new int[a];
		//3. 배열의 값을 입력받아서 저장(name,kor,eng,mat)
		//	 tot배열에는 합을 저장
		for(int i=0;i<a;i++){
			System.out.println(i+1+"번째 이름입력");
			String name1=sc.next();
			name[i]=name1;
			System.out.println(i+1+"번째 국어점수입력");
			int kor1=sc.nextInt();
			kor[i]=kor1;
			System.out.println(i+1+"번째 영어점수입력");
			int eng1=sc.nextInt();
			eng[i]=eng1;
			System.out.println(i+1+"번째 수학점수입력");
			int mat1=sc.nextInt();
			mat[i]=mat1;
			tot[i]=kor[i]+eng[i]+mat[i];
		}//for
		//4. tot배열의 값을 기준으로 순위를 산출해서 rank배열에 저장
		int[] rank=new int[a];
		for(int i=0;i<a;i++){
			rank[i]=1;
			for(int j=0;j<a;j++){
				if(tot[i]<tot[j]){
					rank[i]++;
				}//if
			}//for2
	
		}//for
		//5. 출력
		System.out.println("\t이름\t국어\t영어\t수학\t합계\t순위");
		for(int i=0;i<a;i++){
		System.out.println(i+1+"\t"+name[i]+"\t"+kor[i]+"\t"+
						eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+rank[i]);}//for
		
		
	} //main method

} //Work01 class
