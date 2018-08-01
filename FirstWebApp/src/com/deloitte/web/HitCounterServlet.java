package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HitCounterServlet
 */
@WebServlet("/hitcount")
public class HitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out= response.getWriter();
		String name= request.getParameter("name");
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("hi" + name);
		out.println("your IP address is " + request.getRemoteAddr());
		out.println("you are user number# " +(++counter));
		
		Enumeration<String> headerNames = request.getHeaderNames();
		String headerName= null;
		while(headerNames.hasMoreElements()) {
			headerName= headerNames.nextElement();
			out.println(headerName + ":" +request.getHeader(headerName)+"<br/>");
		}
		out.println(getServletConfig().getInitParameter("email"));
		out.println(getServletContext().getInitParameter("WebAdmin"));
		out.append("Served at: ").append(request.getContextPath());
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
