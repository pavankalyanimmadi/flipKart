package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.Mobile;
import com.pojo.Product;
import com.pojo.User;
import com.service.FlipkartService;

/**
 * Servlet implementation class addItemToCart
 */
@WebServlet("/addItemToCart")
public class addItemToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addItemToCart() {
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
		if(((User)request.getSession().getAttribute("currentUser")).getUserName()!=null) {
			ArrayList<Product> products=(ArrayList<Product>)request.getSession().getAttribute("cart");
			products.add(mobile);
			request.getSession().setAttribute("cart",products);
			RequestDispatcher rs=request.getRequestDispatcher("cart.jsp");
			rs.forward(request,response);
		
			
		}
		else {
			request.setAttribute("currentProductId",productId);
			RequestDispatcher rs=request.getRequestDispatcher("login.jsp");
			rs.forward(request,response);
			
		}
		
		
		
}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
