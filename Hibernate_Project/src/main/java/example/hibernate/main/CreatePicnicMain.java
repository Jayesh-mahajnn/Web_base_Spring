package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.Picnic;

public class CreatePicnicMain {

	public static void main(String[] args) {
		
		Session sessionObj = null;
	    SessionFactory sessionFactoryObj= null;
	    
	    try {
	    	
	    	Configuration conf = new Configuration();
	    	conf.configure();//Look for hibernate.cfg.xml
	    	sessionFactoryObj = conf.buildSessionFactory();
	    	sessionObj = sessionFactoryObj.openSession();
	    	
	    	Picnic ourPicnic = 
	    			new  Picnic(102 , "Karla keevs , Gorai" , "19th june 2026"  , 28 );
	    	
	    	Transaction trn = sessionObj.beginTransaction();
	    	sessionObj.persist(ourPicnic);
	    	
	    	trn.commit();
	    	
	    	System.out.println("Picnic Record Added !");
	    	
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    finally {
			sessionObj.clear();
			sessionFactoryObj.close();
		}
	}

}
