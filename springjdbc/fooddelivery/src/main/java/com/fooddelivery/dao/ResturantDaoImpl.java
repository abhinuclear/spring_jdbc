package com.fooddelivery.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import com.fooddelivery.entities.Resturant;


@Component("resturantDao")
public class ResturantDaoImpl implements ResturantDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
@Override
	public int insert(Resturant resturant) {
		
		
		
		String query="insert into resturant(id,name,address) values(?,?,?)";
		
		return jdbcTemplate.update(
                query,
                resturant.getResturantId(),
                resturant.getResturantName(),
                resturant.getResturantAddress()
        );
	}

	public int change(Resturant resturant) {
		
		String query="update student set name=?,address=? where id=?";

		return jdbcTemplate.update(query,resturant.getResturantName(),resturant.getResturantAddress(),resturant.getResturantId());
	}

	public int delete(Resturant resturant) {
		// TODO Auto-generated method stub
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

}
