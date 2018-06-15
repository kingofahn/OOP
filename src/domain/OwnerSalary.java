package domain;

import javax.swing.JOptionPane;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT ="이사회";
	protected int share; // (SAL + BONUS) *10
	public OwnerSalary(String input) {
		super(input);
		jobName = name+DEPT.substring(0,2);
		setBonus();
		setShare();
	}
	public void setShare() {
		share= (int)(sal+bonus)*10;
	}
	public int getShare() {
		return share;
	}
	public String toString() {
		return String.format("%s에 %d만원 지급", jobName, share);
	}
}


