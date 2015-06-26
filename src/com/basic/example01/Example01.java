package com.basic.example01;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalDate;
import java.time.LocalTime;

public class Example01 extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<CENTER>");
		out.print("<h1>"+"Hello, I am learning"+"</h1>");
		out.println("<table BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=30%>");
		out.println("<tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Current Date:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+ LocalDate.now()+"</td>");
		out.println("<tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Current Time:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+ LocalTime.now()+"</td>");
		out.println("</tr>");
		out.println("</tr>");
		out.println("</table>");
		out.print("<h1>"+"Thank you...!!"+"</h1>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</html>");
	}
	

}