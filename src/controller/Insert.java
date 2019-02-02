package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DonorBean;
import service.DonorService;
import controller.Insert;


/**
 * Servlet implementation class Insert
 */
@WebServlet("/Insert")
public class Insert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Insert() {
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
		String id= request.getParameter("id");
		String Name= request.getParameter("name");
		String dob1=request.getParameter("dob");
		String gender=request.getParameter("Gender");
		String phone=request.getParameter("cno");
		String address=request.getParameter("address");
		String blood=request.getParameter("bloodgroup");
	
			
				
				DonorBean don= new DonorBean(id,Name,dob1,address,phone,gender,blood);
			
				int count=DonorService.insertDonor(don);
				
				
				if(count>0){
					
					RequestDispatcher rd = request.getRequestDispatcher("insertSuccess.jsp");
					
					request.setAttribute("id",id);
					rd.forward(request, response);
					
				}else
				{
					response.sendRedirect("error.jsp");
				}
		
	}

	
}
