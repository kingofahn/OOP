package domain;

public class MinusAccount extends Account {
	public String toString() {
		
//		public void setAccountType() {
//			super.accountType = "일반통장";
//		}
		
		return String.format("비트뱅크\n" + "%s\n" + "계좌번호 : %s\n" + "이름 : %s\n" + "생성일 : %s\n " + "잔액 : %d\n", super.getAccountType(),
				super.getAccountNo(), super.getName(), super.getCreateDate(), super.getMoney());
	}

}
