//Welcome to EmployeeWage Computation Program

import java.util.*;

public class EmployeeWage{
        public static void main(String args[])
        {
                Random random = new Random();
		int wagePerHour = 20, workHours;
		int monthDays=20, count=0;
		int totalWorkHours=0, empWage;
                /*if(employee==ispresent)
		{
			workHours = 8;
                        System.out.println("Employee Works Full Time");
                }
		else if (employee==isparttime)
		{
			workHours = 4;
			System.out.println("Employee Works PartTime");
		}
		else
		{
			workHours = 0;
                        System.out.println("Employee Absent");
		}*/
		while(count <= monthDays && totalWorkHours < 100)
		{
			int employee = random.nextInt(3);
                	int ispresent=1;
                	int isparttime=2;
			switch (employee)
			{
			case 1: 
				workHours = 8;
				break;
			case 2: 
				workHours = 4;
				break;
			default: 
				workHours = 0;
				break;
			}
			count++;
			totalWorkHours+=workHours;
		}
		empWage=wagePerHour * totalWorkHours;
		System.out.printf("Employee Wage for %d days and %d totalhours : %d ", count-1,totalWorkHours, empWage);
	}
}
