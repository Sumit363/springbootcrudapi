package com.springboot.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springbootcrudapi.dao.EmployeeDAO;
import com.springboot.springbootcrudapi.model.Employee;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Transactional
	@Override
	public List<Employee> get() {
		return employeeDAO.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		employeeDAO.save(employee);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		employeeDAO.delete(id);
		
	}

}
