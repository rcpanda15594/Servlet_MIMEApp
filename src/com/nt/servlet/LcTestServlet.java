package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class LcTestServlet extends HttpServlet {
	
	static {
		System.out.println("LcTestServlet::Static block");
	}//static block
	
	public LcTestServlet() {
		System.out.println("LcTestServlet::0-param constructor");
	}//constructor
	
	public void init(ServletConfig cg) {
		
		System.out.println("LcTestServlet::init(ServletConfig)");
		
	}//init method
 public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		
	System.out.println("LcTestServlet::Service Method");
	
	//set response
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	Date d=new Date();
		pw.println("<b><center>Date and Time is "+d+" </b></center>");
		
		pw.close();
	}//service method
	
	public void destroy() {
		
		System.out.println("LcTestServlet::destroy()");
		
	}//destroy method
	

}//class
