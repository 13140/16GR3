package com.jay.t4.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private static Connertion con;
	private static final String DRIVERNAME="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String URL="jdbc:sqlserver://localhost:1433;databaseName=db_user";
	private static final String USERNAME="sa";
	private static final String PASSWORD="123456";
	
	public static Connection getConnection(){
		try{
		Class.forName(DRIVERNAME);
		con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
		}catch(Exception e){
			e.printStackTrace();
		}catch{
			e.printStackTrace();
		}
		
	
		
	}
}
