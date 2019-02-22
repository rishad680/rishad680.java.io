package com.cognizant.payroll.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cognizant.payroll.exception.PayrollException;
import com.cognizant.payroll.model.LoginDetails;
import com.cognizant.payroll.util.*;

public class LoginDao {
	Connection cn = null;
	ResultSet res = null;
	PreparedStatement pst = null;

	public String doLogin(LoginDetails logindetails) throws PayrollException {
		String us = "";

		
		try {
			cn = ConnectionUtil.getConnection();
			pst = cn.prepareStatement("select username,password from login where username=? and password=?");
			pst.setString(1, logindetails.getUname());
			pst.setString(2,logindetails.getPass());
			res = pst.executeQuery();
			if (res.next()) {
				us = res.getString(1);
			}
		} catch (Exception exception) {
			throw new PayrollException(exception.getMessage());
		} finally {
			try {
			if (res != null)
					res.close();
					if (pst != null)
						pst.close();
					if (cn != null)
						cn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					throw new PayrollException(e.getMessage());
				}
		}
		return us;
	}

}
