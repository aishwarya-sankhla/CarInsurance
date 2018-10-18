package com.training.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbConnection {
	
	Connection con;
	
	public Connection getConnection() throws NamingException, SQLException{
		
		Context ctx=new InitialContext();
		DataSource dataSource=(DataSource)ctx.lookup("java:comp/env/jdbc/ds1");
		return dataSource.getConnection();
	}
	
	
}
