package com.katiyar.service;

import java.util.List;

import com.katiyar.dto.EmployeeDTO;

public interface IEmployeeService {

	String save(EmployeeDTO dto);

	List<EmployeeDTO> findAllEmployees();

	EmployeeDTO findById(Integer eid);

	String updateByTd(Integer eid);

	String deleteById(Integer eid);

}
