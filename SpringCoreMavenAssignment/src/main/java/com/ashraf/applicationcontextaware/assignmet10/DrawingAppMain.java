package com.ashraf.applicationcontextaware.assignmet10;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingAppMain {
	
	
	/**
	 * @author Dinesh Rajput
	 *
	 */
	
	 /**
	  * @param args
	  */
	 public static void main(String[] args) 
	 {
	ApplicationContext context = new ClassPathXmlApplicationContext("com/ashraf/applicationcontextaware/assignmet10/config10.xml");
	Triangle triangle = (Triangle) context.getBean("Triangle");
	triangle.draw();
	 }
	}

