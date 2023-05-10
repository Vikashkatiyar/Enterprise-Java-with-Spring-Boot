package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {
		
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
		try {
			session=HibernateUtil.getSession();
			
			if(session!=null) {
				transaction=session.beginTransaction();
			}
			
			if(transaction!=null) {
				Employee employee= new Employee();
				employee.setEmpId(10);
				employee.setEnpName("vivek");
				employee.setEmpSal(8685.9);
				
				session.persist(employee);
				//persist does not use with genrators
				flag=true;
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(flag==true) {
				transaction.commit();
			}else {
				transaction.rollback();
				
			}
			
			HibernateUtil.closeSession(session);
			
		}
		
	}

}
