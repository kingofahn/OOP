package domain;

public class Payment {
	public static final String DEPT = "인턴쉽";
	protected String dept, name, input,jobName;
	protected int sal;

	public Payment(String input) {
		String[] arr = input.split("/");
		name = arr[0].substring(0,1);
		sal = Integer.parseInt(arr[1]);
		jobName = name+DEPT.substring(0,2);
	}
	public int getSal() {
		return sal;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return DEPT;
	}
	public String getJobName() {
		return jobName;
	}
	public String toString() {
		return String.format("%s에 %d만원 지급", jobName, sal);
	}
}