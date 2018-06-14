package domain;
import java.text.SimpleDateFormat;  // setCreateDate에서 SimpleDateFormat 사용했을 시 사용
//import java.util.Calendar; // Calendar cal = Calendar.getInstance 사용했을시 사용 
import java.util.Date; // setCreateDate에서 SimpleDateFormat 사용했을 시 사용

import javax.swing.JOptionPane;
public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, createDate, accountType,accountNo;
	
	/* 통장 123-345-678 의 형태가 되도록 코딩 	
	 */
	public Account(String name, String uid, String pass) {
		setAccountType(ACCOUNT_TYPE);
		setAccountNo();
		this.createDate = 
				new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
		this.name = name;
		this.uid = uid;
		this.pass = pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public void setAccountNo() {
		String result = "";
		for (int i = 0; i < 3; i++) {
				result += String.format("%03d",((int) (Math.random() * 999)+1)); // "%03d" 3자리로하는데 1자리~2자리일경우 0으로 채워라
				result +=(i==2)?"":"-";
		}
		this.accountNo = result;
	}
	public void setMoney(int money) {
		this.money += money;
	}
	
	public void setWithdraw(int money) {
		this.money-=money;
	}
	
	public String getName() {
		return name;
	}
	public String getUid() {
		return uid;
	}
	public String getPass() {
		return pass;
	}
	public String getAccountType() {
		return accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public String getCreateDate() {
		return createDate;
	}
	public int getMoney() {
		return money;
	}
	public int getWithdraw() {
		return money;
	}
	public String toString() {
		return String.format("%s\n" 
							+ "%s\n" 
							+ "계좌번호 : %s\n" 
							+ "이름 : %s\n" 
							+ "생성일 : %s\n" 
							+ "잔액 : %d\n",
							BANK_NAME, 
							accountType,
							accountNo, 
							name, 
							createDate, 
							money);
	}
}