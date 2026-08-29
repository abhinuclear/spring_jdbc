package com.springjdbc.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.springjdbc.entities.Student;


@Component("studentDao")

public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		// TODO Auto-generated method stub
        String query="insert into student(id,name,city) values(?,?,?)";
         int r=this.jdbcTemplate.update(query,student.getStudentId(),student.getStudentName(),student.getStudentAddress());
		return r;
	}
	@Override
	public int change(Student student) {
		//update data
		String query="update student set name=?,city=? where id=?";
		int r = this.jdbcTemplate.update(query,student.getStudentName(),student.getStudentAddress(),student.getStudentId());
		return r;
		
	}
	@Override
	public int delete(int studentId) {
        //delete operations
		String query="delete from student where id=?";
		int r= this.jdbcTemplate.update(query, studentId);
		return r;
	}
	
	//row mapper
	@Override
	public Student getStudent(int studentId) {
		//select single studne tdata
		String query="select * from student where id=?";
		//row mapper impl class
		RowMapper<Student> rowMapper=new RowMapperImpl();
		Student student=this.jdbcTemplate.queryForObject(query,rowMapper,studentId);

		return student;
	}
	//slecting multiple students
	@Override
	public List<Student> getAllStudents() {
		String query="select * from student";
		List<Student> students=this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	} 
	
	public JdbcTemplate getJdbcTemplate() {
		
		
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
		
	}
	
	
}
