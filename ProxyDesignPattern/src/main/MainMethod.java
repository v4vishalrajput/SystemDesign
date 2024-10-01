package main;

import dao.EmployeeDao;
import dao.EmployeeDaoImpl;
import dao.EmployeeDaoProxy;
import employee.Employee;

public class MainMethod {
	
public static void main(String[] args) {
	Employee emp = new Employee(1, "vishal");
	EmployeeDao proxyDao= new EmployeeDaoProxy(new EmployeeDaoImpl());
	
	proxyDao.create("admin", emp);
	proxyDao.delete("user", emp);
	proxyDao.get("user", 0);
}
}
