
public class NombrePremier {

	static int a=0; static int b=0; static int c=0; static int d=0; static int e=0; static int f=0; static int g=0;
	static int h=0; static int i=0; static int j=0; static int k=0; static int l=0; static int m=0; static int n=0;
	static int o=0; static int p=0; static int q=0; static int r=0; static int s=0; static int t=0; static int u=0;
	static int v=0; static int w=0; static int x=0; static int y=0; static int z=0;
	
	public static void main(String[] args) {
		
		nombrePremier(1, 10000);
		//decomposition(15);
	}
	
	public static String nombrePremier(int premier, int dernier) {
		String resultat = null;
		int value[];
		int i = 0 ;
		int z = 0;
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0;
		
		for( i = premier; i <dernier ; i++) {			

			int x = 0;
			if (i != 2 && i != 3 && i !=5 && i !=7 && i !=11 && i != 13 && i != 17 && i !=19 && i!=23 && i!=29 && i!=31 && i!=37 && i!=37 && i!=41) {
				 a = i%2 ; 
				 b = i%3 ;
				 c = i%5 ;
				 d = i%7 ;
				 e = i%11 ;
				 f = i%13 ;
				 g = i%17 ;
				 h = i%19;
				if ( a != 0 && b != 0 && c !=0 && d != 0 && e !=0 && f !=0 && g !=0 && h!=0) {	
					x = 1;
					System.out.print(i+" , "); 
					//value[i];
				}	
				
			}
			else  {
				System.out.print(i+" , ");
				x = 1;
			}
			
			if ( x != 0 ) {
				z = z + x;
			}
		}
		System.out.println( "On a "+z+" nombres premiers entre "+premier+" et "+dernier);
	
		return resultat;
	}
	
	
	public static String decomposition (int nombre) {
		char stockage[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int valeur[] = {a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z};
		int quotient1 = 0, quotient2=0, quotient3 =0, quotient5 =0, quotient4 =0, quotient6 = 0, quotient7 =0, quotient8 =0,
			quotient9 =0, quotient10 =0, quotient11 =0, quotient12 =0, quotient13 =0, quotient14 =0, quotient15 =0, quotient16 =0,
			quotient17 =0, quotient18 =0, quotient19 =0, quotient20 =0, quotient21 =0, quotient22 =0, quotient23 =0, quotient24 =0;
		int premier[] = {2,3,5,7,11,13};
		int nombrePremier;
		String value;
		int tour = 0;
		String resultat = null;
		String nom;
		
		for (i = 0; i<stockage.length;i++) {
			
			while (i < premier.length) {
			
				for (i= 0; i < premier.length; i++) {
					
				/*	while ((nombre/premier))

					int quotient = 0;
					quotient = nombre%premier[i]; */
					
					//System.out.println(stockage[i]+" = "+premier[i]);
					a = premier[i];
					//System.out.println("a = "+a);
							
						if (nombre% premier[i] == 0) {
							
							tour ++; 
							
							if (tour == 1)
							 quotient1 = premier[i];
							else if (tour == 2){
								quotient2 = premier[i];
							}
							else if (tour == 3){
								quotient3 = premier[i];
							}
							else if (tour == 4){
								quotient4 = premier[i];
							}
							else if (tour == 5){
								quotient5 = premier[i];
							}
							else if (tour == 6){
								quotient6 = premier[i];
							}
							else if (tour == 7){
								quotient7 = premier[i];
							}
							else if (tour == 8){
								quotient8 = premier[i];
							}
							else if (tour == 9){
								quotient9 = premier[i];
							}
							else if (tour == 10){
								quotient10 = premier[i];
							}
							
							int val1 = quotient1;
							int val2 = quotient2;
						}	
				
					if (quotient1 != 0 && quotient2 !=0)
							System.out.println(quotient1+" x "+quotient2);
					
				}
				
			}	
			
		}
		return resultat;
	}
	
	public int assignerValeur(int tour, int valeur) {
		
		switch (tour) {
		
		case 1:
			a = valeur;
		break;
			
		case 2:
			b = valeur;
		break;
		
		case 3:
			c = valeur;
		break;
		
		case 4:
			d = valeur;
		break;
		
		case 5:
			e = valeur;
		break;
		
		case 6:
			f = valeur;
		break;
		
		case 7:
			g = valeur;
		break;
		
		case 8:
			h = valeur;
		break;
		
		case 9:
			i = valeur;
		break;
		
		case 10:
			j = valeur;
		break;
		
		case 11:
			k = valeur;
		break;
		
		case 12:
			l = valeur;
		break;
		
		case 13:
			m = valeur;
		break;
			
		default:
			break;
		}
		
		return i;
	}

/*	if (quotient1 != 0 || quotient2 != 0 || quotient3 != 0 || quotient4 != 0 || quotient5 != 0) {
		
		switch (tour) {
		
		case 1:
			a = quotient1;
		break;
			
		case 2:
			b = quotient2;
		break;
		
		case 3:
			c = quotient3;
		break;
		
		case 4:
			d = quotient4;
		break;
		
		case 5:
			e = quotient5;
		break;
		
		case 6:
			f = quotient6;
		break;
		
		case 7:
			g = quotient7;
		break;
		
		case 8:
			h = quotient8;
		break;
		
		case 9:
			i = quotient9;
		break;
		
		case 10:
			j = quotient10;
		break;
		
		case 11:
			k = quotient11;
		break;
		
		case 12:
			l = quotient12;
		break;
		
		case 13:
			m = quotient13;
		break;
			
		default:
			break;
		}
	} */
	//for (valeur = stockage[emplacementPremier]; emplacementPremier < stockage.length; emplacementPremier++);
	
	//System.out.println(premier[emplacementPremier]);
	
	//min = (i <b) ? i: b;
	
	//c = (min == i) ? (i+" x "+b) : ( b+" x "+i);

//}
/*	do {
	if (nombre% == 0) {
		b = a/i;
		
		min = (i <b) ? i: b;
		
		c = (min == i) ? (i+" x "+b) : ( b+" x "+i);
		
	}
} while (b/premier[i] == 1); */


//}				

//System.out.println(c);
	
}
