package Beans;

public class DivisionBeans {

	private int diviseur;
	private int quotient;
	private CompositionBean tableauComposition[];

	public int getDiviseur() {
		return diviseur;
	}

	public void setDiviseur(int diviseur) {
		this.diviseur = diviseur;
	}

	public int getQuotient() {
		return quotient;
	}

	public void setQuotient(int quotient) {
		this.quotient = quotient;
	}

	public CompositionBean[] getTableauComposition() {
		return tableauComposition;
	}

	public void setTableauComposition(CompositionBean[] tableauComposition) {
		this.tableauComposition = tableauComposition;
	}

}
