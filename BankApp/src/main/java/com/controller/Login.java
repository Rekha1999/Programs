package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Model;

public class Login extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String pwd = req.getParameter("pwd");
		
		Model m = new Model();
		m.connect();
		int status = m.login(email, pwd);
		
		if(status==1)
		{
			String accno = m.accno;
			String name = m.name;
			String mobileno = m.mobileno;
			String balance = m.balance;
			HttpSession session = req.getSession(true);
			session.setAttribute("accno", accno);
			session.setAttribute("name", name);
			session.setAttribute("email", email);
			session.setAttribute("mobileno", mobileno);
			session.setAttribute("pwd", pwd);
			session.setAttribute("balance", balance);
			
			resp.sendRedirect("/BankApp/home.jsp");
		}
		else
		{
			resp.sendRedirect("/BankApp/noSuchUser.html");
		}
		
	}

}
