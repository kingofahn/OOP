package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE = "마이너스통장";

	public void setMoney(int money) {
			super.money=(-money);
		}

	public void getAccountType(String accountType) {
			super.accountType = ACCOUNT_TYPE;
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
							getAccountNo(),
							getName(),
							getCreateDate(),
							getMoney());
	}
}