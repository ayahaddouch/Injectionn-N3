package ext;

import Dao.IDao;
//import org.springframework.stereotype.Repository;

public class IDaoImpV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs ...");
        double t = 12;
        return t;
    }

}
