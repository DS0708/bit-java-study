package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		super();
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void save(int i) {
		// TODO Auto-generated method stub
		setBalance(this.balance+i);
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		int res_bal = this.balance - i;
		if(res_bal < 0) {
			System.out.println("잔액 부족 ");
		}else setBalance(res_bal);
	}
}
