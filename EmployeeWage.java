//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage{

	private CompanyDetails companyArray[];
	private int numberOfArrayElements = 0;
	
	//Parameteerized Constructor
	public EmployeeWage(int arraylength) {
			companyArray = new CompanyDetails[arraylength];
	}
	
	public void addCompanyDetails(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName) {
		companyArray[numberOfArrayElements] = new CompanyDetails(companyName,wagePerHour,maxWorkingDays,maxWorkingHours);
		numberOfArrayElements++;
	}
	public void empWageCal() {
		//passing the company details from array to the wage calculation method in Employee Class
		for(int i=0; i < numberOfArrayElements; i++) {
			companyArray[i].setTotalWage(this.empWageCal(companyArray[i]));
			System.out.println(companyArray[i]);
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

	public static void main(String args[]){
		Scanner input =  new Scanner(System.in);
                System.out.print("Enter the number of Companies: \t");
                int companyCount = input.nextInt();
		EmployeeWage sample = new EmployeeWage(companyCount);
                for(int i = 0; i<companyCount; i++)
                {
                        System.out.print("Enter the Name of the Company: ");
                        String companyName = input.next();
                        System.out.print("Enter the number of Max Working Days in a month: ");
                        int maxWorkingDays = input.nextInt();
                        System.out.print("Enter the number of Max Working Hours in a month: ");
                        int maxWorkingHours = input.nextInt();
                        System.out.print("Enter the Wage per hour of Company: ");
                        int wagePerHour = input.nextInt();
			sample.addCompanyDetails(wagePerHour, maxWorkingDays, maxWorkingHours, companyName);
		}
		sample.empWageCal();
		input.close();
	}
}
