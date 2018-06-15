package ui;

import java.util.Scanner;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;
/*
 비트뱅크
 기본통장
 계좌번호: 123-456-789
 이름: 홍길동
 생성일 : 2018년 6월10일
 잔액: 10000원
 ------------
 비트뱅크
 마이너스통장 
 계좌번호: 123-456-789
 이름: 홍길동
 생성일 : 2018년 6월10일
 잔액: -10000원
  
 * */
enum AccountButt1 {
	EXIT, ACCOUNT, MINUS_ACCOUNT,DEPOSIT,WITHDRAW,LIST
}

public class AccountMain {
	public static void main(String[] args) {
		Account ac = null;
		AccountService service = new AccountServiceImpl();
		while(true){
			switch((AccountButt1)JOptionPane.showInputDialog(
                    null,
                    "Choice of Account Type",
                    "Select Menu",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new AccountButt1[]{
                    	AccountButt1.EXIT, 
            			AccountButt1.ACCOUNT, 
            			AccountButt1.MINUS_ACCOUNT,
            			AccountButt1.DEPOSIT,
            			AccountButt1.LIST	
                    },null)){
					case EXIT : return;
		            case ACCOUNT : 
		                service.addList(service.createAccount(
		                		JOptionPane.showInputDialog("이름은?"),
		                        JOptionPane.showInputDialog("아이디 입력"),
		                        JOptionPane.showInputDialog("비밀번호 입력")));break;
		            case MINUS_ACCOUNT : 
		                ac = new MinusAccount(
		                        JOptionPane.showInputDialog("이름은?"),
		                        JOptionPane.showInputDialog("아이디 입력"),
		                        JOptionPane.showInputDialog("비밀번호 입력")
		                        );
		                ((MinusAccount) ac).setLimit(Integer.parseInt(JOptionPane.showInputDialog("대출한도 설정")));
		                JOptionPane.showMessageDialog(null, ac.toString());
		                break;
		            case LIST : 
		            	JOptionPane.showMessageDialog(null, service.showResult());
		            	break;
		            case DEPOSIT :
		                //ac.setDeposit(Integer.parseInt(JOptionPane.showInputDialog("얼마 입금하시겠어요?")));
		                JOptionPane.showMessageDialog(null, "잔액 : "+ac.getMoney());
		                
		                break;
		            case WITHDRAW : 
		                int money=0;
		                if(((MinusAccount) ac).getLimit()!=0) {
		                    money = Integer.parseInt(JOptionPane.showInputDialog("얼마를 출금하시겠습니까?"));
		                    if(money>((MinusAccount) ac).getLimit()) {
		                        //출금성공 ac.setWithdraw(money);
		                        
		                    }else {
		                        //출금불가
		                        JOptionPane.showInternalMessageDialog(null, "출금 불가");break;
		                    }
		                }else {
		                    if(money>((MinusAccount) ac).getMoney()) {
		                        //출금성공 ac.setDeposit(money);
		                    }else {
		                        //출금불가
		                        JOptionPane.showMessageDialog(null, "출금 불가");break;
		                    }
		                        
		                }
		                JOptionPane.showMessageDialog(null, "잔액 : "+ac.getMoney());
		                break;
		        
		            }
		}
	}
}