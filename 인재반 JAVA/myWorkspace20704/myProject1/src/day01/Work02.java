package day01;
/*
 * <���� ����>
 * -����(������)�� �������� ������ ��
 * -�ڹٿ����� Math.random()�̶�� ����� ���� ������ ����
 * 			(0.0 ~ 0.9999... ���� )
 * 			(int) 0.0~0.9999... => 0~9
 * -���ۼ����� �󸶰��� ���� �����Ҷ�(�����϶�)
 *   -����: (int)(Math.random()*�󸶰�)+���ۼ�
 */
public class Work02 {

	public static void main(String[] args) {
		//1���� 10���� ���(for���̿�)
		
		for(int a=1;a<11;a++) {
			System.out.println((int)(Math.random()*10));
								//���ϱ� �ѰŸ� int �� �ٲٴ°�
		}
		//1. 0���� 4������ ������ �߻�
			System.out.println((int)(Math.random()*5));
			//0���� 4������ *5
		//2. 1���� 5������ ������ �߻�
			System.out.println((int)(Math.random()*5)+1);
			//1���� 5������ *5, 1���� �����ϹǷ� +1
	}

}
