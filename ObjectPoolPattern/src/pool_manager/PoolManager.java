package pool_manager;

import java.util.ArrayList;
import java.util.List;

import db_connection.DBConnection;

public class PoolManager {

	private List<DBConnection> connectionsInUse;
	private List<DBConnection> availableConnections;
	
	private int MAX_POOL_SIZE;
	private int MIN_POOL_SIZE;
	
	private volatile static PoolManager manager = null;
	
	private PoolManager() {
		connectionsInUse = new ArrayList<>();
		availableConnections = new ArrayList<>();
		MAX_POOL_SIZE = 6;
		MIN_POOL_SIZE = 3;
		
		for(int i=0 ;i<MIN_POOL_SIZE; i++) {
			availableConnections.add(new DBConnection());
		}
	}
	
	public static PoolManager getInstance() {
		
		if(manager==null) {
			synchronized(PoolManager.class) {
				if(manager==null) {
					manager = new PoolManager();
				}
			}	
		}
		
		return manager;
		
	}
	
	public synchronized DBConnection getConnection() {
		if(availableConnections.size() == 0) {
			if(connectionsInUse.size() == MAX_POOL_SIZE) {
				System.out.println("connection is not available");
				return null;
			}
			
			System.out.println("connection exhausted, creating new.");
			availableConnections.add(new DBConnection());
		}
		
		DBConnection conn = availableConnections.remove(availableConnections.size()-1);
		
		connectionsInUse.add(conn);
		
		System.out.println("connection established");
		
		return conn;
		
	}
	
	public  void releaseConnection(DBConnection conn) {
		
		connectionsInUse.remove(conn);
		
		availableConnections.add(conn);
		
		System.out.println("connection released");
		
	}
	
	
}
