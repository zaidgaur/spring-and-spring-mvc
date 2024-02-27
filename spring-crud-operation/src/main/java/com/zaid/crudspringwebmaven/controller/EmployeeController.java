package com.zaid.crudspringwebmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zaid.crudspringwebmaven.dao.DAO;
import com.zaid.crudspringwebmaven.dto.Employee;

@Controller
public class EmployeeController {
	@Autowired
	private DAO dao;
	@RequestMapping("/empform")
	public String showForm(){
		return "empform";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST  )
	public String save(@ModelAttribute Employee emp){
		System.out.println(emp);
		dao.save(emp);
		return "redirect:/viewemp";
		
	}
	
	
	@RequestMapping("/viewemp")
	public ModelAndView viewemp(){
		List<Employee> list = dao.getEmployees();
		return new ModelAndView("viewemp","employee",list);
		
	}
	
	
	@RequestMapping("/editemp/{id}")                                       
	public ModelAndView editemp(@PathVariable int id){
		Employee employee = dao.getEmpById(id);
		return new ModelAndView("empeditform","employee",employee);
		
	}
	
	
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editsave(@ModelAttribute Employee emp){
		//System.out.println(id);
		dao.update(emp);
		return "redirect:/viewemp";	
	}
	
	
	@RequestMapping("/deleteemp/{id}")
	public String deleteemp(@PathVariable int id){
		dao.delete(id);
		return "redirect:/viewemp";
	}
	
	

}
