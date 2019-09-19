package com.bv.execution;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bv.configuration.GreetingsConfig;
import com.bv.model.Address;
import com.bv.model.Employee;
import com.bv.model.Greetings;

public class App {

	public static void main(String args[])
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(GreetingsConfig.class);
		Greetings greetings = context.getBean(Greetings.class);
		
		Greetings greetings1 = context.getBean(Greetings.class);
		
		
		/*Employee employee = context.getBean(Employee.class);
		employee.setId(101);
		employee.setName("Tatya");
		Address address = context.getBean(Address.class);
		address.setAddress("Govandi");
		employee.setAddress(address);
		System.out.println(employee);*/
		
		greetings.setMessage("Tayta Aleee!!!!!!");
		greetings1.setMessage("Tayta Parat Aleee!!!!!!");
		System.out.println(greetings.getMessage());
		System.out.println(greetings1.getMessage());
		
		
	}
}
