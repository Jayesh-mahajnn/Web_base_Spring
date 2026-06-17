package example.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import example.hibernate.entity.CdacPicnic;

public class HibernateUtils {
	//Build a SessionFactory based upon DB configuration, mapping metadata and return
	
	
	public static SessionFactory getSessionFactory() {
		
		 return new Configuration()
		.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver")
		.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/cdac")
		.setProperty("hibernate.connection.username", "root")
		.setProperty("hibernate.connection.password", "Ycpait24")
		.setProperty("hibernate.hbm2ddl.auto", "update")
		.setProperty("hibernate.show_sql", "true")
		.addAnnotatedClass(CdacPicnic.class)//java.lang.Class
	    .buildSessionFactory();
	
		
		
	}

}
