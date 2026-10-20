package Dao;

public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("la version de la jdk open oracle est : ");
        double a = 21;
        return a;
    }
}
