package com.sample;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		PrintWriter out = response.getWriter();
		out.println("Hello there, this is a test servlet");
	}

}

