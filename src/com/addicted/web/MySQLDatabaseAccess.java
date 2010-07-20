package com.addicted.web;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class MySQLDatabaseAccess implements DatabaseAccess {
	
	protected String username, password, databaseName, hostname, url;
	protected int port;
	
	public MySQLDatabaseAccess(String username, String password, String databaseName, int port, String hostname) {
		this.setUsername(username);
		this.setPassword(password);
		this.setDatabaseName(databaseName);
		this.setHostname(hostname);
		formJDBCURL(getDatabaseName(), getPort());
		
	}

	protected void formJDBCURL(String databaseName2, int port2) {
		String JDBCurl = new String("jdbc:mysql//");
		JDBCurl += getHostname() + ":" + getPort() + "/" + getDatabaseName();
		setUrl(JDBCurl);
	}
	
	public Connection connect(String JDBCurl, String user, String pw) {
		Connection connection;
		try {
			connection = DriverManager.getConnection(JDBCurl, user, pw);
		} catch (SQLException e) {
			connection = null;
			e.printStackTrace();
		} 
		return connection;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getPort() {
		return port;
	}

	public void setHostname(String hostname) {
		this.hostname = hostname;
	}

	public String getHostname() {
		return hostname;
	}

	protected void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
	

}
