package com.rest.services.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class BaseDao {
	protected NamedParameterJdbcTemplate jdbcTemplate;
	
	@Autowired
	public BaseDao(DataSource dataSource){
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		
	}

}
