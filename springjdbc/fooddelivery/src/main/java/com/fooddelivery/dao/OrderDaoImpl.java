package com.fooddelivery.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import com.fooddelivery.entities.Order;


@Configuration("orderDao")
public class OrderDaoImpl implements OrderDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Order order) {
		String query="insert into orders(id,name,address) values(?,?,?)";
		return jdbcTemplate.update(query,order.getOrderId(),order.getOrderName(),order.getOrderAddress());
	}

	@Override
	public int change(Order order) {
		String query="update order set name=?,addr=? where id=?";
		return jdbcTemplate.update(query,order.getOrderName(),order.getOrderAddress(),order.getOrderId());
	}

	@Override
	public int delete(Order order) {
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
