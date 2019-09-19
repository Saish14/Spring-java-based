package com.bv.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.bv.model.Address;
import com.bv.model.Employee;
import com.bv.model.Greetings;

@Configuration
public class GreetingsConfig {

	@Scope("prototype")
	@Bean
	public Greetings getGreetings()
	{
		return new Greetings();
	}
	
	
	@Bean
	public Employee getEmployee()
	{
		return new Employee();
		
	}
	
	@Bean
	public Address getAddress()
	{
		return new Address();
		
	}
}
