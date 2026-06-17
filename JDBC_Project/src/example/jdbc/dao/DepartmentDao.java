package example.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

import example.jdbc.entity.Department;
import example.jdbc.util.JdbcUtils;

public class DepartmentDao implements DaoInterface<Department, Integer> {

	@Override
	public Collection<Department> retrieveAll() {
		Collection<Department> allDepartMents = new ArrayList<Department>();
		
		 String sqlQuery = "select dname , loc,deptno from dept"; 
		 
		 try(
				 Connection dbConn = JdbcUtils.getConnection();
				 Statement stmt = dbConn.createStatement();
				 ResultSet rs = stmt.executeQuery(sqlQuery)
				 
				 ){
			 
			 while(rs.next())
			   {
				  
				  String deptName =  rs.getString(1);
				  String deptLoc = rs.getString(2);
				  int deptNo =   rs.getInt(3);
				 
				  //creating departments object based upon dept data
				  
				  Department dept = new Department(deptNo , deptName , deptLoc);
				  
				  //adding the department object into dept allDepartments Collection
				  
				  allDepartMents.add(dept);
			   }
			 
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		
		return allDepartMents;
	}

	@Override
	public Department retrieveById(Integer deptno) {
		
		 Department foundDept = null;
		 String sqlQuery = "select dname , loc,deptno from dept where deptno= ? "; 
		 
		 try(
				 Connection dbConn = JdbcUtils.getConnection();
				 PreparedStatement pstmt = dbConn.prepareStatement(sqlQuery);
				 
				 ){
			 
			 pstmt.setInt(1, deptno);
			 ResultSet rs = pstmt.executeQuery();
			 if(rs.next())
			 {
				 String deptname = rs.getString(1);
				 String deptloc = rs.getString(2);
				 int dept_No = rs.getInt(3);
				 foundDept = new Department(dept_No , deptname , deptloc);
			 }
			 
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		
		return foundDept;
		
	}

	@Override
	public void create(Department newDept) {
		
		 
		 String sqlQuery = "insert into dept values(?,?,?) "; 
		 
		 try(
				 Connection dbConn = JdbcUtils.getConnection();
				 PreparedStatement pstmt = dbConn.prepareStatement(sqlQuery);
				 
				 ){
			 
		         int deptno = newDept.getDeptNo();
		         String name = newDept.getName();
		         String location = newDept.getLocation();
		         
		         pstmt.setInt(1, deptno);
		         pstmt.setString(2, name);
		         pstmt.setString(3, location);
		         
		         int count = pstmt.executeUpdate();
		         System.out.println(count + " One record inserted");
			 
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		
		
	}

	@Override
	public void update(Department modifiedDept) {
		
        String sqlQuery = "update dept set dname=? , loc=? where deptno = ? "; 
		 
		 try(
				 Connection dbConn = JdbcUtils.getConnection();
				 PreparedStatement pstmt = dbConn.prepareStatement(sqlQuery);
				 
				 ){
			 
		         int deptno = modifiedDept.getDeptNo();
		         String name = modifiedDept.getName();
		         String location = modifiedDept.getLocation();
		         
		         pstmt.setInt(3, deptno);
		         pstmt.setString(1, name);
		         pstmt.setString(2, location);
		         
		         int count = pstmt.executeUpdate();
		         System.out.println(count + " One record Updated");
			 
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }
		
	}

	@Override
	public void deleteById(Integer deptno) {
		 
		String sqlQuery = "delete from dept where deptno = ? "; 
		 
		 try(
				 Connection dbConn = JdbcUtils.getConnection();
				 PreparedStatement pstmt = dbConn.prepareStatement(sqlQuery);
				 
				 ){
			 
		        pstmt.setInt(1, deptno);
		        int count = pstmt.executeUpdate();
		        if(count !=0 )
		        {
		        	System.out.println(count + " Recorded Deleted");
		        }
		        else
		        {
		        	System.out.println("Record not found");
		        }
			 
		 }catch(Exception ex)
		 {
			 ex.printStackTrace();
		 }

		
		
	}

	

	
}
