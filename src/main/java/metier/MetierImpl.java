package metier;

import Dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // couplage faible
    /**
     * Pour injecter dans l´attribut dao
     * un objet d´une classe qui implemente l´interface IDao
     * au moment de l´instantiation
     */
    public MetierImpl(IDao dao){
        this.dao=dao ;
    }

    public MetierImpl(){

    }

    public double calcul() {
        double a = dao.getData();
        double res = a * 12 *Math.PI/2 *Math.cos(a);
        return res;
    }

    /**
     * Pour injecter dans l´attribut dao
     * un objet d´une classe qui implemente l´interface IDao
     * apres l´instantiation
     */

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
