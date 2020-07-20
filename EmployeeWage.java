//Welcome to EmployeeWage Computation Program

import java.util.*;

public class EmployeeWage{
        public static void main(String args[])
        {
                Random random = new Random();
                int employee = random.nextInt(2);
                int ispresent=1;
		int wagePerHour = 20;
                if(employee==ispresent)
		{
			int workHours = 8;
                        System.out.println("Employee Present");
			System.out.println("Employee Wage: "+ wagePerHour*workHours);
                }
		else
		{
			int workHours = 0;
                        System.out.println("Employee Absent");
        		System.out.println("Employee Wage: "+ wagePerHour*workHours);
		}
	}
}

