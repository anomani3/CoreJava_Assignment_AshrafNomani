package com.ashraf.second_assignment;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ashraf.third_assignment.BankAccount;

public class Assign2Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/ashraf/second_assignment/Assign2Config.xml");
		Question  q=(Question)context.getBean("Question");
		System.out.println(q);
		Question  q1=(Question)context.getBean("Question1");
		System.out.println(q1);
		Question  q2=(Question)context.getBean("Question2");
		System.out.println(q2);
		
	}

}
