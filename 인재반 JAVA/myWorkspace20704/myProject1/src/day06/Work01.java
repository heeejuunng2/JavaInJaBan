package day06;
/*
 * <�迭 Ȱ�� 2��°-���ڿ��� �����ϰ� ����ϱ�>
 * 
 */

public class Work01 { //main class

	public static void main(String[] args) {
		String[] p={"��ī��","Ǫ��","����","������","���α�","�Ḹ��","�ߵ���"};
		
		for(int i=0;i<2;i++){ //�����ϰ� 2�� ���
			int rnd=(int)(Math.random()*p.length); //0~6������ ������
			
			System.out.println(p[rnd]+"(��)�� �޸���");
		}//for
	}	//main method

} //Work01 class
