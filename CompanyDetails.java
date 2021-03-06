import java.util.*;

public class CompanyDetails {
	public int wagePerHour, maxWorkingDays, maxWorkingHours;
	public final String companyName;
	public int totalWage;
	List<Integer> dailywage = new ArrayList<>();

	public CompanyDetails(String companyName, int wagePerHour, int maxWorkingDays,int maxWorkingHours){
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}

	public void setTotalWage(int totalWage) {
		this.totalWage = totalWage;
	}

	public void setDailyWage(int wage) {
		this.dailywage.add(wage); 
	}

	public String toString() {
		return String.format("Company Name: %s, Total Wage of the employee in the company: %d", this.companyName, this.totalWage);
	}

}
