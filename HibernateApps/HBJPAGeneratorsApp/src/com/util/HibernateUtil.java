package com.util;




import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	static Configuration cfg=null;
	static SessionFactory sessionfactory=null;
	static Session session=null;
	
	static {
		try {
			cfg=new Configuration();
			cfg.configure();
			sessionfactory=cfg.buildSessionFactory();
		} catch (HibernateException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		if(session==null) {
			session=sessionfactory.openSession();
		}
		return session;
	}
	
	public static void closeSession(Session session) {
		if(session!=null) {
			session.close();
		}
	}
	
    public static  void closesessionfactory(SessionFactory sessionfactory) {
		if(sessionfactory!=null) {
			sessionfactory.close();
		}

	}
}
