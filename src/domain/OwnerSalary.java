package domain;

import javax.swing.JOptionPane;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT ="이사회";
	protected double share; // (SAL + BONUS) *10
	public OwnerSalary(String input) {
		super(input);
		jobName = name+"이사";
		setBonus();
	}
	public void setSal() {
		super.sal= (int)((sal+(sal*0.1))*10);
	}
	public String toString() {
		return String.format("%s에 %d만원 지급", jobName, sal);
	}
}


