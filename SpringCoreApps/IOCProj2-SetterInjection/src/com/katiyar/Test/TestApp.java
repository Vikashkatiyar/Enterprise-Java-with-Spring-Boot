package com.katiyar.Test;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.katiyar.bean.Employee;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileSystemResource resource=new FileSystemResource("src\\applicationContext.xml");
        XmlBeanFactory beanFactory=new XmlBeanFactory(resource);
        
        Employee employee=beanFactory.getBean("emp",Employee.class);
        System.out.println(employee);
	}

}
