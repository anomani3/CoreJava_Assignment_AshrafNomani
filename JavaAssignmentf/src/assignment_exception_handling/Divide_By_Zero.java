package assignment_exception_handling;

import java.util.Scanner;

public class Divide_By_Zero {
	static int res;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter First Number");
		int n=sc.nextInt();
		System.out.println("Enter Second number");
		int n1=sc.nextInt();
		res=n/n1;
		System.out.println("Result::="+res);
		
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("You can not divide any number by zero");
			
		}

	}

}
