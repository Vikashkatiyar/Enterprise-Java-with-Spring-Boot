/**
 * 
 */
package com.main;

import org.hibernate.Session;
import com.model.Employee;
import com.util.HibernateUtil;

/**
 * @author vikash katiyar
 *
 */
public class EntityToDbRowApp {

	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSession();
		Employee employee=null;
		try {
			employee=session.get(Employee.class, 20);
			if(employee!=null) {
				System.out.println("Before Modification:: "+employee);
				
				System.in.read();//pause the execution while not press the enter key
				
				session.refresh(employee);
				
				System.out.println("After Modification:: "+employee);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
