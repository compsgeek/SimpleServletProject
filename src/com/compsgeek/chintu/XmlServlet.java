package com.compsgeek.chintu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	private static final long serialVersionUID = 3694064104362203370L;

	//without deployment descriptor
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet overridden as it is abstract class of HttpServlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String userId = request.getParameter("userId");
		System.out.println("hello from GET method servlet");
		out.println("Hello, " + userName + "!!");
		out.println(userId);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet overridden as it is abstract class of HttpServlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		String fullName = request.getParameter("fullName");
		System.out.println("hello from POST from servlet");
		out.println("Hello, " + userName + "!!");
		out.println("<br>"+fullName);
		String gender = request.getParameter("gender");
		out.print("<br>"+ gender);
		String[] location = request.getParameterValues("location");
		out.print("<br>"+ location.length);
		for(int i = 0;i<location.length;i++){
			out.print("<br>"+ location[i]);
		}
		
	}

}
