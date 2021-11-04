package corejava_assignment1;

import java.util.Scanner;

public class Simple_and_compound_Interest {
	static double p,t,r,s,c;
	static double simpleInterest(double p,double t,double r)
	{
		double simple;
		simple=(p*t*r)/100;
		return simple;
	}
	static double compoundInterest(double p,double t,double r)
	{
		double compound;
		compound=p+(Math.pow(1+(r/100),t));
		return compound;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		p=sc.nextInt();
		System.out.println("Enter time Period");
		t=sc.nextInt();
		System.out.println("Enter Rate of Interest");
		r=sc.nextInt();
		s=simpleInterest(p, t, r);
		c=compoundInterest(p, t, r);
		System.out.println("The value of SimpleInterest is: "+s+"The value of CompoundInterest is :"+c);
		
		
		
		
		
	}

}
