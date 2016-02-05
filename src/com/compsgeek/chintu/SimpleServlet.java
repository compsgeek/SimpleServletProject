package com.compsgeek.chintu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet(description = "A simple servlet", urlPatterns = { "/SimpleServletPath" }) // if urlPattern matches url then this class is run
public class SimpleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet overridden as it is abstract class of HttpServlet
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		HttpSession session = request.getSession();
		session.setAttribute("savedUserName", userName);
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter writer = response.getWriter(); //prints html using parameter response
		writer.println("<h3>Hello!!</h3>" +userName);
	}

}
