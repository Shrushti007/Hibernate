package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entertainment.entity.Movie;

public class RecordInsertionExampleMain {

	public static void main(String[] args) {

		Configuration hibernateConfig=new Configuration();		
		hibernateConfig=hibernateConfig.configure();
		
		//step 2	
		SessionFactory hibernateFactory=hibernateConfig.buildSessionFactory();
		
		//step 3
		Session hibernateSession=
		hibernateFactory.openSession();
		
		//step 4
		Movie movieObj = new Movie(102, "Coder", "ScienceFiction", 2018);
		
		//step 5 
		Transaction hibernateTransaction=hibernateSession.beginTransaction();
				
		//step 6
		hibernateSession.persist(movieObj);
		
		//step 7
		
		hibernateTransaction.commit();
		
		//step 8
		hibernateSession.close();
		
		//step 9
		hibernateFactory.close();

		
		System.out.println("record inserted...");
	}

}
