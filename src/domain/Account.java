package domain;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Account {
	public final static String BANK_NAME = "비트뱅크";
	public final static String ACCOUNT_TYPE = "기본통장";
	public final static String WITHDRAW_SUCCESS = "출금성공";
	public final static String WITHDRAW_FAIL = "잔액부족";
	public final static String DEPOSIT_SUCCESS = "입금성공";
	public final static String DEPOSIT_FAIL = "적합한 입력값이 아님";
	protected int money;
	protected String name, uid, pass, createDate, accountType,accountNo;
	
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
		this.accountType = ACCOUNT_TYPE;
	}
	public void setCreateDate() {
		Calendar cal = Calendar.getInstance();
    	  int nowYear = cal.get(Calendar.YEAR);
		  int nowMonth = cal.get(Calendar.MONTH)+1;
		  int nowDate = cal.get(Calendar.DATE);
		createDate=nowYear+"년"+ nowMonth+"월"+ nowDate+"일";
//		Date today = new Date();
//		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월dd일");
//		this.createDate = format.format(today);
	}
	public void setAccountNo() {
		String result = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				result += String.valueOf((int) (Math.random() * 9));
			}
				result +=(i==2)?"":"-";
		}
		this.accountNo = result;
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