package com.spring.jdbc;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.StudentDao;
import com.springjdbc.entities.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println("Program Started......" );
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
  /*     Student student1=(Student) context.getBean("student1");
       Student student2=(Student) context.getBean("student2");
       Student student3=(Student) context.getBean("student3");
        

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        */
      //  Object template=context.getBean("jdbcTemplate", JdbcTemplate.class);
        
StudentDao studentDao =context.getBean("studentDao", StudentDao.class);
    Student student=new Student();
    student.setStudentName("abhishek");
    student.setStudentId(07);
    student.setStudentAddress("Raebareli");
    
    int result=studentDao.insert(student);
    System.out.println("student added" + result);
    
    }
}
