package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.DepartmentDao;
import example.jdbc.entity.Department;

public class ShowDeptByDeptNo {

	public static void main(String[] args) {
		
		DaoInterface<Department, Integer> daoRef = new DepartmentDao();
		Department dept = daoRef.retrieveById(10);
		
		if(dept!=null)
		{
			System.out.println(dept);
		}
		else
		{
			System.out.println("Department not exits");
		}

	}

}
