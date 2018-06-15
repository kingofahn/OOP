package domain;

public class Payment {
	public static final String DEPT = "인턴쉽";
	protected String dept, name, input,jobName;
	protected int sal;

	public Payment(String input) {
		String[] arr = input.split("/");
		this.name = arr[0].substring(0,1);
		this.sal = Integer.parseInt(arr[1]);
		this.jobName = name+DEPT.substring(0,2) ; 
		setDept(DEPT);
	}
	public void setDept(String dept) {
		this.dept =dept;
	}
	public int getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getJobName() {
		return jobName;
	}
	public String toString() {
		return String.format("%s인 %s에 %d만원 지급",dept, jobName, sal);
	}
}