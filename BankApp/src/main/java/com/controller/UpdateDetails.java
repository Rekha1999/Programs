package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Model;

public class UpdateDetails extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String mobileno = req.getParameter("mobileno");
		HttpSession session = req.getSession();
		String email = (String) session.getAttribute("email");
		if(name.isEmpty())
		{
			 name = (String) session.getAttribute("name");
		}
		if(mobileno.isEmpty())
		{
			mobileno = (String) session.getAttribute("mobileno");
		}

		Model m = new Model();
		m.connect();
		int status = m.UpdateDetails(name, mobileno, email);
		 if(status!=0)
		 {
			 resp.sendRedirect("/BankApp/UpdatedSuccess.html");
		 }
		 else
		 {
			 resp.sendRedirect("/BankApp/UpdationFailed.html");

		 }
	}
}
