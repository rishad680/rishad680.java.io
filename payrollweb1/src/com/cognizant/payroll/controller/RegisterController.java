package com.cognizant.payroll.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("submit").equals("Register")) {
			
		String Name=request.getParameter("name");
		String dob=request.getParameter("dob");
		LocalDate date=LocalDate.parse(dob);
		String mobile=request.getParameter("mb_num");
		long cell=Long.parseLong(mobile);
		String salary=request.getParameter("sal");
		double sal=Double.parseDouble(salary);
		String email=request.getParameter("email");
		String Street=request.getParameter("street");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String pin=request.getParameter("code");
		int pn=Integer.parseInt(pin);
		String gender=request.getParameter("gender");
		char gen=gender.charAt(0);
		String designationName=request.getParameter("designationId");
		int desigId=Integer.parseInt(designationName);
		String arr[]= request.getParameterValues("skill");
		System.out.println(designationName);
		System.out.println(arr);
		}

	}

}
