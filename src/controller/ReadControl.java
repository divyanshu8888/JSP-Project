package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DonorBean;
import service.DonorService;

/**
 * Servlet implementation class ReadControl
 */
@WebServlet("/ReadControl")
public class ReadControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String id= request.getParameter("ID");
		
		List<DonorBean> DonList= DonorService.readDonor(id);
		
		response.setContentType("text/html");
		
		PrintWriter out= response.getWriter();
		
		if(DonList!=null && DonList.size()>0){
			
		
				
				RequestDispatcher rd = request.getRequestDispatcher("readSuccess.jsp");
				
				request.setAttribute("DonList", DonList);
				
				rd.forward(request, response);
				
			}
		else{
			out.println("<html><body>No Records Found</body></html>");
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
