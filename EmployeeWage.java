//Welcome to EmployeeWage Computation Program

import java.util.*;

public class EmployeeWage{
        public static void main(String args[])
        {
                Random random = new Random();
                int employee = random.nextInt(3);
                int ispresent=1;
		int isparttime=2;
		int wagePerHour = 20, workHours;
                if(employee==ispresent)
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
		}
		System.out.println("Employee Wage: "+ wagePerHour * workHours);
	}
}

