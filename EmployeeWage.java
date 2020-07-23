//Welcome to EmployeeWage Computation Program

import java.util.*;
public class EmployeeWage{

	private int wagePerHour = 20, workHours;
    	private int monthDays=20, count=0;
    	private int totalWorkHours=0, totalWage;
	public void EmpWageCal() {
		Random random = new Random();
		while(count <= monthDays && totalWorkHours < 100)
		{
                    int employee = random.nextInt(3);
                    switch (employee)
                    {
                    case 1:
                            workHours = 8;    break;
                    case 2:
                            workHours = 4;    break;
                    default:
                            workHours = 0;    break;
                    }
                    count++;
                    this.totalWorkHours+=this.workHours;
		}
            	this.totalWage=this.wagePerHour * this.totalWorkHours;
	}
	@Override
	public String toString() {
		if(count==21)
			return String.format("Employee Wage for %d days and %d totalhours : %d ",count-1, totalWorkHours,  totalWage);
		else
			return String.format("Employee Wage for %d days and %d totalhours : %d ",count, totalWorkHours,  totalWage);
	}
        public static void main(String args[])
        {
                EmployeeWage object = new EmployeeWage();
                object.EmpWageCal();
                System.out.println(object);
        }
}
