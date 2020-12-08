import java.util.Arrays;
import java.util.EnumMap;
import java.util.Optional;

import Beans.CompositionBean;
import Beans.DivisionBeans;
import Beans.NombrePremierBean;
import Beans.VariableIterationBeans;

public class DivisionEuclidienne {	
	
	
	public VariableIterationBeans getComposant(int nombre) {
		CompositionBean composition = new CompositionBean();
		VariableIterationBeans iteration = new VariableIterationBeans();
		int nbVariable = 0;
		 composition.setZ(nombre);
		do {
			
			DivisionBeans division = diviser(nombre);
				
			
			if (composition.getB() == 0) {
				composition.setB(division.getDiviseur());
			}
			
			else if (composition.getC() == 0) {
				composition.setC(division.getDiviseur());
			}
			
			else if (composition.getD() == 0) {
				composition.setD(division.getDiviseur());
			}
			
			else if (composition.getF() == 0) {
				composition.setF(division.getDiviseur());
			}
			
			else if (composition.getG() == 0) {
				composition.setG(division.getDiviseur());
			}
			
			else if (composition.getH() == 0) {
				composition.setH(division.getDiviseur());
			}
			
			else if (composition.getJ() == 0) {
				composition.setJ(division.getDiviseur());
			}
			
			else if (composition.getK() == 0) {
				composition.setK(division.getDiviseur());
			}
			
			else if (composition.getL() == 0) {
				composition.setL(division.getDiviseur());
			}
			
			else if (composition.getM() == 0) {
				composition.setM(division.getDiviseur());
			}
			
			else if (composition.getN() == 0) {
				composition.setP(division.getDiviseur());
			}
			nombre = division.getQuotient(); 
			
		}while(nombre !=1 && nombre != 0); 
		
		
		if ( composition.getN() != 0 && composition.getM() != 0 && composition.getL() !=0 && composition.getK() !=0 && composition.getJ() !=0
				&& composition.getH() !=0 && composition.getG() !=0 && composition.getF() !=0 && composition.getD() !=0 
				&& composition.getC() !=0 && composition.getB() !=0){
			
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
				" x "+composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK()+" x "+composition.getL()+" x "+composition.getM()+" x "+composition.getN());
			nbVariable = 11;
		}
		else if (composition.getB() != 0 && composition.getC() !=0 && composition.getD() !=0 && composition.getF() !=0
				&& composition.getG() !=0 && composition.getH() !=0 && composition.getJ() !=0 && composition.getK() !=0 
				&& composition.getL() !=0 && composition.getM() !=0)
		{
				nombre = composition.getZ();
				System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
				composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
				composition.getK()+" x "+composition.getL()+" x "+composition.getM());
				nbVariable = 10;
		}
		else if (composition.getL() !=0 && composition.getK() !=0 && composition.getJ() !=0
				&& composition.getH() !=0 && composition.getG() !=0 && composition.getF() !=0 && composition.getD() !=0 
				&& composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK()+" x "+composition.getL());
			nbVariable = 9;
		}
		else if (composition.getK() !=0 && composition.getJ() !=0 && composition.getH() !=0 && composition.getG() !=0 && 
				composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK());
			nbVariable = 8;
		}
		else if (composition.getJ() !=0 && composition.getH() !=0 && composition.getG() !=0 && 
				composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ());
			nbVariable = 7;
		}
		else if (composition.getH() !=0 && composition.getG() !=0 &&composition.getF() !=0 && composition.getD() !=0  && 
				composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH());
			nbVariable = 6;
		}
		else if (composition.getG() !=0 &&composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG());
			nbVariable = 5;
		}
		else if (composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF());
			nbVariable = 4;
		}
		else if (composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0){
			nombre = composition.getZ();
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD());
			nbVariable = 3;
		}
		else if (composition.getC() !=0 && composition.getB() !=0){
			System.out.println(nombre+" = "+composition.getB()+" x "+composition.getC());
			nbVariable = 2;
		}
		
		System.out.println(nbVariable);
		
		int resultat[] = {composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH()};
		
		
		for (int i = 0; i < resultat.length; i++)//boucler pour lire les éléments du tableau
			
			Arrays.sort(resultat); //trier le tableau et ranger par ordre croissant
		
		for (int i = 0; i < resultat.length; i++) //reaffichage du tableau dans l'ordre
			
			System.out.print(" "+resultat[i]);
			System.out.println("\n");
		
		//boucle pour avoir les nombres premier distinct du tableau
		for (int cas1 = 0; cas1 < resultat.length; cas1++) {
			int compte = 0, valeurCas1, valeurCas2, debutProchainBoucle = 0; 
				valeurCas1 = resultat[cas1];
				
				//compter la repetition d'un nombre premier dans le tableau
				for (int cas2 = cas1; cas2 < resultat.length; cas2++) {	
					
					valeurCas2 = resultat[cas2];
					
					if (valeurCas1 == valeurCas2) 						
						compte++;
						
					if (valeurCas1 != valeurCas2 && debutProchainBoucle == 0)
						debutProchainBoucle = cas2;
				}

				if (iteration.getB() == 0) {
					iteration.setB(valeurCas1);
					iteration.setNbrB(compte);
				}
				else if (iteration.getC() ==0) {
					iteration.setC(valeurCas1);
					iteration.setNbrC(compte);
				}
				else if (iteration.getD() == 0) {
					iteration.setD(valeurCas1);
					iteration.setNbrD(compte);
				}
				else if (iteration.getF() == 0) {					
					iteration.setF(valeurCas1);
					iteration.setNbrF(compte);
				}
				else if (iteration.getG() == 0) {
					iteration.setG(valeurCas1);
					iteration.setNbrG(compte);
				}
				else if (iteration.getH() == 0) {
					iteration.setH(valeurCas1);
					iteration.setNbrH(compte);
				}
				else if (iteration.getJ() ==0) {
					iteration.setJ(valeurCas1);
					iteration.setNbrJ(compte);
				}
				else if (iteration.getK() ==0) {
					iteration.setK(valeurCas1);
					iteration.setNbrK(compte);
				}
				else if (iteration.getL() == 0) {
					iteration.setL(valeurCas1);
					iteration.setNbrL(compte);
				}
				else if (iteration.getM() == 0) {
					iteration.setM(valeurCas1);
					iteration.setNbrM(compte);
				}
				else if (iteration.getN() == 0) {
					iteration.setN(valeurCas1);
					iteration.setNbrN(compte);
				}
				else if (iteration.getP() == 0) {
					iteration.setP(valeurCas1);
					iteration.setNbrP(compte);
				}
				else if (iteration.getQ() == 0) {
					iteration.setQ(valeurCas1);
					iteration.setNbrQ(compte);
				}
				else if (iteration.getR() == 0) {
					iteration.setR(valeurCas1);
					iteration.setNbrR(compte);
				}
				else if (iteration.getS() == 0) {
					iteration.setS(valeurCas1);
					iteration.setNbrS(compte);
				}
				else if (iteration.getT() == 0) {
					iteration.setT(valeurCas1);
					iteration.setNbrT(compte);
				}
				else if (iteration.getV() == 0) {
					iteration.setV(valeurCas1);
					iteration.setNbrV(compte);
				}
				else if (iteration.getW() == 0) {
					iteration.setW(valeurCas1);
					iteration.setNbrW(compte);
				}
				else if (iteration.getX() == 0) {
					iteration.setX(valeurCas1);
					iteration.setNbrX(compte);
				}
				else if (iteration.getZ() == 0) {
					iteration.setZ(valeurCas1);
					iteration.setNbrZ(compte);
				}
				
				cas1 = (debutProchainBoucle != 0 ? debutProchainBoucle -1 : nbVariable +1);
				
		}
		
		String fin = iteration.getB()+"^"+iteration.getNbrB()+" x "+iteration.getC()+"^"+iteration.getNbrC()+" x "+iteration.getD()+"^"+iteration.getNbrD()+" x "+
				  iteration.getF()+"^"+iteration.getNbrF()+" x "+iteration.getG()+"^"+iteration.getNbrG()+"";
		System.out.println(fin);	
		
		return iteration;
	}
	

	public DivisionBeans diviser(int nombre) {
		DivisionBeans division = new DivisionBeans();
		NombrePremierBean premierNombre = new NombrePremierBean();
		
		for (int i = 0; i < premierNombre.getPremier().length; i++) {
			int a = 0;
			int b = 0;
			int c = premierNombre.getPremier()[i];
			
				if (nombre%premierNombre.getPremier()[i] == 0) {
					 a = nombre/premierNombre.getPremier()[i];
					 b = premierNombre.getPremier()[i];
									
					if (a !=0 && b !=0) {
						division.setDiviseur(b);
						division.setQuotient(a);
					}
				
					System.out.println(nombre+" = "+b+" x "+a);
				}						
		}
		
		return division;
	}
	
}
