package ui;

import javax.swing.JOptionPane;
import domain.BMI;

enum Butt{
	EXIT,
	BMI,
	TEST
}

public class Main {
	public static void main(String[] args) {
		String result =" Name | Height | Weight | BMI \n";
		Butt[] buttons= {
				Butt.EXIT,
				Butt.BMI,
				Butt.TEST};
		BMI bmi = new BMI();
		String [] arr =new String[2];
		
		while(true) {
			switch((Butt)JOptionPane.showInputDialog( 
				null, // frame
				"MAIN PAGE", // frame title
				"SELECT MENU", // ORDER
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				buttons, // Array of choices
				buttons[1] // default
				)) {
			case EXIT:  return;

			case BMI:  
				for(int i=0; i<2; i++) {
					bmi.setName(JOptionPane.showInputDialog("Name?"));
					bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Height?")));
					bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Weight?")));
					bmi.setResult();
					arr[i] = String.format(" %s | %fcm | %skg | %s", 
							bmi.getName(),
							bmi.getHeight(),
							bmi.getWeight(),
							bmi.getResult()); 
				}
				
					for(int i=0; i<2; i++) {
					  result += arr[i]+"\n";	
					}
					JOptionPane.showMessageDialog(null,result);
				break;
			default : JOptionPane.showMessageDialog(null,"Error"); break;
			}
		}
	}
}
