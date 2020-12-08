package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.VariableIterationBeans;
import Modele.DecompositionModele;

public class DecompositionServlet extends HttpServlet{
	public static final String VUE = "/WEB-INF/decomposition.jsp";
	public static final String ITERATION = "iteration";
	public static final String MODELE = "modele";
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DecompositionModele modele = new DecompositionModele();
		
		VariableIterationBeans iteration = modele.decomposition(request);
		
		request.setAttribute(ITERATION, iteration);
		request.setAttribute(MODELE, modele);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
