package day11;

public class Account {
	/*
	 * Quiz01>
	 * 1. 필드(private) : name(이름, String), account(계좌번호,String)
	 * 				     password(비밀번호,String), balance(잔액,long)
	 * 2. 생성자
	 * 	 -기본생성자
	 * 	 -이름, 계좌번호, 비밀번호, 잔액을 매개변수로 하는 생성자
	 *    ==> setter이용
	 * 3. 모든 필드에 대한 getter&setter
	 * 	  -특히, balance에 대한 setter는 인자값으로 password를 추가로 받고
	 *          이 password와 멤버변수의 password가 일치하면
	 *          balance에 잔액을 저장
	 * 4. 메서드
	 *    public String show()
	 *    :필드의 정보를 출력
	 *    예) 000님의 계좌번호 000 / 잔액000
	 */
	private String name, account,password;
	private long balance;
	
	public Account(){
		
	}//기본 생성자
	
	public Account(String name,String account,String password,long balance){
		setName(name);
		setPassword(password);
		setAccount(account);
		setBalance(balance,password);
	}//이름, 계좌번호, 비밀번호, 잔액을 매개변수로 하는 생성자
	
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
		return getName()+"님의 계좌번호 "+getAccount()+" / 잔액"+getBalance();
	}
	
}
