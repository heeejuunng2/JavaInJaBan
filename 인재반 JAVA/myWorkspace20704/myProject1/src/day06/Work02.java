package day06;
/*
 * <�迭 Ȱ��3 : �迭 ��� ����(shuffle) ==> ī�弯��, �ζǹ�ȣ ����>
 * 1. �迭�� 0~9�� ���� �����ϰ�, 0/1/...8/9 �� ���
 * 2. �迭�� ��Ҹ� 50�� ��� ���
 */
public class Work02 { //main class

	public static void main(String[] args) {
		int arr[]=new int[10];
		//�迭�� ��ҿ� ���� �����ϰ� ���
		System.out.println("�迭 : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
			//System.out.print(i==arr.length-1?i:i+"/");
								//i�� �� ������ ��ȣ��? ������ i Ʋ���� i/
			System.out.print(arr[i]+"/");
		}//for
		
		System.out.println();
		
		for(int i=0;i<50;i++){ 
			//0~9������ �������� �̴´�
			int rnd=(int)(Math.random()*arr.length);
			//�� �������� �ش��ϴ� ���ҿ� ù��° ���Ҹ� ��ȯ�Ѵ�
			int t=arr[rnd];
			arr[rnd]=arr[0];
			arr[0]=t;
			
		}//for
		
		System.out.println("���� ��� : ");
		for(int a:arr){
			System.out.print(a+"/");
		}//for
	} //main method

} //Work02 class
