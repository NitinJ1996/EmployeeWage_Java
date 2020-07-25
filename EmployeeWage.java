//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage{

        private final int wagePerHour, maxWorkingDays, maxWorkingHours; //instance variable
	private final String companyName; //instance Variables

	//Parameterized Constructor
        public EmployeeWage(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName){
		this.wagePerHour=wagePerHour;
		this.maxWorkingDays=maxWorkingDays;
		this.maxWorkingHours=maxWorkingHours;
		this.companyName=companyName;
		EmpWageCal();
	}

	public void EmpWageCal()
        {
		int totalWorkHours=0, workHours, totalWage, count=0; //local variables
                Random random = new Random();
                while(count <= this.maxWorkingDays && totalWorkHours < this.maxWorkingHours)
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
                totalWage=this.wagePerHour * totalWorkHours;
		System.out.println(toPrint(this.companyName,count,totalWorkHours,totalWage,this.maxWorkingDays));
        }

       // @Override //Overriding the inbuilt toString method
        public String toPrint(String companyName, int count, int totalWorkHours, int totalWage, int maxWorkingDays) {
                if(count==maxWorkingDays)
                        return String.format("Company %s: Employee Wage for %d days and %d totalhours : %d ", companyName, count-1, totalWorkHours,  totalWage);
                else
                        return String.format("Company %s: Employee Wage for %d days and %d totalhours : %d ", companyName, count, totalWorkHours,  totalWage);
        }

	public static void main(String args[]){
		Scanner input =  new Scanner(System.in);
                System.out.print("Enter the number of Companies: \t");
                int companyCount = input.nextInt();
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
                        EmployeeWage object = new EmployeeWage(wagePerHour,maxWorkingDays,maxWorkingHours,companyName);
		}
	}
}
