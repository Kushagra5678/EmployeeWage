package employeeWageUC4;

public class EmpWageSwitch {
	public static final int full_time=1;
	public static final int part_time=2;
	public static final int emp_rate_per_hour=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int empHours=0;
		int empWage=0;
		int empCheck=(int) Math.floor(Math.random() * 10)%3;
		switch(empCheck) {
		case full_time:
			empHours=8;
			break;
		case part_time:
			empHours=4;
			break;
		default:
			empHours=0;
		}
		empWage=empHours * emp_rate_per_hour;
		System.out.println("Employee Wage: "+empWage);
	}

}
