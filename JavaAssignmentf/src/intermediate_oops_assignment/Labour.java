package intermediate_oops_assignment;

import java.util.Scanner;

 abstract class Employee {
		
		abstract void totalsalry(int x[]);
		abstract int[] readSal();

	}


public class Labour extends Employee {
public static void main(String[] args) {
	Labour l= new Labour();
	int a[]=l.readSal();
	l.totalsalry(a);
	}
	int[] readSal() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter sal of laobour : ");
		int sal=s.nextInt();
		System.out.println("enter overtime sal of laobour : ");
		int overtime=s.nextInt();
		int[] a= {sal,overtime};
		s.close();
		return a;
		}
	
	@Override
	void totalsalry(int x[]) {
		int Ltsal=0;
		for(int i=0;i<x.length;i++) {
			Ltsal+=x[i];	
		}
		System.out.println("total salry of Labour is : "+Ltsal);
		
		return ;
	}

}

public class Manager extends Employee{
	public static void main(String[] args) {
		Manager m=new Manager();
		int a[]=m.readSal();
		m.totalsalry(a);
		
	}
	int[] readSal() {
		Scanner s= new Scanner(System.in);
		System.out.println("enter sal of Manager : ");
		int sal=s.nextInt();
		System.out.println("enter incentive sal of Manager : ");
		int incentive=s.nextInt();
		int[] a= {sal,incentive};
		s.close();
		return a;
		}
	@Override
	void totalsalry(int x[]) {
		int Mtsal=0;
		for(int i=0;i<x.length;i++) {
			Mtsal+=x[i];	
		}
		System.out.println("total salry of manager is : "+Mtsal);
		
		return;
	}
}
