package com.klu.jfsd.labexam;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		insert(sf);
		//delete(sf);
		sf.close();

	}
	private static void insert(SessionFactory sf)
	{
		
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Query q1 = s.createSQLQuery("insert Department values('ABC','C301','Ram')");
		q1.executeUpdate();
		Query q2 = s.createSQLQuery("insert Department values('CSE','C305','Krishna')");
		q2.executeUpdate();
		t.commit();
		
		System.out.println("Client Record Inserted Successfully");
	}
	private static void delete(SessionFactory sf)
	{
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("delete from Department where id=:n");
		q.setParameter("n", 1);
		t.commit();
		System.out.println("Record deleted successfully");
		
		
	
	}
	

}
