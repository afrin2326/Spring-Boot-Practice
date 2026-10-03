package com.iostream.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.iostream.main.bean.Student;

@org.springframework.context.annotation.Configuration
public class Configuration 
{
	
	@Bean
	public CommandLineRunner cmdLineRunner()
	{
		return new CommandLineRunner()
		{

			@Override
			public void run(String... args) throws Exception
			{
				std().display();
			}
			
		};
	}
	
	
	@Bean
    public Student std() {
        return new Student("Afrin", 12, 90.8f);
    }

}
