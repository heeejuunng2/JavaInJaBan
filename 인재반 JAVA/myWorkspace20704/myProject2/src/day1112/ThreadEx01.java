package day1112;
/*
 * ������ ����ó���� �ؾ� ����� �� �ִ� �޼ҵ���� �ִ�.
 * ex) Thread.sleep(long �и���)
 *     (1�� = 1000�и���) : �и��ʸ�ŭ �Ͻ�����(os�� �����·�)
 * �� �޼ҵ�� �����Ұ� �ֱ⶧���� �ݵ�� ����ó�� �ؾ���
 */
public class ThreadEx01 {//main class

	public static void main(String[] args) {
		for(int c=10;c>0;c--) {
			System.out.println(c+"��");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//end of main method

}//end of main class
