package day19;

import java.util.Date;

/*
 * <java.util Ŭ����>
 * - ���� ����ϴ� ���� ��ɵ��� ����ִ� ��Ű��
 * - Scanner, �÷��� �����ӿ�ũ, Data, Calender Ŭ���� ��
 * <java.util.Date Ŭ����>
 * - System.current...()�� Ȱ���Ͽ� ���� ��, ��, ����� �˾ƿ�
 */
public class Work02 {//main class

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		System.out.println(d.getMonth()); //1���� 0���� ������
		System.out.println(d.getTime()); 
		//**deprecated method : ���� �޼ҵ�
		//���̻� ������Ʈ�� �������� �ʰ� ������ �޼ҵ�
		//������� �ʴ°��� ����
		System.out.println(d.getYear());
		//1900�⵵�� �������� (2018-1900=118)
		System.out.println(d.getDate());
		//

	}//main method

}//Work02 class
