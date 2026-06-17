package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.DepartmentDao;
import example.jdbc.entity.Department;

public class CreateDepartmentMain {

	public static void main(String[] args) {
		
		DaoInterface<Department, Integer> daoRef = new DepartmentDao();
		Department dept = new Department(50 , "Finance", "Mumbai");
		daoRef.create(dept);
	}

}
