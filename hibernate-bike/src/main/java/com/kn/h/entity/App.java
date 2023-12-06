package com.kn.h.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.hib.entity.Student;

public class App {

	public static void main(String[] args) {
	   Student s1=new Student(1, "Shyam", 68);
	   Student s2=new Student(2, "Ram", 68);
	   Student s3=new Student(3, "Priya", 68);
	   Student s4=new Student(4, "sonu", 68);
       Bike b1=new Bike(123, "Royal Enfield Classic 350", 256632);
       Bike b2=new Bike(456, "Bajaj plusar NS200", 196632);
       Bike b3=new Bike(789, "Hero Splender", 95663);
       Bike b4=new Bike(852, "Hero XPulse", 156632);
       
       Configuration cfg=new Configuration();
       cfg.configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction txn=session.beginTransaction();
       session.save(s1);
       session.save(s2);
       session.save(s3);
       session.save(s4);
       session.save(b1);
       session.save(b2);
       session.save(b3);
       session.save(b4);
       
       txn.commit();
       
       System.out.println("---> "+s1+" has been stored in database !");
       System.out.println("---> "+s2+" has been stored in database !");
       System.out.println("---> "+s3+" has been stored in database !");
       System.out.println("---> "+s4+" has been stored in database !");
       System.out.println("---> "+b1+" has been stored in database !");
       System.out.println("---> "+b2+" has been stored in database !");
       System.out.println("---> "+b3+" has been stored in database !");
       System.out.println("---> "+b4+" has been stored in database !");
	}

}
