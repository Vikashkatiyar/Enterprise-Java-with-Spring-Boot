package com.katiyar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.katiyar.bo.CustomerBo;
import com.katiyar.dao.ICustomerDAO;
import com.katiyar.dto.CustomerDTO;


@Service(value = "service")
public class CustomerMgmtServiceImpl implements ICustomerMgmtService{
    
	@Autowired
	private ICustomerDAO dao;
	
	static {
		System.out.println("CustomerMgmtServiceImpl.class file is loading...");
	}
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao)
	{
		System.out.println("CustomerMgmtServiceImpl::One Param constructor...");
		this.dao=dao;
	}
	
	@Override
	public String calculateSimpleInterest(CustomerDTO dto) {
		float intrAmt = 0.0f;

		intrAmt = (dto.getPamt() * dto.getTime() * dto.getRate()) / 100.0f;

		CustomerBo bo = new CustomerBo();

		bo.setCustomerAddres(dto.getCustomerAddress());
		bo.setCustomerName(dto.getCustomerName());
		bo.setPamt(dto.getPamt());
		bo.setRate(dto.getRate());
		bo.setTime(dto.getTime());
		bo.setInterestAmt(intrAmt);

		int count = dao.insert(bo);

		// process the result
		if (count == 0)
			return "Customer Registration failed :: " + dto.getPamt() + " Interest :: " + intrAmt;
		else
			return "Customer Registration Successful :: " + dto.getPamt() + " Interest :: " + intrAmt;
	}
	
	
      
}
