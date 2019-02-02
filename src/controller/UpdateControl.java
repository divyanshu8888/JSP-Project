package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.DonorService;

/**
 * Servlet implementation class UpdateControl
 */
@WebServlet("/Update")
public class UpdateControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateControl() {
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
		String id=request.getParameter("Id");
		String Name=request.getParameter("name");
int count = DonorService.updateDonor(id, Name);
		
		
		
		if(count>0){
			
			RequestDispatcher rd = request.getRequestDispatcher("updateSuccess.jsp");
			
			request.setAttribute("Id",id);
			request.setAttribute("name", Name);
			rd.forward(request, response);
			
		}else
		{
			response.sendRedirect("error.jsp");
		}
	}



		
	}


