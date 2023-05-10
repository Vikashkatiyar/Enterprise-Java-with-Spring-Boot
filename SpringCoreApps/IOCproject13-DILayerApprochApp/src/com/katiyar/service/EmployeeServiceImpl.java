package com.katiyar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.katiyar.bo.EmployeeBO;
import com.katiyar.dao.IEmployeeDAO;
import com.katiyar.dto.EmployeeDTO;



@Component("service")
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
	IEmployeeDAO dao;
	
    
    @Override
	public String save(EmployeeDTO dto) {
		EmployeeBO bo=new EmployeeBO();
		bo.setEname(dto.getEname());
		bo.setAge(dto.getAge());
		bo.setEaddress(dto.getEaddress());
		
		return dao.save(bo);
	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {
		List<EmployeeBO> employeesBO = dao.findAllEmployees();
		List<EmployeeDTO> employeeDTO = new ArrayList<>();
		
		for (EmployeeBO bo : employeesBO) {

			EmployeeDTO dto = new EmployeeDTO();
			dto.setEid(bo.getEid());
			dto.setEname(bo.getEname());
			dto.setAge(bo.getAge());
			dto.setEaddress(bo.getEaddress());

			employeeDTO.add(dto);
		}
		return employeeDTO;
		
	}

	@Override
	public EmployeeDTO findById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateByTd(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
