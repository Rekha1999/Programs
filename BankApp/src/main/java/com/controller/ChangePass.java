package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Model;

public class ChangePass extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String pwd = (String) session.getAttribute("pwd");		
		String cpassword = req.getParameter("cpassword");			//old password
		String password = req.getParameter("password");
		String accno = (String) session.getAttribute("accno");
		
		if(password.equals(cpassword)) {
			Model m = new Model();
			m.connect();
		
		if(pwd.equals(password))
		{
			accno = (String) req.getAttribute("accno");
			m.connect();
			int status = m.updatePassword(accno, password);
			if(status!=0)
			{
				resp.sendRedirect("/BankApp/SuccesfulChanged.html");

			}
			else {
				resp.sendRedirect("/BankApp/Changefailed.html");

			}
		}
		else
		{
			resp.sendRedirect("/BankApp/invalidchange.html");

		}
		

	}
		else {
			resp.sendRedirect("/BankApp/Passwordnotmatching.html");
		}

	}
}
