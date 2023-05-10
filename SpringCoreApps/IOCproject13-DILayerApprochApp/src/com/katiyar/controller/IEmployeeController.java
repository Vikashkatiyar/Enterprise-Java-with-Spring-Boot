package com.katiyar.controller;

import java.util.List;

import com.katiyar.vo.EmployeeVO;

public interface IEmployeeController {
    String save(EmployeeVO vo);
    
    List<EmployeeVO> findAllEmployees();
    
    EmployeeVO findById(Integer eid);
    
    String updateById(Integer eid);
    
    String deleteByID(Integer eid);
    
    
    
}
