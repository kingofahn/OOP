package ui;

import javax.swing.JOptionPane;
import domain.*;

enum SalaryButt {
	EXIT, INTERSHIP, STAFF, EXECUTIVE
}
	// 김길동, 100 => 김인턴 100만원 지급
	// 김길동, 100 => 김직원 110만원 지급
	// 김길동, 100 => 김이사 1100만원 지급

public class SalaryMain {
	public static void main(String[] args) {
		SalaryButt[] buttons = { SalaryButt.EXIT, SalaryButt.INTERSHIP, SalaryButt.STAFF, SalaryButt.EXECUTIVE };
		while (true) {
			switch ((SalaryButt) JOptionPane.showInputDialog(null, // frame
					"MAIN PAGE", // ORDER
					"SELECT MENU", // frame title
					JOptionPane.QUESTION_MESSAGE, // type
					null, // icon
					buttons, // Array of choices
					buttons[1] // default
			)) {
			case EXIT :
				return;
			case INTERSHIP :
				JOptionPane.showMessageDialog(
						null,new Payment(JOptionPane.showInputDialog("Name/Salary?"))
						.toString());
				break;
			case STAFF :
				JOptionPane.showMessageDialog(
						null,new StaffSalary(JOptionPane.showInputDialog("Name/Salary?"))
						.toString());
				break;
			case EXECUTIVE :
				JOptionPane.showMessageDialog(
						null,new OwnerSalary(JOptionPane.showInputDialog("Name/Salary?"))
						.toString());
				break;
			default : JOptionPane.showMessageDialog(null, "error"); break; 
			}
		}
	}
}