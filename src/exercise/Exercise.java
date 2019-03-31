
package exercise;
import java.util.Scanner;
class Employee{
	 
	 int employeeid;
	 String employeename;
	 String empType;
	 double Grosssalary;
	 double salary;
	 
 }
 class WeekEmployee extends Employee{
	 int hours;
	 int pricePerHour;
	 double rate=0.05;
	 double wages;
	 
	 
	
 }
 class MonthEmployee extends Employee{ 	
	 double tax=0.3                                                                          ;
	 double rssb=0.03;
	 double expenses;
 }

public class Exercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		Employee Emp=new Employee();
		Scanner input = new Scanner(System.in);
		Employee employee = new MonthEmployee();
		
		System.out.println("Enter an Employee id");
		Emp.employeeid=input.nextInt();
		System.out.println("Enter an Employee name");
		Emp.employeename=input.next();
		
		
		System.out.println("Enteran Employee type Month or Week");
		Emp.empType=input.next();
		
		if(Emp.empType.equalsIgnoreCase("Month"))
		{
			System.out.println("Enter the Gross salary");
			Emp.Grosssalary=input.nextInt();
			
			MonthEmployee MonthEmp = new MonthEmployee();
			
			MonthEmp.Grosssalary=Emp.Grosssalary;
			MonthEmp.expenses=(MonthEmp.tax*MonthEmp.Grosssalary)+(MonthEmp.rssb*MonthEmp.Grosssalary);
			MonthEmp.salary = MonthEmp.Grosssalary-MonthEmp.expenses;
			
			
			System.out.println("Employee id  :" +Emp.employeeid+  "Employee name  :"+ Emp.employeename+"   Salary is:" +MonthEmp.salary);
			
			
		}
		else if(Emp.empType.equalsIgnoreCase("Week")) 
		{
			WeekEmployee WeekEmp = new WeekEmployee();
			System.out.println("Enter the hours Worked by Employee ");
			WeekEmp.hours = input.nextInt();
			if(WeekEmp.hours<=40)
			    {
				System.out.println("Enter the price per hour");
				WeekEmp.pricePerHour = input.nextInt();
				WeekEmp.salary = WeekEmp.pricePerHour*WeekEmp.hours;
				
				System.out.println("Employee id  :" +Emp.employeeid+  "Employee name  :"+ Emp.employeename+" Salary is"+WeekEmp.salary);
		        }
	      else if(WeekEmp.hours>40){
	    	  
	    	  System.out.println("Enter the price per hour");
				WeekEmp.pricePerHour = input.nextInt();

			 	  WeekEmp.wages=((WeekEmp.hours-40)*(WeekEmp.pricePerHour)*WeekEmp.rate);
				    	  WeekEmp.Grosssalary=(WeekEmp.pricePerHour*40);
				    	  
				    	  WeekEmp.salary= WeekEmp.Grosssalary+WeekEmp.wages;
				
				
	    	  System.out.println("Employee id :" +Emp.employeeid+  "Employee name :"+ Emp.employeename+" Salary is"+WeekEmp.salary);
				
			}
	   }

	}
	
    }
    

