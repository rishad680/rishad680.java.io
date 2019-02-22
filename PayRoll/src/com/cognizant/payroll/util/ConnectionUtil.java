package com.cognizant.payroll.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cognizant.payroll.exception.PayrollException;

public class ConnectionUtil {
public static  Connection getConnection() throws PayrollException{
	Connection con=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
	}
	
	try {
		 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("driver is missing");
	}
	return con;

}
}
