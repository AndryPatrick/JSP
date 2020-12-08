package Modele;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import Beans.VariableIterationBeans;

public class PpcmModele {

	private static final String CHAMP_FIRST_NOMBRE = "nombre1";
	private static final String CHAMP_SECOND_NOMBRE = "nombre2";
	private static final String RESULTAT = "resultat";
	
	Map<String, String> erreur = new HashMap<String, String>();
	
	
	public VariableIterationBeans genererPpcm(HttpServletRequest request) {
		VariableIterationBeans variable = new VariableIterationBeans();
		TraitementModele traiterPpcm = new TraitementModele();
		String nombre1 = getValeurChamp(request, CHAMP_FIRST_NOMBRE);
		String nombre2 = getValeurChamp(request, CHAMP_SECOND_NOMBRE);
		String a = nombre1;
		String b = nombre2;
	
		try {
			
			validationNombre(Integer.valueOf(nombre1), Integer.valueOf(nombre2), variable);
			
		} catch (Exception e) {
			
			setErreur(a, b, e.getMessage());
			System.out.println(erreur);
			
		}
		
		if (variable.getResultat1() == null) {
		
			int resultat = traiterPpcm.genererPPCM( Integer.valueOf(nombre1), Integer.valueOf(nombre2) );
				
			variable.setValB(nombre1);
			variable.setValC(nombre2);
			variable.setResultat1("PPCM = "+resultat);
		}
			variable.setValB(nombre1);
			variable.setValC(nombre2);	
		return variable;
	}
	
	
	public void setErreur(String champ1, String champ2, String message) {
		if (champ1.equals("0")) {
			erreur.put(champ1, message);
		}
		
		if (champ2.equals("0")) {
			erreur.put(champ2, message);
		}
		
	}
	
	public Map<String, String> getErreur() {
		return erreur;
	}
	
	private VariableIterationBeans  validationNombre(int nombre1, int nombre2, VariableIterationBeans variable) {
		if (nombre1 == 0 && nombre2 == 0)	{
			variable.setResultat1("les deux nombres doivent être different de nulle");
		}
		else if (nombre1 == 0 ) {
			variable.setResultat1("le premier nombre ne doit pas être nulle");
		}
		else if (nombre2 == 0 ) {
			variable.setResultat1("le deuxième nombre ne doit pas être nulle");
		}
		
		return variable;
	}

	private String getValeurChamp(HttpServletRequest request, String nomChamp) {
		
		String valeur;
		String a= "0";
		 valeur = request.getParameter(nomChamp);
		 
		 if (valeur == null || valeur.trim().length() == 0) {
			 return a;
		 }
		 else if (valeur.equals("0")) {
			 return a;
		 }
		 else {
			 return valeur.trim();
		 }
		
	}
	
}
