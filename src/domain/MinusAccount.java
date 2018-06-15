package domain;

import javax.swing.JOptionPane;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE = "마이너스통장";
	public int limit;
	
	public MinusAccount(String name, String uid, String pass) {
		super(name, uid, pass); // 부모의 생성자
		setAccountType(ACCOUNT_TYPE);
	}
	
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public int getLimit() {
		return limit;
	}
	
	public void setMoney(int money) {
			this.money=(-money);
	}
	public void setDeposit(int money) {
		this.money += money;
	}
	public void setWithdraw(int money) {
		int result = this.money-money;
		if(result<0) {
			JOptionPane.showMessageDialog(null,WITHDRAW_FAIL);
		} else {
			this.money -= money;
		}
	}
	
	public int setWithdraw() {
		return money;
	}
	public int setDeposit() {
		return money;
	}
	
	public String toString() {
		return String.format("%s\n"
							+"%s\n"
							+"계좌번호 : %s\n"
							+"이름 : %s\n"
							+"생성일 : %s\n "
							+"잔액 : %d\n",
							BANK_NAME,
							ACCOUNT_TYPE,
							accountNo,
							name,
							createDate,
							money);
	}
}