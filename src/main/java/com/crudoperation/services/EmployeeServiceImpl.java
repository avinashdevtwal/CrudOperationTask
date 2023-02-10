package com.crudoperation.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudoperation.dao.EmployeeRepositary;
import com.crudoperation.exceptionhandel.ResourcenotfountException;
import com.crudoperation.model.Employee;
import com.crudoperation.model.EmployeeDTO;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeServices {
	@Autowired
	EmployeeRepositary employeerepositary;
	@Autowired
	private ModelMapper modelmapper;

	@Override
	public EmployeeDTO saveEmployee(Employee employee) {
		Employee employeedata = employeerepositary.save(employee);

		EmployeeDTO employeedto = modelmapper.map(employeedata, EmployeeDTO.class);

		return employeedto;

	}

	@Override
	public List<EmployeeDTO> getAllEmployeeid() {
		List<Employee> employeedata = employeerepositary.findAll();
		List<EmployeeDTO> employeedto = employeedata.stream().map(user -> modelmapper.map(user, EmployeeDTO.class))
				.collect(Collectors.toList());

		return employeedto;
	}

	@Override
	public EmployeeDTO getEmployeeid(Long id) {

		Employee employee = employeerepositary.findById(id)
				.orElseThrow(() -> new ResourcenotfountException("user not found " + id));

		EmployeeDTO employeedto = modelmapper.map(employee, EmployeeDTO.class);

		return employeedto;

	}

	@Override
	public void deleteEmployeebyid(Long id) {
		employeerepositary.deleteById(id);

	}

	

	


	

}
