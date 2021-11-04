package corejava_assignment1;

import java.io.*;

import java.util.*;

import java.lang.Math;

public class Average

{
	
public static void main(String[] args) 
	
{
		
Scanner sc=new Scanner(System.in);
		
int a,b,c,sum;
		
double avg=0.0;
		
System.out.println("Enter the marks of A subject: ");
		
a=sc.nextInt();
		
System.out.println("Enter the marks of B subject: ");
		
b=sc.nextInt();
		
System.out.println("Enter the marks of C subject: ");
		
c=sc.nextInt();
		
sum=a+b+c;
		
avg=(sum/3);
System.out.println("Total marks Obtained is "+sum+" and average is "+avg);
		
	
}

}