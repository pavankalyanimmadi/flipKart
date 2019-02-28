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
 * Servlet implementation class login
 */
@WebServlet("/loginServlet")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		System.out.println(userId+" -----"+password);
		FlipkartService service=new FlipkartService();
		User currentUser=service.getLogin(userId, password);
		System.out.println(currentUser.getUserName());
		if(currentUser.getUserName()!=null) {
			request.getSession().setAttribute("currentUser",currentUser);
			ArrayList<Product> products=new ArrayList<>();
			request.getSession().setAttribute("cart",products);
			RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
			rd.forward(request,response);
			
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request,response);
			
		}
		
	}

}
