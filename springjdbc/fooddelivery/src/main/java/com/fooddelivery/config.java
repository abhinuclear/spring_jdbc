package com.fooddelivery;

import org.springframework.context.annotation.Bean;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.fooddelivery.dao.OrderDao;
import com.fooddelivery.dao.OrderDaoImpl;
import com.fooddelivery.dao.ResturantDao;
import com.fooddelivery.dao.ResturantDaoImpl;


public class config {
	
	
	@Bean("ds")
	public DriverManagerDataSource getDataSource() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	    ds.setUrl("jdbc:mysql://localhost:3306/fooddelivery");
	    ds.setUsername("root");
	    ds.setPassword("MyNewPassword123!");
	    
	    return ds;

}
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate(){
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());;
		return jdbcTemplate;
		
	}
	
	
	
	
	  @Bean("resturantDao") 
	  public ResturantDao getResturantDao() {
	  
	  ResturantDaoImpl resturantDao=new ResturantDaoImpl();
	  resturantDao.setJdbcTemplate(getTemplate()); 
	  return resturantDao;
	  }
	  
	  @Bean("orderDao")
	 public OrderDao getOrderDao() {
		  
		  OrderDaoImpl orderDao=new OrderDaoImpl();
		  orderDao.setJdbcTemplate(getTemplate());
		  return orderDao;
	  }
	 
	  
	 
}