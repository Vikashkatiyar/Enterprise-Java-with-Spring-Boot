package com.main;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.MobileCustomer;
import com.util.HibernateUtil;

public class VersionInsertionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Session session=null;
       Transaction transaction=null;
       Integer idValue=null;
       boolean flag=false;
       
       session=HibernateUtil.getSession();
       MobileCustomer customer=new MobileCustomer();
       customer.setCname("sachin");
       customer.setMobileNo(9999959);
       customer.setCname("KGF-2");
       
       try {
		transaction=session.beginTransaction();
		idValue=(Integer) session.save(customer);
		System.out.println("Generated id Value is:: " +idValue);
		flag=true;
		
       } catch (Exception e) {
		e.printStackTrace();
		flag=false;
	}finally {
		if(flag==true) {
			transaction.commit();
			System.out.println("Object is saved....");
			
		}else {
			transaction.rollback();
			System.out.println("Object is not saved....");
		}
		HibernateUtil.closeSession(session);
	}
       
       		
       
	}

}
