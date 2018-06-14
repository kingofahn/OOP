package domain;
import java.text.SimpleDateFormat;  // setCreateDate에서 SimpleDateFormat 사용했을 시 사용
//import java.util.Calendar; // Calendar cal = Calendar.getInstance 사용했을시 사용 
import java.util.Date; // setCreateDate에서 SimpleDateFormat 사용했을 시 사용
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
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일");
		this.createDate = format.format(today);
//		Calendar cal = Calendar.getInstance();      		// 예전 시대 스타일의 코드이다.
//		  int nowYear = cal.get(Calendar.YEAR);				// 예전 시대 스타일의 코드이다.
//		  int nowMonth = cal.get(Calendar.MONTH)+1; 		// 예전 시대 스타일의 코드이다.
//		  int nowDate = cal.get(Calendar.DATE);				// 예전 시대 스타일의 코드이다.
//		createDate=nowYear+"년"+ nowMonth+"월"+ nowDate+"일"; // 예전 시대 스타일의 코드이다.
	}
	public void setAccountNo() {
		String result = "";
		for (int i = 0; i < 3; i++) {
				result += String.format("%03d",((int) (Math.random() * 999)+1)); // "%03d" 3자리로하는데 1자리~2자리일경우 0으로 채워라
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