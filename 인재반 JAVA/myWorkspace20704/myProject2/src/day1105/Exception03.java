package day1105;
/*
 * 
 */
public class Exception03 {//main class

	public static void main(String[] args) {
		int i=10, j=0, k=0;
		try {
			k = divide(i,j); //ȣ���� ������ ����ó��
			System.out.println(k);
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� ����");
		}
		
	}//end of main method
	static int divide(int i, int j) throws ArithmeticException {
		return i/j;                   //���⼭ �߻��Ҽ� �ִ� ���ܸ� throws�� ����
	}
}//end of main class
