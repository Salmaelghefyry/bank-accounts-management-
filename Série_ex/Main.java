package Série_ex;


import java.util.ArrayList;
import java.util.List;




public class Main {
	public static void main(String[] args)throws SoldeInsuffisantException{
	ArrayList<Opération> opérations= new ArrayList<Opération>() ;
	
	List<Compte> comptes=List.of(new CompteCourant("karim", 5000,1000),
			new CompteEpargne("Nora", 6000, 0.050));
for(int i=0;i<5;i++) {
		int i1=(int)(Math.random()*10)%2;
		int i2=1-i1;
		Compte compte1=comptes.get(i1);
		Compte compte2=comptes.get(i2);
		double montant=Math.random()*5000.0;
		int type =(int )(Math.random()*100)%2;
		switch (type) {
		case 0: comptes.get(0).déposer(montant);break;
		case 1: comptes.get(0).retirer(montant);break;
		}
	}
/*System.out.println(comptes.get(0).relevé());
 System.out.println(comptes.get(1).relevé());*/
for (Compte compte:comptes)
	System.out.println(compte.relevé());

}}