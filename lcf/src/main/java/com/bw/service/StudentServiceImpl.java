package com.bw.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bw.mapper.StudentMapper;
import com.bw.model.Student;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;

	@Override
	public List<Student> findStudent() {
		// TODO Auto-generated method stub
		return studentMapper.findStudent();
	}
	
}
