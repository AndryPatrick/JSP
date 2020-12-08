package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.Solution;
import Beans.Variable;
import Modele.EquationModele;

public class EquationServlet extends HttpServlet{
	public static final String VUE = "/WEB-INF/equation.jsp";
	public static final String MODELE = "modele";
	public static final String VARIABLE = "variable";
	public static final String SOLUTION = "solution";
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
    	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		EquationModele modele = new EquationModele();
		
		Solution solution = modele.EquationSecondDegre(request);
		
		request.setAttribute(MODELE, modele);
		request.setAttribute(SOLUTION, solution);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
