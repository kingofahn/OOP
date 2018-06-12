package domain;

import java.util.Calendar;

public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, accountType, createDate; 
	protected String accountNo="";
	// 통장 123-345-678 의 형태가 되도록 코딩
	// 블로그에서 오늘 날짜 뽑는 로직 가져다가 쓰세요

	public void setMoney(int money) {
		this.money = money;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setAccountType() {
		this.accountType = "일반통장";
	}

	public void setCreateDate() {
		Calendar cal = Calendar.getInstance();
    	  int nowYear = cal.get(cal.YEAR);
		  int nowMonth = cal.get(cal.MONTH)+1;
		  int nowDate = cal.get(cal.DATE);
		createDate=nowYear+"년"+ nowMonth+"월"+ nowDate+"일";
	}

	public void setAccountNo() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				accountNo += (int) (Math.random() * 9)+"";
			}
			if (i == 2) {
				accountNo += "";
			} else {
				accountNo += "-";
			}
		}
	}
	public int getMoney() {
		return money;
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

	public String getCreateDate() {
		return createDate;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String toString() {
		return String.format("비트뱅크\n" + "%s\n" + "계좌번호 : %s\n" + "이름 : %s\n" + "생성일 : %s\n " + "잔액 : %d\n", accountType,
				accountNo, name, createDate, money);
	}
}