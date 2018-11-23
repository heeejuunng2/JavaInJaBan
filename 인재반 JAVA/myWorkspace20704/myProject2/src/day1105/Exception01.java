package day1105;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.zip.DataFormatException;

/*
 * <���α׷��� ���۵�, ���������� ����>
 * 1. ����(error): �����ڰ� �ذ� ����
 * 2. ����(exception): �����ڰ� �ذ��� �� ����
 * 
 * <���� Ŭ����>
 * : ����� �߻������� ����(Error, Exception)�� Ŭ������ ����
 *   1. Exception Ŭ���� : ������� �Ǽ� ==> ����ó�� ��
 *      - printStackTrace() : �ܼ�â�� ���� �� �߸鼭 ��������
 *      -> ����ó���� ���ϸ�, ����Ʈ�� ����Ǵ� �޼ҵ�
 *   2. RuntimeException Ŭ���� : ���α׷����� �Ǽ� ==> ����ó���� ������ �ƴ�
 *   
 * <1. try~catch ���>
 *   ���ǻ���! - try��Ͼȿ����� ������ �������� �ʴ´�!!
 *           - try��Ͼȿ��� �����߻���, �����߻����� ���� ������ ����X
 *           - Exception ó���ϴ� catch����� ���� �������� �����ϴ�
 *             (�տ��θ� �����ڵ��)
 * <2. throws ����>
 *   :�޼ҵ� ���ο��� ���ܰ� �߻��� �� �ִ� �κп� try~ catch�� �ϴ°��� �⺻������,
 *     ��쿡 ���� �޼ҵ带 ȣ���� ������ ���ܸ� ���ѱ��.
 *   ���� ����!! �θ� ���� ���ܺ���  �� ���� ���� ���� �Ұ�
 *             (���� ������ �ƴ� ������ ����)
 */
class Parent{
	void parentMethod() throws IOException, SQLException{
		
	}
}//end of Parent class

class Child extends Parent{
	@Override
	void parentMethod() throws  IOException, SQLException { 
		//�θ� ���� ���ܺ��� �� ���� ���� �Ұ�, ���� �� ū�� ���� �Ұ�
		super.parentMethod();
	}
}

public class Exception01 {//main class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ΰ��� ���� �Է¹޾Ƽ� �������Ѵ����� �� ���
		int n1=1, n2=1, result=0;
		try {
			System.out.println("ù��° ���� �Է��ϼ���:");
			n1 = sc.nextInt();
			System.out.println("�ι�° ���� �Է��ϼ���:");
			n2 = sc.nextInt();
			System.out.println("�� ���� �����ϴ�.");
			result = n1/n2;
			System.out.println("��µɱ�?");
		}
		catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է��ϼ���:");
		}catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����");
		}catch(Exception e) {
			System.out.println("���߻�Ȳ �߻�");
		} //Exeption�� �� �������� �ؾ��� !
		  finally {
				System.out.println("��:"+result);
				System.out.println("�����մϴ�.");
		}//���û���, 
		
	
	}//end of main method

}//end of main class
