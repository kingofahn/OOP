package domain;

public class OwnerSalary extends StaffSalary {
	public static final String DEPT ="이사회";
	protected int share; // (SAL + BONUS) *10
	public OwnerSalary(String input) {
		super(input);
		jobName = name+DEPT.substring(0,2);
		setBonus();
		setShare();
		setDept(DEPT);
	}
	public void setShare() {
		share= (int)(sal+bonus)*10;
	}
	public int getShare() {
		return share;
	}
	public String toString() {
		return String.format("%s인 %s에 %d만원 지급",dept,jobName, share);
	}
}


