package Modele;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.naming.spi.ResolveResult;
import javax.servlet.http.HttpServletRequest;

import Beans.CompositionBean;
import Beans.DivisionBeans;
import Beans.NombrePremierBean;
import Beans.PpcmValEgauxBeans;
import Beans.VariableIterationBeans;

public class DecompositionModele {
	
	private static final String CHAMP_NOMBRE = "nombre";
	
	Map<String, String> erreur = new HashMap<String, String>();
	
	public Map<String, String> getErreur() {
		return erreur;
	}
	
	public VariableIterationBeans decomposition(HttpServletRequest request) {
		VariableIterationBeans iteration = new VariableIterationBeans();
		VariableIterationBeans resultat =  new VariableIterationBeans();
		String nombre = getValeurChamp(request, CHAMP_NOMBRE);
		int nbr = Integer.valueOf(nombre).intValue();
		try {
			validationNombre(nbr);
		} catch (Exception e) {
			setErreur(CHAMP_NOMBRE, e.getMessage());
		} 
		
		if (erreur.isEmpty()) {
			iteration = getComposant(nbr);
			iteration.setNombre(nbr);
			
			resultat = traiterResultatDecomposition(iteration);
		}
			
		return resultat;
	}
	
	private void validationNombre(int nombre) throws Exception{
		if (nombre == 0)	{
			throw new Exception("Veuillez inserer un nombre");
		}
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
	
	
	public VariableIterationBeans getComposant(int nombre) {
		CompositionBean composition = new CompositionBean();
		VariableIterationBeans iteration = new VariableIterationBeans();
		int nbVariable = 0;
		 composition.setNombre(nombre);
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
		
		
		//stocker les valeurs du tableau dans l'objet composition
		CompositionBean composante = compositionVariable(composition);
				
		//intégrer les valeur du composition dans un tableau
		int resultat[] = getTableau(composante, nbVariable);
		
		
		for (int i = 0; i < resultat.length; i++) //boucler pour lire les éléments du tableau
			
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
					if (iteration.getNbrB() != 1) {
						iteration.setValB(iteration.getB()+"<sup>"+iteration.getNbrB()+"</sup>");
					}
					else {
						iteration.setValB(iteration.getB()+"");
					}
				}
				else if (iteration.getC() ==0) {
					iteration.setC(valeurCas1);
					iteration.setNbrC(compte);
					if (iteration.getNbrC() != 1) {
						iteration.setValC(iteration.getC()+"<sup>"+iteration.getNbrC()+"</sup>");
					}
					else {
						iteration.setValC(iteration.getC()+"");
					}
				}
				else if (iteration.getD() == 0) {
					iteration.setD(valeurCas1);
					iteration.setNbrD(compte);
					if (iteration.getNbrD() != 1) {
						iteration.setValD(iteration.getD()+"<sup>"+iteration.getNbrD()+"</sup>");
					}
					else {
						iteration.setValD(iteration.getD()+"");
					}
				}
				else if (iteration.getF() == 0) {					
					iteration.setF(valeurCas1);
					iteration.setNbrF(compte);
					if (iteration.getNbrF() != 1) {
						iteration.setValF(iteration.getF()+"<sup>"+iteration.getNbrF()+"</sup>");
					}
					else {
						iteration.setValF(iteration.getF()+"");
					}
				}
				else if (iteration.getG() == 0) {
					iteration.setG(valeurCas1);
					iteration.setNbrG(compte);
					if (iteration.getNbrG() != 1) {
						iteration.setValG(iteration.getG()+"<sup>"+iteration.getNbrG()+"</sup>");
					}
					else {
						iteration.setValG(iteration.getG()+"");
					}
				}
				else if (iteration.getH() == 0) {
					iteration.setH(valeurCas1);
					iteration.setNbrH(compte);
					if (iteration.getNbrH() != 1) {
						iteration.setValH(iteration.getH()+"<sup>"+iteration.getNbrH()+"</sup>");
					}
					else {
						iteration.setValH(iteration.getH()+"");
					}
				}
				else if (iteration.getJ() ==0) {
					iteration.setJ(valeurCas1);
					iteration.setNbrJ(compte);
					if (iteration.getNbrJ() != 1) {
						iteration.setValJ(iteration.getJ()+"<sup>"+iteration.getNbrJ()+"</sup>");
					}
					else {
						iteration.setValJ(iteration.getJ()+"");
					}
				}
				else if (iteration.getK() ==0) {
					iteration.setK(valeurCas1);
					iteration.setNbrK(compte);
					if (iteration.getNbrK() != 1) {
						iteration.setValK(iteration.getK()+"<sup>"+iteration.getNbrK()+"</sup>");
					}
					else {
						iteration.setValK(iteration.getK()+"");
					}
				}
				else if (iteration.getL() == 0) {
					iteration.setL(valeurCas1);
					iteration.setNbrL(compte);
					if (iteration.getNbrL() != 1) {
						iteration.setValL(iteration.getL()+"<sup>"+iteration.getNbrL()+"</sup>");
					}
					else {
						iteration.setValL(iteration.getL()+"");
					}
				}
				else if (iteration.getM() == 0) {
					iteration.setM(valeurCas1);
					iteration.setNbrM(compte);
					if (iteration.getNbrM() != 1) {
						iteration.setValM(iteration.getM()+"<sup>"+iteration.getNbrM()+"</sup>");
					}
					else {
						iteration.setValM(iteration.getM()+"");
					}
				}
				else if (iteration.getN() == 0) {
					iteration.setN(valeurCas1);
					iteration.setNbrN(compte);
					if (iteration.getNbrN() != 1) {
						iteration.setValN(iteration.getN()+"<sup>"+iteration.getNbrN()+"</sup>");
					}
					else {
						iteration.setValN(iteration.getN()+"");
					}
				}
				else if (iteration.getP() == 0) {
					iteration.setP(valeurCas1);
					iteration.setNbrP(compte);
					if (iteration.getNbrP() != 1) {
						iteration.setValP(iteration.getP()+"<sup>"+iteration.getNbrP()+"</sup>");
					}
					else {
						iteration.setValP(iteration.getP()+"");
					}
				}
				else if (iteration.getQ() == 0) {
					iteration.setQ(valeurCas1);
					iteration.setNbrQ(compte);
					if (iteration.getNbrQ() != 1) {
						iteration.setValQ(iteration.getQ()+"<sup>"+iteration.getNbrQ()+"</sup>");
					}
					else {
						iteration.setValQ(iteration.getQ()+"");
					}
				}
				else if (iteration.getR() == 0) {
					iteration.setR(valeurCas1);
					iteration.setNbrR(compte);
					if (iteration.getNbrR() != 1) {
						iteration.setValR(iteration.getR()+"<sup>"+iteration.getNbrR()+"</sup>");
					}
					else {
						iteration.setValR(iteration.getR()+"");
					}
				}
				else if (iteration.getS() == 0) {
					iteration.setS(valeurCas1);
					iteration.setNbrS(compte);
					if (iteration.getNbrS() != 1) {
						iteration.setValS(iteration.getS()+"<sup>"+iteration.getNbrS()+"</sup>");
					}
					else {
						iteration.setValS(iteration.getS()+"");
					}
				}
				else if (iteration.getT() == 0) {
					iteration.setT(valeurCas1);
					iteration.setNbrT(compte);
					if (iteration.getNbrT() != 1) {
						iteration.setValT(iteration.getT()+"<sup>"+iteration.getNbrT()+"</sup>");
					}
					else {
						iteration.setValT(iteration.getT()+"");
					}
				}
				else if (iteration.getV() == 0) {
					iteration.setV(valeurCas1);
					iteration.setNbrV(compte);
					if (iteration.getNbrV() != 1) {
						iteration.setValV(iteration.getV()+"<sup>"+iteration.getNbrV()+"</sup>");
					}
					else {
						iteration.setValV(iteration.getV()+"");
					}
				}
				else if (iteration.getW() == 0) {
					iteration.setW(valeurCas1);
					iteration.setNbrW(compte);
					if (iteration.getNbrW() != 1) {
						iteration.setValW(iteration.getW()+"<sup>"+iteration.getNbrW()+"</sup>");
					}
					else {
						iteration.setValW(iteration.getW()+"");
					}
				}
				else if (iteration.getX() == 0) {
					iteration.setX(valeurCas1);
					iteration.setNbrX(compte);
					if (iteration.getNbrX() != 1) {
						iteration.setValX(iteration.getX()+"<sup>"+iteration.getNbrX()+"</sup>");
					}
					else {
						iteration.setValX(iteration.getX()+"");
					}
				}
				else if (iteration.getZ() == 0) {
					iteration.setZ(valeurCas1);
					iteration.setNbrZ(compte);
					if (iteration.getNbrZ() != 1) {
						iteration.setValZ(iteration.getZ()+"<sup>"+iteration.getNbrZ()+"</sup>");
					}
					else {
						iteration.setValZ(iteration.getZ()+"");
					}
				}
				
				cas1 = (debutProchainBoucle != 0 ? debutProchainBoucle -1 : composition.getNbVariable() +1);
				
		}
		
		String fin = iteration.getB()+"^"+iteration.getNbrB()+" x "+iteration.getC()+"^"+iteration.getNbrC()+" x "+iteration.getD()+"^"+iteration.getNbrD()+" x "+
				  iteration.getF()+"^"+iteration.getNbrF()+" x "+iteration.getG()+"^"+iteration.getNbrG()+"";
		System.out.println(fin);	
		
		return iteration;
	}
	
	public int[] getTableau(CompositionBean composition, int nbVariable) {
		

		int resultat[] = null;
		System.out.println(nbVariable);
		
		switch (composition.getNbVariable()) {
		
			case 1:						
				resultat = new int []{ composition.getB() };			 
			break;
		
			case 2:
				resultat = new int []{ composition.getB(), composition.getC()};
			break;
			
			case 3:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD()};
			break;
			
			case 4:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF()};
			break;
			
			case 5:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG()};
			break;
			
			case 6:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH() };
			break;
			
			case 7:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
					composition.getJ()};
			break;
			
			case 8:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
					composition.getJ(), composition.getK()};
			break;
			
			case 9:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
					composition.getJ(), composition.getK(), composition.getL()};
			break;
			
			case 10:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
					composition.getJ(), composition.getK(), composition.getL(), composition.getM()};
			break;
			
			case 11:
				resultat = new int []{ composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
					composition.getJ(), composition.getK(), composition.getL(), composition.getM(),composition.getN()};
			break;
		
			default:
			break;
		}
		return resultat;
	}
	
	
	public CompositionBean compositionVariable(CompositionBean composition) {
		int nombre = 0;
		if ( composition.getN() != 0 && composition.getM() != 0 && composition.getL() !=0 && composition.getK() !=0 && composition.getJ() !=0 && 
			 composition.getH() !=0 && composition.getG() !=0 && composition.getF() !=0 && composition.getD() !=0 	&& composition.getC() !=0 && 
			 composition.getB() !=0)
		{			
				System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
				" x "+composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK()+" x "+composition.getL()+" x "+composition.getM()+" x "+composition.getN());
			composition.setNbVariable(11);
			composition.getNombre();
		}
		else if (composition.getB() != 0 && composition.getC() !=0 && composition.getD() !=0 && composition.getF() !=0 && composition.getG() !=0 &&
				composition.getH() !=0 && composition.getJ() !=0 && composition.getK() !=0 && composition.getL() !=0 && composition.getM() !=0)
		{
				System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
				composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+composition.getK()+" x "+
				composition.getL()+" x "+composition.getM());
				composition.setNbVariable(10);
				composition.getNombre();
		}
		else if (composition.getL() !=0 && composition.getK() !=0 && composition.getJ() !=0 && composition.getH() !=0 && composition.getG() !=0 && 
				composition.getF() !=0 && composition.getD() !=0 && composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK()+" x "+composition.getL());
			composition.setNbVariable(9);
			composition.getNombre();
		}
		else if (composition.getK() !=0 && composition.getJ() !=0 && composition.getH() !=0 && composition.getG() !=0 && composition.getF() !=0 && 
				 composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ()+" x "+
					composition.getK());
			composition.setNbVariable(8);
			composition.getNombre();
		}
		else if (composition.getJ() !=0 && composition.getH() !=0 && composition.getG() !=0 && composition.getF() !=0 && composition.getD() !=0  && 
				composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
							   composition.getF()+" x "+composition.getG()+" x "+composition.getH()+" x "+composition.getJ());
			composition.setNbVariable(7);
			composition.getNombre();
		}
		else if (composition.getH() !=0 && composition.getG() !=0 &&composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && 
				 composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
							   composition.getF()+" x "+composition.getG()+" x "+composition.getH());
			composition.setNbVariable(6);
			composition.getNombre();
		}
		else if (composition.getG() !=0 &&composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
					 		   composition.getF()+" x "+composition.getG());
			composition.setNbVariable(5);
			composition.getNombre();
		}
		else if (composition.getF() !=0 && composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD()+" x "+
							   composition.getF());
			composition.setNbVariable(4);
			composition.getNombre();
		}
		else if (composition.getD() !=0  && composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC()+" x "+composition.getD());
			composition.setNbVariable(3);
			composition.getNombre();
		}
		else if (composition.getC() !=0 && composition.getB() !=0)
		{
			System.out.println(composition.getNombre()+" = "+composition.getB()+" x "+composition.getC());
			composition.setNbVariable(2);
			composition.getNombre();
		}
		else if (composition.getB() != 0) 
		{
			if (composition.getNombre() == 1)
				System.out.println(composition.getNombre()+" = "+composition.getB()+" :c'est un nombre premier");
			else 
				System.out.println(composition.getNombre()+" = "+composition.getB());
			composition.setNbVariable(1);
			composition.getNombre();
		}
		
		return composition;
	}

	public DivisionBeans diviser(int nombre) {
		DivisionBeans division = new DivisionBeans();
		NombrePremierBean premierNombre = new NombrePremierBean();
		
		int premier = 0;
		//verification si le nombre est premier
		for (int i = 0; i < premierNombre.getPremier().length; i++) {
			
			if (nombre == premierNombre.getPremier()[i]) {
				premier = nombre;
			}
		}
		
		if (premier == 0) {
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
		}
		else {
			division.setDiviseur(nombre);
			division.setQuotient(1);
		}
		
		return division;
	}
	
	
	public VariableIterationBeans traiterResultatDecomposition(VariableIterationBeans iteration) {
		
		if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
				&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
				&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 && iteration.getT()!=0 && iteration.getV()!=0 && iteration.getW()!=0
				&& iteration.getX()!=0 && iteration.getZ()!=0) {
				
				iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
									  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
									  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
									  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS()+" x "+iteration.getValT()+" x "+
									  iteration.getValV()+" x "+iteration.getValW()+" x "+iteration.getValX()+" x "+iteration.getValZ());
				
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 && iteration.getT()!=0 && iteration.getV()!=0 && iteration.getW()!=0
					&& iteration.getX()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS()+" x "+iteration.getValT()+" x "+
										  iteration.getValV()+" x "+iteration.getValW()+" x "+iteration.getValX());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 && iteration.getT()!=0 && iteration.getV()!=0 && iteration.getW()!=0
					) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS()+" x "+iteration.getValT()+" x "+
										  iteration.getValV()+" x "+iteration.getValW());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 && iteration.getT()!=0 && iteration.getV()!=0
					) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS()+" x "+iteration.getValT()+" x "+
										  iteration.getValV());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 && iteration.getT()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS()+" x "+iteration.getValT());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 && iteration.getS()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR()+" x "+iteration.getValS());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 && iteration.getR()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ()+" x "+iteration.getValR());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					&& iteration.getQ()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP()+" x "+
										  iteration.getValQ());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 && iteration.getP()!=0
					 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN()+" x "+iteration.getValP() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 && iteration.getN()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM()+" x "+iteration.getValN() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 && iteration.getM()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL()+" x "+iteration.getValM() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 && iteration.getL()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK()+" x "+
										  iteration.getValL());
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 && iteration.getK()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ()+" x "+iteration.getValK() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0
					&& iteration.getJ()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH()+" x "+iteration.getValJ() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 && iteration.getH()!=0 ) {
					
					iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
										  iteration.getValG()+" x "+iteration.getValH() );
					
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 && iteration.getG()!=0 ) {
				
				iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF()+" x "+
									  iteration.getValG() );
				
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 && iteration.getF()!=0 ) {
				
				iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD()+" x "+iteration.getValF() );
				
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 && iteration.getD()!=0 ) {
				
				iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC()+" x "+iteration.getValD());
				
			}
			else if (iteration.getB() != 0 && iteration.getC()!=0 ) {
				
				iteration.setResultat(iteration.getNombre()+" = "+iteration.getValB()+" x "+iteration.getValC());
				
			}
			else if (iteration.getB() != 0) {
				if (iteration.getNbrB() == 1)
					iteration.setResultat(iteration.getNombre()+" = "+ iteration.getValB()+" :c'est un nombre premier");
				else 
					iteration.setResultat(iteration.getNombre()+" = "+ iteration.getValB());
			}
		
		return iteration;
	}
	
	public void setErreur(String champ, String message) {
		erreur.put(champ, message);
	}
	
	
}
