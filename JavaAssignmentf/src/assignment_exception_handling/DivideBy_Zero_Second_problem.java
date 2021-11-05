package assignment_exception_handling;

import java.util.Scanner;

public class DivideBy_Zero_Second_problem extends RuntimeException
{

	
	
		static int res;

		public static void main(String[] args)  {
			Scanner sc=new Scanner(System.in);
			
			try {
				System.out.println("Enter First Number");
				int n=sc.nextInt();
				System.out.println("Enter Second number");
				int n1=sc.nextInt();
				res=n/n1;
				System.out.println("Result::="+res);
			} catch (UnsupportedOperationException e) 
			{
				// TODO Auto-generated catch block
				
			System.out.println("UnsupportedOperationException"+e);
			}
			
			

		}

	}
