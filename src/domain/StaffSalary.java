package domain;

public class StaffSalary extends Payment {
	public static final String DEPT ="정직원";
	protected  double bonus; // 10%
	public StaffSalary(String input) {
		super(input);
		jobName = name+"직원";
		setSal();
	}
	public void setBonus() {
		bonus= sal * 0.1;
	}
	public void setSal() {
		sal= (int)(sal+bonus);
	}
	
	public int getSal() {
		return sal;
	}
	public double getBonus() {
		return bonus;
	}
	public String toString() {
		return String.format("%s에 %d만원 지급", jobName, sal);
	}
}
