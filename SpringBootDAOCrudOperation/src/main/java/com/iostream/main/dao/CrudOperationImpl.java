package com.iostream.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CrudOperationImpl implements CrudOperation
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean insertValues(String item_id, String item_name, String item_price) 
	{
		boolean status=false;
		
		String sql_query="insert into items values(?,?,?)";
		int count=jdbcTemplate.update(sql_query,item_id,item_name,item_price);
		
		if(count>0)
		{
			//System.out.println("success");
			status=true;
		}
		else
		{
			//System.out.println("fail");
			status=false;
		}
		
		return status;
		
		
	}

}
