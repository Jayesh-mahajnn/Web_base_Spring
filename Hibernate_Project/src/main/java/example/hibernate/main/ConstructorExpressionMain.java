package example.hibernate.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import example.hibernate.bean.LocationAndHeadCount;
import example.hibernate.entity.CdacPicnic;
import example.hibernate.utils.HibernateUtils;

public class ConstructorExpressionMain {

	public static void main(String[] args) {
		
		try(
				SessionFactory sessionFactoryObj = HibernateUtils.getSessionFactory();
				Session sessionObj = sessionFactoryObj.openSession()
				) {
			
			String hqlQuery = "select new example.hibernate.bean.LocationAndHeadCount(location,headCount) from CdacPicnic cdac";
			
			Query<LocationAndHeadCount> queryObj = sessionObj.createQuery(hqlQuery, LocationAndHeadCount.class);
			List<LocationAndHeadCount> dataList = queryObj.list();
			
			for(LocationAndHeadCount data : dataList)
			{
				System.out.println(data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
