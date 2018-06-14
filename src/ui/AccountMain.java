package ui;

import javax.swing.JOptionPane;

import domain.*;

/*
 * 비트뱅크
 * 기본통장
 * 계좌번호 : 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 잔액  : 0  // 입력한 금액에 따라 다름, 한번만 물어봄
 * 개설까지만 만든다.
 * -----------------
 * 마이너스통장
 * 계좌번호 : 123-456-789
 * 이름 : 홍길동
 * 생성일 : 2018년 6월 10일
 * 잔액  : 0  // 입력한 금액에 따라 다름, 한번만 물어봄
 * 상속이용해서 대출만 추가
 * **/
enum AccountButt{
	EXIT,
	OPEN_ACCOUNT,
	OPEN_MINUSACCOUNT
}

public class AccountMain {
	public static void main(String[] args) {
		Account account = null;
		MinusAccount mAccount=null;
		AccountButt[] butt= {
				AccountButt.EXIT,
				AccountButt.OPEN_ACCOUNT,
				AccountButt.OPEN_MINUSACCOUNT
				};
		while(true) {
			switch((AccountButt)JOptionPane.showInputDialog( 
				null, // frame
				"MAIN PAGE", // ORDER
				"SELECT MENU", // frame title
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				butt, // Array of choices
				butt[1] // default
				)) {
			case EXIT :
				return;
			case OPEN_ACCOUNT :
				account = new Account(); 
				account.setAccountNo();
				account.setCreateDate();
				account.setAccountType();
				account.setName(JOptionPane.showInputDialog("Name?"));
				account.setUid(JOptionPane.showInputDialog("Uid?"));
				account.setPass(JOptionPane.showInputDialog("Pass?"));
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("money?")));
				JOptionPane.showMessageDialog(null, account.toString());
				break;
			case OPEN_MINUSACCOUNT :
				mAccount = new MinusAccount(); 
				mAccount.setAccountNo();
				mAccount.setCreateDate();
				mAccount.setAccountType();
				mAccount.setName(JOptionPane.showInputDialog("Name?"));
				mAccount.setUid(JOptionPane.showInputDialog("Uid?"));
				mAccount.setPass(JOptionPane.showInputDialog("Pass?"));
				mAccount.setMoney(Integer.parseInt(JOptionPane.showInputDialog("money?")));
				JOptionPane.showMessageDialog(null, mAccount.toString());
				break;
			}
		}
	}
}