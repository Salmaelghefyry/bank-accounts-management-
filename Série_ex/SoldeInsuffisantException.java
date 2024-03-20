package Série_ex;

public class SoldeInsuffisantException extends Exception {
	public SoldeInsuffisantException(Compte compte,double montant ) {
		System.out.println("Imposiible de retirer le montant :"+montant +"  Solde="+compte.getSolde());
	}

}
