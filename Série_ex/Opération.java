package Série_ex;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Opération {
    public static final int DEPOT = 0, RETRAIT = 1, VIREMENT = 2;
    public int type;
    public double montant;
    public Date date;

    public Opération(int type, double montant, Date date) {
        this.type = type;
        this.date = date;
        this.montant = montant;
    }

    public Opération(int retrait2, double montant2) {
        this.montant = montant2;
        this.type = retrait2;
        this.date = new Date(); // Initialize the date field with the current date/time
    }


	public int getType() {
        return type;
    }

    public double getMontant() {
        return montant;
    }

    public Date getDate() {
        return date;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        String S = "";
        S += new SimpleDateFormat("dd/MM/YYY HH:mm:ss", Locale.FRANCE).format(date);
      
        switch (type) {
            case 0:
                S = S + "\tDépot\t" + new DecimalFormat("0.00").format(montant);
                break;
            case 1:
                S = S + "\tRetrait\t\t\t\t"+ new DecimalFormat("0.00").format(montant);;
                break;
        }
        return S;
    }
}

