package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */
@WebServlet("/BeerSelect")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeerSelect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String c = request.getParameter("color");
		BeerExpert be = new BeerExpert();
		List result = be.getBrands(c);
		String adminEmail = null;
		adminEmail = getServletContext().getInitParameter("adminEmail");
		
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("Beer Selection advice<br>");
		
//		Iterator it = result.iterator();
//		while(it.hasNext())
//		{
//			out.println("<br>try:"+it.next());
//		}
		request.setAttribute("adminemail", adminEmail);
		request.setAttribute("styles", result);//为请求对象增加一个属性供JSP使用
		RequestDispatcher view = request.getRequestDispatcher("advice.jsp");
		//为JSP实例化一个请求分派器
		view.forward(request, response);//使用请求分派器要求容器准备好JSP，并向JSP发送请求和响应
//		System.out.println(getServletContext().getInitParameter("adminEmail"));
	}

}
