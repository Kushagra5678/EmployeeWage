package employeeWageUC1;

public class EmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int full_time=1;
		double empCheck=Math.floor(Math.random() * 10)%2;
		if(empCheck==full_time) {
			System.out.println("Employee is present");
		}
		else {
			System.out.println("Employee is absent");
		}
	}

}
