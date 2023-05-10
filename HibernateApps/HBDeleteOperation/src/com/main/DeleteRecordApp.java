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
public class DeleteRecordApp {

	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSession();
		Transaction transaction=null;
		Boolean flag=false;
		
		try {
			transaction=session.beginTransaction();
			Employee employee=new Employee();
			employee.setEmpId(7);
			session.delete(employee);
			flag=true;
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
