package day06;
/*
 * <�迭Ȱ�� ����4: �迭�� �ִ밪�� �ּҰ� ���ϱ�>
 * 1. �ִ밪�� ������ ������ �����Ѵ�
 *	    �迭�� ù��° ���ҷ� �ʱ�ȭ �Ѵ�
 * 2. �ּҰ��� ������ ������ �����Ѵ�
 * 	    �迭�� ù��° ���ҷ� �ʱ�ȭ �Ѵ�
 * 3. �迭�� ���鼭 ���� ���Ѵ�
 */
public class Work03 {//main class

	public static void main(String[] args) {
		int[] num={10,90,88,79,5};
		int max=num[0];
		int min=num[0];
		
		for(int a:num){
			if(a>max){
				max=a;
			}//if
			if(a<min){
				min=a;
			}//if
		}//for
		
	//	for(int i=0;i<num.length;i++){
	//		if(max<num[i]){
	//			max=num[i];
	//		}//if
	//		if(min>num[i]){
	//			min=num[i];
	//		}//if
	//	}//for
		System.out.println("�ּҰ��� "+min+" �ִ밪�� "+max);
		
		
	} //main method

}//Work03 class
