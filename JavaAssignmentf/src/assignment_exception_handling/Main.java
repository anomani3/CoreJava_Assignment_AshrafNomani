package assignment_exception_handling;



public class Main {

	public static void main(String[] args) {
		Banking_Application_Third_problem b=new Banking_Application_Third_problem();
		b.deposit(100);//1200 u must fill in the method then u can get result  
		try {
			b.withdraw(-200);//200  if u pass negative value then u can get result okay  //-1
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("InsufficientBalanceException "+e);
		}
		


	}

}
