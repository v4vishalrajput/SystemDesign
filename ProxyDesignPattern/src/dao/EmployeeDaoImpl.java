package dao;

import employee.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void create(String access, Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("New employee created in database: "+ emp);
	}

	@Override
	public void delete(String access, Employee emp) {
		// TODO Auto-generated method stub
		System.out.println("New employee deleted from database: "+ emp);
	}

	@Override
	public int get(String access, int id) {
		// TODO Auto-generated method stub
		System.out.println("Fetching employee from database: "+ id);
		return id;
	}

}
