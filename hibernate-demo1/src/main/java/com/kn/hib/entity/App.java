package com.kn.hib.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
      Student s1=new Student(1, "Ram", 85);
      //1.configure 
      Configuration cfg=new Configuration();
      cfg.configure();
      
      //Build sessionfactory
      SessionFactory factory=cfg.buildSessionFactory();
      
      //open session
      Session session=factory.openSession();
      
      //begin transaction
      Transaction txn=session.beginTransaction();
      session.save(s1);
      
      //commit
      txn.commit();
      
      System.out.println("---> "+s1+" has been stored in database !");
	}

}
