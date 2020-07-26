public interface ComputeEmpWage{
	public void addCompanyDetails(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName);
	public void computeTotalWage();
	public int empWageCal(CompanyDetails details);
	public void getTotalWage(String company);
}
