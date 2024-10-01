package dao;

import employee.Employee;

public interface EmployeeDao {
	
	public void create(String access, Employee emp);
	
	public void delete(String access, Employee emp);
	
	public int get(String access, int id);

}
