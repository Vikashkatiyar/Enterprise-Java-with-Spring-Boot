package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

public class DeleteApp {

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
				int id=10;
				Employee employee=session.get(Employee.class, id);
				if(employee!=null) {
					
					session.delete(employee);
					flag=true;
				}else {
					System.out.println("Record not availbale for deletion...");
					return;
				}
				
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(flag==true) {
				transaction.commit();
				System.out.println("Object Deleted Successfully...");
			}else {
				transaction.rollback();
				System.out.println("Object Failed to delete...");
			}
			
			HibernateUtil.closeSession(session);
		}

	}

}
