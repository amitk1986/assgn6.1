package com.secondassgn;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeaderInfo
 */
@WebServlet("/HeaderInfo")
public class HeaderInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request,
            HttpServletResponse response)
throws IOException, ServletException {
response.setContentType("text/html");
PrintWriter out = response.getWriter();

out.println("<p>Show Headers</p>");

Enumeration <String> e = request.getHeaderNames();
while (e.hasMoreElements()) {
String headerName = (String) e.nextElement();
String headerValue = request.getHeader(headerName);
out.print("<b>"+headerName + "</b>: ");
out.println(headerValue + "<br>");
}

}
}