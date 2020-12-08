package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.VariableIterationBeans;
import Modele.PpcmModele;

public class PpcmServlet extends HttpServlet{

	public static final String VUE = "/WEB-INF/decomposition.jsp";
	public static final String MODELE = "modele";
	public static final String RESULTAT = "resultat";
	
	public  void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		
	}
	
	public  void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		PpcmModele modele = new PpcmModele();
		
		VariableIterationBeans resultat = modele.genererPpcm(request);
		
		request.setAttribute(RESULTAT, resultat);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
		
	}
	
}
