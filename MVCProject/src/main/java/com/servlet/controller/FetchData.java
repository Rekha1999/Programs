package com.servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.servlet.Model.Model;

public class FetchData extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id = req.getParameter("id");
	
	Model m = new Model();
	m.setId(id);
	m.connect();
	m.fetchData();
	
	String name = m.getName();
	String m1 = m.getM1();
	String m2 = m.getM2();
	String m3 = m.getM3();
	
	HttpSession session =  req.getSession(true);
	session.setAttribute("id", id);
	session.setAttribute("name", name);
	session.setAttribute("marks1", m1);
	session.setAttribute("marks2", m2);
	session.setAttribute("marks3", m3);
	
	resp.sendRedirect("/MVCProject/dispFetchData.jsp");
	
	}
}
