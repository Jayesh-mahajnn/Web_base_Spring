package example.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class UpdateCdacPicnicMain {

	public static void main(String[] args) {
	
		
		
		try(
				SessionFactory sessionFactoryObj = HibernateUtils.getSessionFactory();
				Session sessionObj = sessionFactoryObj.openSession()
				
				) {
			
			          CdacPicnic foundPicnic =  sessionObj.find(CdacPicnic.class, 2);
			          if(foundPicnic !=null)
			          {
			        	  Transaction trn = sessionObj.beginTransaction();
			        	  
			               foundPicnic.setLocation("Wet and joy , new Lonavala");
			               foundPicnic.setHeadCount(30);
			               
			               trn.commit();
			               System.out.println("Picnic data Updated");
			               		        	  
			          }else
			          {
			        	  System.out.println("Picnic data not found because Id is invalid");
			          }
			             
			
			
		} catch (Exception e) {
		  
			 e.printStackTrace();
		}
	}

}
