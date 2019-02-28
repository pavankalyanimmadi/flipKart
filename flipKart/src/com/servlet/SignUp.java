package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pojo.User;
import com.service.FlipkartService;

/**
 * Servlet implementation class SignUp
 */
@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
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
		User user=new User();
		user.setUserAddress(request.getParameter("userAddress"));
		user.setUserEmail(request.getParameter("userEmail"));
		user.setUserId(request.getParameter("userId"));
		user.setUserMobileNumber(request.getParameter("userPhoneNumber"));
		user.setUserName(request.getParameter("userName"));
		user.setUserPassword(request.getParameter("userPassword"));
		
		FlipkartService service=new FlipkartService();
		User registereduser=service.signUp(user);
		request.getSession().setAttribute("currentUser",registereduser);
		RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
		rd.forward(request,response);
		
	}

}
