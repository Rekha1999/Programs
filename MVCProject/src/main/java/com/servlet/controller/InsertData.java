package com.servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.servlet.Model.Model;

public class InsertData extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id = req.getParameter("id");
	String name = req.getParameter("name");
	String m1 = req.getParameter("marks1");
	String m2 = req.getParameter("marks2");
	String m3 = req.getParameter("marks3");
	
	Model m = new Model();
	m.setId(id);
	m.setM1(m1);
	m.setM2(m2);
	m.setM3(m3);
	m.connect();
	m.insertData();
	
	int report = m.updateData();
	if(report!=0)
	{
		resp.sendRedirect("/MVCProject/successInserted.html");
	}
	else
	{
		resp.sendRedirect("/MVCProject/failedInserted.html");
	}
}
}
