package day11;

public class Account {
	/*
	 * Quiz01>
	 * 1. �ʵ�(private) : name(�̸�, String), account(���¹�ȣ,String)
	 * 				     password(��й�ȣ,String), balance(�ܾ�,long)
	 * 2. ������
	 * 	 -�⺻������
	 * 	 -�̸�, ���¹�ȣ, ��й�ȣ, �ܾ��� �Ű������� �ϴ� ������
	 *    ==> setter�̿�
	 * 3. ��� �ʵ忡 ���� getter&setter
	 * 	  -Ư��, balance�� ���� setter�� ���ڰ����� password�� �߰��� �ް�
	 *          �� password�� ��������� password�� ��ġ�ϸ�
	 *          balance�� �ܾ��� ����
	 * 4. �޼���
	 *    public String show()
	 *    :�ʵ��� ������ ���
	 *    ��) 000���� ���¹�ȣ 000 / �ܾ�000
	 */
	private String name, account,password;
	private long balance;
	
	public Account(){
		
	}//�⺻ ������
	
	public Account(String name,String account,String password,long balance){
		setName(name);
		setPassword(password);
		setAccount(account);
		setBalance(balance,password);
	}//�̸�, ���¹�ȣ, ��й�ȣ, �ܾ��� �Ű������� �ϴ� ������
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance,String password) {
		if(password.equals(this.password)){
			this.balance=balance;
			}
		}
	
	public String show(){
		return getName()+"���� ���¹�ȣ "+getAccount()+" / �ܾ�"+getBalance();
	}
	
}
