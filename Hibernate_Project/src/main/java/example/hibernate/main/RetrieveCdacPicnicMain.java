package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class RetrieveCdacPicnicMain {

	public static void main(String[] args) {
	
		
		
		try(
				SessionFactory sessionFactoryObj = HibernateUtils.getSessionFactory();
				Session sessionObj = sessionFactoryObj.openSession()
				
				) {
			
			          CdacPicnic foundPicnic =  sessionObj.find(CdacPicnic.class, 1);
			          if(foundPicnic !=null)
			          {
			        	  System.out.println(foundPicnic);
			          }else
			          {
			        	  System.out.println("Picnic data not found because id is invalid");
			          }
			             
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
