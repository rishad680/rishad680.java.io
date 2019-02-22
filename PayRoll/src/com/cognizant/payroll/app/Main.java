package com.cognizant.payroll.app;
import java.util.*;
import com.cognizant.payroll.dao.LoginDao;
import com.cognizant.payroll.exception.PayrollException;

public class Main {
	public static void main(String[] args) throws PayrollException {
		// TODO Auto-generated method stub		
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
			System.out.println("enter username");
			String uname=scan.nextLine();
			System.out.println("enter password");
			String pass=scan.nextLine();
			LoginDao lg=new LoginDao();
			String us="";
			try {
			us=lg.doLogin(uname, pass);
			}
			catch(PayrollException e)
			{
				System.out.println(e.getMessage());
			}
			if(us.equals(""))
				System.out.println("user not registered");
			else
				System.out.println("welcome "+us);
	
	}

}
