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
public class LoadAndDeleteApp {

	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSession();
		Transaction transaction=null;
		Boolean flag=false;
		Employee employee=null;
		
		
		try {
			transaction=session.beginTransaction();
			employee=session.get(Employee.class, 10);
			if(employee!=null) {
				
				session.delete(employee);
				flag=true;
			}else {
				System.out.println("Record not available to delete");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			flag=false;
		}finally {
			if(flag==true) {
				transaction.commit();
				System.out.println("Object Deleted.....");
			}else {
				transaction.rollback();
				System.out.println("Object failed to delete.....");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
