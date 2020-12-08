package Modele;

import java.util.stream.IntStream;
import Beans.PpcmValEgauxBeans;
import Beans.VariableIterationBeans;

public class TraitementModele {
	PpcmValEgauxBeans valeurDiff = new PpcmValEgauxBeans();
	PpcmValEgauxBeans valeurEgaux = new PpcmValEgauxBeans();
	//==================================================traitement PPCM===============================
	
	//traiter PPCM
	public int genererPPCM (int nombre1, int nombre2) {
		int resultat = 0;
		DecompositionModele decompositionModele = new DecompositionModele();
		//tableau1
		
		VariableIterationBeans decomposerNombre1 = decompositionModele.getComposant(nombre1);
		
		VariableIterationBeans contenueTab1 = iterationVariable(decomposerNombre1);
		
		int tableau1[][] = getTableau(contenueTab1, contenueTab1.getNbVariable());
		
		//tableau 2
		VariableIterationBeans decomposerNombre2 = decompositionModele.getComposant(nombre2);
		
		VariableIterationBeans contenueTab2 = iterationVariable(decomposerNombre2);
			
		int tableau2[][] = getTableau(contenueTab2, contenueTab1.getNbVariable());
		
		int firstTableau[][] = (tableau1.length > tableau2.length) ? tableau1 : tableau2;
		int secondTableau[][] = (tableau1.length < tableau2.length) ? tableau2 : tableau1;
		
		PpcmValEgauxBeans valeur = getElementForPpcmOfTab(firstTableau, secondTableau);
		
		resultat = calculPpcm(valeur);
		
		return resultat;
	}
	
	
	public int genererPGCD (int nombre1, int nombre2) {
		int resultat = 0;
		DecompositionModele decompositionModele = new DecompositionModele();
		//tableau1
		
		VariableIterationBeans decomposerNombre1 = decompositionModele.getComposant(nombre1);
		
		VariableIterationBeans contenueTab1 = iterationVariable(decomposerNombre1);
		
		int tableau1[][] = getTableau(contenueTab1, contenueTab1.getNbVariable());
		
		//tableau 2
		VariableIterationBeans decomposerNombre2 = decompositionModele.getComposant(nombre2);
		
		VariableIterationBeans contenueTab2 = iterationVariable(decomposerNombre2);
			
		int tableau2[][] = getTableau(contenueTab2, contenueTab1.getNbVariable());
		
		int firstTableau[][] = (tableau1.length > tableau2.length) ? tableau1 : tableau2;
		int secondTableau[][] = (tableau1.length < tableau2.length) ? tableau2 : tableau1;
		int longueurTableau1 = firstTableau.length;
		int longueurTableau2 = secondTableau.length;
		
		PpcmValEgauxBeans valeur = getElementForPgcdOfTab(firstTableau, secondTableau);
		
		resultat = calculPpcm(valeur);
		
		return resultat;
	}
	
	private PpcmValEgauxBeans setValeurDifferent(int val1,int val2, int puissance1, int puissance2) {
				
			if (valeurDiff.getB() == 0 && valeurDiff.getC() == 0) {
				valeurDiff.setB(val1);
				valeurDiff.setPuissanceB(puissance1);
				valeurDiff.setC(val2);
				valeurDiff.setPuissanceC(puissance2);
			}
			else if (valeurDiff.getD() == 0 && valeurDiff.getF() == 0) {
				valeurDiff.setD(val1);
				valeurDiff.setPuissanceD(puissance1);
				valeurDiff.setF(val2);
				valeurDiff.setPuissanceF(puissance2);
			}
			else if (valeurDiff.getG() == 0 && valeurDiff.getH() == 0) {
				valeurDiff.setG(val1);
				valeurDiff.setPuissanceG(puissance1);
				valeurDiff.setH(val2);
				valeurDiff.setPuissanceH(puissance2);
			}
			else if (valeurDiff.getJ() == 0 && valeurDiff.getK() == 0) {
				valeurDiff.setJ(val1);
				valeurDiff.setPuissanceJ(puissance1);
				valeurDiff.setK(val2);
				valeurDiff.setPuissanceK(puissance2);
			}
			else if (valeurDiff.getL() == 0 && valeurDiff.getM() == 0) {
				valeurDiff.setL(val1);
				valeurDiff.setPuissanceL(puissance1);
				valeurDiff.setM(val2);
				valeurDiff.setPuissanceM(puissance2);
			}
			else if (valeurDiff.getN() == 0 && valeurDiff.getP() == 0) {
				valeurDiff.setN(val1);
				valeurDiff.setPuissanceN(puissance1);
				valeurDiff.setP(val2);
				valeurDiff.setPuissanceP(puissance2);
			}
			else if (valeurDiff.getQ() == 0 && valeurDiff.getR() == 0) {
				valeurDiff.setQ(val1);
				valeurDiff.setPuissanceQ(puissance1);
				valeurDiff.setR(val2);
				valeurDiff.setPuissanceR(puissance2);
			}
			else if (valeurDiff.getS() == 0 && valeurDiff.getT() == 0) {
				valeurDiff.setS(val1);
				valeurDiff.setPuissanceS(puissance1);
				valeurDiff.setT(val2);
				valeurDiff.setPuissanceT(puissance2);
			}
			else if (valeurDiff.getV() == 0 && valeurDiff.getW() == 0) {
				valeurDiff.setV(val1);
				valeurDiff.setPuissanceV(puissance1);
				valeurDiff.setW(val2);
				valeurDiff.setPuissanceW(puissance2);
			}
			else if (valeurDiff.getX() == 0 && valeurDiff.getZ() == 0) {
				valeurDiff.setX(val1);
				valeurDiff.setPuissanceX(puissance1);
				valeurDiff.setZ(val2);
				valeurDiff.setPuissanceZ(puissance2);
			}
				
		return valeurDiff;
	}

	private PpcmValEgauxBeans setValeurEgaux(int val1, int puissance) {
				
			 if (valeurEgaux.getB() == 0) {
				 valeurEgaux.setB(val1);
				 valeurEgaux.setPuissanceB(puissance);
			 }
			 else if (valeurEgaux.getC() == 0) {
				 valeurEgaux.setC(val1);
				 valeurEgaux.setPuissanceC(puissance);
			 }
			 else if (valeurEgaux.getD() == 0) {
				 valeurEgaux.setD(val1);
				 valeurEgaux.setPuissanceD(puissance);
			 }
			 else if (valeurEgaux.getF() == 0) {
				 valeurEgaux.setF(val1);
				 valeurEgaux.setPuissanceF(puissance);
			 }
			 else if (valeurEgaux.getG() == 0) {
				 valeurEgaux.setG(val1);
				 valeurEgaux.setPuissanceD(puissance);
			 }
			 else if (valeurEgaux.getH() == 0) {
				 valeurEgaux.setH(val1);
				 valeurEgaux.setPuissanceH(puissance);
			 }
			 else if (valeurEgaux.getJ() == 0) {
				 valeurEgaux.setJ(val1);
				 valeurEgaux.setPuissanceJ(puissance);
			 }
			 else if (valeurEgaux.getK() == 0) {
				 valeurEgaux.setK(val1);
				 valeurEgaux.setPuissanceK(puissance);
			 }
			 else if (valeurEgaux.getL() == 0) {
				 valeurEgaux.setL(val1);
				 valeurEgaux.setPuissanceL(puissance);
			 }
			 else if (valeurEgaux.getM() == 0) {
				 valeurEgaux.setM(val1);
				 valeurEgaux.setPuissanceM(puissance);
			 }
			 else if (valeurEgaux.getN() == 0) {
				 valeurEgaux.setN(val1);
				 valeurEgaux.setPuissanceN(puissance);
			 }
			 else if (valeurEgaux.getP() == 0) {
				 valeurEgaux.setP(val1);
				 valeurEgaux.setPuissanceP(puissance);
			 }
			 else if (valeurEgaux.getQ() == 0) {
				 valeurEgaux.setQ(val1);
				 valeurEgaux.setPuissanceQ(puissance);
			 }
			 else if (valeurEgaux.getR() == 0) {
				 valeurEgaux.setR(val1);
				 valeurEgaux.setPuissanceR(puissance);
			 }
			 else if (valeurEgaux.getS() == 0) {
				 valeurEgaux.setS(val1);
				 valeurEgaux.setPuissanceS(puissance);
			 }
			 else if (valeurEgaux.getT() == 0) {
				 valeurEgaux.setT(val1);
				 valeurEgaux.setPuissanceT(puissance);
			 }
			 else if (valeurEgaux.getV() == 0) {
				 valeurEgaux.setV(val1);
				 valeurEgaux.setPuissanceV(puissance);
			 }
			 else if (valeurEgaux.getW() == 0) {
				 valeurEgaux.setW(val1);
				 valeurEgaux.setPuissanceW(puissance);
			 }
			 else if (valeurEgaux.getX() == 0) {
				 valeurEgaux.setX(val1);
				 valeurEgaux.setPuissanceX(puissance);
			 }
			 else if (valeurEgaux.getZ() == 0) {
				 valeurEgaux.setZ(val1);
				 valeurEgaux.setPuissanceZ(puissance);
			 }
		
		return valeurEgaux;
	}
	
	
	
	private VariableIterationBeans iterationVariable(VariableIterationBeans composition) {
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
	
	
	private int[][] getTableau(VariableIterationBeans composition, int nbVariable) {
		

		int resultat[] [] = null;
		System.out.println(nbVariable);
		
		switch (composition.getNbVariable()) {
		
			case 1:						
				resultat = new int [][]{ {composition.getB()},{composition.getNbrB() } };			 
			break;
		
			case 2:
				resultat = new int [][]{ {composition.getB(), composition.getC()} , {composition.getNbrB(), composition.getNbrC() } };
			break;
			
			case 3:
				resultat = new int [][]{ {composition.getB(), composition.getC(), composition.getD()},
										 {composition.getNbrB(), composition.getNbrC(), composition.getNbrD() } };
			break;
			
			case 4:
				resultat = new int [][]{ {composition.getB(), composition.getC(), composition.getD(), composition.getF()},
										 {composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF()} };
			break;
			
			case 5:
				resultat = new int [][]{ {composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG()}, 
										 {composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG()} };
			break;
			
			case 6:
				resultat = new int [][]{ {composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH() },
										 {composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(), 
										  composition.getNbrH()} };
			break;
			
			case 7:
				resultat = new int [][]{ { composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
									       composition.getJ()},
										 { composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(),
									       composition.getNbrH(),composition.getNbrJ()} };
			break;
			
			case 8:
				resultat = new int [][]{ { composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
										   composition.getJ(), composition.getK()},
										 { composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(),
										   composition.getNbrH(),composition.getNbrJ(),composition.getNbrK()} };
			break;
			
			case 9:
				resultat = new int [][]{ { composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
										   composition.getJ(), composition.getK(), composition.getL()},
									     { composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(),
										   composition.getNbrH(),composition.getNbrJ(),composition.getNbrK(),composition.getNbrL()} };
			break;
			
			case 10:
				resultat = new int [][]{ { composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
										   composition.getJ(), composition.getK(), composition.getL(), composition.getM()},
										 { composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(),
										   composition.getNbrH(),composition.getNbrJ(),composition.getNbrK(),composition.getL(),composition.getNbrM()} };
			break;
			
			case 11:
				resultat = new int [][]{ { composition.getB(), composition.getC(), composition.getD(), composition.getF(), composition.getG(),composition.getH(),
										   composition.getJ(), composition.getK(), composition.getL(), composition.getM(),composition.getN()},
									     { composition.getNbrB(), composition.getNbrC(), composition.getNbrD(), composition.getNbrF(),composition.getNbrG(),
										   composition.getNbrH(),composition.getNbrJ(),composition.getNbrK(),composition.getL(),composition.getNbrM(),composition.getNbrN()} };
			break;
		
			default:
			break;
		}
		return resultat;
	}
	
	
	private int valeurPpcm (PpcmValEgauxBeans valeurEgaux, PpcmValEgauxBeans valeurDiff) {
		int resultat = 0;
		
		if (valeurEgaux.getB() != 0 && valeurDiff.getB() !=0) {
			resultat = ( (int) Math.pow(valeurEgaux.getB() , valeurEgaux.getPuissanceB()) )* 
					   ( (int) Math.pow(valeurDiff.getB(), valeurDiff.getPuissanceB()) )*
					   ( (int) Math.pow(valeurDiff.getC(), valeurDiff.getPuissanceC()) );
		}
		
		return resultat;
	}

	
	private int[][] tableauComparaison(int tableau1[][], int longueurTableau) {
		int tableau[][]= null;
		int a = 0, b=1; 
		int a1 = tableau1[a][0], a2 = tableau1[a][1], a3 = tableau1[a][2], a4 = tableau1[a][3], a5 = tableau1[a][4], 
			a6 = tableau1[a][5], a7 = tableau1[a][6], a8 = tableau1[a][7], a9 = tableau1[a][8], a10 = tableau1[a][9];
		int puis1 = tableau1[a][0], puis2 = tableau1[a][1], puis3 = tableau1[a][2], puis4 = tableau1[a][3], puis5 = tableau1[a][4], 
			puis6 = tableau1[a][5], puis7 = tableau1[a][6], puis8 = tableau1[a][7], puis9 = tableau1[a][8], puis10 = tableau1[a][9];
		
		switch (longueurTableau) {
			case 10:
				tableau = new int [][]{ {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10} , {puis1,puis2,puis3,puis4,puis5,puis6,puis7,puis8,puis9,puis10} };
			break;
			
			case 9:
				tableau = new int [][]{ {a1,a2,a3,a4,a5,a6,a7,a8,a9} , {puis1,puis2,puis3,puis4,puis5,puis6,puis7,puis8,puis9} };
			break;
			
			case 8:
				tableau = new int [][]{ {a1,a2,a3,a4,a5,a6,a7,a8} , {puis1,puis2,puis3,puis4,puis5,puis6,puis7,puis8} };
			break;
			
			case 7:
				tableau = new int [][]{ {a1,a2,a3,a4,a5,a6,a7} , {puis1,puis2,puis3,puis4,puis5,puis6,puis7} };
			break;
			
			case 6:
				tableau = new int [][]{ {a1,a2,a3,a4,a5,a6} , {puis1,puis2,puis3,puis4,puis5,puis6} };
			break;
			
			case 5:
				tableau = new int [][]{ {a1,a2,a3,a4,a5} , {puis1,puis2,puis3,puis4,puis5} };
			break;
			
			case 4:
				tableau = new int [][]{ {a1,a2,a3,a4} , {puis1,puis2,puis3,puis4} };
			break;
			
			case 3:
				tableau = new int [][]{ {a1,a2,a3} , {puis1,puis2,puis3} };
			break;
			
			case 2:
				tableau = new int [][]{ {a1,a2} , {puis1,puis2} };
			break;
			
			case 1:
				tableau = new int [][]{ {a1} , {puis1} };
			break;
			
			default:
				tableau = null;
			break;
		}	
		
		return tableau;
	}
	
	//Remove element in array
	private  int[] removeElement(int[] arr, int index) { //0344906066 maman angela
															  //0348634571 dokotera
		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		
		return  IntStream.range(0, arr.length).filter(i -> i != index).map(i -> arr [i] ).toArray();
		
	}
	
	
	private PpcmValEgauxBeans getElementForPpcmOfTab(int[][] tab1, int[][] tab2) {
		PpcmValEgauxBeans valeur = new  PpcmValEgauxBeans();
		int val1 =0, val2=0, puiss1=0, puiss2=0;
		int firstTableau[] = tab1[0];
		int secondTableau[] = tab2[0];
		
		int currentTab1[][] =  tab1;
		int currentTab2[][] =  tab2;
		
		for (int i = 0; i < tab1[0].length; i++) { //2 x 3 x 5
			
			val1 = tab1[0][i]; // 2 x 3
			puiss1 = tab1[1][i];
			int j=0;
			for ( j=0; j < tab2[0].length; j++) {
				
				val2 = tab2[0][j];
				puiss2 = tab2[1][j];
				
				if (val1 == val2) {
					int puissance  = (puiss1 < puiss2) ? puiss2 : puiss1 ;
					valeur = attributionValeurEgaux(val1, puissance, valeur);
					int newtab1[][] = {removeElement(tab1[0], i), removeElement(tab1[1], i) };
					int newTab2[][] = { removeElement(tab2[0], j), removeElement(tab2[1], j)};
					tab1 = newtab1; 
					tab2 = newTab2;
					j = tab2[0].length;
					i= -1;
				}		
		   }
		
	   }
		
	   for (int i = 0; i <tab1[0].length; i++) {
		   val1 = tab1[0][i];
		   int puissance = tab1[1][i];
		   valeur = attributionValeurEgaux(val1, puissance, valeur);
	   }
	   
	   for (int i =0; i < tab2[0].length; i++) {
		   val2 = tab2[0][i];
		   int puissance = tab2[1][i];
		   valeur = attributionValeurEgaux(val2, puissance, valeur);
	   }
		
		return valeur;
	}
	
	
	private PpcmValEgauxBeans getElementForPgcdOfTab(int[][] tab1, int[][] tab2) {
		PpcmValEgauxBeans valeur = new  PpcmValEgauxBeans();
		int val1 =0, val2=0, puiss1=0, puiss2=0;
		int firstTableau[] = tab1[0];
		int secondTableau[] = tab2[0];
		
		int currentTab1[][] =  tab1;
		int currentTab2[][] =  tab2;
		
		for (int i = 0; i < tab1[0].length; i++) { //2 x 3 x 5
			
			val1 = tab1[0][i]; // 2 x 3
			puiss1 = tab1[1][i];
			int j=0;
			for ( j=0; j < tab2[0].length; j++) {
				
				val2 = tab2[0][j];
				puiss2 = tab2[1][j];
				
				if (val1 == val2) {
					int puissance  = (puiss1 > puiss2) ? puiss2 : puiss1 ;
					valeur = attributionValeurEgaux(val1, puissance, valeur);
					int newtab1[][] = {removeElement(tab1[0], i), removeElement(tab1[1], i) };
					int newTab2[][] = { removeElement(tab2[0], j), removeElement(tab2[1], j)};
					tab1 = newtab1; 
					tab2 = newTab2;
					j = tab2[0].length;
					i= -1;
				}		
		   }
		
	   }
		
		return valeur;
	}
	
	private PpcmValEgauxBeans attributionValeurEgaux(int valeur, int puissance, PpcmValEgauxBeans value) {
		
		if (value.getB() == 0) {
			value.setB(valeur);
			value.setPuissanceB(puissance);
			value.setNbVariable(1);
		}
		else if (value.getC() == 0) {
			value.setC(valeur);
			value.setPuissanceC(puissance);
			value.setNbVariable(2);
		}
		else if (value.getD() == 0) {
			value.setD(valeur);
			value.setPuissanceD(puissance);
			value.setNbVariable(3);
		}
		else if (value.getF() == 0) {
			value.setF(valeur);
			value.setPuissanceF(puissance);
			value.setNbVariable(4);
		}
		else if (value.getG() == 0) {
			value.setG(valeur);
			value.setPuissanceG(puissance);
			value.setNbVariable(5);
		}
		else if (value.getH() == 0) {
			value.setH(valeur);
			value.setPuissanceH(puissance);
			value.setNbVariable(6);
		}
		else if (value.getJ() == 0) {
			value.setJ(valeur);
			value.setPuissanceJ(puissance);
			value.setNbVariable(7);
		}
		else if (value.getK() == 0) {
			value.setK(valeur);
			value.setPuissanceK(puissance);
			value.setNbVariable(8);
		}
		else if (value.getL() == 0) {
			value.setL(valeur);
			value.setPuissanceL(puissance);
			value.setNbVariable(9);
		}
		else if (value.getM() == 0) {
			value.setM(valeur);
			value.setPuissanceM(puissance);
			value.setNbVariable(10);
		}
		else if (value.getN() == 0) {
			value.setN(valeur);
			value.setPuissanceN(puissance);
			value.setNbVariable(11);
		}
		else if (value.getP() == 0) {
			value.setP(valeur);
			value.setPuissanceP(puissance);
			value.setNbVariable(12);
		}
		else if (value.getQ() == 0) {
			value.setQ(valeur);
			value.setPuissanceQ(puissance);
			value.setNbVariable(13);
		}
		else if (value.getR() == 0) {
			value.setR(valeur);
			value.setPuissanceR(puissance);
			value.setNbVariable(14);
		}
		else if (value.getS() == 0) {
			value.setS(valeur);
			value.setPuissanceS(puissance);
			value.setNbVariable(15);
		}
		else if (value.getT() == 0) {
			value.setT(valeur);
			value.setPuissanceT(puissance);
			value.setNbVariable(16);
		}
		else if (value.getV() == 0) {
			value.setV(valeur);
			value.setPuissanceV(puissance);
			value.setNbVariable(17);
		}
		else if (value.getW() == 0) {
			value.setW(valeur);
			value.setPuissanceW(puissance);
			value.setNbVariable(18);
		}
		else if (value.getX() == 0) {
			value.setX(valeur);
			value.setPuissanceX(puissance);
			value.setNbVariable(19);
		}
		else if (value.getZ() == 0) {
			value.setZ(valeur);
			value.setPuissanceZ(puissance);
			value.setNbVariable(20);
		}
		
		return value;
	}
	
	
	private int calculPpcm (PpcmValEgauxBeans valeur) {
		int ppcm = 0;
		switch (valeur.getNbVariable()) {
			case 1:
				ppcm = (int) Math.pow(valeur.getB(), valeur.getPuissanceB());
			break;
			
			case 2:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) 
							 );
			break;
			
			case 3:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) 
							 );
			break;
			
			case 4:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) 
							 );
			break;
			
			case 5:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) 
							 );
			break;
			
			case 6:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) 
							 );
			break;
			
			case 7:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() )
							 );
			break;
			
			case 8:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() )
							 );
			break;
			
			case 9:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() )
							 );
			break;
			
			case 10:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() )
							 );
			break;
			
			case 11:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() )
							 );
			break;
			
			case 12:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() )
							 );
			break;
			
			case 13:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() )
							 );
			break;
			
			case 14:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() )
							 );
			break;
			
			case 15:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() )
							 );
			break;
			
			case 16:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() ) *
							   Math.pow( valeur.getT(), valeur.getPuissanceT() )
							 );
			break;
			
			case 17:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() ) *
							   Math.pow( valeur.getT(), valeur.getPuissanceT() ) *
							   Math.pow( valeur.getV(), valeur.getPuissanceV() )
							 );
			break;
			
			case 18:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() ) *
							   Math.pow( valeur.getT(), valeur.getPuissanceT() ) *
							   Math.pow( valeur.getV(), valeur.getPuissanceV() ) *
							   Math.pow( valeur.getW(), valeur.getPuissanceW() )
							 );
			break;
			
			case 19:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() ) *
							   Math.pow( valeur.getT(), valeur.getPuissanceT() ) *
							   Math.pow( valeur.getV(), valeur.getPuissanceV() ) *
							   Math.pow( valeur.getW(), valeur.getPuissanceW() ) *
							   Math.pow( valeur.getX(), valeur.getPuissanceX() )
							 );
			break;
			
			case 20:
				ppcm = (int) ( Math.pow( valeur.getB(), valeur.getPuissanceB() ) *
							   Math.pow( valeur.getC(), valeur.getPuissanceC() ) *
							   Math.pow( valeur.getD(), valeur.getPuissanceD() ) *
							   Math.pow( valeur.getF(), valeur.getPuissanceF() ) *
							   Math.pow( valeur.getG(), valeur.getPuissanceG() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getH(), valeur.getPuissanceH() ) *
							   Math.pow( valeur.getJ(), valeur.getPuissanceK() ) *
							   Math.pow( valeur.getL(), valeur.getPuissanceL() ) *
							   Math.pow( valeur.getM(), valeur.getPuissanceM() ) *
							   Math.pow( valeur.getN(), valeur.getPuissanceN() ) *
							   Math.pow( valeur.getP(), valeur.getPuissanceP() ) *
							   Math.pow( valeur.getQ(), valeur.getPuissanceQ() ) *
							   Math.pow( valeur.getR(), valeur.getPuissanceR() ) *
							   Math.pow( valeur.getS(), valeur.getPuissanceS() ) *
							   Math.pow( valeur.getT(), valeur.getPuissanceT() ) *
							   Math.pow( valeur.getV(), valeur.getPuissanceV() ) *
							   Math.pow( valeur.getW(), valeur.getPuissanceW() ) *
							   Math.pow( valeur.getX(), valeur.getPuissanceX() ) *
							   Math.pow( valeur.getZ(), valeur.getPuissanceZ() )
							 );
			break;

			default:
			break;
		}
	
		return ppcm;
	}
}
	

