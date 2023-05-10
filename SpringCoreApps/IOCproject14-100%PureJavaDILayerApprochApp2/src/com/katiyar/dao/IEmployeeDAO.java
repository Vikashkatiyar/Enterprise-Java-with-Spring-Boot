package com.katiyar.dao;

import com.katiyar.bo.EmployeeBO;
import java.util.*;

public interface IEmployeeDAO {

	String save(EmployeeBO bo);

	List<EmployeeBO> findAllEmployees();

	EmployeeBO findById(Integer eid);

	String updateById(Integer eid);

	String deleteById(Integer eid);

}
