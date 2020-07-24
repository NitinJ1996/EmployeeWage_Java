//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage{

        //private final int WAGEPERHOUR = 20, MONTHDAYS=20; //instance variable final
	private String cName; //Instance variables

        public void EmpWageCal(int wagePerHour, int maxWorkingDays, int maxWorkingHours, String companyName)
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
		toString(companyName,count,totalWorkHours,totalWage);
        }

       // @Override //Overriding the inbuilt toString method
        public static String toString(String companyName, int count, int totalWorkHours, int totalWage) {
                if(count==21)
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
                        System.out.println("Enter the Name of the Company:");
                        String companyName = input.next();
                        System.out.println("Enter the number of Max Working Days in a month:");
                        int maxWorkingDays = input.nextInt();
                        System.out.println("Enter the number of Max Working Hours in a month:");
                        int maxWorkingHours = input.nextInt();
                        System.out.println("Enter the Wage per hour of Company:");
                        int wagePerHour = input.nextInt();
                        EmployeeWage object = new EmployeeWage();
                        object.EmpWageCal(wagePerHour,maxWorkingDays,maxWorkingHours,companyName);
		}
	}
}
