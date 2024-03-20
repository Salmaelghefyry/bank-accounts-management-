package Série_ex;

public class CompteCourant extends Compte{
	private double découvertAutorisé ;
	public CompteCourant(String nom,double solde,double découvertAutorisé) {
		super(nom,solde);//appel constructeur super classe pour creer la partie heritée
		this.découvertAutorisé=découvertAutorisé;
	}
	public void retirer(double montant) throws SoldeInsuffisantException {
		double soldevirtuel=getSolde()+découvertAutorisé;//ou super.getsolde() commence la rechrche à partir de la superclasse
		if(soldevirtuel<montant) { 
			throw new SoldeInsuffisantException(this, montant) ;
		}
		setSolde(getSolde()-montant);
		add(new Opération (Opération.RETRAIT,montant));
		}
	}

