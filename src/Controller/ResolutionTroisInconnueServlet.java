package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Solution;
import Modele.EquationModele;

public class ResolutionTroisInconnueServlet extends HttpServlet{
	public static final String VUE = "/WEB-INF/troisEquation.jsp";
	public static final String SOLUTION = "solution";
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		EquationModele modele = new EquationModele();
		
		Solution solution = modele.equationTroisInconnue(request);
		
		request.setAttribute(SOLUTION, solution);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	
}
