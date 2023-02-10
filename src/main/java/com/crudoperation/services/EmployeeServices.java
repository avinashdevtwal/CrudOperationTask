package com.crudoperation.services;

import java.util.List;

import com.crudoperation.model.Employee;
import com.crudoperation.model.EmployeeDTO;


public interface EmployeeServices {

	public EmployeeDTO saveEmployee(Employee employee);

	public EmployeeDTO getEmployeeid(Long id);

	public List<EmployeeDTO> getAllEmployeeid();

	public void deleteEmployeebyid(Long id);

 

}
