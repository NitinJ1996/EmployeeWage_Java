//Welcome to EmployeeWage Computation Program
import java.util.*;
public class EmployeeWage{

	private final int WAGEPERHOUR = 20, MONTHDAYS=20;
    	private int totalWorkHours=0, workHours, totalWage, count=0; //instance variables
	public void EmpWageCal() {
		Random random = new Random();
		while(this.count <= this.MONTHDAYS && this.totalWorkHours < 100)
		{
                    int employee = random.nextInt(3); //local variable
                    switch (employee)
                    {
                    case 1:  workHours = 8;   break;
                    case 2:  workHours = 4;   break;
                    default: workHours = 0;   break;
                    }
                    this.count++;
                    this.totalWorkHours+=this.workHours;
		}
            	this.totalWage=this.WAGEPERHOUR * this.totalWorkHours;
	}
	@Override //Overriding the inbuilt toString method
	public String toString() {
		if(count==21)
			return String.format("Employee Wage for %d days and %d totalhours : %d ",this.count-1, this.totalWorkHours,  this.totalWage);
		else
			return String.format("Employee Wage for %d days and %d totalhours : %d ",this.count, this.totalWorkHours,  this.totalWage);
	}
        public static void main(String args[])
        {
                EmployeeWage object = new EmployeeWage();
                object.EmpWageCal();
                System.out.println(object);
        }
}
