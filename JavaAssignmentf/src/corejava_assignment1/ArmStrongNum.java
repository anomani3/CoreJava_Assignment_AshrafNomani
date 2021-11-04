package corejava_assignment1;

import java.util.Scanner;

public class ArmStrongNum {
public static void main(String[] args) 
  {
	int n,arm=0,rem,c;
	System.out.println("Enter any number");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	c=n;
	while(n>0)
	{
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(c==arm)
	{
		System.out.println("Number is Armstronmg");
	}
	else
		System.out.println("Number is not ArmStrong");
	
  }
}