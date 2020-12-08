import Beans.DivisionBeans;

public class test {

	
	/*  public Variable decomposition (int nombre) {
		Variable variable = new Variable();
		Resultat result = test(nombre);
			variable.setA(result.getDiviseur());
			variable.setB(result.getQuotient());
			
		int val = variable.getB();
			result = test(val);
			variable.setC(result.getDiviseur());
			variable.setD(result.getQuotient());
		
		int val1 = variable.getD();
			result = test(val1);
			variable.setE(result.getDiviseur());
			variable.setF(result.getQuotient());
			
		int val2 = variable.getF();
			result = test(val2);
			variable.setG(result.getDiviseur());
			variable.setH(result.getQuotient());
		
		return variable; */
		
		/* 
		 * DivisionBeans division = diviser(nombre);
			composition.setB(division.getDiviseur());
			chiffre.setA(division.getQuotient());	
			
		for (int i = 0; i < premierNombre.getPremier().length; i++) {
			if (chiffre.getA() == premierNombre.getPremier()[i]) {
				DivisionBeans division1 = diviser(chiffre.getA());
				composition.setC(division1.getDiviseur());
				chiffre.setB(division1.getQuotient());
			}
		}
			
		for (int o = 0; o <premierNombre.getPremier().length; o++) {
			if (chiffre.getB() == premierNombre.getPremier()[o]) {
				DivisionBeans division2 = diviser(chiffre.getB());
				composition.setD(division2.getDiviseur());
				chiffre.setC(division2.getQuotient());
			}
		}
		 * */
				
	//}
	
	
	public Resultat test (int nombre) {
		
		int premier[] = {2,3,5,7,11,13};
		int quotient =0;
		int tour = 0;
		int a = 0, b=0;
		int div1 = 0, div2=0;
		int quotient1 = 0, quotient2 =0;
		String resultat;
		
		for (int i=0; i < premier.length; i++) {
				quotient = nombre/premier[i];
				
			if ( (( quotient != 2 || quotient != 3 || quotient != 5 || quotient != 7 || quotient != 11 || quotient != 13 )  
					&& nombre%premier[i] == 0)) {
				tour ++;
				b = quotient;
				a = premier[i];
				
			
			}
			if (tour == 1) {
				div1 = a;
				quotient1 =b;
			}
			else if (tour ==2) {
				div2 = a;
				quotient2 = b;
			}
			
			if (div2 >div1) {
				
			}
		}
		
		Resultat result = new Resultat();
		
		resultat = (div2 >div1) ? (nombre +" = "+div2+" x "+quotient2) : (nombre +" = "+div1+" x "+quotient1);
		nombre = (div2 > div1) ? quotient2: quotient1;
		int diviseur = (div2 >div1) ? div2 : div1;
		int nouveauNombre = nombre;
		
		result.setDiviseur(diviseur);
		result.setQuotient(nouveauNombre);
		System.out.println(resultat);
		System.out.println("nouveau nombre = "+nombre);

	return result;
	}
}
