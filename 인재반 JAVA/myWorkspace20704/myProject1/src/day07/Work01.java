package day07;

import java.util.Scanner;

/*
 * <�迭Ȱ�� Quiz>
 * 1. Scanner�� �ο����� �Է¹޴´�
 * 2. �ο�����ŭ �л��̸�, ��������, ��������, ���������� �Է¹޾Ƽ�
 * 	  name�迭, kor�迭, eng�迭, mat�迭�� �����Ѵ�
 * 3. �л��� ����, ����, ���� ������ ������ tot�迭�� �����Ѵ�
 * 4. tot������ ���� ������ �ű�� rank�迭�� �����Ѵ�
 * 5. �̸�	����		����		����		����		���� ������
 * 	  ��� �迭�� ������ ����Ѵ�
 */
public class Work01 { //main class
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ο��� �Է�");
		//1. �ο��� �Է¹޾Ƽ� ����
		int a=sc.nextInt(); //�ο��� �Է�
		//2. �ο�����ŭ �迭 ����
		String[] name=new String[100];
		int[] kor=new int[a];
		int[] eng=new int[a];
		int[] mat=new int[a];
		int[] tot=new int[a];
		//3. �迭�� ���� �Է¹޾Ƽ� ����(name,kor,eng,mat)
		//	 tot�迭���� ���� ����
		for(int i=0;i<a;i++){
			System.out.println(i+1+"��° �̸��Է�");
			String name1=sc.next();
			name[i]=name1;
			System.out.println(i+1+"��° ���������Է�");
			int kor1=sc.nextInt();
			kor[i]=kor1;
			System.out.println(i+1+"��° ���������Է�");
			int eng1=sc.nextInt();
			eng[i]=eng1;
			System.out.println(i+1+"��° ���������Է�");
			int mat1=sc.nextInt();
			mat[i]=mat1;
			tot[i]=kor[i]+eng[i]+mat[i];
		}//for
		//4. tot�迭�� ���� �������� ������ �����ؼ� rank�迭�� ����
		int[] rank=new int[a];
		for(int i=0;i<a;i++){
			rank[i]=1;
			for(int j=0;j<a;j++){
				if(tot[i]<tot[j]){
					rank[i]++;
				}//if
			}//for2
	
		}//for
		//5. ���
		System.out.println("\t�̸�\t����\t����\t����\t�հ�\t����");
		for(int i=0;i<a;i++){
		System.out.println(i+1+"\t"+name[i]+"\t"+kor[i]+"\t"+
						eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+rank[i]);}//for
		
		
	} //main method

} //Work01 class
