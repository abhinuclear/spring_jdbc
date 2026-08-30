package com.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fooddelivery.dao.OrderDao;
import com.fooddelivery.dao.ResturantDao;
import com.fooddelivery.entities.Order;
import com.fooddelivery.entities.Resturant;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Started" );
        ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
        
        ResturantDao resturantDao=context.getBean("resturantDao", ResturantDao.class);
        
        OrderDao  orderDao=context.getBean("orderDao", OrderDao.class);
        
        Resturant resturant1=new Resturant();
        Order order1=new Order();
        
        resturant1.setResturantId(1);
        resturant1.setResturantName("dhaba");
        resturant1.setResturantAddress("Jaipur");
        
        
        order1.setOrderId(1);
        order1.setOrderName("dalkachori");
        order1.setOrderAddress("nya dukan");
        
        int result1=resturantDao.insert(resturant1);
        int result2=orderDao.insert(order1);
        
        System.out.println("Resturant 1 Added: " + result1);
        System.out.println("Order 1 Added: " + result2);

        
        
    }
}
