//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage{

        //private final int WAGEPERHOUR = 20, MONTHDAYS=20; //instance variable final
        public static void EmpWageCal(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName)
        {
		int totalWorkHours=0, workHours, totalWage, count=0;
                Random random = new Random();
                while(count <= maxWorkingDays && totalWorkHours < maxWorkingHours)
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
                totalWage=wagePerHour * totalWorkHours;
		System.out.println(toPrint(companyName,count,totalWorkHours,totalWage,maxWorkingDays));
        }

       // @Override //Overriding the inbuilt toString method
        public static String toPrint(String companyName, int count, int totalWorkHours, int totalWage, int maxWorkingDays) {
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
                        EmpWageCal(wagePerHour,maxWorkingDays,maxWorkingHours,companyName);
		}
	}
}
