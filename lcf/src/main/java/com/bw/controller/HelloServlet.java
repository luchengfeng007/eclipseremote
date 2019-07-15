package com.bw.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.model.Student;
import com.bw.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HelloServlet {

	@Resource
	private StudentService studentService;
	@RequestMapping("find")
	@ResponseBody
	public String find() {
		
		return "success";
	}
	@ResponseBody
	@RequestMapping("list")
	public  List<Student> findStudent() {
		List<Student> findStudent = studentService.findStudent();
		
		return findStudent;
	}

	@RequestMapping("get")
	public  String getStudent(Model model,@RequestParam(defaultValue = "1")Integer pageNum) {
		PageHelper.startPage(pageNum, 3);
		
		List<Student> findStudent = studentService.findStudent();
		PageInfo<Student> pageInfo = new PageInfo<Student>(findStudent);
		
		//model.addAttribute("findStudent", findStudent);
		model.addAttribute("page", pageInfo);
		return "list";
	}
}
