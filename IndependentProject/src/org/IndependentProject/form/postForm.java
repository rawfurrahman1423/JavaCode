package org.IndependentProject.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class postForm extends HttpServlet {
	
	@Override
	protected void doGet (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//get names from html and set them to variables
		String FirstName = req.getParameter("FirstName");
		String LastName = req.getParameter("LastName");
		String Email = req.getParameter("Email");
		String Email2 = req.getParameter("Email2");
		String PassWord = req.getParameter("PassWord");
		String Gender = req.getParameter("Gender");
		String Day = req.getParameter("Day");
		String Month = req.getParameter("Month");
		String Day1 = req.getParameter("Day");
		String Year = req.getParameter("Year");
		
		//print variables that are set equal to names
		resp.getWriter().println("First name is: '" + FirstName + "'");
		resp.getWriter().println("Last name is: '" + LastName + "'");
		resp.getWriter().println("Email is: '" + Email + "'");
		resp.getWriter().println("Email is: '" + Email2 + "'");
		resp.getWriter().println("Password is: '" + PassWord + "'");
		resp.getWriter().println("Gender is: '" + Gender + "'");
		resp.getWriter().println("Day is: '" + Day + "'");
		resp.getWriter().println("Month is: '" + Month + "'");
		resp.getWriter().println("Day is: '" + Day1 + "'");
		resp.getWriter().println("Year is: '" + Year + "'");
		
	}

}
