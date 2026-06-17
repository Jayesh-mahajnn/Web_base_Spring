package example.jdbc;

import example.jdbc.dao.DaoInterface;
import example.jdbc.dao.DepartmentDao;
import example.jdbc.entity.Department;

public class DeleteDepartmentMain {

	public static void main(String[] args) {
		
		DaoInterface<Department, Integer> daoRef = new DepartmentDao();
		daoRef.deleteById(50);
	}

}
