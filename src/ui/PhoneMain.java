package ui;

import javax.swing.JOptionPane;

import domain.*;
enum PhoneButt{EXIT, TELEPHONE,	CELLPHONE, IPHONE, GALAXYPHONE}

public class PhoneMain {
	public static void main(String[] args) {
		PhoneButt[] buttons= {
				PhoneButt.EXIT,
				PhoneButt.TELEPHONE,
				PhoneButt.CELLPHONE,
				PhoneButt.IPHONE,
				PhoneButt.GALAXYPHONE
				};
		Phone phone = null;    // 다형성  
		while(true) {
			switch((PhoneButt)JOptionPane.showInputDialog( 
				null, // frame
				"MAIN PAGE", // ORDER
				"SELECT MENU", // frame title
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				buttons, // Array of choices
				buttons[1] // default
				)) {
			case EXIT :
				return;
			case TELEPHONE :
				phone = new Phone(); 
				phone.setName(JOptionPane.showInputDialog("name?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				phone.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case CELLPHONE :
				phone = new CellPhone(); 
				phone.setName(JOptionPane.showInputDialog("name?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				phone.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case IPHONE :
				phone = new IPhone(); 
				phone.setName(JOptionPane.showInputDialog("name?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				phone.setCall(JOptionPane.showInputDialog("Message?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			case GALAXYPHONE :
				phone = new GalaxyPhone(); 
				phone.setName(JOptionPane.showInputDialog("name?"));
				phone.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				phone.setCall(JOptionPane.showInputDialog("Message?"));
				JOptionPane.showMessageDialog(null, phone.toString());
				break;
			default : JOptionPane.showMessageDialog(null, "error"); break; 

			}
		}
	}
}
