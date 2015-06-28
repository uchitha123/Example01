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
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		int numOne = Integer.parseInt(req.getParameter("number_one"));
		int numTwo = Integer.parseInt(req.getParameter("number_two"));
		String contextPath = req.getContextPath();
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel='stylesheet' type='text/css' href='css/calc.css'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<CENTER>");
		out.print("<h1>"+"Hello, I am learning"+"</h1>");
		out.println("<table BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=30%>");
		out.println("<tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Entered number one:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+numOne+"</td>");
		out.println("</tr><tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Entered number two:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+numTwo+"</td>");
		out.println("</tr><tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Sum of two numbers:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+addNumbers(numOne,numTwo)+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br>");
		out.println("<br>");
		out.println("<table>");
		out.println("<tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Current Date:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+ LocalDate.now()+"</td>");
		out.println("</tr><tr>");
		out.print("<td bgcolor ='#00FF00'>"+"Current Time:"+"</td>");
		out.print("<td bgcolor ='#00FF00'>"+ LocalTime.now()+"</td>");
		out.println("</tr>");
		out.println("</table>");
		out.println("<br>");
		out.println("<br>");
		//out.println("prinnt"+contextPath);
		out.println("Thank you and try once again...!"+"<a href='/Example01/index.html'>Back to Page</a>");
		out.print("<h1>"+"Thank you...!!"+"</h1>");
		out.println("</CENTER>");
		out.println("</body>");
		out.println("</html>");
		
	}
	public int addNumbers(int numberOne, int numberTwo){
		int sum=0;
		sum=numberOne+numberTwo;
		return sum;
	}
	

}