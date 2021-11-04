package corejava_assignment1;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		
			
		
				
		Scanner sc=new Scanner(System.in);
				
		double tax=0.0;
				
		System.out.println("Enter your yearly salary: ");
				
		double salary=sc.nextDouble();
				
		System.out.println("Your yearly salary is: "+salary);
				
		if((salary > 0) && (salary < 180000))
				
		{
					
		tax=0.0;
				
		}
				
		else if((salary > 181001.0) && (salary < 300000.0))
				
		{
					
		tax=salary*(0.1);
				
		}
				
		else if((salary > 300001) && (salary < 500000))
				
		{
					
		tax=salary*(0.2);
				
		}
				
		else if((salary > 500001) && (salary < 1000000))
				
		{
					
		tax=salary*(0.3);
				
		}
				
		System.out.println("The income tax amount you have to pay " +tax);
			
		}

		
	}


