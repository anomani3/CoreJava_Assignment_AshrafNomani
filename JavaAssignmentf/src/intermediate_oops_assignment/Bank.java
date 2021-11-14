package intermediate_oops_assignment;
import java.util.Scanner;


public class Bank {
	
	
		public static void main(String[] args) {
			Savings s = new Savings();
			Current c = new Current();
			int d = s.money();
			int e = c.money();
			System.out.println("total amount bank has is : " + (d + e));
		}

		int money() {
			return 0;
		}
	}

	class Savings extends Bank {
		@Override
		int money() {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the money in saving account : ");
			int c = s.nextInt();
			return c;
		}
	}

	class Current extends Savings {
		@Override
		int money() {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the money in current account : ");
			int d = s.nextInt();
			s.close();
			return d;
		}
	}


