package com.iostream.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.iostream.main.dao.CrudOperationImpl;

@SpringBootApplication
public class SpringBootDaoCrudOperationApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringBootDaoCrudOperationApplication.class, args);
		
		 CrudOperationImpl  crudOperationImpl =context.getBean( CrudOperationImpl.class);
		 
		 String item_id1="101";
		 String item_name1="T-Shirt";
		 String item_price1="500";
		 boolean status=crudOperationImpl.insertValues(item_id1, item_name1, item_price1);
		 
		 if(status)
		 {
			 System.out.println("success");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
	}

}
