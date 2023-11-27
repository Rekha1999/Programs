package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Model;

public class Register extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String pass = req.getParameter("pass");
	String cpass = req.getParameter("cpass");
	
	if(pass.equals(cpass))
	{
		String accno = req.getParameter("accno");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobileno =req.getParameter("mobileno");
		String balance = req.getParameter("balance");
		
		Model m = new Model();
		m.connect();
		int status = m.register(accno, name, email, mobileno, pass, balance);
		if(status!=0)
		{
			resp.sendRedirect("/BankApp/succesfulRegister.html");
		}
		else
		{
			resp.sendRedirect("/BankApp/failureRegister.html");
		}
		
	}
	else
	{
		resp.sendRedirect("/BankApp/passwordMissMatch.html");
	}
}

}
