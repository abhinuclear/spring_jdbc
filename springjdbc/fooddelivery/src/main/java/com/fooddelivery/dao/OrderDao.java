package com.fooddelivery.dao;

import com.fooddelivery.entities.Order;

public interface OrderDao {
	public int insert(Order order);
	public int change(Order order);
	public int delete(Order order);

}
