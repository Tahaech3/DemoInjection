package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Prensentation {
    public static void main(String[] args) {

        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat = "+metier.calcul());
    }
}
