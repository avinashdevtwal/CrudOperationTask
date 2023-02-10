package com.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.crudoperation.model.Employee;
import com.crudoperation.model.EmployeeDTO;
import com.crudoperation.services.EmployeeServices;

@Controller
@RequestMapping("/")
public class EmployeeController {
	@Autowired
	EmployeeServices employeeservices;

	@GetMapping("/get")
	public String viewHomePage(Model model) {
		List<EmployeeDTO> employeedto = employeeservices.getAllEmployeeid();
		model.addAttribute("listOfEmployee", employeedto);
		return "index";

	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		// create model attribute to bind form data
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "AddnewEmployee";
	}

	@PostMapping("/saveemployee")
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeservices.saveEmployee(employee);

		return "redirect:/get";
	}

	@GetMapping("/update/{id}")
	public String getEmployeeid(@PathVariable("id") Long id, Model model) {
		EmployeeDTO employee1 = employeeservices.getEmployeeid(id);
		model.addAttribute("employee", employee1);
		return "update_employee";

	}

	@GetMapping("/delete/{id}")
	public String deteteEmployeebyid(@PathVariable("id") Long id) {

		employeeservices.deleteEmployeebyid(id);
		return "redirect:/get";

	}

}