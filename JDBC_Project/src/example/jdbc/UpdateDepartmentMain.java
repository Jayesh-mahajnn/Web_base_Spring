package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.DepartmentDao;
import example.jdbc.entity.Department;

public class UpdateDepartmentMain {

	public static void main(String[] args) {
		
		
		DaoInterface<Department, Integer> daoRef = new DepartmentDao();
		Department dept  = daoRef.retrieveById(50);
		
		if(dept!=null)
		{
			dept.setLocation("Nashik");
			daoRef.update(dept);
		}
		else
		{
			System.out.println("Recored not exits");
		}

	}

}
