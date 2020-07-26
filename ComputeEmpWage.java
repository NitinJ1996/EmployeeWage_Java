public interface ComputeEmpWage{
	public void addCompanyDetails(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName);
	public void getTotalWage();
	public int empWageCal(CompanyDetails details);
}
