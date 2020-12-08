package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Solution;
import Beans.Variable;
import Modele.EquationModele;

public class ResolutionDeuxEquationServlet extends HttpServlet{
	
	public static final String VUE = "/WEB-INF/deuxEquation.jsp";
	public static final String VARIABLE = "variable";
	public static final String SOLUTION = "solution";
	public static final String MODELE = "modele";
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Variable variable = new Variable();
		EquationModele modele = new EquationModele();
		
		Solution solution = modele.EquationDeuxInconnue(request);
		
		request.setAttribute(MODELE, modele);
		request.setAttribute(SOLUTION, solution);
		request.setAttribute(VARIABLE, variable);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
