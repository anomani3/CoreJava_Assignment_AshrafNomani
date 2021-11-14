package intermediate_oops_assignment;

//Why do we use Inheritence?
//
//Singleton is a design pattern involving a class which is responsible to create an object while making sure that only one object gets created. This design pattern comes under creational design patterns as it is one of the ways to create an object of a class.
//
//A class designed using the Singleton design pattern is loosely referred to as a Singleton Class.
//
//To design a singleton class:
//
//You have to make all the constructors (including the default no-argument constructor) as private.
//Write a static method that has return type object of this singleton class.
//		
//		We cannot inherit from singleton class

public class SingleTon_Class {
	

	// Create private attribute that refers to a singleton object
		private static SingleTon_Class single=new SingleTon_Class();
		
		//Create private constructor that restricts the object to create object
		//outside the class.
		private SingleTon_Class()
		{
			
		}
		
		public static SingleTon_Class getInstance()
		{
			return single;
		}
		public void getInfo()
		{
			System.out.println("Yeou arre in singleton clsss");
		}

		  
			
	

}
