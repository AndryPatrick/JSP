
public class EquationSecondDegre {

	public static void main(String[] args) {
		String f = "ax + bx + c ";
		// int solution1 = 0, solution2 = 0;
		// int a = 4, b=4, c=1;
		int a = 2, b = 9, c = -5;
		//int a = -1, b = 2, c = 3;
		double x1 = 0, x2 = 0;
		String solution1 = null, solution2 = null;

		int delta = (int) (Math.pow(b, 2.0)) - (4 * a * c);

		System.out.println("delta = " + delta);

		if (delta == 0) {
			x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));

			System.out.println("l'equation admet une solution unique x = " + x1);
		} else if (delta < 0) {
			System.out.println("pas de solution");
			
		} else if (delta > 0) {
			x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));
			x2 = (((-b) + (Math.sqrt(delta))) / (2 * a));
			
			double entier1 =  x1 - (int) x1;
			double entier2 = x2 - (int) x2;
			
			//solution1
			if ( entier1 == 0.0) {
				x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));
				 int x = (int) x1;
				solution1 = String.valueOf(x);
			}
			else {
				x1 = (((-b) - (Math.sqrt(delta))) / (2 * a));
				solution1 = String.valueOf(x1);
			}
			
			//Solution2
			if ( entier2 == 0.0) {
				x2 = (int)(((-b) + (Math.sqrt(delta))) / (2 * a));
				int x = (int) x2;
				solution2 = String.valueOf(x);
			}
			else {
				x2 = (((-b) + (Math.sqrt(delta))) / (2 * a));
				solution2 = String.valueOf(x2);
			}
				System.out.println("L'equation admet deux solution dont x1 = " + solution1 + "\t x2 = " + solution2);
			}

		}

}
