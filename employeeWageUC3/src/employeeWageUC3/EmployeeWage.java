package employeeWageUC3;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int full_time=1;
		int part_time=2;
		int emp_rate_per_hour=20;
		int empHours=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random() * 10)%3;
		if(empCheck==full_time) {
			empHours=8;
		}
		else if(empCheck==part_time){
			empHours=4;
		}
		empWage=empHours * emp_rate_per_hour;
		System.out.println("Employee Wage: "+empWage);
	}

}
