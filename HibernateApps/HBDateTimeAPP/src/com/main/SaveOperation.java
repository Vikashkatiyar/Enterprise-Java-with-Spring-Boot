package com.main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.PersonInfo;
import com.util.HibernateUtil;

public class SaveOperation {

	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();// con.setAutocommit(false)

			if (transaction != null) {
				PersonInfo person = new PersonInfo();
				person.setPname("sachin");
				person.setPaddress("MI");
				person.setDob(LocalDate.of(1973, 4, 24));
				person.setDom(LocalDateTime.of(1987, 6, 21, 12, 35));
				person.setDoj(LocalTime.of(10, 45));
				session.save(person);
				flag = true;

			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (flag == true) {
				transaction.commit();// con.commit()
				System.out.println("Object saved to database....");
			} else {
				transaction.rollback();// con.rollback()
				System.out.println("Object insertion failed...");
			}

			HibernateUtil.closeSession(session);
		}

	}

}

