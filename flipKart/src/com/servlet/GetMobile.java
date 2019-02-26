package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Mobile;
import com.service.FlipkartService;

/**
 * Servlet implementation class GetMobile
 */
@WebServlet("/GetMobile")
public class GetMobile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMobile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String productId=request.getParameter("productId");
		FlipkartService service=new FlipkartService();
		Mobile mobile=service.getMobile(productId);
		System.out.println(mobile.getName());
		request.setAttribute("mobile",mobile);
		RequestDispatcher rd=request.getRequestDispatcher("productDetails.jsp");
		rd.forward(request,response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String productId=request.getParameter("productId");
		FlipkartService service=new FlipkartService();
		Mobile mobile=service.getMobile(productId);
		System.out.println(mobile.getName());
		request.setAttribute("mobile",mobile);
		RequestDispatcher rd=request.getRequestDispatcher("productDetails.jsp");
		rd.forward(request,response);
	
		}

}
