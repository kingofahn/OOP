package domain;

public class StaffSalary extends Payment {
	public static final String DEPT ="정직원";
	protected  double bonus; // 10%
	public StaffSalary(String input) {
		super(input);
		jobName = name+DEPT.substring(1,3);
		setBonus();
		setDept(DEPT);
	}
	public void setBonus() {
		bonus= sal * 0.1;
	}
	public double getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format("%s인 %s에 %d만원 지급",dept, jobName, (int)(sal+bonus));
	}
}
