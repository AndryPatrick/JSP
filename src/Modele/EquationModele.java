package Modele;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import Beans.ChiffreBean;
import Beans.ChiffreStringBean;
import Beans.Solution;
import Beans.Variable;

public class EquationModele {
	private static final String CHAMP_A ="a";
	private static final String CHAMP_B ="b";
	private static final String CHAMP_C ="c";
	private static final String CHAMP_D ="d";
	private static final String CHAMP_E ="e";
	private static final String CHAMP_F ="f";
	private static final String CHAMP_G ="g";
	private static final String CHAMP_H ="h";
	private static final String CHAMP_I ="i";
	private static final String CHAMP_J ="j";
	private static final String CHAMP_K ="k";
	private static final String CHAMP_L ="l";
	private static final String CHAMP_M ="m";
	private static final String CHAMP_N ="n";
	private static final String CHAMP_O ="o";
	private static final String CHAMP_P ="p";
	private static final String CHAMP_Q ="q";
	private static final String CHAMP_R ="r";
	private static final String CHAMP_S ="s";
	private static final String CHAMP_T ="t";
	
	private String y;
	private String x;
	private String z;
	private String solution1;
	private String solution2;
	
	private Map<String, String> erreur = new  HashMap<String, String>();
	
	public Map<String, String> getErreur() {
		return erreur;
	}

	QuatreInconnue modeleQuatreInconnue = new QuatreInconnue();
	
	//résolution équation second dégré
	public Solution EquationSecondDegre(HttpServletRequest request) {

		Variable variable = new Variable();
		String a = getValeurChamp(request, CHAMP_A);
		String b = getValeurChamp(request, CHAMP_B);
		String c = getValeurChamp(request, CHAMP_C);
		
		//validation a
		try {
			validationA(a);
		} catch (Exception e) {
			setErreur(a, e.getMessage());
		}
		variable.setA(Integer.valueOf(a));
		
		//validation b
		try {
			validationB(b);
		} catch (Exception e) {
			setErreur(b, e.getMessage());
		}
		variable.setB(Integer.valueOf(b));
		
		//validation c
		try {
			validationC(c);
		} catch (Exception e) {
			setErreur(c, e.getMessage());
		}
		variable.setC(Integer.valueOf(c));
		
		Solution solution = resolution(variable.getA(), variable.getB(), variable.getC());
		solution.setA(variable.getA());
		solution.setB(variable.getB());
		solution.setC(variable.getC());
		
		return solution;
	}

	//resolution equation à deux inconnues
	public Solution EquationDeuxInconnue (HttpServletRequest request) {
		
		Variable variable = new Variable();
		String a = getValeurChamp(request, CHAMP_A);
		String b = getValeurChamp(request, CHAMP_B);
		String c = getValeurChamp(request, CHAMP_C);
		String d = getValeurChamp(request, CHAMP_D);
		String e = getValeurChamp(request, CHAMP_E);
		String f = getValeurChamp(request, CHAMP_F);
		
		try {
			validationA(a);
		} catch (Exception mes) {
			setErreur(a, mes.getMessage());
		}
		variable.setA(Integer.valueOf(a).intValue());
		
		try {
			validationB(b);
		} catch (Exception mes) {
			setErreur(b, mes.getMessage());
		}
		variable.setB(Integer.valueOf(b).intValue());
		
		try {
			validationC(c);
		} catch (Exception mes) {
			setErreur(c, mes.getMessage());
		}
		variable.setC(Integer.valueOf(c).intValue());
		
		try {
			validationD(d);
		} catch (Exception mes) {
			setErreur(d, mes.getMessage());
		}
		variable.setD(Integer.valueOf(d).intValue());
		
		try {
			validationE(e);
		} catch (Exception mes) {
			setErreur(e, mes.getMessage());
		}
		variable.setE(Integer.valueOf(e).intValue());
		
		try {
			validationF(f);
		} catch (Exception mes) {
			setErreur(f, mes.getMessage());
		}
		variable.setF(Integer.valueOf(f).intValue());
		
		Solution solution = resolutionEquationDeuxInconnues(variable.getA(), variable.getB(), variable.getC(),
				variable.getD(), variable.getE(), variable.getF());
			solution.setA(variable.getA());
			solution.setB(variable.getB());
			solution.setC(variable.getC());
			solution.setD(variable.getD());
			solution.setE(variable.getE());
			solution.setF(variable.getF());
		
		return solution;
	}
	
	//résolution équation à trois inconnues
	public Solution equationTroisInconnue(HttpServletRequest request) {
		
		Variable variable = new Variable();
		String a = getValeurChamp(request, CHAMP_A);
		String b = getValeurChamp(request, CHAMP_B);
		String c = getValeurChamp(request, CHAMP_C);
		String d = getValeurChamp(request, CHAMP_D);
		String e = getValeurChamp(request, CHAMP_E);
		String f = getValeurChamp(request, CHAMP_F);
		String g = getValeurChamp(request, CHAMP_G);
		String h = getValeurChamp(request, CHAMP_H);
		String i = getValeurChamp(request, CHAMP_I);
		String j = getValeurChamp(request, CHAMP_J);
		String k = getValeurChamp(request, CHAMP_K);
		String l = getValeurChamp(request, CHAMP_L);
		
		try {
			validationA(a);
		} catch (Exception mes) {
			setErreur(a, mes.getMessage());
		}
		variable.setA(Integer.valueOf(a).intValue());
		
		try {
			validationB(b);
		} catch (Exception mes) {
			setErreur(b, mes.getMessage());
		}
		variable.setB(Integer.valueOf(b).intValue());
		
		try {
			validationC(c);
		} catch (Exception mes) {
			setErreur(c, mes.getMessage());
		}
		variable.setC(Integer.valueOf(c).intValue());
		
		try {
			validationD(d);
		} catch (Exception mes) {
			setErreur(d, mes.getMessage());
		}
		variable.setD(Integer.valueOf(d).intValue());
		
		try {
			validationE(e);
		} catch (Exception mes) {
			setErreur(e, mes.getMessage());
		}
		variable.setE(Integer.valueOf(e).intValue());
		
		try {
			validationF(f);
		} catch (Exception mes) {
			setErreur(f, mes.getMessage());
		}
		variable.setF(Integer.valueOf(f).intValue());
		
		try {
			validationG(g);
		} catch (Exception mes) {
			setErreur(g, mes.getMessage());
		}
		variable.setG(Integer.valueOf(g).intValue());
		
		try {
			validationH(h);
		} catch (Exception mes) {
			setErreur(h, mes.getMessage());
		}
		variable.setH(Integer.valueOf(h).intValue());
		
		try {
			validationI(i);
		} catch (Exception mes) {
			setErreur(i, mes.getMessage());
		}
		variable.setI(Integer.valueOf(i).intValue());
		
		try {
			validationJ(j);
		} catch (Exception mes) {
			setErreur(j, mes.getMessage());
		}
		variable.setJ(Integer.valueOf(j).intValue());
		
		try {
			validationK(k);
		} catch (Exception mes) {
			setErreur(k, mes.getMessage());
		}
		variable.setK(Integer.valueOf(k).intValue());
		
		try {
			validationL(l);
		} catch (Exception mes) {
			setErreur(l, mes.getMessage());
		}
		variable.setL(Integer.valueOf(l).intValue());
		
		Solution solution = resolutionEquationTroisInconnues(variable.getA(), variable.getB(), variable.getC(), variable.getD(), variable.getE(),
				variable.getF(), variable.getG(), variable.getH(), variable.getI(), variable.getJ(), variable.getK(), variable.getL());
			solution.setA(variable.getA());
			solution.setB(variable.getB());
			solution.setC(variable.getC());
			solution.setD(variable.getD());
			solution.setE(variable.getE());
			solution.setF(variable.getF());
			solution.setG(variable.getG());
			solution.setH(variable.getH());
			solution.setI(variable.getI());
			solution.setJ(variable.getJ());
			solution.setK(variable.getK());
			solution.setL(variable.getL());
		
		return solution;
	}


	//résolution équation à trois inconnues
		public ChiffreStringBean equationQuatreInconnue(HttpServletRequest request) {
			
			ChiffreStringBean resolutionString = new ChiffreStringBean();	
			ChiffreBean chiffre = new ChiffreBean();
			String a = getValeurChamp(request, CHAMP_A);
			String b = getValeurChamp(request, CHAMP_B);
			String c = getValeurChamp(request, CHAMP_C);
			String d = getValeurChamp(request, CHAMP_D);
			String e = getValeurChamp(request, CHAMP_E);
			String f = getValeurChamp(request, CHAMP_F);
			String g = getValeurChamp(request, CHAMP_G);
			String h = getValeurChamp(request, CHAMP_H);
			String i = getValeurChamp(request, CHAMP_I);
			String j = getValeurChamp(request, CHAMP_J);
			String k = getValeurChamp(request, CHAMP_K);
			String l = getValeurChamp(request, CHAMP_L);
			String m = getValeurChamp(request, CHAMP_M);
			String n = getValeurChamp(request, CHAMP_N);
			String o = getValeurChamp(request, CHAMP_O);
			String p = getValeurChamp(request, CHAMP_P);
			String q = getValeurChamp(request, CHAMP_Q);
			String r = getValeurChamp(request, CHAMP_R);
			String s = getValeurChamp(request, CHAMP_S);
			String t = getValeurChamp(request, CHAMP_T);
			
			
			if (a.isEmpty()) {
				chiffre.setErreur1("Veuillez inserer la valeur de <font color=\"red\">a</font>");
			}
			else if (b.isEmpty()) {
				chiffre.setErreur1("Veuillez inserer la valeur de <font color=\"red\">b</font>");
			}
			else if (c.isEmpty()) {
				chiffre.setErreur1("Veuillez inserer la valeur de <font color=\"red\">c</font>");
			}
			else if (d.isEmpty()) {
				chiffre.setErreur1("Veuillez inserer la valeur de <font color=\"red\">d</font>");
			}
			else if (e.isEmpty()) {
				chiffre.setErreur2("Veuillez inserer la valeur de <font color=\"red\">e</font>");
			}
			else if (f.isEmpty()) {
				chiffre.setErreur2("Veuillez inserer la valeur de <font color=\"red\">f</font>");
			}
			else if (g.isEmpty()) {
				chiffre.setErreur2("Veuillez inserer la valeur de <font color=\"red\">g</font>");
			}
			else if (h.isEmpty()) {
				chiffre.setErreur2("Veuillez inserer la valeur de <font color=\"red\">h</font>");
			}
			else if (i.isEmpty()) {
				chiffre.setErreur3("Veuillez inserer la valeur de <font color=\"red\">i</font>");
			}
			else if (j.isEmpty()) {
				chiffre.setErreur3("Veuillez inserer la valeur de <font color=\"red\">j</font>");
			}
			else if (k.isEmpty()) {
				chiffre.setErreur3("Veuillez inserer la valeur de <font color=\"red\">k</font>");
			}
			else if (l.isEmpty()) {
				chiffre.setErreur3("Veuillez inserer la valeur de <font color=\"red\">l</font>");
			}
			else if (m.isEmpty()) {
				chiffre.setErreur4("Veuillez inserer la valeur de <font color=\"red\">m</font>");
			}
			else if (n.isEmpty()) {
				chiffre.setErreur4("Veuillez inserer la valeur de <font color=\"red\">n</font>");
			}
			else if (o.isEmpty()) {
				chiffre.setErreur4("Veuillez inserer la valeur de <font color=\"red\">o</font>");
			}
			else if (p.isEmpty()) {
				chiffre.setErreur4("Veuillez inserer la valeur de <font color=\"red\">p</font>");
			}
			else if (q.isEmpty()) {
				chiffre.setErreur1("Veuillez inserer la valeur de <font color=\"red\">q</font>");
			}
			else if (r.isEmpty()) {
				chiffre.setErreur2("Veuillez inserer la valeur de <font color=\"red\">r</font>");
			}
			else if (s.isEmpty()) {
				chiffre.setErreur3("Veuillez inserer la valeur de <font color=\"red\">s</font>");
			}
			else if (t.isEmpty()) {
				chiffre.setErreur4("Veuillez inserer la valeur de <font color=\"red\">t</font>");
			}
			
			if ( chiffre.getErreur1() == null && chiffre.getErreur2() == null &&
				 chiffre.getErreur3() == null && chiffre.getErreur4() == null) {
				
				chiffre = modeleQuatreInconnue.resolutionQuatreInconnue(chiffre);
				
			}
			
			resolutionString = attribValueString(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
			resolutionString.setErreur1(chiffre.getErreur1());
			resolutionString.setErreur2(chiffre.getErreur2());
			resolutionString.setErreur3(chiffre.getErreur3());
			resolutionString.setErreur4(chiffre.getErreur4());
			resolutionString.setValX(chiffre.getValX());
			resolutionString.setValY(chiffre.getValY());
			resolutionString.setValZ(chiffre.getValZ());
			resolutionString.setValW(chiffre.getValW());
			
			return resolutionString;
		}
	
	
	private void validationA(String a) throws Exception{
		if (a == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">a</font>");
		}
	}

	private void validationB(String b) throws Exception{
		if (b == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">b</font>");
		}
		
	}	
	
	private void validationC(String c) throws Exception{
		if (c == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">c</font>");
		}
		
	}
	
	private void validationD(String d) throws Exception{
		if (d == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">d</font>");
		}
	}

	private void validationE(String e) throws Exception{
		if (e == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">e</font>");
		}
		
	}	
	
	private void validationF(String f) throws Exception{
		if (f == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">f</font>");
		}
		
	}
	
	private void validationG(String g) throws Exception{
		if (g == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">g</font>");
		}
	}

	private void validationH(String h) throws Exception{
		if (h == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">h</font>");
		}
		
	}	
	
	private void validationI(String i) throws Exception{
		if (i == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">i</font>");
		}
		
	}
	
	private void validationJ(String j) throws Exception{
		if (j == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">j</font>");
		}
	}

	private void validationK(String k) throws Exception{
		if (k == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">k</font>");
		}
		
	}	
	
	private void validationL(String l) throws Exception{
		if (l == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">l</font>");
		}
		
	}
	
	private void validationM(String m) throws Exception{
		if (m == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">m</font>");
		}
		
	}
	
	private void validationN(String n) throws Exception{
		if (n == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">n</font>");
		}
	}

	private void validationO(String o) throws Exception{
		if (o == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">o</font>");
		}
		
	}	
	
	private void validationP(String p) throws Exception{
		if (p == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">p</font>");
		}
		
	}
	
	private void validationQ(String q) throws Exception{
		if (q == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">g</font>");
		}
	}

	private void validationR(String r) throws Exception{
		if (r == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">r</font>");
		}
		
	}	
	
	private void validationS(String s) throws Exception{
		if (s == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">s</font>");
		}
		
	} 
	
	private void validationT(String t) throws Exception{
		if (t == null)	{
			throw new Exception("Veuillez introduire la valeur de <font color=\"red\">t</font>");
		}
		
	}
	
	private void setErreur (String champ, String message) {
		erreur.put(champ, message);
	}
	
	private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
		
		String valeur = request.getParameter(nomChamp);
		
		if (valeur == null || valeur.trim().length() < 0) {
			return null;
		}
		else {
			return valeur.trim();
		}
		
	}
	
	//Fonction de traitement équation second degré
	public Solution resolution(int a, int b, int c) {
		
		Solution solution = new Solution();
		double delta;
		
		delta = ( Math.pow(b, 2) ) - ( (4*a*c) ); 
		
		if (delta == 0) {
			double x1 =( (-b) - ( Math.sqrt(delta) ) ) / ( 2*a );
			
			if (x1 != (int) x1 ) {
				solution.setSolution("Solution unique = "+x1);
			}
			else {
				solution.setSolution("Solution unique = "+(int)x1);
			}
			
		}
		else if (delta > 0) {
			
			double x1 =( (-b) - ( Math.sqrt(delta) ) ) / ( 2*a );
			double x2 =( (-b) + ( Math.sqrt(delta) ) ) / ( 2*a ); 
				
				//solution 1
				if (x1 != (int) x1 ) {
					solution.setFirstSolution("Solution1 = "+x1);
				}
				else {
					solution.setFirstSolution("Solution1 = "+(int)x1);
				}
				
				//solution 2
				if (x2 != (int) x2 ) {
					solution.setSecondSolution("Solution2 = "+x2);
				}
				else {
					solution.setSecondSolution("Solution2 = "+(int)x2);
				}
		}
		else {
			
			solution.setSolution("Pas de solution");
			
		}
		return solution;
	}

	//fonction de traitement equation à deux inconnues
	public Solution resolutionEquationDeuxInconnues(int a, int b, int c, int d, int e, int f) {
			double y = (a*f - c*d)/ ( (-b*d) + (a*e) );
			
			double x = ( c + (-b*y) )/ a ;
			
			Solution solution = new Solution();
			
			//valeur de y
			if (y == (int) y) {
				solution.setY("la valeur de Y = "+ (int) y);
			}
			else {
				solution.setY("la valeur de Y = "+ y);
			}
			
			//valeur de x
			if (x == (int) x) {
				solution.setX("la valeur de X = "+ (int) x);
			}
			else {
				solution.setX("la valeur de X = "+ x);
			}
			
			
		return solution;
	}
	
	//Fonction de traitement equation à trois inconnue
	private Solution resolutionEquationTroisInconnues(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l) {
		Solution solution = new Solution();
		int delta, deltaX, deltaY, deltaZ;
		double x,y,z;
		
		delta = (a*(f*k - g*j) ) - ( b*(e*k - g*i) ) + ( c*(e*j - f*i) );
		
		deltaX = ( d*(f*k - g*j) ) - ( b*(h*k - g*l) ) + ( c*(h*j - f*l) );
	
		deltaY = ( a*(h*k - g*l) ) - ( d*(e*k - g*i) ) + ( c*(e*l - h*i) );
		
		deltaZ = ( a*(f*l - h*j) ) - ( b*(e*l - h*i) ) + ( d*(e*j - f*i) );
		
		x = (double) deltaX / delta;
		y = (double) deltaY / delta;
		z = (double) deltaZ / delta;
		
		if (x == (int) x) {
			solution.setX("X = "+(int)x);
		} 
		else {
			if (delta < 0) {
				solution.setX("X = "+ -deltaX+"/"+-delta);
			}
			else {
				solution.setX("X = "+ deltaX+"/"+delta);
			}
		}
		
		if (y == (int) y) {
			solution.setY("Y = "+(int)y);
		} 
		else {
			if (delta < 0) {
				solution.setY("Y = "+ -deltaY+"/"+-delta);
			}
			else {
				solution.setY("Y = "+ deltaY+"/"+delta);
			}
		}
		
		if (z == (int) z) {
			solution.setZ("Z = "+(int)z);
		} 
		else {
			if (delta < 0) {
				solution.setZ("Z = "+ -deltaZ+"/"+-delta);
			}
			else {
				solution.setZ("Z = "+ deltaZ+"/"+delta);
			}
		}
		
		return solution;
	}
	
	private String attribValueInt(int value) {
		String val= null;	
		
		if (value != 0) {
			val = String.valueOf(value);
		}
		
		return val;
	}
	
	private ChiffreStringBean attribValueString(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, 
												String k, String l, String m, String n, String o, String p, String q, String r, String s, String t) {
		ChiffreStringBean chiffreString = new ChiffreStringBean();
		
			chiffreString.setA(a);chiffreString.setB(b);chiffreString.setC(c);chiffreString.setD(d);chiffreString.setE(e);
			chiffreString.setF(f);chiffreString.setG(g);chiffreString.setH(h);chiffreString.setI(i);chiffreString.setJ(j);
			chiffreString.setK(k);chiffreString.setL(l);chiffreString.setM(m);chiffreString.setN(n);chiffreString.setO(o);
			chiffreString.setP(p);chiffreString.setQ(q);chiffreString.setR(r);chiffreString.setS(s);chiffreString.setT(t);
		
		return chiffreString;
	}
}
