package day04;
/*
 * switch(����){
 * 		case ���ͷ�: //���ͷ��� �׳� ��
 * 		case ���ͷ�:
 * 		default
 * 		}
 */
public class Work03 {// main class
	public static void main(String[] args) {
		//int rnd=(int)(Math.random()*3)+8; //8~10
		int rnd=8;
		
		switch(rnd){
		case 8:
			//System.out.println("�����");
			//break;
		case 9:
			System.out.println("�ٹ���");
			break;
		case 10:
			System.out.println("�ܱ���");
			break;
		default:
			System.out.println("��ƿ�");
			break;
		}//end of switch
	}//end of main method
}//end of Work03 class
