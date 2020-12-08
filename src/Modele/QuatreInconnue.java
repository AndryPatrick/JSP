package Modele;

import Beans.ChiffreBean;

public class QuatreInconnue { 
	int a =0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, 
		k =0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0;
	
	public ChiffreBean resolutionQuatreInconnue(ChiffreBean chiffre) {
		
		chiffre.setDelta(calculDelta( chiffre));
		chiffre.setDeltaX(calculDeltaX( chiffre));
		chiffre.setDeltaY(calculDeltaY( chiffre));
		chiffre.setDeltaZ(calculDeltaZ( chiffre));
		chiffre.setDeltaW(calculDeltaW( chiffre));
		
		chiffre.setValX("X = "+(( chiffre.getDelta() ==0 )?(0) : (chiffre.getDeltaX() / chiffre.getDelta())));
		chiffre.setValY("Y = "+(( chiffre.getDelta() ==0 )?(0) : (chiffre.getDeltaY() / chiffre.getDelta())));
		chiffre.setValZ("Z = "+(( chiffre.getDelta() ==0 )?(0) : (chiffre.getDeltaZ() / chiffre.getDelta())));
		chiffre.setValW("W = "+(( chiffre.getDelta() ==0 )?(0) : (chiffre.getDeltaW() / chiffre.getDelta())));  
		chiffre.setA(chiffre.getA()); chiffre.setB(chiffre.getB()); chiffre.setC(chiffre.getC()); chiffre.setD(chiffre.getD());
		chiffre.setE(chiffre.getE()); chiffre.setF(chiffre.getF()); chiffre.setG(chiffre.getG()); chiffre.setH(chiffre.getH()); 
		chiffre.setI(chiffre.getI()); chiffre.setJ(chiffre.getJ()); chiffre.setK(chiffre.getK()); chiffre.setL(chiffre.getL()); 
		chiffre.setM(chiffre.getM()); chiffre.setN(chiffre.getN()); chiffre.setO(chiffre.getO()); chiffre.setP(chiffre.getP()); 
		chiffre.setQ(chiffre.getQ()); chiffre.setR(chiffre.getR()); chiffre.setS(chiffre.getS()); chiffre.setT(chiffre.getT());
		
		return chiffre;
	}

	
	private int calculDelta(ChiffreBean chiffre) {
		
		int a = chiffre.getA() , b = chiffre.getB() , c = chiffre.getC() , d = chiffre.getD() , e = chiffre.getE(), 
			f = chiffre.getF() , g = chiffre.getG() , h = chiffre.getH() , i = chiffre.getI() , j = chiffre.getJ(), 
			k = chiffre.getK() , l = chiffre.getL() , m = chiffre.getM() , n = chiffre.getN() , o = chiffre.getO(),
			p = chiffre.getP() , q = chiffre.getQ() , r = chiffre.getR() , s = chiffre.getS() , t = chiffre.getT();
		int delta = calcul(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		
		return delta;
	}
	
	private int calculDeltaX( ChiffreBean chiffre ) {
		int a = chiffre.getQ() , b = chiffre.getB() , c = chiffre.getC() , d = chiffre.getD() , e = chiffre.getR(), 
			f = chiffre.getF() , g = chiffre.getG() , h = chiffre.getH() , i = chiffre.getS() , j = chiffre.getJ(), 
			k = chiffre.getK() , l = chiffre.getL() , m = chiffre.getT() , n = chiffre.getN() , o = chiffre.getO(),
			p = chiffre.getP() , q = chiffre.getQ() , r = chiffre.getR() , s = chiffre.getS() , t = chiffre.getT();
		
		int deltaX = calcul(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		
		return deltaX;
	}
	
	private int calculDeltaY(ChiffreBean chiffre) {
		int a = chiffre.getA() , b = chiffre.getQ() , c = chiffre.getC() , d = chiffre.getD() , e = chiffre.getE(), 
			f = chiffre.getR() , g = chiffre.getG() , h = chiffre.getH() , i = chiffre.getI() , j = chiffre.getS(), 
			k = chiffre.getK() , l = chiffre.getL() , m = chiffre.getM() , n = chiffre.getT() , o = chiffre.getO(),
			p = chiffre.getP() , q = chiffre.getQ() , r = chiffre.getR() , s = chiffre.getS() , t = chiffre.getT();
		
		int deltaY = calcul(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		
		return deltaY;
	}
	
	private int calculDeltaZ(ChiffreBean chiffre) {
		int a = chiffre.getA() , b = chiffre.getB() , c = chiffre.getQ() , d = chiffre.getD() , e = chiffre.getE(), 
			f = chiffre.getF() , g = chiffre.getR() , h = chiffre.getH() , i = chiffre.getI() , j = chiffre.getJ(), 
			k = chiffre.getS() , l = chiffre.getL() , m = chiffre.getM() , n = chiffre.getN() , o = chiffre.getT(),
			p = chiffre.getP() , q = chiffre.getQ() , r = chiffre.getR() , s = chiffre.getS() , t = chiffre.getT();
		
		//c = q; g = r; k = s; o = t;
		
		int deltaZ = calcul(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		
		return deltaZ;
	}
	
	private int calculDeltaW(ChiffreBean chiffre) {
		int a = chiffre.getA() , b = chiffre.getB() , c = chiffre.getC() , d = chiffre.getQ() , e = chiffre.getE(), 
			f = chiffre.getF() , g = chiffre.getG() , h = chiffre.getR() , i = chiffre.getI() , j = chiffre.getJ(), 
			k = chiffre.getK() , l = chiffre.getS() , m = chiffre.getM() , n = chiffre.getN() , o = chiffre.getO(),
			p = chiffre.getT() , q = chiffre.getQ() , r = chiffre.getR() , s = chiffre.getS() , t = chiffre.getT();
		
		//d = q; h = r; l = s; p = t;
		
		int deltaW = calcul(a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t);
		
	return deltaW;
	}
	
	private int calcul(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p, int q, int r, int s, int t) {
		
		int delta = (a*f*k*p) - (a*f*l*o) - (a*g*j*p) + (a*g*l*n) + (a*h*j*o) - (a*h*k*n) -
					(b*e*k*p) + (b*e*l*o) + (b*g*i*p) - (b*g*l*m) - (b*h*i*o) + (b*h*k*m) +
					(c*e*j*p) - (c*e*l*n) - (c*f*i*p) + (c*f*l*m) + (c*h*i*n) - (c*h*j*m) -
					(d*e*j*o) + (d*e*k*n) + (d*f*i*o) - (d*f*k*m) - (d*g*i*n) + (d*g*j*m);
				
		
		return delta;
	}
}
