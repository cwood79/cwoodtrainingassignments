package com.cg.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class enrollServlet
 */
public class enrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String table = "<table style=\"width:100%\">\r\n" + 
				"  <tr>\r\n" + 
				"    <th>TrainingID</th>\r\n" + 
				"    <th>TrainingName</th>\r\n" + 
				"    <th>Available Seats</th>\r\n" + 
				"    <th></th>\r\n" +
				"  </tr>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>1001</td>\r\n" + 
				"    <td>Spring</td>\r\n" + 
				"    <td>40</td>\r\n" + 
				"    <td><a href=''>Enroll</a></td>\r\n" + 
				"  <tr>\r\n" + 
				"    <td>1002</td>\r\n" + 
				"    <td>Hibernate</td>\r\n" + 
				"    <td>40</td>\r\n" + 
				"    <td><a href=''>Enroll</a></td>\r\n" +
				"  <tr>\r\n" + 
				"    <td>1003</td>\r\n" + 
				"    <td>EJB</td>\r\n" + 
				"    <td>40</td>\r\n" + 
				"    <td><a href=''>Enroll</a></td>\r\n" +
				"  </tr>\r\n" + 
				"</table>";
		out.println("<html><body>"+table+"</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
