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
		Phone phone = null;
		CellPhone cp = null;
		IPhone iphone = null;
		GalaxyPhone galaxy = null;
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
				cp = new CellPhone(); 
				cp.setName(JOptionPane.showInputDialog("name?"));
				cp.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				cp.setCall(JOptionPane.showInputDialog("call?"));
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
			case IPHONE :
				iphone = new IPhone(); 
				iphone.setName(JOptionPane.showInputDialog("name?"));
				iphone.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				iphone.setCall(JOptionPane.showInputDialog("Message?"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				break;
			case GALAXYPHONE :
				galaxy = new GalaxyPhone(); 
				galaxy.setName(JOptionPane.showInputDialog("name?"));
				galaxy.setPhoneNum(JOptionPane.showInputDialog("phoneNum?"));
				galaxy.setCall(JOptionPane.showInputDialog("Message?"));
				JOptionPane.showMessageDialog(null, galaxy.toString());
				break;
			default : JOptionPane.showMessageDialog(null, "error"); break; 

			}
		}
	}
}
