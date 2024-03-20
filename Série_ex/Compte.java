package Série_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Compte {
	private int numéro;
	private String nom ;
	private  double solde;
	static int  nbComptes;
	public ArrayList<Opération> opérations =new ArrayList<Opération>();
	public Compte(String nom, double solde) {
		if (nom==null) {
			Scanner read= new Scanner(System.in);
			nom=read.next();
		}
		this.nom=nom;
		this.solde=solde;
		nbComptes++;
		this.numéro=nbComptes;
	}
	public Compte() {
		nom=null;
		solde=0;
	}
	void déposer(double montant) {
		solde+=montant ;
	}
	public void retirer(double montant ) throws SoldeInsuffisantException{
		if(solde<montant) {
			throw new SoldeInsuffisantException(this, montant);
			
		}
		solde-=montant ;
	}
	public void virer (double montant , Compte compte)throws SoldeInsuffisantException {
		compte.déposer(montant);
		retirer(montant);
	}
	
	public Compte(Compte compte){
		this.nom=compte.nom;
		this.solde=compte.solde;
		this.numéro=compte.numéro;
	}
	public String toString() {
		return "Numéro="+numéro+"     Nom="+nom+"  Solde="+solde;
	}
	boolean equals(Compte c1,Compte c2) {
		return c1.nom==c2.nom && c1.numéro==c2.numéro;
	}
	public String getNom() {
		return nom ;
	}
	public int getNum() {
		return numéro ;
	}
	public double getSolde() {
		return solde ;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setNum(int numéro) {
		this.numéro=numéro;
	}
	public void setSolde(double solde)throws ArithmeticException {
		if (solde <0) {
			throw new ArithmeticException("solde négatif");
		}else this.solde=solde;
	}
	public void add(Opération O) {
		opérations.add(O);
	}
	public void remove(Opération O) {
		opérations.remove(O);
	}
	public String relevé() {
		String S="";
		S+="Numéro="+numéro+"    Nom="+nom+"\n";
		for(int i=0;i<opérations.size();i++) {
			S+="\n"+opérations.get(i);
		}
		S+="\t\t\t\t\tSolde="+solde;
		return S;
		
	}
	
}
