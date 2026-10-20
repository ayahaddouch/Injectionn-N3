package pres;

import Dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d= new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        //metier.setDao(d);// Injection des dependances via le setter
        System.out.print("RES= "+metier.calcul());
    }
}
