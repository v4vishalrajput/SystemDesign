package main;

import db_connection.DBConnection;
import pool_manager.PoolManager;

public class MainMethod {
	
public static void main(String[] args) {
	PoolManager manager = PoolManager.getInstance();
	
	manager.getConnection();
	manager.getConnection();
	DBConnection conn = manager.getConnection();
	manager.releaseConnection(conn);
	manager.getConnection();
	manager.getConnection();
	manager.getConnection();
	manager.getConnection();
	manager.getConnection();
	
}
}
