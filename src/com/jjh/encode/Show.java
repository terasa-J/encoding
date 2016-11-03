package com.jjh.encode;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jjh.utils.*;
/**
 * Servlet implementation class Show
 */
@WebServlet("/Show")
public class Show extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		//使用post方法提交
		request.setCharacterEncoding("utf-8");
		PrintWriter out=response.getWriter();
	//	String u=request.getParameter("uname");
		//使用get方法，用工具类转换
	//	GetNewstring.getNewString(u);
	//	out.print(u);
	//	System.out.println("u(post)="+u);
		
	/*	使用超链接
	 * String u2=request.getParameter("username2");
		System.out.println("u2(a)="+u2);
		out.print(u2);*/
		
		String u2=request.getParameter("uname");
		System.out.println("u(post)="+u2);
		response.sendRedirect("/enconding/Welcome?name="+GetNewstring.getNewString(u2));	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
