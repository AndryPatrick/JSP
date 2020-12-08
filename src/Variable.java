import java.util.HashMap;
import java.util.Map;

public class Variable {

	static int a;
	static int b;
	static int c;
	static String A1,B1,C1;
	
	Map<String, Integer> valeur = new HashMap<String, Integer>();
	
	
	public Map<String, Integer> getValeur() {
		return valeur;
	}


	public void setValeur(Map<String, Integer> valeur) {
		this.valeur = valeur;
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public String getA1() {
		return A1;
	}


	public void setA1(String a1) {
		A1 = a1;
	}


	public String getB1() {
		return B1;
	}


	public void setB1(String b1) {
		B1 = b1;
	}


	public String getC1() {
		return C1;
	}


	public void setC1(String c1) {
		C1 = c1;
	}

	
	public static void main (String [] args) {
	
		
	}
	
	
}
