package com.ashraf.mavenassignment.SpringCoreMavenAssignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    
    ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/ashraf/mavenassignment/SpringCoreMavenAssignment/ConfigFirst.xml");
	Adddress ad=(Adddress)context.getBean("Address");
	System.out.println(ad);
	Customer sc=(Customer)context.getBean("Customer");
	System.out.println(sc);
	
  } 
}
