package employeeWageUC12;
import java.util.*;

interface IComputeEmpWage {
	void ComputeEmpWage(ArrayList<CompanyEmpWage> arr);
}
class CompanyEmpWage {
	public final String company;
	public final int empRatePerHour;
	public final int numOfWorkingDays;
	public final int maxHoursPerMonth;
	public int totalEmpWage;

	public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {

		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	@Override
	public String toString() {
		return "Total Emp Wage for company " + company + ": " + totalEmpWage;
	}
}

public class EmployeeWageBuilder implements IComputeEmpWage{
	
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public void ComputeEmpWage(ArrayList<CompanyEmpWage> arr) {
		for(CompanyEmpWage i: arr) {
			i.setTotalEmpWage(this.computeWage(i));
			System.out.println(i);
		}
	}
	public int computeWage(CompanyEmpWage companyEmpWage) {
		int empHours = 0, totalWorkingHours = 0, totalWorkingDays = 0;

		while (totalWorkingDays++ < companyEmpWage.numOfWorkingDays
				&& totalWorkingHours < companyEmpWage.maxHoursPerMonth) {
			short empCheck = (short) (Math.random() * 10 % 3);

			switch (empCheck) {
			case IS_PART_TIME:
				empHours = 4;
				break;
			case IS_FULL_TIME:
				empHours = 8;
				break;
			default:
				empHours = 0;
			}

			totalWorkingHours += empHours;
		}

		return totalWorkingHours * companyEmpWage.empRatePerHour;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		ArrayList<CompanyEmpWage> companyEmpWageList;
		Map<String, CompanyEmpWage> companyEmpWageMap;
		companyEmpWageList = new ArrayList<>();
		companyEmpWageMap = new HashMap<>();
		companyEmpWageList.add(new CompanyEmpWage("ABC", 60, 22, 100));
		companyEmpWageList.add(new CompanyEmpWage("XYZ", 50, 18, 110));
		empWageBuilder.ComputeEmpWage(companyEmpWageList);		

	}

}
