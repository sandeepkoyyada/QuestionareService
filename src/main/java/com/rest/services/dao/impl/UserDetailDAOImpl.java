package com.rest.services.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.rest.services.dao.BaseDao;
import com.rest.services.dao.UserDetailsDAO;




@Repository("UserDetailDAO")
public class UserDetailDAOImpl extends BaseDao implements UserDetailsDAO {

	@Autowired
	public UserDetailDAOImpl(DataSource dataSource) {
		super(dataSource);
	}

	@Autowired
	protected Properties queries;
	
	public String getUserName(String user) {
		
		String query = queries.getProperty("getUser");
		//String query = "select * from user_access where user_name = :username ;";
		
		MapSqlParameterSource map= new MapSqlParameterSource();
		map.addValue("username", user);
		
		List<Map<String,Object>> rows= this.jdbcTemplate.queryForList(query, map);
		String username = "User not found";
		if(rows !=null && !rows.isEmpty())
		{
			for(Map<String,Object> row:rows)
			{
				username = (String) row.get("first_name") + " "+ (String) row.get("last_name");
			}
		}
		return username;
	}

}
