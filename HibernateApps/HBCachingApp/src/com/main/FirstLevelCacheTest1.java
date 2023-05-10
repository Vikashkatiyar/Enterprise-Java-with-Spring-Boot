package com.main;

import org.hibernate.Session;

import com.model.*;
import com.util.*;

public class FirstLevelCacheTest1 {

	public static void main(String[] args) {

		Session session = null;
		InsurancePolicy policy = null;

		session = HibernateUtil.getSession();

		try {
			policy = session.get(InsurancePolicy.class, 1L);// gets from DB and put it in L1-cache
			System.out.println("1:: " + policy);

			policy = session.get(InsurancePolicy.class, 1L);// gets from L1cache
			System.out.println("2:: " + policy);
			System.out.println("=====================");

			session.evict(policy);// remove policy object from L1 cache

			policy = session.get(InsurancePolicy.class, 1L);// gets from DB and put it in L1-cache
			System.out.println("3:: " + policy);

			policy = session.get(InsurancePolicy.class, 1L);// gets from L1 cache
			System.out.println("4:: " + policy);
			System.out.println("========================");

			session.clear(); // remove all objects from L1-cache

			policy = session.get(InsurancePolicy.class, 1L);// gets from DB and put it in L1-cache
			System.out.println("5:: " + policy);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			HibernateUtil.closeSession(session);
		}
	}
}

