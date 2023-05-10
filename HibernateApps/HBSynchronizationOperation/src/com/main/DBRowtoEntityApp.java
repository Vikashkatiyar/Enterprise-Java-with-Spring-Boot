/**
 * 
 */
package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

/**
 * @author vikash katiyar
 *
 */
public class DBRowtoEntityApp {

	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSession();;
		Transaction transaction=null;
		Boolean flag=false;
		Employee employee=null;
		try {
			transaction=session.beginTransaction();
			employee=session.get(Employee.class, 20);
			if(employee!=null) {
				System.out.println(employee);
				employee.setEmpSal(5555.5);
				flag=true;
			}
			flag=true;
		} catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}finally {
			if(flag==true) {
				transaction.commit();
				System.out.println(employee);
				System.out.println("Object updated.....");
			}else {
				transaction.rollback();
				System.out.println("Object updation failed.....");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
