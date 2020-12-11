package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Employee;
import service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	private EmpService empService;	// Object reference for Service Class
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		try {
			// Calling service method to complete record addition
			empService.addEmp(employee);		
			mv.setViewName("result.jsp");		// Adding view page to model
			mv.addObject("id",employee.getEmpId());	// adding data to model
			mv.addObject("name",employee.getEmpName());	// adding name data to model
			mv.addObject("sal",employee.getSal());	// adding salary to model
		}
		catch(DataIntegrityViolationException excep) {
			System.out.println("Error");	
		}
		return mv;
	}
	
	@RequestMapping(value = "/listEmp", method = RequestMethod.GET)
	public ModelAndView listEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView();
		System.out.println("List Employee Called");
		List<Employee> emplist = empService.listEmp();
		mv.addObject("employees",emplist);
		mv.setViewName("list.jsp");
		return mv;		
	}


}
