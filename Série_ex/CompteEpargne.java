package Série_ex;

public class CompteEpargne extends Compte{
	private double taux;
	public CompteEpargne(String nom,double solde,double taux) {
		super(nom,solde);
		this.taux=taux;
	}
	public void déposer(double montant) {
		setSolde(getSolde() + (montant+montant*taux));//super.déposer(montant*(1+taux)
	}

}
