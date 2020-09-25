package employeeWageUC11;

class EmpWage {
	
	public final String company;
	public final int emp_rate_per_hour, working_days, max_hours;
	public int totalEmpWage;
	
	
	public EmpWage(String company, int emp_rate_per_hour, int working_days, int max_hours) {
		this.company=company;
		this.emp_rate_per_hour=emp_rate_per_hour;
		this.working_days = working_days;
		this.max_hours = max_hours;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	@Override
	public String toString() {
		return "total emp wage for company "+company+" is: "+totalEmpWage; 
	}
}


interface IComputeEmpWage {
	 void ComputeEmpWage(EmpWage x[]);
}

public class CompanyEmpWage implements IComputeEmpWage{
	
	public static final int full_time=1;
	public static final int part_time=2;
	private static final int numOfCompanies=3;
	
	public void ComputeEmpWage(EmpWage arr[]) {
		for(int i=0; i<numOfCompanies; i++) {
			arr[i].setTotalEmpWage(this.WageCalc(arr[i]));
			System.out.println(arr[i]);
		}
	}
	private int WageCalc(EmpWage arr) {
		int empHours=0,totalHours=0;
		int empWage=0;
		final int full_time=1;
		final int part_time=2;
		int empCheck=(int) Math.floor(Math.random() * 10)%3;
		for(int day=0; day<arr.working_days; day++) {
			if(totalHours>=arr.max_hours) {
				break;
			}
			switch(empCheck) {
				case full_time:
					empHours=8;
					totalHours+=empHours;
					break;
				case part_time:
					empHours=4;
					totalHours+=empHours;
					break;
				default:
					empHours=0;
			}
	
		}
	empWage=totalHours*arr.emp_rate_per_hour;
	return empWage;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompanyEmpWage empWageBuilder = new CompanyEmpWage();
		EmpWage[] arr = new EmpWage[3];
		arr[0]=new EmpWage("ABC", 20, 20, 100);
		arr[1]=new EmpWage("XYZ", 30, 26, 120);
		arr[2]=new EmpWage("IJK", 10, 15, 50);
		empWageBuilder.ComputeEmpWage(arr);
	}

}
