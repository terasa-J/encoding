package com.getInf;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import com.jjh.utils.*;
/**
 * 使用request对象获取客户信息
 */
@WebServlet("/Info")
public class Info extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out=response.getWriter();
		String queryString=request.getQueryString();
		String s[]=queryString.split("&");
		for(String ss:s){
			//System.out.println(ss);
			String name_val[]=ss.split("=");
			System.out.println(name_val[0]+"=  "+GetNewstring.getNewString(name_val[1]));
			out.println(name_val[0]+"=  "+GetNewstring.getNewString(name_val[1]));
		}
		//System.out.println("queryString:  "+queryString);
		
	/*	int clientPort=request.getRemotePort();
		System.out.println("clientPort="+clientPort);
		
		String clientIP=request.getRemoteAddr();
		System.out.println("clientIP="+clientIP); */
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
