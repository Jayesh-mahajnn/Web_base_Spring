package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class CreateCdacPicnicMain {

	public static void main(String[] args) {
		
		//Session , SessionFactory => AutoCloseable
		
		try (
				SessionFactory sessionFactoryObj = HibernateUtils.getSessionFactory();
				Session sessionObj = sessionFactoryObj.openSession()
				) {
			
			
			CdacPicnic ourPicnic = new CdacPicnic( null,"Mahabaleshwar" , "22th june 2026"  , 29 );
			
			Transaction trn =  sessionObj.beginTransaction();
			sessionObj.persist(ourPicnic);
			trn.commit();
			System.out.println("Cdac Picnic recorded added");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
