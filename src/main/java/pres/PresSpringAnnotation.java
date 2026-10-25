package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresSpringAnnotation  {
    static void main() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("Dao","metier");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("res="+metier.calcul());

    }
}
