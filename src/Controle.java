import Beans.CompositionBean;
import Beans.DivisionBeans;
import Beans.VariableIterationBeans;

public class Controle {
	
	public static void main (String[] args) {
		DivisionEuclidienne divisionModele = new DivisionEuclidienne();
		VariableIterationBeans iteration = divisionModele.getComposant(486);		
	}
}
