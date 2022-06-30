//XmlServlet.java

package com.nt.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class XmlServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res)
		                                                                        throws ServletException,IOException{

	//getPrintWriter

	PrintWriter pw=res.getWriter();
	
	//set response content type
	res.setContentType("text/xml");

	//write  logic to generate outputs(webpage)

		pw.println("<table border='1'>");
	pw.println("<tr><th>Student</th><th>Rollno</th><th>Subject</th></tr>");
	pw.println("<tr><td>Ramesh</td><td>101</td><td>java</td></tr>");
	pw.println("<tr><td>Sameer</td><td>102</td><td>php</td></tr>");
	pw.println("<tr><td>Alok</td><td>103</td><td>python</td></tr>");
	pw.println("<tr><td>Satya</td><td>104</td><td>java</td></tr>");
	pw.println("</table>");
    
//close straem
    
	pw.close();
	}

}
