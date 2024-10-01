package dao;

import employee.Employee;

public class EmployeeDaoProxy implements EmployeeDao {
	
	private EmployeeDao dao;
	
	

	public EmployeeDaoProxy(EmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public void create(String access, Employee emp) {
		// TODO Auto-generated method stub
      if("ADMIN".equalsIgnoreCase(access)) {
    	  dao.create(access, emp);
      }else {
    	  System.out.println("Access Denied.");
      }
	}

	@Override
	public void delete(String access, Employee emp) {
		// TODO Auto-generated method stub
		 if("ADMIN".equalsIgnoreCase(access)) {
	    	  dao.delete(access, emp);
	      }else {
	    	  System.out.println("Access Denied.");
	      }
	}

	@Override
	public int get(String access, int id) {
		// TODO Auto-generated method stub
		 if("ADMIN".equalsIgnoreCase(access) || "USER".equalsIgnoreCase(access)) {
	    	 return dao.get(access, id);
	      }else {
	    	  System.out.println("Access Denied.");
	    	  return id;
	      }
	}

}
