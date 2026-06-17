package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class DeleteCdacPicnicMain {

	public static void main(String[] args) {
	
		  
		
		try(
				SessionFactory sessionFactoryObj = HibernateUtils.getSessionFactory();
				Session sessionObj = sessionFactoryObj.openSession()
				
				) {
			
			          CdacPicnic foundPicnic =  sessionObj.find(CdacPicnic.class, 1);
			          if(foundPicnic !=null)
			          {
			        	  Transaction trn = sessionObj.beginTransaction();
			        	  
			              sessionObj.remove(foundPicnic);
			               
			               trn.commit();
			               System.out.println("Picnic data Deleted");
			               		        	  
			          }else
			          {
			        	  System.out.println("Picnic data not found because Id is invalid");
			          }
			             
			
			
		} catch (Exception e) {
		  
			 e.printStackTrace();
		}
	}

}
