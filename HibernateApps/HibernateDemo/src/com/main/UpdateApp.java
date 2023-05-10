package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

public class UpdateApp {

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
				Employee employee=new Employee();
				employee.setEmpId(7);
				employee.setEnpName("Sachin");
				employee.setEmpSal(5555.9);
				
				
				session.saveOrUpdate(employee);
				flag=true;
				
				
			}
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			if(flag==true) {
				transaction.commit();
				System.out.println("Record Updated Successfully...");
			}else {
				transaction.rollback();
				System.out.println("Record Updation Failed....");
			}
			
			HibernateUtil.closeSession(session);
		}

	}

}
