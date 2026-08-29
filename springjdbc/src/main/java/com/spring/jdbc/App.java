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
  
/*
Student student1=new Student();
    Student student2=new Student();

    student1.setStudentName("abhishek");
    student1.setStudentId(17);
    student1.setStudentAddress("Raebareli");
    
   int result1=studentDao.insert(student1);
    
    student2.setStudentName("gautam");
    student2.setStudentId(10);
    student2.setStudentAddress("Jaipur");
    int result2=studentDao.insert(student2);

    
    
    System.out.println("Student 1 added: " + result1);
    System.out.println("Student 2 added: " + result2);
    */
/*
//update
Student student=new Student();
student.setStudentId(07);
student.setStudentName("bit");
student.setStudentAddress("Lucknow");

int  result= studentDao.change(student);
System.out.println("data changed"+ result);
*/

//Delete
/*
int result=studentDao.delete(17);
System.out.println("deleted "+ result);
*/

Student student=studentDao.getStudent(17);
System.out.println(student);

    
    }
}
