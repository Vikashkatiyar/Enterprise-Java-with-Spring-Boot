package com.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Employee;
import com.util.HibernateUtil;

public class AssignedGeneratorApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Employee employee = new Employee();
				
				employee.setEmpName("virat");
				employee.setEmpSal(5555.6);

				Integer id = (Integer) session.save(employee);
				System.out.println("The id of the student is :: " + id);
				flag = true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (flag == true)
				transaction.commit();
			else
				transaction.rollback();

			HibernateUtil.closeSession(session);
		}
	}

}
