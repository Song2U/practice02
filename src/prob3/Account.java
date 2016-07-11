package prob3;

public class Account {
	private String accountNo;
	private int balance = 0;

	public Account(String account) {
		this.accountNo = account;
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
		return;
	}

	public int save(int s) {
		this.balance = (this.balance + s);
		System.out.println(this.accountNo + " 계좌에 " + s + "만원이 입금되었습니다.");
		return this.balance;
	}

	public int deposit(int d) {
		this.balance = (this.balance - d);
		System.out.println(this.accountNo + " 계좌에 " + d + "만원이 출금되었습니다.");
		return this.balance;
	}

	public String getAccount() {
		return accountNo;
	}

	public void setAccount(String account) {
		this.accountNo = account;
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
}