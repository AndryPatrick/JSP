package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Beans.ChiffreBean;
import Beans.ChiffreStringBean;
import Beans.Solution;
import Modele.EquationModele;
import Modele.QuatreInconnue;

public class ResolutionQuatreInconnueServlet extends HttpServlet{
	public static final String VUE = "/WEB-INF/quatreEquation.jsp";
	public static final String RESOLUTION = "resolution";
	
	public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
	
	public void doPost (HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		EquationModele equation = new EquationModele();
	
		ChiffreStringBean resolution = equation.equationQuatreInconnue(request);
		
		request.setAttribute(RESOLUTION, resolution);
		
		this.getServletContext().getRequestDispatcher(VUE).forward(request, response);
	}
}
