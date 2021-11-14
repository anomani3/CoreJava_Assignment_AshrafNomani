package com.ashraf.initilize.dispose.eighthassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ashraf/initilize/dispose/eighthassignment/Assign8Config.xml");
		((AbstractApplicationContext)context).registerShutdownHook();
		Restaurant res=(Restaurant)context.getBean("restaurantBean");
	//System.out.println(res);
	res.greetCustomer();
	}

}
