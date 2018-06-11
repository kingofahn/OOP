package ui;

import javax.swing.JOptionPane;
import domain.BMI;
import domain.Grade;
import domain.Salary;
import domain.Lotto;

enum Butt{
	EXIT,
	INPUT_BMI,
	OUTPUT_BMI,
	INPUT_GRADE,
	OUTPUT_GRADE,
	INPUT_SALARY,
	OUTPUT_SALARY,
	INPUT_LOTTO,
	OUTPUT_LOTTO}

public class Main {
	public static void main(String[] args) {
		Butt[] buttons= {
				Butt.EXIT,
				Butt.INPUT_BMI,
				Butt.OUTPUT_BMI,
				Butt.INPUT_GRADE,
				Butt.OUTPUT_GRADE,
				Butt.INPUT_SALARY,
				Butt.OUTPUT_SALARY,
				Butt.INPUT_LOTTO,
				Butt.OUTPUT_LOTTO};

		BMI[] arr = new BMI[2];
		BMI bmi = null;   // bmi를 청소하는 개념 temp개념이다.
		Grade[] arr1 = new Grade[10];
		Grade grade =null;
		Salary salary = null;
		Salary[] arr2 = new Salary[2];
		Lotto lotto = null;
		Lotto[] arr3 = new Lotto[20];
		
		int count=0, count1=0,count2=0,count3=0;
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

			case INPUT_BMI:  
				bmi = new BMI();  // bmi를 청소하는 개념 temp개념이다.
				bmi.setName(JOptionPane.showInputDialog("Name?"));
				bmi.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Height?")));
				bmi.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Weight?")));
				bmi.setResult();
				arr[count]=bmi;
				count++;
				break;
			case OUTPUT_BMI: 
				String output = new String();
				for(int i=0; i<count; i++) {
					  output += arr[i].toString()+"\n";	
					}
					JOptionPane.showMessageDialog(null,"이름|키|몸무게|BMI\n"+output);
				break;  
				
			case INPUT_GRADE:  
				grade = new Grade();  // 청소
				grade.setName(JOptionPane.showInputDialog("Name?"));
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("Kor?")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("Eng?")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("Math?")));
				grade.setTotal();
				grade.setAvg();
				grade.setGrade();
				arr1[count1]=grade;
				count1++;
				break;
				
			case OUTPUT_GRADE: 
				String output1 ="";
				for(int i=0; i<count1; i++) {
					  output1 += arr1[i].toString()+"\n";	
					}
					JOptionPane.showMessageDialog(null,"name|total|avg|grade\n" + output1);
				break;
				
			case INPUT_SALARY: 
				salary = new Salary();
				salary.setName(JOptionPane.showInputDialog("Name?"));
				salary.setDept(JOptionPane.showInputDialog("Dept?"));
				salary.setSal(Integer.parseInt(JOptionPane.showInputDialog("Salary?")));
				salary.setBonus(Integer.parseInt(JOptionPane.showInputDialog("bonus?")));
				arr2[count2]=salary;
				count2++;
				break;
			case OUTPUT_SALARY: 
				String output2 ="";
				for(int i=0; i<count2; i++) {
					output2+=arr2[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,"name|dept|sal|bonus\n"+output2);
				break;
				
			case INPUT_LOTTO: 
				lotto = new Lotto();
				lotto.setMoney(Integer.parseInt(JOptionPane.showInputDialog("Money")));
				lotto.setBall1();
				lotto.setBall2();
				lotto.setBall3();
				lotto.setBall4();
				lotto.setBall5();
				lotto.setBall6();
				arr3[count3]=lotto;
				count3++;
				break;
			case OUTPUT_LOTTO: 
				String output3 ="";
				for(int i=0; i<lotto.getCount(); i++) {
					output3+=arr3[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null,output3);
				break;
			default : JOptionPane.showMessageDialog(null,"Error"); break;
			}
		}
	}
}
