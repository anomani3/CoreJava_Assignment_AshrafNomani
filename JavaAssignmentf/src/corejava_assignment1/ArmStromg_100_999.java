package corejava_assignment1;

import java.util.Scanner;

public class ArmStromg_100_999 {

	    public static boolean arms(int n)
	    {
	    	int sum=0;
	    	int temp=n;
	        while(n!=0)
	        {
	        	int r=n%10;
	        	n=n/10;
	        	sum=sum+r*r*r;
	        }
	        
	        if(temp==sum)
	        {
	        	return true;
	        }
	        return false;
	    }
	    public static void main(String[]args) {

       
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter first number");
	    	int n1=sc.nextInt();
	    	System.out.println("Enter second number for intervals");
	    	int n2=sc.nextInt();
	    	for (int i=n1;i<=n2;i++)
	    	{
	    		if(arms(i))
	    		{
	    			System.out.println(i);
	    		}
	    	}
	    }
	}


   