package day6EmpWage;
import java.util.Scanner;


public class empWageday6 {

	  public void EmployeeWageUC1()
	  {
		  int IsPresent=1;
		  int empCheck = (int)Math.floor(Math.random() * 10) % 2;

		  int RatePerHr=20;
		  int Hr=8;
		  
		  if(IsPresent==empCheck)
		  {
			  System.out.println("Employee is Present and he work for a day his earn Salary will="+RatePerHr*Hr);
	    }
		  else
		  {
			  System.out.println("Employee is Abscent he Earn as Salary=0");
			  
		  }
	  }
	  
	  
		public static void main(String[] args) 
		{
	      System.out.println("Welcometo Employee Wage Computation Program=");
	      Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the choice=\n");
	      System.out.println("Enter 1 To check the Employee is present or not:-");
	      System.out.println("Enter 2 To calculate The part-full time Employee Wage:-");
	      System.out.println("Enter 3 To calculate Monthly employee wage:-");
	      System.out.println("Enter 4 To calulate employee wage hours:-");
	      
	      
	      int ch=sc.nextInt();
	      
	      switch(ch) 
	      {
	    	  case 1: System.out.println("To calculate the Employee Wage");
	    	  		  empWageday6 obj=new empWageday6();
	    	  		  obj.EmployeeWageUC1();
	    	  		  break;
	    	  		  
	    	  case 2:  System.out.println("To calculate The part-full time Employee Wage"); 
	    		       EmployeePartTime obj2=new EmployeePartTime();
	                   obj2.EmployeeUC3();
	                   break;
	                   
	    	  case 3: System.out.println("To calculate Monthly employee wage");
	    	          CalculateMonthWage obj3=new CalculateMonthWage();
	    	          obj3.EmployeeUC5();
	    	          break;
	    	          
	    	  case 4: System.out.println("To calulate employee wage hours ");
	    	          EmployeeWageHrs obj4=new EmployeeWageHrs();
	    	          obj4.employeeWageUC6();
	    	          break;
	    	  case 5: System.out.println("To calulate employee wage for different companys ");
	          		  DiffCompanyEmployeeWage obj5=new DiffCompanyEmployeeWage();
	          		  obj5.EmployeeUC7();
	                  break;
	          
	    	  default: System.out.println("you have entered Wrong option please enter right one:-");
	    	           break;
	      }  
	      
	      
		}
		
	}

	class EmployeePartTime
	{
		public void EmployeeUC3()
		{
			int PartTime=1;
			int FullTime=2;
			int RatePerHr=20;
			int Hr=0;
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			if(FullTime==empCheck)
			{
				 Hr=8;
			}
			else if(PartTime==empCheck)
			{
				 Hr=4;
			}
			else
			{
				System.out.println("Salary=0");
			}
			 int Salary=RatePerHr*Hr;
			 System.out.println("Salary="+Salary);
		}   
	}

	class CalculateMonthWage
	{
		public void EmployeeUC5() 
		{
			int PartTime=1;
			int FullTime=2;
			int RatePerHr=20;
			int Hr=0;
			int DaysInMonth=20;
			int totalEmpWage=0;
			for(int days=0;days<DaysInMonth;days++)
			{
			int empCheck = (int)Math.floor(Math.random() * 10) % 3;
			if(FullTime==empCheck)
			{
				 Hr=8;
			}
			else if(PartTime==empCheck)
			{
				 Hr=4;
			}
			else
			{
				System.out.println("Salary=0");
			}
			 int Salary=RatePerHr*Hr;
			 totalEmpWage += Salary;
			 System.out.println("="+Salary);
		  }
			System.out.println("Total Employee Wage"+totalEmpWage);
	 }
	}

	class EmployeeWageHrs
	{
		public void employeeWageUC6()
		{
			int EarnPerHour=20;

				int Hour=0, TotalWage=0,Totalemphour=0,TotalWorkingDays=0;
			
				while (Totalemphour<=100 && TotalWorkingDays<20)
				{
					TotalWorkingDays++;
					int present =(int)Math.floor((Math.random()*10)%3);
					switch (present) 
					{
						case 1:
							Hour=Hour+8;
							break;
						case  2:
							Hour=Hour+4;
							break;
						default:
							Hour=0;
					}
					Totalemphour+=Hour;
					TotalWage=TotalWage+Totalemphour;
				}
			System.out.println("Employee Earn in Month mworking 20 days:-"+TotalWage*EarnPerHour);
	}
	}

	class DiffCompanyEmployeeWage
	{
		public void EmployeeUC7() 
		{
			int PartTime=1;
			int FullTime=2;
			int RatePerHr=20;
			int Hr=0;
			int DaysInMonth=20;
			int totalEmpWage=0;
			for(int days=0;days<DaysInMonth;days++)
			{
			double empCheck = Math.floor(Math.random() * 10) % 3;
			if(FullTime==empCheck)
			{
				 Hr=8;
			}
			else if(PartTime==empCheck)
			{
				 Hr=4;
			}
			else
			{
				System.out.println("Salary=0");
			}
			 int Salary=RatePerHr*Hr;
			 totalEmpWage += Salary;
			 System.out.println("Salary="+Salary);
		  }
			System.out.println("Total Employee Wage"+totalEmpWage);
	 }
	}
