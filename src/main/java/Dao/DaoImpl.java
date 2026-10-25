package Dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {

    @Override
    public double getData() {
        System.out.println("la version de la base de donnees est : ");
        double a = 21;
        return a;
    }
}
