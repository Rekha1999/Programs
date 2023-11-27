package com.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.Model.Model;

public class UpdateData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String m2 = req.getParameter("marks2");
		
		Model m = new Model();
		m.setId(id);
		m.setM2(m2);
		m.connect();
		m.updateData();
		
		int status = m.updateData();
		if(status!=0)
		{
			resp.sendRedirect("/MVCProject/successUpdate.html");
		}
		else
		{
			resp.sendRedirect("/MVCProject/failedUpdate.html");
		}
	}
}
