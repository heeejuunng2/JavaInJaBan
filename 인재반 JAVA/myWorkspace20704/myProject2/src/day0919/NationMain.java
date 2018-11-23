package day0919;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * 1) ������:
 *      -������(��� �ʵ� �ʱ�ȭ)
 * 2) �޼ҵ�
 *      -��� �ʵ带 ĸ��ȭ�ϰ� getter/setter�����
 *      -setter : nationName�� capitalName�� ""�ƴϵ���
 *      		  /population�� 0�� �ʰ��ϵ���
 *      		  ���� �� ������ �������� ������ �����Ҷ����� �Է���
 *               �ٽ� �޵��� ���ּ���
 *      -getter
 *      -toString() �������̵�(���� ����)
 */
class Nation{
	private String nationName; //������
	private String capitalName; //������
	private int population; //�α�
	
	Nation(String nationName,String capitalName,int population){
		setNationName(nationName);
		setCapitalName(capitalName);
		setPopulation(population);
	}
	
	public void setNationName(String nationName) {
		while(nationName.equals("")) {
			nationName=JOptionPane.showInputDialog("�������� �Էµ��� �ʾҽ��ϴ�.\n ������:");
		}//end of while
		this.nationName = nationName;
	}//setNationName method
	
	public void setCapitalName(String capitalName) {
		while(capitalName.equals("")) {
			capitalName=JOptionPane.showInputDialog("�������� �Էµ��� �ʾҽ��ϴ�.\n ������:");
		}//end of while
		this.capitalName = capitalName;
	}//setCapitalName method
	
	public void setPopulation(int population) {
		while(population<=0) {
			population=Integer.parseInt(JOptionPane.showInputDialog("�α����� �߸��ԷµǾ����ϴ�.\n �α���:"));
		}//end of while
		this.population = population;
	}//setPopulation method
	
	@Override
	public String toString() {
		return "������: "+nationName+"\n������: "+capitalName+"\n�α���: "+population+"����";
	}
	
	public String getNationName() {
		return nationName;
	}
	public String getCapitalName() {
		return capitalName;
	}
	public int getPopulation() {
		return population;
	}
	
}
public class NationMain {//main class

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		String select= ""; //�޴� ���� ��ȣ
		String menu="===���� ���� ���α׷�===\n"
					+"1. �� �� ��      ��\n"
				    +"2. ��� ���� ����\n"
					+"3. �� �� ��      ��\n"
				    +"4. �� �� ��      ��\n"
				    +"0. ��              ��\n";
		String nation,capital;
		int population;
		while(true) {
			select = JOptionPane.showInputDialog(menu);
			if(select.equals("1")) { //�������
				 //������, ������, �α���(����:����) �� �Է¹޾Ƽ�
				 //�Է¹��� ������ ��ü �����ؼ� list�� ����
				 //list�� add�� "��ϿϷ�"�޼��� ���
				nation = JOptionPane.showInputDialog("�������� �Է��ϼ��� :");
				capital = JOptionPane.showInputDialog("�������� �Է��ϼ��� :");
				population = Integer.parseInt(JOptionPane.showInputDialog("�α���(����:����)�� �Է��ϼ��� :"));
				list.add(new Nation(nation,capital,population));
				JOptionPane.showMessageDialog(null, "��ϿϷ�");
			}else if(select.equals("2")) { //��� ���� ����
				String str="----��������Ʈ----\n";
				//list�� ���
				for(Object o:list) { //ArrayList�� Object��ü��
					str+=o.toString()+"\n-------------------------\n";
				}
				JOptionPane.showMessageDialog(null, str);
			}else if(select.equals("3")) { //�����˻�
				//�������� �Է¹ް�, �ش� ���� ������ ������
				//������ "������� ���� �����Դϴ�"�޼��� ���
				boolean check=false;
				String search = JOptionPane.showInputDialog("�˻��� ������ �̸��� �Է��ϼ��� :");
				for(Object o:list) {
					if(((Nation)o).getNationName().equals(search)) {
						JOptionPane.showMessageDialog(null, o.toString());
						check=true;
						break;
					}
				}//end of for
				if(!check) { //check == false 
					JOptionPane.showMessageDialog(null, "��ϵ��� ���� �����Դϴ�.");
				}
				continue;
			}else if(select.equals("4")) { //��������
				//�������� �Է¹ް�, �ش� ���� ������ ��������
				//"�����Ͽ����ϴ�"�޼��� ���
				//�������� ������, "������� ���� �����̹Ƿ� ������ �� �����ϴ�" �޼��� ���
				boolean check=false;
				String bin = JOptionPane.showInputDialog("������ �������� �Է��ϼ���.");
				for(Object o : list) {
					if(((Nation)o).getNationName().equals(bin)) {
						list.remove(o);
						JOptionPane.showMessageDialog(null, "�����Ϸ�");
						check=true;
						break;
					}
				}
				if(!check) { //check == false 
					JOptionPane.showMessageDialog(null, "��ϵ��� ���� �����Դϴ�.");
				}
			}else if(select.equals("0")) { //����
				JOptionPane.showMessageDialog(null, "���α׷� ����");
				System.exit(0);
			}else JOptionPane.showMessageDialog(null, "�߸��Է�");
		}
		
	}//end of main method

}//end of mian class
