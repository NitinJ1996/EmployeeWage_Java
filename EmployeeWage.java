//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage implements ComputeEmpWage{

	private List<CompanyDetails> companydetailsList;
	private Map<String, CompanyDetails> companydetailsMap;

	//Parameteerized Constructor
	public EmployeeWage() {
		companydetailsList = new ArrayList<CompanyDetails>();
		companydetailsMap = new HashMap<>();
	}

	public void addCompanyDetails(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName) {
		CompanyDetails companydetails = new CompanyDetails(companyName,wagePerHour,maxWorkingDays,maxWorkingHours);
		companydetailsList.add(companydetails);
		companydetailsMap.put(companyName, companydetails);
	}
	public void computeTotalWage() {
		//passing the company details from array to the wage calculation method in Employee Class
		for(CompanyDetails data : companydetailsList) {
			data.setTotalWage(this.empWageCal(data));
			//System.out.println(data);
		}
	}

	public int empWageCal(CompanyDetails details)
        {
		int totalWorkHours=0, workHours, totalWage, count=0; //local variables
                Random random = new Random();
                while(count <= details.maxWorkingDays && totalWorkHours < details.maxWorkingHours)
                {
                    int employee = random.nextInt(3); //local variable
                    switch (employee)
                    {
                    case 1:  workHours = 8;   break;
                    case 2:  workHours = 4;   break;
                    default: workHours = 0;   break;
                    }
                    count++;
                    totalWorkHours+=workHours;
                }
                totalWage=details.wagePerHour * totalWorkHours;
		return totalWage;
        }

	public void getTotalWage(String company) {
		int wage = companydetailsMap.get(company).totalWage;
		System.out.println("TotalWage of "+company+" is "+wage);
	}

	public static void getCompanyDetails() {
		Scanner input =  new Scanner(System.in);
	        System.out.print("Enter the number of Companies: \t");
        	int companyCount = input.nextInt();
        	EmployeeWage sample = new EmployeeWage();
        	for(int i = 0; i<companyCount; i++)
        	{
                	System.out.print("Enter the Name of the Company: ");
                	String companyName = input.next();
                	System.out.print("Enter the number of Max Working Days(less than 27) in a month: ");
                	int maxWorkingDays = input.nextInt();
                	System.out.print("Enter the number of Max Working Hours(less than 234) in a month: ");
                	int maxWorkingHours = input.nextInt();
                	System.out.print("Enter the Wage per hour of Company: ");
                	int wagePerHour = input.nextInt();
                	int checkMonthDays = (maxWorkingDays<=26 && maxWorkingDays>0)?1:0;
                	int checkWorkingHours = (maxWorkingHours<=234 && maxWorkingHours>0)?1:0;
                	if (checkMonthDays==1 && checkWorkingHours==1 && wagePerHour>0)
                		sample.addCompanyDetails(wagePerHour, maxWorkingDays, maxWorkingHours, companyName);
                	else
                		System.out.println("Enter Proper Details");
        	}
		sample.computeTotalWage();
        	System.out.print("Enter the company for total Wage: ");
        	String company = input.next();
        	sample.getTotalWage(company);
        	input.close();
	}


	public static void main(String args[]){
		getCompanyDetails();
	}
}
