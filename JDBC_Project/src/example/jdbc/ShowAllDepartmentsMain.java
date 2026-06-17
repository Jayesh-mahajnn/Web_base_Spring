package example.jdbc;

import java.util.Collection;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.DepartmentDao;
import example.jdbc.entity.Department;

public class ShowAllDepartmentsMain {

	public static void main(String[] args) {
		
	    DaoInterface<Department, Integer> daoRef = 
	    		new  DepartmentDao();
	    Collection<Department> departments =daoRef.retrieveAll();
	    
	    for(Department dept : departments)
	    {
	    	System.out.println(dept);
	    }

	}

}
