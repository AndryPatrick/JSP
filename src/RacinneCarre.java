import java.util.Arrays;

import java.util.stream.IntStream;

import Beans.PpcmValEgauxBeans;
import Modele.DecompositionModele;
import Modele.TraitementModele;
public class RacinneCarre {
	//https://www.jmdoudoux.fr/java/dej/chap-collections.htm
	public static void main (String [] args) {		
		
	  TraitementModele modele = new TraitementModele();
	  
	  	int ppcm =  modele.genererPGCD(16, 12);
	  	
		System.out.println("PPCM = "+ppcm); 
				
	}	
	
	public static int getNewElementOfTab(int[][] tab1, int[][] tab2) {
		int resultat = 0;	
		int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0;
		int p1=0,p2=0,p3=0,p4=0,p5=0,p6=0;
		
		int val1 =0, val2=0, puiss1=0, puiss2=0;
		int firstTableau[] = tab1[0];
		int secondTableau[] = tab2[0];
		//int newTab1[][] = null, newTab2[][] = null;
		
		int currentTab1[][] =  tab1;
		int currentTab2[][] =  tab2;
		
		for (int i = 0; i < tab1[0].length; i++) { //15 = 3 x 5
			
			val1 = firstTableau[i]; // 12 = 2 x 2 x 3
			puiss1 = tab1[1][i];
			
			for (int j=0; j < tab2.length; j++) {
				
				val2 = secondTableau[j];
				puiss2 = tab2[1][j];
				
				if (val1 == val2) {
					
					if (a1 == 0) {
						a1 = val1;
						p1 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					else if (a2 == 0) {
						a2 = val1;
						p2 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					else if (a3 == 0) {
						a3 = val1;
						p3 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					else if (a4 == 0) {
						a4 = val1;
						p4 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					else if (a5 == 0) {
						a5 = val1;
						p5 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					else if (a6 == 0) {
						a6 = val1;
						p6 = (puiss1 < puiss2) ? puiss1 : puiss2;
					}
					
					int newtab1[][] = { removeTheElement(tab1[0], i), removeTheElement(tab1[1], i) };
					int newTab2[][] = { removeTheElement(tab2[0], j), removeTheElement(tab2[1], j) };
					tab1 = newtab1;
					tab2 = newTab2;
					i = 0;
									
				} 
				
				if (i == tab1[0].length - 1) {
					currentTab1 = tab1;
					currentTab2 = tab2;			
				}
				
			}
						
		}
		
		
		resultat = tab1[0][0] * tab1[1][0] * tab2[0][0] * tab2[1][0] * a1 * p1;
		
		return resultat;
	}
	
	
	
	
	
	public static int[] removeTheElement(int[] arr, int index) {

		if (arr == null || index < 0 || index >= arr.length) {
			return arr;
		}
		
		int tab2[] =  IntStream.range(0, arr.length).filter(i -> i != index)
				.map(i -> arr [i] ).toArray();
		return tab2;
		
	}
	
	
	
	
	public static  int ppcm () {
		int resultat = 0;
		int val1=0, val2=0, puissance1=0, puissance2=0, puissance =0;
		int puissanceC=0, puissanceD=0, puissanceE=0, puissanceF=0, puissanceG=0, puissanceH=0;
		int c=0, d=0, e=0,f=0, g=0, h= 0;
		//int tab1[][];
		
		int tab1[][] = { {3,2} , {1,2} }; 
		int tab2[][] = { {2} , {3}};
		
		int tab3[][] = tab1;
		
		for (int i = 0 ; i < tab1.length; i++) {
			int a = 0, b= 1;	
			System.out.println(tab1.length);	
			 val1= tab1[a][i];
			 puissance1 = tab1[b][i];
			
			for (int j = 0; j < tab2.length;  j++) {
				System.out.println(tab2.length);
				 val2 = tab2[a][j];
				 puissance2 = tab2[b][j];
				 
				 puissance = (puissance1 > puissance2) ? puissance1 : puissance2;
					
					if (val1 ==  val2) {
						a = val1; 
						puissanceC = puissance;
					}
				j = tab2.length + 1;
			}
			i = -1;
		}
	
		return resultat;
	}
}